/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import db.dbConnect;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@MultipartConfig
public class register extends HttpServlet {


    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = null;
        HttpSession session=request.getSession();

        try {
            
            //get value from home.jsp/register form:

            out = response.getWriter();
            String n = request.getParameter("name");
            String ph = request.getParameter("phone");
            String e = request.getParameter("email");
            String g = request.getParameter("gender");
            String s = request.getParameter("state");
            String c = request.getParameter("city");
            String a = request.getParameter("area");
            String p = request.getParameter("password");
            //code to convert String into Date
            String dt = request.getParameter("dob");
            java.text.SimpleDateFormat sdf = new java.text.SimpleDateFormat("dd/MM/yyyy");
            java.util.Date date = sdf.parse(dt);
            java.sql.Date d = new java.sql.Date(date.getTime());
            
            Part part = request.getPart("photo");
            InputStream is = null;
            if (part != null) {
                is = part.getInputStream();
            }
            
            //put value in HashMap to snt in UserDetails method in dbConnect:
            
            HashMap userDetails=new HashMap();
            
            userDetails.put("email", e);
            userDetails.put("password", p);
            userDetails.put("name", n);
            userDetails.put("phone", ph);
            userDetails.put("gender",g);
            userDetails.put("dob", d);
            userDetails.put("state", s);
            userDetails.put("city", c);
            userDetails.put("area", a);
            userDetails.put("photo", is);
            
            dbConnect dbc=new dbConnect();
            String m=dbc.insertUser(userDetails);
            
            if(m.equalsIgnoreCase("Registeration Successfull!")){
                
                userDetails.remove("password");
                userDetails.remove("photo");
                session.setAttribute("userDetails", userDetails);
                response.sendRedirect("profile.jsp");
                
               }
            
            else if(m.equalsIgnoreCase("Registration failed!")){
                session.setAttribute("msg", "Registration failed!");
                response.sendRedirect("home.jsp");
                
            }
            else{
                session.setAttribute("msg", "Email ID already exist !");
                response.sendRedirect("home.jsp");
   
                
            }
            
            
            
             } catch (Exception ex) {
               session.setAttribute("msg","Regitration failed: "+ ex);
               response.sendRedirect("home.jsp");
        }
    }

}
