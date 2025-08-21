const classificador = {
	Ferro: 1000,
	Bronze: 2000,
	Prata: 5000,
	Ouro: 7000,
	Platina: 8000,
	Ascendente: 9000,
	Imortal: 10000,
	Radiante: Infinity,
};

function classificarHeroi() {
    const resultado = document.getElementById("resultado");
	let nomeHeroi = document.getElementById("nomeHeroi").value;
	let experiencia = parseInt(document.getElementById("xpAtual").value);
	let nivel = "Ferro"; // Valor padrão

	for (const [key, value] of Object.entries(classificador)) {
		if (experiencia <= value) {
			nivel = key;
			break;
		}
	}
    resultado.textContent = `O Herói de nome ${nomeHeroi} está no nível de ${nivel}`;
}