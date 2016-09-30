package servlet.Order;

import com.google.gson.Gson;
import dao.DaoImpl;
import dao.Tour;
import po.Context;
import po.Order;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * 文件列表
 * Created by Administrator on 2016/9/26.
 */
@WebServlet(urlPatterns = "/api/order/add")
public class AddOrderServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");
        String card = request.getParameter("card");
        String phone = request.getParameter("phone");

        List<Context> result = (List<Context>) request.getSession().getAttribute("result");

        for (Context c:result) {
            int id = c.getId();
            int type_id = c.getType_id();

            Order order = new Order();
            order.setGoodsNum(type_id);
            order.setContext_id(id);
            order.setName(name);
            order.setTel(phone);
            order.setPort(card);
            order.setState("ing");
            order.setDate("2016年9月30日");

            new DaoImpl().addOrder(order);
        }
        response.sendRedirect("http://localhost:8080/ok.html");
    }
}
