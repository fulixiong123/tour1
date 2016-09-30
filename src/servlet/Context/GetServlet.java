package servlet.Context;

import com.google.gson.Gson;
import dao.DaoImpl;
import dao.Tour;
import po.Context;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

/**
 * 文件列表
 * Created by Administrator on 2016/9/26.
 */
@WebServlet(urlPatterns = "/api/context/get/*")
public class GetServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //得到分割后的链接
        String[] split = (String[]) request.getAttribute("split");

        //得到栏目类型
        String type = split[split.length - 1];

        //得到条数
        int number=4;

        int type_id=1;
        if(type.equals("announce")){
            type_id=2;
        }else if(type.equals("line1")){
            type_id=3;
        }else if(type.equals("activity")){
            type_id=4;
        }else if(type.equals("line2")){
            type_id=5;
        }else if(type.equals("goods")){
            type_id=15;
            number=10;
        }else if (type.equals("allnews")){
            type_id=1;
            number=1000;
        }else if (type.equals("allannounce")){
            type_id=2;
            number=1000;
        }else if (type.equals("allactivity")){
            type_id=4;
            number=1000;
        }else if (type.equals("dyl")){
            type_id=5;
            number=1000;
        }else if (type.equals("xs")){
            type_id=3;
            number=1000;
        }else if(type.equals("history")){
            type_id=6;
            number=1000;
        }else if (type.equals("dbculture")){
            type_id=7;
            number=1000;
        }else if (type.equals("nxmusic")){
            type_id=8;
            number=1000;
        }else if (type.equals("custom")){
            type_id=9;
            number=1000;
        }else if (type.equals("tourservice")){
            type_id=10;
            number=1000;
        }


        //dao操作
        Tour dao = new DaoImpl();
        List<Context> context = dao.getContext(number,type_id);


        //转化为json输出
        PrintWriter writer = response.getWriter();
        Gson gson = new Gson();
        writer.write(gson.toJson(context));

    }
}
