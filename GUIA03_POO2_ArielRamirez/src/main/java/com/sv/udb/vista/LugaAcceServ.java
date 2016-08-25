/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.sv.udb.vista;

import com.sv.udb.controlador.LugaAcceCtrl;
import com.sv.udb.modelo.LugaAcce;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author REGISTRO
 */
@WebServlet(name = "LugaAcceServ", urlPatterns = {"/LugaAcceServ"})
public class LugaAcceServ extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        boolean esValido = request.getMethod().equals("POST");
        if(esValido)
        {
            String mens = "";
            String CRUD = request.getParameter("lugaAcceBton");
            if(CRUD.equals("Guardar"))
            {
                LugaAcce obje = new LugaAcce();
                obje.setNombLugaAcce(request.getParameter("nomb"));
                obje.setFechAlta(new Date());
                obje.setEsta(1);
                mens = new LugaAcceCtrl().guar(obje) ? "Datos guardados exitosamente" : "Datos NO guardados";
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
            else if(CRUD.equals("Eliminar"))
            {
                
                 Long CodiLuga = Long.parseLong(request.getParameter("codiRadi") == null ? 
                            "0" : request.getParameter("codiRadi"));
                mens = new LugaAcceCtrl().elim(CodiLuga) ? "Datos Eliminados" : "Datos no eliminados"; 
                request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
            else if(CRUD.equals("Consultar"))
            {
                Long CodiLuga = Long.parseLong(request.getParameter("codiRadi") == null ? 
                            "0" : request.getParameter("codiRadi"));
                    LugaAcce objeLuga = new LugaAcceCtrl().get(CodiLuga);
                    if(objeLuga != null)
                    {
                        //System.out.println(objeLuga.getCodiLugaAcce() +" "+objeLuga.getNombLugaAcce());
                        request.setAttribute("codi", objeLuga.getCodiLugaAcce());
                        request.setAttribute("nomb", objeLuga.getNombLugaAcce());
                     }
                    request.getRequestDispatcher("/index.jsp").forward(request, response);
            }
           
        }
        else
        {
            response.sendRedirect(request.getContextPath() + "/index.jsp");
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
