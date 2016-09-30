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
@WebServlet(urlPatterns = "/api/orders/*")
public class GetOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String[] split = (String[]) request.getAttribute("split");

        //得到栏目类型
        String type = split[split.length - 1];
        //dao操作
        Tour dao = new DaoImpl();
        List<Order> orders=new ArrayList<>();
        if (type.equals("ed")) {
            orders = dao.getOrdered();
        }else if (type.equals("ing")){
            orders=dao.getOrdering();
        }
        //转化为json输出
        PrintWriter writer = response.getWriter();
        Gson gson = new Gson();
        writer.write(gson.toJson(orders));

    }
}
