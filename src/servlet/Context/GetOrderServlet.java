package servlet.Context;

import com.google.gson.Gson;
import dao.DaoImpl;
import po.Context;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 购物详细信息
 * Created by Administrator on 2016/9/26.
 */
@WebServlet(urlPatterns = "/api/context/getOrder")
public class GetOrderServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String data = (String) request.getSession().getAttribute("data");

        String[] split = data.split(",");

        int result=0;

        List<Context> list =new ArrayList<>();

        for (int i=0;i<split.length;i=i+2){
            String id = split[i];
            String number = split[i + 1];

            Context context = new DaoImpl().getContextById(Integer.parseInt(id));
            context.setType_id(Integer.parseInt(number));

            result += context.getDate() * context.getType_id();

            list.add(context);
        }

        list.get(0).setId(result);

        request.getSession().setAttribute("result",list);


        //转化为json输出
        PrintWriter writer = response.getWriter();
        Gson gson = new Gson();
        writer.write(gson.toJson(list));
    }

}
