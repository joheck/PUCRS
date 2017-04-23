 function visible(){
	if(document.getElementById('radioComp').checked == true){
		console.log('none');
		document.getElementById('resultPCpf').style.display = 'none';
		
	} else
	if(document.getElementById('radioCpf').checked == true){
		console.log('block');
		document.getElementById('resultPCpf').style.display = 'inline';
		document.getElementById('resultPCpf').style.float = "right";
		document.getElementById('resultPCpf').style.marginRight = "170px";
		}else
	if(document.getElementById('radioQtd').checked == true){
		console.log('none');
		document.getElementById('resultPCpf').style.display = 'none';
		}
};			