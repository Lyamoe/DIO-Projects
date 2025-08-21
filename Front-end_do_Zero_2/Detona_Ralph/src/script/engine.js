//* ==================== DEFAULTS ====================
const MAX_SCORE = 10; // points you can get by clicking faster
const QT_SQUARES = 9; // number of squares in the game
const MAX_LIVES = 3; // maximum lives
let hasHit = true; // if the user has hit Ralph

//* ==================== IN GAME ====================
const gameInfo = {
	dom: {
		squares: document.querySelectorAll(".panel_square"),
		enemy: document.querySelector(".enemy"),
		timeLeft: document.querySelector("#time-value"),
		score: document.querySelector("#score-value"),
	},
	values: {
		gameVelocity: 1000,
		hitPosition: 0,
		currentScore: 0,
		curretTime: 30,
		currentLives: MAX_LIVES,
	},
	actions: {
		timerId: null,
		countdownTimerId: null,
	},
};

function countdown() {
	gameInfo.values.curretTime--;
	gameInfo.dom.timeLeft.textContent = gameInfo.values.curretTime;

	if (gameInfo.values.curretTime <= 0) {
		gameOver();
	}
}

function checkLives() {
	if (!hasHit) {
		gameInfo.values.currentLives--;
		document.getElementById("lives-value").textContent =
			gameInfo.values.currentLives;
		//TODO: playSound("miss");
		hasHit = true; // reset hit status
	}
	if (gameInfo.values.currentLives <= 0) {
		gameOver();
	}
}

function randomSquare() {
	deleteRalph();
	checkLives();
	let randomNumber = Math.floor(Math.random() * QT_SQUARES);
	let randomSquare = gameInfo.dom.squares[randomNumber];
	randomSquare.classList.add("enemy");
	gameInfo.values.hitPosition = randomSquare.id;
	hasHit = false; // reset hit status
}

function deleteRalph() {
	gameInfo.dom.squares.forEach((square) => {
		square.classList.remove("enemy");
	});
}

function playSound(audioName) {
	let audio = new Audio(`./src/audio/${audioName}.m4a`);
	audio.volume = 0.2;
	audio.play();
}

function addListenerHitBox() {
	gameInfo.dom.squares.forEach((square) => {
		square.addEventListener("mousedown", () => {
			if (square.id === gameInfo.values.hitPosition) {
				gameInfo.values.currentScore++;
				gameInfo.dom.score.textContent = gameInfo.values.currentScore;
				gameInfo.values.hitPosition = null;
				deleteRalph();
				playSound("hit");
				hasHit = true; // user has hit Ralph
			}
		});
	});
}

function setTime(time) {
	document.getElementById("pop-up_time-span").textContent = time;
	gameInfo.values.curretTime = time + 1;
}

function openStartPopup() {
	document.getElementById("pop-up_start").style.display = "flex";
	document.getElementById("pop-up_game-over").style.display = "none";
}

function resetGameState() {
	clearInterval(gameInfo.actions.countdownTimerId);
	clearInterval(gameInfo.actions.timerId);
    gameInfo.values.currentScore = 0;
    gameInfo.dom.score.textContent = gameInfo.values.currentScore;
    gameInfo.values.currentLives = MAX_LIVES + 1; // +1 because you will lose one life at the start
    gameInfo.values.curretTime = 30;
    gameInfo.dom.timeLeft.textContent = gameInfo.values.curretTime;
    deleteRalph();
	checkLives();
    hasHit = true;
}

function gameOver() {
	// TODO: playSound("game-over");
	document.getElementById("pop-up_game-over").style.display = "flex";
	document.getElementById("final-score").textContent =
		gameInfo.values.currentScore;
	resetGameState();
}

function initialize() {
	document.querySelectorAll(".pop-up").forEach((el) => {
		el.style.display = "none";
	});
	addListenerHitBox();
	gameInfo.actions.timerId = setInterval(randomSquare, 1000);
	gameInfo.actions.countdownTimerId = setInterval(countdown, 1000);
}
