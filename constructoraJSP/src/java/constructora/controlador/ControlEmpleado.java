/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructora.controlador;

import constructora.entidades.Empleado;
import constructora.modelo.DaoEmpleado;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.commons.codec.digest.DigestUtils;

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
    int r = 0;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            RequestDispatcher res;
            
            DaoEmpleado ob1 = new DaoEmpleado();
            
            if(request.getParameter("insertar")!=null){
                try {
                    
                    String recibirContra = request.getParameter("contra");
                    String contraEncryptada = DigestUtils.sha1Hex(recibirContra); 
                    
                    emp = new Empleado(request.getParameter("usuario"),
                        request.getParameter("correo"),
                        contraEncryptada,
                        request.getParameter("nombre"),
                        request.getParameter("direccion"),
                        request.getParameter("telefono"),
                        request.getParameter("dui"),
                        request.getParameter("fechaNacimiento"),
                        request.getParameter("tipoEmpleado"),
                        Double.parseDouble(request.getParameter("pagoDia")));                    
                 
                    r=ob1.insertar(emp);   

                    if(r>0){
                        request.setAttribute("r", "Felicidades, Su registro finalizo exitosamente.!!");
                    }else{
                        request.setAttribute("r", "No pudo ser registrado:( ");
                    }                    
                    
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
