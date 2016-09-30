package servlet.Context;

import com.google.gson.Gson;
import dao.DaoImpl;
import dao.Tour;
import po.Context;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 详细信息
 * Created by Administrator on 2016/9/26.
 */
@WebServlet(urlPatterns = "/api/context/getOne")
public class GetOneServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //得到分割后的id
        String data = (String) request.getSession().getAttribute("data");

        Context context = new DaoImpl().getContextById(Integer.valueOf(data));

        //转化为json输出
        PrintWriter writer = response.getWriter();
        Gson gson = new Gson();
        writer.write(gson.toJson(context));

    }

}
