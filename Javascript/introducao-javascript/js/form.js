function capturaFormPaciente(form){
	var paciente = {
		nome: form.nome.value,
		peso: form.peso.value,
		altura: form.altura.value,
		gordura: form.gordura.value,
		imc: calculaImc(form.peso.value, form.altura.value)
	}

	return paciente;
}

function montaTd(dado, nomeClasse){
	var meuTd = document.createElement("td");
	meuTd.textContent = dado;
	meuTd.classList.add(nomeClasse);

	return meuTd;
}

function montaTr(paciente){
	var pacienteTr = document.createElement("tr");

	pacienteTr.classList.add("paciente");

	pacienteTr.appendChild(montaTd(paciente.nome, "info-nome"));
	pacienteTr.appendChild(montaTd(paciente.peso, "info-peso"));
	pacienteTr.appendChild(montaTd(paciente.altura, "info-altura"));
	pacienteTr.appendChild(montaTd(paciente.gordura, "info-gordura"));
	pacienteTr.appendChild(montaTd(paciente.imc, "info-imc"));

	return pacienteTr;
}

function exibeMensagemErros(erros){
	var ul = document.querySelector("#mensagens-erro");

	destroiErros();

	erros.forEach(function(erro) {
		var minhaLi = document.createElement("li");
		minhaLi.textContent = erro
		minhaLi.classList.add("linha-de-erro");
		ul.appendChild(minhaLi);
	});
}

function destroiErros(){

	var ul = document.querySelector("#mensagens-erro");

	ul.innerHTML = "";

/*
	var lis = document.querySelectorAll(".linha-de-erro");	

	lis.forEach(function(li){
		li.remove();
	})*/
}

function validaPaciente(paciente){
	retorno = true;
	var caixaErro = document.querySelector("#mensagem-erro");
	var mensagemErro = []

	if (paciente.nome.length == 0){
		mensagemErro.push("Atenção! É necessário haver um nome!");
		retorno = false;
	}
	if (!validaPeso(paciente.peso)){
		mensagemErro.push("Atenção! Peso inválido!");
		retorno = false;
	}
	if (!validaAltura(paciente.altura)){
		mensagemErro.push("Atenção! Altura inválida!");
		retorno = false;
	}
	if (paciente.gordura <=0 || paciente.gordura > 100){
		mensagemErro.push("Atenção! Percentual de gordura inválido!");
		retorno = false;	
	}
	if (!retorno){
		exibeMensagemErros(mensagemErro);
		//caixaErro.textContent = mensagemErro;
	}
	return retorno;
}

function adicionaPaciente(event){
	event.preventDefault();

	var form = document.querySelector("#form-adiciona");

	var paciente = capturaFormPaciente(form);
	
	if (validaPaciente(paciente)){
		adicionaPacienteNaTabela(paciente);

		form.nome.focus();
		destroiErros();
		form.reset();
	}

}

function adicionaPacienteNaTabela(paciente){
	var pacienteTr = montaTr(paciente);
	
	var tabela = document.querySelector("#tabela-pacientes");

	tabela.appendChild(pacienteTr);
}

/*
As duas funções abaixo removem um elemento quando o evento foi ligado 
diretamente à linha
*/
function removePaciente(){
	this.remove();
}

function ligaEventoPaciente(){
	var pacientes =document.querySelectorAll(".paciente");

	pacientes.forEach(function(paciente){
		paciente.addEventListener("dblclick", removePaciente);
	})

}

/*
As duas funções abaixo removem um elemento quando o evento foi ligado
à tabela e portanto deve remover um dos seus filhos
*/
function removePacienteFilho(event){
	/*
	event diz respeito à quem recebe o evento, no caso a tabela (tbody)
	event.target diz respeito à quem de fato recebeu o click, a célula (td)
	event.target.parentNode representa o pai da célula, ou seja a linha (tr)
	*/
	event.target.parentNode.classList.add("fadeOut");
	setTimeout(function(){
		event.target.parentNode.remove();	
	},500)
	
}

function ligaEventoTabelaPaciente(){
	var tabela = document.querySelector("#tabela-pacientes");
	tabela.addEventListener("dblclick",removePacienteFilho);
}

ligaEventoTabelaPaciente();
var botaoAdd = document.querySelector("#adicionar-paciente");
botaoAdd.onclick = adicionaPaciente;
