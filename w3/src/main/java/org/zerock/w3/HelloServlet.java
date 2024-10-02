package org.zerock.w3;

import java.io.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

// Servlet : 요청을 받아 데이터를 취득하거나 저장한 후 화면을 돌려주는 역할을 하는 기능
// name : 서블릿의 이름(다른 서블릿과 중복되지않는 이름 설정
// value : 도메인/value값 : survalet을 요청할때 사용되는 주소의 값
@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        // Hello
        // html파일에 작성할 내용을 적는 기능
        PrintWriter out = response.getWriter();
        // html파일에 <html><body>내용을 추가하는 기능
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}