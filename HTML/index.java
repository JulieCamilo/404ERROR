<!DOCTYPE html>
<html lang="pt-br">
<head>
   <meta charset="UTF-8">
   <meta http-equiv="X-UA-Compatible" content="IE=edge">
   <meta name="viewport" content="width=device-width, initial-scale=1.0">
   <link rel="shortcut icon" href="/caminho/favicon.ico">
   <title>404 ERROR - PIZZAS</title>

   <!-- font awesome cdn link  -->
   <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.1.1/css/all.min.css">

   <!-- custom css file link  -->
   <link rel="stylesheet" href="css/estilo.css">
   <script type="text/javascript" src="script.js"></script>

</head>
<body>
   
<!-- onde começa a header  -->

<header class="header">

   <section class="flex">

      <a href="#home" class="logo">404 ERROR</a>

      <nav class="navbar">
         <a href="#home">Home</a>
         <a href="#about">Sobre</a>
         <a href="#menu">Menu</a>
         <a href="#order">Pedidos</a>
         <a href="#faq">FAQ</a>
      </nav>

      <div class="icons">
         <div id="menu-btn" class="fas fa-bars"></div>
         <div id="user-btn" class="fas fa-user"></div>
         <div id="order-btn" class="fas fa-box"></div>
         <div id="cart-btn" class="fas fa-shopping-cart"></div>
      </div>

   </section>

</header>

<!-- onde termina a header -->

<div class="user-account">

   <section>

      <div id="close-account"><span>sair</span></div>

      <div class="flex">

         <form method="post" action="index.php">
            <h3>login</h3>
            <input type="email" name="email" required class="box" placeholder="email" maxlength="50">
            <input type="password" name="pass" required class="box" placeholder="senha" maxlength="20">
            <input type="submit" value="login" name="login" class="btn">
         </form>

         <form method="post" action="processamento-cliente.php">
            <h3>cadastre-se</h3>
            <input type="text" name="name" required class="box" placeholder="nome" maxlength="30">
            <input type="text" name="sobrenome" required class="box" placeholder="sobrenome" maxlength="30">
            <input type="text" name= "telefone" required class="box" placeholder="telefone" maxlength="11">
            <input type="text" name= "cpf" required class="box" placeholder="cpf" maxlength="11">
            <input type="text" name= "endereco" required class="box" placeholder="endereço" maxlength="150">
            <input type="text" name= "cep" required class="box" placeholder="cep" maxlength="8">
            <input type="email" name="email" required class="box" placeholder="email" maxlength="500">
            <input type="password" name="pass" required class="box" placeholder="senha" maxlength="30">
            <input type="password" name="cpass" required class="box" placeholder="confirme sua senha" maxlength="30">
            <input type="submit" value="cadastre-se" name="register" class="btn">
         </form>


      </div>

   </section>

</div>

<div class="my-orders">

   <section>

      <div id="close-orders"><span>sair</span></div>

      <h3 class="title"> meus pedidos</h3>

      <div class="box">
         <p>pedido feito : <span>02/12/2022</span> </p>
         <p>nome : <span>Jeff</span> </p>
         <p>número : <span>(11)94002-8922</span></p>
         <p>endereço : <span>Rua Tito, 115 - Senac Lapa Tito</span></p>
         <p>metódo de pagamento : <span>Cartão de Crédito</span></p>
         <p>seus pedidos : <span>Pizza de Muçarela R$30-2, Pizza de Brócolis R$42-1, Pizza Vegetariana R$40-2, Pizza de Portuguesa, R$36-1</span></p>
         <p>total: <span>R$ 268</span></p>
         <p>status de pagamento : <span style="color: var(--red);">pendente</span> </p>
      </div>
	  
	  

   </section>

</div>

