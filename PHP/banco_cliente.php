<?php
include ("conexao.php");
function insert ($conexao, $nome, $email, $pass,$cpass, $sobrenome, $telefone ,$cpf ,$cep,$endereco){
    /*if($pass==$cpass){
	$sql="insert into cliente(nome, senha, sobrenome, email, telefone, cpf, cep, endereco) values('$nome','$pass','$sobrenome','$email','$telefone','$cpf', '$cep','$endereco')";
	return mysqli_query($conexao,$sql);
    }else{
        echo "senha não é igual";
        header("location:index.html");
    }*/
    $sql = "insert into cliente(nome, senha, sobrenome, email, telefone, cpf, cep, endereco) values ('jeff','jeff','jeff','jeff','jeff','jeff','jeff','jeff')";
    mysqli_query($conexao,$sql);
    return true;
    echo "$nome <br>";
    echo "$sobrenome <br>";
    echo "$email <br>";
    echo "$cpass <br>";
    echo "$cpf <br>";
	
}

function alterar($conexao,$idCliente,$nome,$email){
	$sql = "update clientes set nome='$nome',email='$email' where idCliente=$idCliente";
	return mysqli_query($conexao,$sql);
}

function excluir($conexao,$idCliente){
	$sql = "delete from clientes where idCliente = $idCliente";
	return mysqli_query($conexao,$sql);
}

function listarClientes($conexao){
	$clientes = array();
	$sql = "select * from clientes";
	$resultado =  mysqli_query($conexao,$sql);
	
	while($cliente=mysqli_fetch_assoc($resultado)){
		array_push($clientes,$cliente);
	}
	return $clientes;
}

function buscarCliente($conexao,$idCliente){
	$sql = "select * from clientes where idCliente = $idCliente";
	$resultado = mysqli_query($conexao,$sql);
	return mysqli_fetch_assoc($resultado);

}
?>