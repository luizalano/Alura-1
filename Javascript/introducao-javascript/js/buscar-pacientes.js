function buscaPacientes(){
	
	var xhr = new XMLHttpRequest();

	i++;

	if ((i % 2) == 0) xhr.open("GET", "http://api-pacientes.herokuapp.com/pacientess");
	else xhr.open("GET", "http://api-pacientes.herokuapp.com/pacientes");
	
	xhr.addEventListener("load", function(){

		var mensErro = document.querySelector("#mensagem-erro");

		if (xhr.status == 200){
			var resposta = xhr.responseText;
			var pacientes = JSON.parse(resposta);

			pacientes.forEach(function(paciente){
				adicionaPacienteNaTabela(paciente);	
			})
			mensErro.classList.add("invisivel");
		} else {
			alert(xhr.status);
			alert(xhr.responseText);
			mensErro.classList.remove("invisivel");
		}

	})
	xhr.send();

}

var i = 1;

var botaoAdicionar = document.querySelector("#buscar-pacientes");
botaoAdicionar.addEventListener("click", buscaPacientes)