<div class="shopping-cart">

   <section>

      <div id="close-cart"><span>sair</span></div>

      <div class="box">
         <a href="#" class="fas fa-times"></a>
         <img src="images/pizza-mussa.png" alt="">
         <div class="content">
            <p>Pizza de Muçarela <span>(R$30)</span></p>
            <form action="" method="post">
               <input type="number" class="qty" name="qty" min="1" value="2" max="100">
               <button type="submit" class="fas fa-edit" name="update_qty"></button>
            </form>
         </div>
      </div>

      <div class="box">
         <a href="#" class="fas fa-times"></a>
         <img src="images/pizza-bro.png" alt="">
         <div class="content">
            <p>Pizza de Brócolis <span>(R$42)</span></p>
            <form action="" method="post">
               <input type="number" class="qty" name="qty" min="1" value="1" max="100">
               <button type="submit" class="fas fa-edit" name="update_qty"></button>
            </form>
         </div>
      </div>

      <div class="box">
         <a href="#" class="fas fa-times"></a>
         <img src="images/pizza-veg.png" alt="">
         <div class="content">
            <p>Pizza Vegetariana <span>(R$40)</span></p>
            <form action="" method="post">
               <input type="number" class="qty" name="qty" min="1" value="2" max="100">
               <button type="submit" class="fas fa-edit" name="update_qty"></button>
            </form>
         </div>
      </div>

      <div class="box">
         <a href="#" class="fas fa-times"></a>
         <img src="images/pizza-port.png" alt="">
         <div class="content">
            <p>Pizza de Portuguesa <span>(R$36)</span></p>
            <form action="" method="post">
               <input type="number" class="qty" name="qty" min="1" value="1" max="100">
               <button type="submit" class="fas fa-edit" name="update_qty"></button>
            </form>
         </div>
      </div>

      <a href="#pedido" class="btn">fazer pedido</a>

   </section>

</div>

<div class="home-bg">

   <section class="home" id="home">

      <div class="slide-container">

         <div class="slide active">
            <div class="image">
               <img src="images/pizza-pepe.png" alt="">
            </div>
            <div class="content">
               <h3>Pizza Peperoni</h3>
               <div class="fas fa-angle-left" onclick="prev()"></div>
               <div class="fas fa-angle-right" onclick="next()"></div>
            </div>
         </div>

         <div class="slide">
            <div class="image">
               <img src="images/pizza-qua.png" alt="">
            </div>
            <div class="content">
               <h3>Pizza 4 Queijos</h3>
               <div class="fas fa-angle-left" onclick="prev()"></div>
               <div class="fas fa-angle-right" onclick="next()"></div>
            </div>
         </div>

         <div class="slide">
            <div class="image">
               <img src="images/pizza-bro.png" alt="">
            </div>
            <div class="content">
               <h3>Pizza Brócolis</h3>
               <div class="fas fa-angle-left" onclick="prev()"></div>
               <div class="fas fa-angle-right" onclick="next()"></div>
            </div>
         </div>

      </div>

   </section>

</div>

<!-- seção sobre começa  -->

<section class="about" id="about">

   <h1 class="heading">sobre nós</h1>

   <div class="box-container">

      <div class="box">
         <img src="images/about-1.svg" alt="">
         <h3>Feito com carinho</h3>
         <p>Especialmente para você!</p>
         <a href="#menu" class="btn">Nosso menu</a>
      </div>

      <div class="box">
         <img src="images/about-2.svg" alt="">
         <h3>Tempo de entrega</h3>
         <p>Aguarde um pouquinho!</p>
         <a href="#menu" class="btn">Nosso menu</a>
      </div>

      <div class="box">
         <img src="images/about-3.svg" alt="">
         <h3>Compartilhe com os amigos</h3>
         <p>Nas redes sociais!</p>
         <a href="#footer" class="btn">Onde nos encontrar!</a>
      </div>

   </div>

</section>

<!-- about section ends -->

<!-- menu section starts  -->

