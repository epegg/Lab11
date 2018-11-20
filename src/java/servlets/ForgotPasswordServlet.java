/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import database.NotesDBException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import services.AccountService;

/**
 *
 * @author 752814
 */
public class ForgotPasswordServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
            String email = request.getParameter("email");
            AccountService ac = new AccountService();
            
            if (ac.forgotPassword(email,getServletContext().getRealPath("/WEB-INF"))) {
                request.setAttribute("message", "Your password has been sent to your email");
                request.getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);
            } else {
                request.setAttribute("message", "Password recovery failed");
                request.getRequestDispatcher("/WEB-INF/forgot.jsp").forward(request, response);
            }
    }

}
