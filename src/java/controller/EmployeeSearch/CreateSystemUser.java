/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.EmployeeSearch;

import dao.EmployeeDAO;
import dao.LoginDAO;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Employee;
import model.Login;

/**
 *
 * @author NC
 */
@WebServlet(name = "CreateSystemUser", urlPatterns = {"/CreateSystemUser"})
public class CreateSystemUser extends HttpServlet {

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
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String empid = request.getParameter("empid");
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            String status = request.getParameter("status");

            Login login = new Login();

            EmployeeDAO employeeDAO = new EmployeeDAO();
            Employee employee = employeeDAO.getEmployeeById(Integer.parseInt(empid));
//            System.out.println("--------------------------------");
//            System.out.println(empid);
//            System.out.println(username);
//            System.out.println(password);
//            System.out.println(status);
//            System.out.println(employee);
            login.setEmployee(employee);
            login.setUsername(username);
            login.setPassword(password);
            if (status.equals("1")) {
                login.setIsactive(Boolean.TRUE);
            } else {
                login.setIsactive(Boolean.FALSE);
            }
//            EmployeeDAO employee = new EmployeeDAO();
//            employee.createUser(employeeno);
            LoginDAO loginDao = new LoginDAO();
            loginDao.SaveUser(login);
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
