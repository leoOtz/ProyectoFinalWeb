<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>Contacto</title>
<link rel="stylesheet" media="screen" href="css/styles.css" >


</head>
<body>
<header>
   <img src="images/LogoCADSO.jpg" alt="" />
   
   </header>

  <form class="contact_form" method="post" ACTION="enviarsdbg.php" name="contact_form" id="contacto" onsubmit="return validar ()">

<ul>
    <li>
         <h2>Contacto</h2>	
         
         <span class="required_notification">* Indica el campo obligatorio</span>
    </li>
    <li>
        <label for="name">Nombre*:</label>
        <input type="text" name="name" id="nombre"  required/>
    </li>
	
	<li>
    <label for="email">Correo*:</label>
    <input type="text" name="email" id="email"  required/>
    <span class="form_hint">Formato apropiado "Juan_bena@example.com"</span>
</li>

<li>
    <label for="message">Mensaje*:</label>
	<textarea name="message" id="comentarios" cols="40" rows="6" required ></textarea>
    
</li>

<li>
    <button class="submit" type="submit">Enviar</button>
</li>
</ul>




</form>
<jsp:include page="piePagina.jsp" />

</body>
</html>