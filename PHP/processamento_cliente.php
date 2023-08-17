<?php
include("conexao.php");
include("banco-cliente.php");
$nome=$_POST['name'];
$sobrenome=$_POST['sobrenome'];
$telefone=$_POST['telefone'];
$cpf=$_POST['cpf'];
$email=$_POST['email'];
$pass=$_POST['pass'];
$cpass=$_POST['cpass'];
$cep=$_POST['cep'];
$endereco=$_POST['endereco'];
if(!inserir($conexao, $nome, $email, $pass,$cpass, $sobrenome, $telefone ,$cpf ,$cep,$endereco)){
    
	echo "cadastrado <br>";
}
else{
	echo "erro ao cadastrar<br>";
}
?>