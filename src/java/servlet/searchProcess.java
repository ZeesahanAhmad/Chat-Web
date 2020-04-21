package servlet;

import db.dbConnect;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class searchProcess extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response) {
        HttpSession session = request.getSession();
        HashMap userDetails = (HashMap) session.getAttribute("userDetails");
        response.setContentType("text/html;charset=UTF-8");
        try {
            if (userDetails != null) {
                String s = request.getParameter("state");
                String c = request.getParameter("city");
                String a = request.getParameter("area");

                dbConnect dbc = new dbConnect();
                ArrayList<java.util.HashMap> allUserDetails = dbc.searchPeople(s, c, (String) userDetails.get("email"), a);
                if (allUserDetails.isEmpty() == false) {
                    HashMap address = new HashMap();
                    address.put("state", s);
                    address.put("cite", c);
                    address.put("area", a);

                    session.setAttribute("address", address);
                    session.setAttribute("allUserDetails", allUserDetails);
                    response.sendRedirect("peoplesearch.jsp");

                } else {
                    session.setAttribute("msg", "No data found !");
                    response.sendRedirect("profile.jsp");
                }
                

            } else {
                session.setAttribute("msg", "please login first!");
                response.sendRedirect("home.jsp");
            }
            

        } catch (Exception ex) {

        }
    }
}
