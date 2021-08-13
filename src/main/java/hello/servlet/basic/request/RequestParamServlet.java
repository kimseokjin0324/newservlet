package hello.servlet.basic.request;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;
//HTTP요청 데이터-GET 쿼리 파라미터

import javax.servlet.annotation.WebServlet;

/**
 * 1. 파라미터 전송기능
 * http://localhost:8082/request-param?username=hello&age=20
 *
 */
@WebServlet(name="RequestParamServlet",urlPatterns = "/request-param")
public class RequestParamServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("[전체 파라미터 조회]- start");
        //Enumeration<String> parameterNames = request.getParameterNames(); //모든 요청파라미터를 꺼낼수 있다
        request.getParameterNames().asIterator()
                .forEachRemaining(paramName -> System.out.println(paramName + "=" + request.getParameter(paramName)));

        System.out.println("[전체 파라미터 조회]- end");
        System.out.println();

        System.out.println("[단일 파라미터 조회]");
        String username = request.getParameter("username");
        String age = request.getParameter("age");
        System.out.println("username = " + username);
        System.out.println("age = " + age);

        System.out.println("[이름이 같은 복수 파라미터 조회]");
        String[] usernames = request.getParameterValues("username"); //여러가지이름이 있으면 이렇게 배열로 받아서 호출가능
        for (String name : usernames) {
            System.out.println("username = " + name);
        }
        response.getWriter().write("OK");

    }
}