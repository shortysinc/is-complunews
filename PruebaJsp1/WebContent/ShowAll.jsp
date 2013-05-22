<%@page import="java.io.IOException"%>
<%@page import="javax.swing.JOptionPane"%>
<%@page import="sun.security.jca.GetInstance"%>
<%@ page language="java" contentType="text/html; charset=utf-8"
  pageEncoding="utf-8" import="PackagePrueba.Persona"%>
<!DOCTYPE html> 
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Show all names</title>
</head>
<body>


<form method="GET" action='Controller' name="showall">
<table>
	<tr>
    	<td><input type="checkbox" name="id1" /></td>
    	<td>Jim</td>
    	<td>Knopf</td>
  	</tr>
 	<tr>
    	<td><input type="radio" name="id2" /></td>
    	<td>Jim</td>
    	<td>Bean</td>
  	</tr>
</table>

<!-- Parrafo -->
<p>
	<input type="submit" name="delete" value="delete" />&nbsp; 
   	<input type="submit" name="edit" value="edit" />&nbsp; 
  	<input type="reset" value="reset" />
  	<input type="button" name="hola" value="Hola" onclick= "alert('Que te jodan'); return true">
</p> 
  	<div></div>
  	<%Persona persona = new Persona("jorge", "Madrid", 23);%>
  	<div>
  		<%out.println("El nombre de este señor es: "+persona.getNombre());%>
  	</div>
  	<div>
  		<%out.println("El Id de la persona es: "+persona.getId());%>
  	</div>
  	<div>
  		<%out.println("La ciudad donde vive este tio es: "+persona.getCiudad());%>
    </div>
    
	    <%out.println("Quieres cambiar el nombre de la persona?");%>
	    <input type="text" name="nuevoNombre">
	    <input type="submit" value="Enviar">
	    <br/>
	    
	    <%
	    	
	    	//String NewName = request.getParameter("nuevoNombre");
	    	if(request.getParameter("nuevoNombre")==null)
	    		out.println("Aún no has introducido ningún nombre");
	    		
	    	else
	    	{ 
	    		persona.setNombre(request.getParameter("nuevoNombre"));
    			out.println("El nombre de este señor es: "+ persona.getNombre());
	    		
	    		/* if(request.getParameter("nuevoNombre").equalsIgnoreCase(persona.getNombre().toString()))
	    		{
	    			out.println("Has introducido un nombre que ya existia");
	    			
	    		}
	    		else
	    		{
	    			;
	    			
	    			
	    		} */
	    	}
	    %>
	
    

</form>



</body>
</html> 