<section id="menu" class="menu">

   <h1 class="heading">nosso menu</h1>

   <div class="box-container">

      <div class="box">
         <div class="price">R$<span>30</span></div>
         <img src="images/pizza-mussa.png" alt="">
         <div class="name">Pizza de Muçarela</div>
         <form action="" method="post">
            <input type="number" min="1" max="100" value="1" class="qty" name="qty">
            <input type="submit" value="adicionar" name="adicionar" class="btn">
         </form>
      </div>

      <div class="box">
         <div class="price">R$<span>42</span></div>
         <img src="images/pizza-cala.png" alt="">
         <div class="name">Pizza de Calabresa</div>
         <form action="" method="post">
            <input type="number" min="1" max="100" value="1" class="qty" name="qty">
            <input type="submit" value="adicionar" name="adicionar" class="btn">
         </form>
      </div>

      <div class="box">
         <div class="price">R$<span>35</span></div>
         <img src="images/pizza-bro.png" alt="">
         <div class="name">Pizza de Brócolis</div>
         <form action="" method="post">
            <input type="number" min="1" max="100" value="1" class="qty" name="qty">
            <input type="submit" value="adicionar" name="adicionar" class="btn">
         </form>
      </div>

      <div class="box">
         <div class="price">R$<span>40</span></div>
         <img src="images/pizza-baco.png" alt="">
         <div class="name">Pizza de Bacon</div>
         <form action="" method="post">
            <input type="number" min="1" max="100" value="1" class="qty" name="qty">
            <input type="submit" value="adicionar" name="adicionar" class="btn">
         </form>
      </div>

      <div class="box">
         <div class="price">R$<span>42</span></div>
         <img src="images/pizza-pepe.png" alt="">
         <div class="name">Pizza de Peperoni</div>
         <form action="" method="post">
            <input type="number" min="1" max="100" value="1" class="qty" name="qty">
            <input type="submit" value="adicionar" name="adicionar" class="btn">
         </form>
      </div>

      <div class="box">
         <div class="price">R$<span>40</span></div>
         <img src="images/pizza-veg.png" alt="">
         <div class="name">Pizza Vegetariana</div>
         <form action="" method="post">
            <input type="number" min="1" max="100" value="1" class="qty" name="qty">
            <input type="submit" value="adicionar" name="adicionar" class="btn">
         </form>
      </div>

      <div class="box">
         <div class="price">R$<span>36</span></div>
         <img src="images/pizza-port.png" alt="">
         <div class="name">Pizza de Portuguesa</div>
         <form action="" method="post">
            <input type="number" min="1" max="100" value="1" class="qty" name="qty">
            <input type="submit" value="adicionar" name="adicionar" class="btn">
         </form>
      </div>

      <div class="box">
         <div class="price">R$<span>39</span></div>
         <img src="images/pizza-qua.png" alt="">
         <div class="name">Pizza de 4 Queijos</div>
         <form action="" method="post">
            <input type="number" min="1" max="100" value="1" class="qty" name="qty">
            <input type="submit" value="adicionar" name="adicionar" class="btn">
         </form>
      </div>

      <div class="box">
         <div class="price">R$<span>33</span></div>
         <img src="images/pizza-choco.png" alt="">
         <div class="name">Pizza de Chocolate</div>
         <form action="" method="post">
            <input type="number" min="1" max="100" value="1" class="qty" name="qty">
            <input type="submit" value="adicionar" name="adicionar" class="btn">
         </form>
      </div>

   </div>

</section>

<!-- menu section ends -->

<!-- order section starts  -->

