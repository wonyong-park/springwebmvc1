package hello.servlet.basic;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "helloServlet", urlPatterns = "/hello")
public class HelloServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        System.out.println("HelloServlet.service");
        System.out.println("request = " + request);
        System.out.println("response = " + response);

        //요청에 관련된 값은 request
        String username = request.getParameter("username");
        System.out.println("username = " + username);

        //응답에 관련된 값은 response
        response.setContentType("text/plain");
        response.setCharacterEncoding("utf-8");
        //write() => httpMessageBody에 값이 들어감
        response.getWriter().write("hello, " + username);
    }
}
