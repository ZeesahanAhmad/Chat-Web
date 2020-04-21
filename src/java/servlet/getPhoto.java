package servlet;

import db.dbConnect;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author zeeshan ahmae
 */
public class getPhoto extends HttpServlet {

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        byte[] b;
        response.setContentType("text/html;charset=UTF-8");
        try {
            String e = request.getParameter("email");
           
            dbConnect dbc = new dbConnect();
             b = dbc.getPhoto(e);
            if (b == null) {
                FileInputStream fin = new FileInputStream("D:PROJECTS\\AdvanceJAVA\\people_talk\\web\\img\\xyz.jpg");
                b = new byte[3500];
                fin.read(b);
            }
            response.getOutputStream().write(b);

        } catch (Exception ex) {
            FileInputStream fin = new FileInputStream("D:PROJECTS\\AdvanceJAVA\\people_talk\\web\\img\\xyz.jpg");
                b = new byte[3500];
                fin.read(b);
            
            response.getOutputStream().write(b);

        }

    }
}
