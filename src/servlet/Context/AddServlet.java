package servlet.Context;

import dao.DaoImpl;
import po.Context;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by DELL on 2016/9/28.
 */
@WebServlet(urlPatterns = "*.do")
public class AddServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String title = (String) req.getAttribute("title");
        int type_id= Integer.parseInt((String) req.getAttribute("type"));
        String date1= (String) req.getAttribute("date");
        String date2 = date1.replaceAll("-", "");
        int date=Integer.parseInt(date2);
        String context= (String) req.getAttribute("context");
        String pic= (String) req.getAttribute("pic");
        DaoImpl dao = new DaoImpl();
        Context context1=new Context(0,type_id,title,date,context,pic);
        dao.addContext(context1);
        resp.sendRedirect("../admin_wcom.jsp");
    }
}
