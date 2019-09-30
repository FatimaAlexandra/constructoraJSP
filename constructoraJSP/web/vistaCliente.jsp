<%-- 
    Document   : vistaCliente
    Created on : 09-28-2019, 02:45:08 AM
    Author     : Alexis
--%>

<%@page contentType="text/html" import="constructora.entidades.*" import="java.util.*"  pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<title>Registro</title>
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
        <script src="bootstrap/jquery.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
        <script src="bootstrap/sweetalert2.all.min.js"></script>
        
           
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
         
                 
        <div class="container-registro">
            <a href="index.jsp" style="float: left; color: #3F51B5; margin-top: 25px; margin-left: 10px;"> 
                <i style="font-size: 45px; " class="zmdi zmdi-chevron-left"></i>
            </a>
            <center>
                <h3 style="font-family: calibri">Registro de Clientes <i class="zmdi zmdi-account-add"></i></h3>
            </center>
                
                <form name="f1" id="f1" action="controlCliente">                                
                       
                    <div class="row">
                        
                        <div class="col-md-6">
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" style="padding-bottom: 28px;">
                                <input class="mdl-textfield__input" type="text" id="usuario" name="usuario" >
                                <label class="mdl-textfield__label" for="usuario">Usuario</label>
                            </div>
                        </div>
                        
                        <div class="col-md-6">
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" style="padding-bottom: 28px;">
                                <input class="mdl-textfield__input" type="text" id="correo" name="correo" >
                                <label class="mdl-textfield__label" for="correo">Correo</label>
                            </div>
                        </div>
                        
                    </div>
                    
                    <div class="row">
                        
                        <div class="col-md-6">
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" style="padding-bottom: 28px;">
                                <input class="mdl-textfield__input" type="text" id="nombre" name="nombre" >
                                <label class="mdl-textfield__label" for="nombre">Nombre</label>
                            </div>
                        </div>
                        
                        <div class="col-md-6">
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" style="padding-bottom: 28px;">
                                <input class="mdl-textfield__input" type="text" id="telefono" name="telefono" >
                                <label class="mdl-textfield__label" for="telefono">Telefono</label>
                            </div>
                        </div>
                        
                    </div>
                    
                    <div class="row">
                        
                        <div class="col-md-6">
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" style="padding-bottom: 28px;">
                                <input class="mdl-textfield__input" type="text" id="dui" name="dui" >
                                <label class="mdl-textfield__label" for="dui">Dui</label>
                            </div>
                        </div>
                        
                        <div class="col-md-6">
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" style="padding-bottom: 28px;">
                                <input  style="color: #B7B7B7; font-size: 17px; font-family: times-romans" class="mdl-textfield__input" type="date" id="fechaNacimiento" name="fechaNacimiento" >
                                <label class="mdl-textfield__label" for="fechaNacimiento"></label>
                            </div>
                        </div>
                        
                    </div>
                    
                    <div class="row">
                        
                        <div class="col-md-12">
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" style="padding-bottom: 28px;">
                                <input class="mdl-textfield__input" type="text" id="direccion" name="direccion" >
                                <label class="mdl-textfield__label" for="direccion">Direccion</label>
                            </div> 
                        </div>
                                                
                    </div>
                    
                    <div class="row">
                        
                        <div class="col-md-6">
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" style="padding-bottom: 28px;">
                                <input class="mdl-textfield__input" type="password" id="contra" name="contra">
                                <label class="mdl-textfield__label" for="contra">Contraseña</label>
                            </div>
                        </div>
                        
                        <div class="col-md-6">
                            <div class="mdl-textfield mdl-js-textfield mdl-textfield--floating-label" style="padding-bottom: 28px;">
                                <input class="mdl-textfield__input" type="password" id="confirmarContraseña" name="confirmarContraseña">
                                <label class="mdl-textfield__label" for="confirmarContraseña">Confirmar Contraseña</label>
                            </div>   
                        </div>
                        
                    </div>
                    
                    <center>
                        <button style="background-color: #3F51B5; color: white;" id="insertar" name="insertar" class="mdl-button mdl-js-button mdl-js-ripple-effect" >
				Registrarse
                        </button>
                    </center>
                    
		</form>
                
	</div>
            <%
                if(request.getAttribute("error")!=null)
                    out.println("<script>Swal.fire('error','"+request.getAttribute("error")+"','info')</script>");
                if(request.getAttribute("r")!=null)
                    out.println("<script>Swal.fire('respuesta','"+request.getAttribute("r")+"','info')</script>");
            %>
    </body>
</html>

