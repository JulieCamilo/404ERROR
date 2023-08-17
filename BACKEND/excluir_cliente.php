<?php
include("conexao.php");
include("banco-cliente.php");

$id=$_GET['idCliente'];
if (excluir($conexao,$id)){
	header('Location:lista-clientes.php');
	die();
}
?>