<?php
include("conexao.php");
include("banco-cliente.php");

$idCliente = $_GET['idCliente'];
$cliente = buscarCliente($conexao,$idCliente);
?>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Alterar cliente</title>
	</head>
	<body>
	<h1>Alterar Cliente</h1>
	<form method="post" action="verifica-alteracao.php">
		<input type="hidden" name="idCliente" value="<?php echo $cliente['idCliente']?>"><br>
		Nome:<input type="text" name="nome" value="<?php echo $cliente['nome']?>"><br>
		Email:<input type="text" name="email" value="<?php echo $cliente['email']?>"><br>
		Idade:<input type="text" name="idade" value="<?php echo $cliente['idade']?>"><br>
		<input type="submit" value="Alterar" name="btnAlterar"><br>
	</form>
	</body>
</html>