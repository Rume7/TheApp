package com.codehacks.users.control;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Gabriel
 */
@WebServlet(name = "AdminServlet", urlPatterns = {"/administrator"})
public class AdminServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String userPath = request.getServletPath();
        
        String url = "admin.jsp";
        if (userPath.equals("/administrator")) 
        {
            String username = request.getParameter("adminUser");
            String password = request.getParameter("adminPass");
            
            if (username.equals("wale") && password.equals("welcome")) 
            {
               userPath = "/AdminView";
               url = "/WEB-INF/views" + userPath + ".jsp";
               request.getRequestDispatcher(url).forward(request, response);
            } else {
                request.getRequestDispatcher(url).forward(request, response);
            }
        }
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Admin staff";
    }

}
