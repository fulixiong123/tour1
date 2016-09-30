package servlet.Context;

import dao.DaoImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 文件列表
 * Created by Administrator on 2016/9/26.
 */
@WebServlet(urlPatterns = "/delcontext")
public class DelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String getid=request.getParameter("id");
        String id1=getid.replace(" ","");
        System.out.println(id1);
        int id=Integer.parseInt(id1);
        DaoImpl dao=new DaoImpl();
        dao.delContext(id);
    }
}
