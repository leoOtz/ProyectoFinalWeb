<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">

<title>SPORT</title>
</head>
<body>

<%@include file="cabecera.txt" %>


<section id="main_container">

       
		 <%@include file="SubCabeceraRopa.txt" %>


        <!-- Contenido -->
        <section>
           		
				<table style="width:80%" border="1" >
				
  <tr>
    <th></th>
    <th>Nombre</th>
	<th>Precio </th>
	<th> </th>
	
  </tr>
  <tr>
    <td align="center"><img src="images/Sport.jpeg" width="150" height="150" alt="foto chompa polo"  /></td>
    <td align="center">Chompa de Caballero Marca Polo</td>
	<th>$ 25.00</th>
	<td align="center">
	<table cellspacing="2" cellpadding="2" border="4">
	<tr> 
            <td><button type="button">Añadir!</button> </td> 
            
            <td><button type="button">Quitar!</button> </td>
           
       </tr>	
       </table> 
	 </td>
  </tr>
  <tr>
    
   
  </tr>
</table>
				
	<table style="width:100%" bgcolor="#286af0" >
	<tr>
		<!-- NAV-->
	<nav>
  <ul>
   <th height="50"> COTIZA TU PEDIDO </th>
   </table>
   <table style="width:100%" border="1" >
				
  <tr>
    
    <th>Cantidad</th>
	<th>Detalle Ropa </th>
	<th>Precio Unitario </th>
	<th>Precio Total </th>
	<th></th>
	
	
  </tr>
  <tr>
  
    <td>2</td>
    <td>Chompa de Caballero Marca Polo</td>
	<th>$ 25.00</th>
	<th>$ 50.00</th>
	<th>$ (+) (-)</th>
  </tr>
  <tr>
    
   
  </tr>
</table>
   
 </th>
</th>
  </ul>
  
</nav>
 </tr>		
 
	
</table>			
						
	<table style="width:100%" bgcolor="#286af0" >
	<tr>
	
  <ul>
   <th height="50"> Total: <input type="text" name="nombredelacaja"></th>
   </table>		
   <br><br>
		<center> 
        <button type="button">Enviar Proforma</button>	
          </center>

            
            <p></p>
            <p></p>
	

	
	
	<br><br>

<jsp:include page="piePagina.jsp" />

</body>
</html>