<section class="order" id="order">

   <h1 class="heading">Fazer pedido</h1>

   <form action="" method="post">

      <div class="flex">
         <div class="inputBox">
            <span>Seu nome :</span>
            <input type="text" name="name" class="box" required placeholder="Nome" maxlength="20">
         </div>
         <div class="inputBox">
            <span>Seu número de telefone :</span>
            <input type="number" name="number" class="box" required placeholder="Número" maxlength="9">
         </div>
         <div class="inputBox">
            <span>Método de pagamento</span>
            <select name="method" class="box">
               <option value="cartão de débito/crédito">Cartão de débito/crédito</option>
               <option value="pix">PIX</option>
               <option value="dinheiro no delivery">Dinheiro no delivery</option>
               <option value="paypal">Paypal</option>
            </select>
         </div> 
         <div class="inputBox">
            <span>Endereço 02 :</span>
            <input type="text" name="flat" class="box" required placeholder="Número do apto" maxlength="50">
         </div>
         <div class="inputBox">
            <span>Endereço 01 :</span>
            <input type="text" name="street" class="box" required placeholder="Nome da rua" maxlength="50">
         </div>
      </div>

      <input type="submit" value="Fazer pedido" class="btn" name="order">

   </form>

</section>

<!-- order section ends -->

<!-- faq section starts  -->

<section class="faq" id="faq">

   <h1 class="heading">FAQ</h1>

   <div class="accordion-container">

      <div class="accordion active">
         <div class="accordion-heading">
            <span>Como foi fazer esse trabalho?</span>
            <i class="fas fa-angle-down"></i>
         </div>
         <p class="accrodion-content">
           Foi um trabalho bem complexo, com muitos altos e baixos. Reinventamos nosso trabalho diversas vezes e conseguimos fazer algo que representasse nosso grupo e mostra-se nossas habilidades como programadores.
         </p>
      </div>

      <div class="accordion">
         <div class="accordion-heading">
            <span>Por que vocês escolheram fazer um site de pizza?</span>
            <i class="fas fa-angle-down"></i>
         </div>
         <p class="accrodion-content">
            A princípio iriamos fazer um site de jogos, porém era muito complexo. Então entramos em um consenso e decidimos fazer um site de pizza porque era mais simples.
         </p>
      </div>

      <div class="accordion">
         <div class="accordion-heading">
            <span>O que mais gostaram de fazer nele?</span>
            <i class="fas fa-angle-down"></i>
         </div>
         <p class="accrodion-content">
           O front-end, pois é mais divertido de produzir e podemos personalizar o site conforme queremos.
         </p>
      </div>

      <div class="accordion">
         <div class="accordion-heading">
            <span>Dá para fazer pedidos de verdade?</span>
            <i class="fas fa-angle-down"></i>
         </div>
         <p class="accrodion-content">
            Sim, mas ele nunca vai chegar na sua casa rs.
         </p>
      </div>


      <div class="accordion">
         <div class="accordion-heading">
            <span>Acham que o Jeff irá gostar do trabalho?</span>
            <i class="fas fa-angle-down"></i>
         </div>
         <p class="accrodion-content">
            Claro que sim. Somos o orgulho dele, ué.
         </p>
      </div>

   </div>

</section>

<!-- faq section ends -->

<!-- footer section starts  -->

<section class="footer" id="footer">

   <div class="box-container">

      <div class="box">
         <i class="fas fa-phone"></i>
         <h3>Nosso número</h3>
         <p>(11)940404 404</p>
      </div>

      <div class="box">
         <i class="fas fa-map-marker-alt"></i>
         <h3>Nosso endereço</h3>
         <p>Rua Tito, 54 - Senac Lapa Tito</p>
      </div>

      <div class="box">
         <i class="fas fa-clock"></i>
         <h3>Horário de funcionamento</h3>
         <p>18h às 01h</p>
      </div>

      <div class="box">
         <i class="fas fa-envelope"></i>
         <h3>Email</h3>
         <p>404error_pizzarias@gmail.com</p>
      </div>

   </div>

   <div class="credit">
      &copy; Copyright @ 2022 by <span>Gabi Melo, Gabriel Munhoz, Julie Camilo, Maria Giulia, Sabrina Marinho, Sandra Marcello, Sandro Marcello & Vinicíus Augusto</span> | All Rights Reserved!
   </div>

</section>

<!-- footer section ends -->



<!-- custom js file link  -->
<script src="js/script.js"></script>

</body>
</html>