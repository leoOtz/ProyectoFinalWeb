<?php
$mail="leo666dog@gmail.com";
$nombre = $_POST ['nombre'];
$email = $_POST ['email'];
$comentarios = $_POST ['comentario'];

$Thank="http://www.facebook.com";

$message =

Nombre: ".$nombre."
Email: ".$email."
Comentarios: ".$comentarios."
";


if(mail ($mail,"Nuevo Mensaje", $message))

Header ("location: $Thank");
echo 'mensaje enviado correctamente';

?>