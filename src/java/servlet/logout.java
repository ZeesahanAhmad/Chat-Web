/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author zeeshan ahmad
 */
public class logout extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            HttpSession session = request.getSession();
            HashMap userDetails = (HashMap) session.getAttribute("userDetails");
            if (userDetails != null) {
                session.invalidate();
                response.sendRedirect("home.jsp");
            } else {
                session.setAttribute("msg", "Please Login First !");
                response.sendRedirect("home.jsp");
            }

        }
    }

}
