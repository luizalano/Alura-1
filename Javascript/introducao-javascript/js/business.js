
function calculaImcDeTodos(){
	var pacientes = document.querySelectorAll(".paciente");
	for (var i = 0; i < pacientes.length; i++) {
		var peso = pacientes[i].querySelector(".info-peso");
		var altura = pacientes[i].querySelector(".info-altura");
		var imcTela = pacientes[i].querySelector(".info-imc");

		var p = parseFloat (peso.textContent);
		var a = parseFloat(altura.textContent);

		pesoOk = validaPeso(p);
		alturaOk = validaAltura(a);

		var imcCalc = 0
		if (pesoOk && alturaOk){
			imcCalc = calculaImc(p, a)
		}
		else {
			imcCalc = 'Inconsistência!';
			pacientes[i].classList.add("paciente-invalido");
		}

		imcTela.textContent = imcCalc;
	}
}

function validaPeso(peso){
	if (peso <= 0 || peso > 800) { return false;}
	return true;
}

function validaAltura(altura){
	if (altura <= 0 || altura > 3) { return false;}
	return true;
}

function calculaImc(peso, altura){
	return (Math.round((peso / (altura * altura)) * 100) / 100).toFixed(2);
}

calculaImcDeTodos();


//botaoAdd.addEventListener("click", adicionaPaciente);  esse permite associar mais de uma elemento

