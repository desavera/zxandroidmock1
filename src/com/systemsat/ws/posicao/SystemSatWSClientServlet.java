
package com.systemsat.ws.posicao;

import java.util.*;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.ws.WebServiceRef;

@WebServlet(name="SystemSatWSClientServlet", urlPatterns={"/posicao"})
public class SystemSatWSClientServlet extends HttpServlet {
    @WebServiceRef(wsdlLocation = "http://www.globalsearch.com.br/webservice/posicoes.asmx?wsdl")
    private static Posicoes service;
   
    /** 
     * Processes requests for both HTTP <code>GET</code> 
     *   and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, 
            HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            out.println("<html lang=\"en\">");
            out.println("<head>");
            out.println("<title>Servlet SystemSat Web Service Client</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet at " + 
                request.getContextPath () + "</h1>");
            out.println("<p>" + "Hello World !!!" + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
    } 
}
