<%-- 
    Document   : index
    Created on : 09-27-2019, 08:17:43 PM
    Author     : Alexis
--%>

<%@page import="java.util.Objects"%>
<%@page import="org.apache.commons.codec.digest.DigestUtils"%>
<%@page import="constructora.modelo.DaoLogin"%>
<%@page contentType="text/html" session="true" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="es">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Login</title>      
       
	<link rel="stylesheet" href="css/sweetalert2.css">
	<link rel="stylesheet" href="css/material.min.css">
	<link rel="stylesheet" href="css/material-design-iconic-font.min.css">
	<link rel="stylesheet" href="css/jquery.mCustomScrollbar.css">
	<link rel="stylesheet" href="css/main.css">
	<script src="//ajax.googleapis.com/ajax/libs/jquery/1.11.2/jquery.min.js"></script>
	<script>window.jQuery || document.write('<script src="js/jquery-1.11.2.min.js"><\/script>')</script>
	<script src="js/material.min.js" ></script>
	<script src="js/sweetalert2.min.js" ></script>
	<script src="js/jquery.mCustomScrollbar.concat.min.js" ></script>
	<script src="js/main.js" ></script>
</head>
<body class="cover">
	<div class="container-login">
		<p class="text-center" style="font-size: 80px;">
			<i class="zmdi zmdi-account-circle"></i>
		</p>
		<p class="text-center text-condensedLight">Inicia sesion con tu cuenta</p>
                <form action="index.jsp" method="POST">
			<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			    <input class="mdl-textfield__input" type="text" id="usuario" name="usuario">
			    <label class="mdl-textfield__label" for="userName">Usuario</label>
			</div>
			<div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label">
			    <input class="mdl-textfield__input" type="password" id="contra" name="contra">
			    <label class="mdl-textfield__label" for="pass">Contraseña</label>
			</div>
                    <!--input type="submit" id="registro" value="Guardar" name="registro" class="btn btn-success"/-->
                    
                    <center><button style="background-color: #3F51B5; color: white;" id="registo" name="registro" class="mdl-button mdl-js-button mdl-js-ripple-effect" style="color: #3F51B5;">
				Iniciar Sesion <i class="zmdi zmdi-mail-send"></i>
                    </button>
                        <hr style="background-color: #3F51B5;">
                        
                        <a href="vistaCliente.jsp" style="color: #3F51B5;">Registrate Con Nosotros</a>
                    </center>
		</form>
	</div>
    
   
        <%
        
        if(request.getParameter("registro")!=null){
            String usuario = request.getParameter("usuario");
            String contra = request.getParameter("contra");
            String contraEncryptada = DigestUtils.sha1Hex(contra);
            
            DaoLogin ob1 = new DaoLogin();
            HttpSession s = request.getSession();
            String rol = ob1.entrar(usuario, contraEncryptada);
            
            if(Objects.equals(rol, "Administrador") || Objects.equals(rol, "Director de proyectos")
                    || Objects.equals(rol, "Empleado") || Objects.equals(rol, "Cliente") ){
                s.setAttribute("usuario", usuario);
                s.setAttribute("rol", rol);
                response.sendRedirect("dashboard.jsp");                
            }else{               
                out.write("<div style='height: 27px; padding-top: 5px; "
                + "background-color: #FAB1AD; font-family: calibri; color: white;"
                + " font-size: 23px;'> <center>Usuario o contraseña no son válidos</center></div>");
            }            
            
        }
        
        if(request.getParameter("cerrar")!=null){
            session.invalidate();
        }
        
        %>
    
    
</body>
</html>