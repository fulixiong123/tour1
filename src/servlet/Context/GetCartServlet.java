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
@WebServlet(urlPatterns = "/api/context/getCart")
public class GetCartServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String data = (String) request.getSession().getAttribute("data");

        String[] split = data.split(",");

        //结果
        List<Context> list = new ArrayList<>();

        //购物车去重
        Set<Integer> set = new HashSet<>();
        for (String s : split) {
            Integer id = Integer.valueOf(s);
            boolean add = set.add(id);
            if (add) {
                Context context = new DaoImpl().getContextById(id);
                context.setType_id(1);
                list.add(context);
            }else{
                for (Context context:list) {
                    if(context.getId()==id){
                        list.remove(context);
                        context.setType_id(context.getType_id()+1);
                        list.add(context);
                        break;
                    }
                }
            }
        }


        //转化为json输出
        PrintWriter writer = response.getWriter();
        Gson gson = new Gson();
        writer.write(gson.toJson(list));
    }

}
