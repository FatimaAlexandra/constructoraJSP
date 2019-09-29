/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora.controlador;

import constructora.entidades.*;
import constructora.modelo.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jorge Alberto
 */
public class ControlEmpleado extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    Empleado emp;
    Usuario us;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            int r=0;
            RequestDispatcher res;
            DaoEmpleado ob1= new DaoEmpleado();
            DaoUsuario ob2= new DaoUsuario();
            if(request.getParameter("mostrar")!=null){
                try {
                    request.setAttribute("empleados", ob1.mostrar());
                    request.setAttribute("usuarios", ob2.mostrar());
                } catch (Exception e) {
                    request.setAttribute("error", e.getMessage());
                }
            }
            if(request.getParameter("insertar")!=null){
                try {
                   /*us=new Usuario(request.getParameter("usuario"), request.getParameter("correo"),
                            request.getParameter("contraseña"), request.getParameter("rol"));
                    r= ob1.insertar(us);*/
                    emp=new Empleado(request.getParameter("nombre"), request.getParameter("direccion"),
                            request.getParameter("telefono"),request.getParameter("dui"),
                            request.getParameter("fechaNacimiento"),request.getParameter("tipoEmpleado"),
                            Double.valueOf(request.getParameter("pagoDia")),new Usuario(Integer.valueOf(request.getParameter("idUsuario"))));
                    r= ob1.insertar(emp); 
                    request.setAttribute("empleados", ob1.mostrar());
                    request.setAttribute("usuarios", ob2.mostrar());
                                       
                    if(r>0)
                        request.setAttribute("r", "Su registro se ha guardado exitosamente");
                    else
                        request.setAttribute("r", "Su registro NO se guardo");
                    
                } catch (ClassNotFoundException | NumberFormatException | SQLException e) {
                    request.setAttribute("error", e.getMessage());
                }
            }
            if(request.getParameter("modificar")!=null){
                try {
                    /*us=new Usuario(Integer.valueOf(request.getParameter("idUsuario")),request.getParameter("usuario"), request.getParameter("correo"),
                            request.getParameter("contraseña"), request.getParameter("rol"));
                    r= ob1.insertar(us);*/
                    emp=new Empleado(Integer.valueOf(request.getParameter("idEmpleado")),
                            request.getParameter("nombre"), request.getParameter("direccion"),
                            request.getParameter("telefono"),request.getParameter("dui"),
                            request.getParameter("fechaNacimiento"),request.getParameter("tipoEmpleado"),
                            Double.valueOf(request.getParameter("pagoDia")),
                            new Usuario(Integer.valueOf(request.getParameter("idUsuario"))));
                    r= ob1.modificar(emp); 
                    request.setAttribute("empleados", ob1.mostrar());
                    request.setAttribute("usuarios", ob2.mostrar());
                                     
                    if(r>0)
                        request.setAttribute("r", "Su registro se ha modificado exitosamente");
                    else
                        request.setAttribute("r", "Su registro NO se ha modificado");
                    
                } catch (Exception e) {
                    request.setAttribute("error", e.getMessage());
                }
            }
            if(request.getParameter("eliminar")!=null){
                try {
                   /* us=new Usuario(Integer.valueOf(request.getParameter("idUsuario")));
                    r= ob1.insertar(us);*/
                    emp=new Empleado(Integer.valueOf(request.getParameter("idEmpleado")));
                    r= ob1.eliminar(emp); 
                    request.setAttribute("empleados", ob1.mostrar());
                    request.setAttribute("usuarios", ob2.mostrar());
                                     
                    if(r>0)
                        request.setAttribute("r", "Su registro se ha eliminado exitosamente");
                    else
                        request.setAttribute("r", "Su registro NO se ha eliminado");
                    
                } catch (Exception e) {
                    request.setAttribute("error", e.getMessage());
                }
            }
            res = request.getRequestDispatcher("vistaEmpleado.jsp");
            res.forward(request, response);
        }
        }
    

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
