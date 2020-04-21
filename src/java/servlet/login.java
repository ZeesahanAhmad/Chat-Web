/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import db.dbConnect;
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
public class login extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        HttpSession session = request.getSession();
        try (PrintWriter out = response.getWriter()) {
            String e = request.getParameter("email");
            String p = request.getParameter("password");
            dbConnect dbc = new dbConnect();
            HashMap userDetails = dbc.checkLogin(e, p);

            if (userDetails != null) {
                session.setAttribute("userDetails", userDetails);
                response.sendRedirect("profile.jsp");

            } else {
                session.setAttribute("msg", "Wrong Entries !");
                response.sendRedirect("home.jsp");
            }

        } catch (Exception ex) {
            session.setAttribute("msg", "Login Error : "+ex);
            response.sendRedirect("home.jsp");
            
        }
    }

}
