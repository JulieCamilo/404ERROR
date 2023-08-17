<?php
//String de conexao com os 4 parâmetros
//1º parâmetro -> Endereço da máquina que está instalado o banco de dados -> localhost
//2º parâmetro -> Nome do usuário do banco de dados -> id19774602_root
//3º parâmetro -> Senha do banco de dadost -> Y5Zf)%)PebKmMdBA
//4º parâmetro -> Nome do banco de dados -> id9774602_pizzaria
$conexao = mysqli_connect("localhost","id19774602_root","Y5Zf)%)PebKmMdBA","id9774602_pizzaria");
if($conexao){
    echo "conectado";
}else{
    echo "erro";
}
?>