<%-- 
    Document   : vistaEmpleado
    Created on : 09-16-2019, 01:10:00 PM
    Author     : Administrador
--%>

<%@page contentType="text/html" import="constructora.entidades.*" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" type="text/css" href="bootstrap/css/bootstrap.css">
        <script src="jquery.js"></script>
        <script src="bootstrap/js/bootstrap.js"></script>
        <script src="sweetalert2.all.min.js"></script>
        <script>
            $(document).ready(function(){
                $('#del').click(function(){
                Swal.fire({
                    type:"info",
                    tittle:"Eliminar registro",
                    text:"No se podrá recuperar despues de eliminar",
                    showCancelButton:true,
                    cancelButtonColor:"red"
                    
                }).then(result=>{
                    if(result.value){
                        $('#d1').append("<input type='hidden' name='eliminar'>");
                        $('#f1').submit();
                    }
                });
                });
            });
        </script>
    </head>
    <body>
        <h1>Registro de Empleados</h1>
        <%
            if(request.getAttribute("empleados")==null)
                    response.sendRedirect("ControlEmpleado?mostrar=1");
            
            
        %>
        <div class="col-md-7">
            <form name="f1" id="f1" action="ControlEmpleado">
                <div id="d1"></div>
                <!--ID: <input type="text" id="idUsuario" name="idEmpleado" value="" class="form-control"/>
                Usuario: <input type="text" id="usuario" name="usuario" value="" class="form-control"/>
                Email: <input type="email" id="correo" name="correo" value="" class="form-control"/>
                Contraseña: <input type="password" id="contraseña" name="contraseña" value="" class="form-control"/>
                Confirmar Contraseña: <input type="text" id="confirmar" name="confirmar" value="" class="form-control"/>
                -->
                ID: <input type="text" id="idEmpleado" name="idEmpleado" value="" class="form-control"/>
                Nombre: <input type="text" id="nombre" name="nombre" value="" class="form-control"/>
                Dirección: <input type="text" id="direccion" name="direccion" value="" class="form-control"/>
                Telefono: <input type="text" id="telefono" name="telefono" value="" class="form-control"/>
                Dui: <input type="text" id="dui" name="dui" value="" class="form-control"/>
                Tipo Empleado: <select id="tipoEmpleado" name="tipoEmpleado" class="form-control"/>
                <option></option>
                <option value="Director_de_proyectos">Director_de_proyectos</option>
                <option value="Empleado" >Empleado</option>
                <option value="Albañi">Albañil</option>                
                </select>
                Pago por Dia: <input type="text" id="pagoDia" name="pagoDia" value="" class="form-control"/>
                Fecha Nacimiento: <input type="text" id="fechaNacimiento" name="fechaNacimiento" value="" class="form-control"/>
                Usuario: <select name="idUsuario" id="idUsuario" class="form-control">                    
                    <option></option>
                    <%
                       if(request.getAttribute("usuarios")!=null)
                        {
                            ArrayList<Usuario> usu = new ArrayList<Usuario>();
                            usu.addAll((Collection)request.getAttribute("usuarios"));
                            for(Usuario u:usu){
                                
                                 out.println("<option value='"+u.getIdUsuario()+"'>"+u.getUsuario()+"</option>");
                            }
                        }
                    %>
                </select><br>
                <input type="reset" value="Nuevo" onclick="$('#g').attr('disabled',false)" name="b1" class="btn btn-success"/>
                <input type="submit" id="g"  value="Guardar" name="insertar" class="btn btn-success"/>
                <input type="submit" value="Modificar" name="modificar" class="btn btn-success"/>
                <input type="button" id="del" value="Eliminar" name="eliminar" class="btn btn-success"/>
                <!--<a href="reporte.jsp" target="_blank"><input type="submit" value="Generar reporte" class="btn btn-success" /></a>-->
                <a href="reporte.jsp" target="_blank">  Generar Reporte</a>                
                
            </form><br>
                <table class="table-striped">
                    <tr>
                        <th>ID</th>
                        <th>NOMBRE</th>
                        <th>DIRECCION</th>
                        <th>TELEFONO</th>
                        <th>DUI</th>
                        <th>NACIMIENTO</th>
                        <th>TIPO EMPLEADO</th>
                        <th>PAGO DÍA</th>
                        <th>USUARIO</th>
                        <th>ACCION</th>
                    </tr>
                    <%
                        if(request.getAttribute("empleados")!=null){
                           
                            ArrayList<Empleado> empleado = new ArrayList<Empleado>();
                            empleado.addAll((Collection)request.getAttribute("empleados"));
                            for(Empleado e:empleado){
                               
                                out.println("<tr><td>"+e.getIdEmpleado()+""
                                        + "</td><td>"+e.getNombre()+""
                                        + "</td><td>"+e.getDireccion()+""
                                        + "</td><td>"+e.getTelefono()+""
                                        + "</td><td>"+e.getDui()+""
                                        + "</td><td>"+e.getFechaNacimiento()+""
                                        + "</td><td>"+e.getTipoEmpleado()+""
                                        + "</td><td>"+e.getPagoDia()+""
                                        + "</td><td>"+e.getIdUsuario().getUsuario()+"</td>"
                                        + "<td><input type='button' "
                                        + "value='editar' onclick=$('#idEmpleado')."
                                        + "val('"+e.getIdEmpleado()+"');$('#nombre')."
                                        + "val('"+e.getNombre()+"');$('#direccion')."
                                        + "val('"+e.getDireccion()+"');$('#telefono')."
                                        + "val('"+e.getTelefono()+"');$('#dui')."
                                        + "val('"+e.getDui()+"');$('#fechaNacimiento')."
                                        + "val('"+e.getTipoEmpleado()+"');$('#tipoEmpleado')."
                                        + "val('"+e.getFechaNacimiento()+"');$('#pagoDia')."
                                        + "val('"+e.getPagoDia()+"');$('#idUsuario')."
                                        + "val('"+e.getIdUsuario().getIdUsuario()+"'); "
                                        + "class='btn btn-danger'></td></tr>");
                            }
                        }
                    %>
                </table>
            
        </div>
                <%
                    if(request.getAttribute("error")!=null)
                         out.println("<script>Swal.fire('error','"+request.getAttribute("error")+"','info')</script>");
                    if(request.getAttribute("r")!=null)
                     out.println("<script>Swal.fire('respuesta','"+request.getAttribute("r")+"','info')</script>");
                %>
                
    </body>
        
</html>
