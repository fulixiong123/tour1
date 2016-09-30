package servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/**
 * Created by DELL on 2016/9/28.
 */
@WebFilter(urlPatterns = "*.do")
public class FileFilter implements Filter {
    public void destroy() {
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        DiskFileItemFactory factory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(factory);
        try {
            List<FileItem> fileItems = servletFileUpload.parseRequest((HttpServletRequest) req);
            Iterator<FileItem> iterator = fileItems.iterator();
            while (iterator.hasNext()){
                FileItem next = iterator.next();
                if (next.isFormField()){
                    String fieldName = next.getFieldName();
                    String value = next.getString();
                    req.setAttribute(fieldName,value);
                }else {
                    UUID uuid = UUID.randomUUID();
                    String s = uuid.toString();
                    String name = s.substring(0, 5);
                    String path = this.getClass().getResource("/").getPath();
                    String substring = path.substring(1, path.length() - 16)+"images/"+name+".jpg";
                    File file = new File(substring);
                    next.write(file);
                    req.setAttribute("pic",substring);
                }
            }
        } catch (FileUploadException e) {


        } catch (Exception e) {
            e.printStackTrace();
        }
        chain.doFilter(req, resp);
    }

    public void init(FilterConfig config) throws ServletException {

    }

}
