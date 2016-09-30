package servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 重定向控制器
 * Created by Administrator on 2016/9/26.
 */
@WebServlet(urlPatterns = "/api/redirect/*")
public class RedirectServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //拿到分割后的链接
        String[] split = (String[]) request.getAttribute("split");

        //判断是否需要保存session
        boolean save=false;
        if(split.length==6){
            save = true;
        }

        //保存数据
        if (save){
            request.getSession().setAttribute("data",split[5]);
        }

        //重定向
        String result="http://localhost:8080/"+split[3]+"/"+split[4]+".html";
        response.sendRedirect(result);

    }
}
