package servlet.Order;

import dao.DaoImpl;
import po.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * Created by DELL on 2016/9/29.
 */
@WebServlet("/edit")
public class EditOrderServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setCharacterEncoding("UTF-8");
        int id=Integer.parseInt(req.getParameter("id"));
        DaoImpl dao=new DaoImpl();
        Order order=dao.geteditOrder(id);
         HttpSession session=req.getSession();
        session.setAttribute("order",order);
        resp.sendRedirect("background/threeStage/Order_edit.jsp");

    }
}
