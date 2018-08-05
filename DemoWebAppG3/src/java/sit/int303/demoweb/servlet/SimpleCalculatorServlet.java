/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sit.int303.demoweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nuntuch Thongyoo
 */
public class SimpleCalculatorServlet extends HttpServlet {

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

        String xStr = request.getParameter("x");
        String yStr = request.getParameter("y");
        String Operator = request.getParameter("oper");
        
        double xValue = Double.valueOf(xStr);
        double yValue = Double.valueOf(yStr);

        double result = Double.NaN;
        double resultP = Double.NaN;
        if (Operator.equals(" ")) {
             result = xValue + yValue;
        } else if (Operator.equals("-")) {
             result = xValue - yValue;
        } else if (Operator.equals("*")) {
             result = xValue * yValue;
        } else if (Operator.equals("/")) {
             result = xValue / yValue;
        }

        double xValueP = Double.parseDouble(xStr);
        double yValueP = Double.parseDouble(yStr);

        switch (Operator) {
            case " ": {
                 resultP = xValueP + yValueP;
                break;
            }
            case "-": {
                 resultP = xValueP - yValueP;
                break;
            }
            case "*": {
                 resultP = xValueP * yValueP;
                break;
            }
            case "/": {
                 resultP = xValueP / yValueP;
                break;
            }
           
        }

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SimpleCalculatorServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet SimpleCalculatorServlet at " + request.getContextPath() + "</h1>");
            out.println("<h1 style='color:darkblue>Simple Calculator V1 </h1><hr>");
            out.println(" &nbsp; &nbsp; &nbsp; &nbsp; x = " + xValue + "<br>");
            out.println(" &nbsp; &nbsp; &nbsp; &nbsp; y = " + yValue + "<hr>");
            out.println(" &nbsp; &nbsp; &nbsp; &nbsp; Result = " + result + "<hr>");
            
            out.println("<h1 style='color:darkblue>Simple Calculator V2</h1><hr>");
            out.println(" &nbsp; &nbsp; &nbsp; &nbsp; x = " + xValueP + "<br>");
            out.println(" &nbsp; &nbsp; &nbsp; &nbsp; y = " + yValueP + "<hr>");
            out.println(" &nbsp; &nbsp; &nbsp; &nbsp; Result = " + resultP + "<hr>");
            out.println("</body>");
            out.println("</html>");
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
