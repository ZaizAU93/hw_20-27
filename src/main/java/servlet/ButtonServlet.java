package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;


import java.io.IOException;
import java.io.PrintWriter;

import static java.lang.System.out;

@WebServlet(name = "ButtonServlet", urlPatterns = {"/minsk", "/washington", "/beijing"})
public class ButtonServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String button = request.getParameter("button");

        switch (button) {
            case "button1":
                response.sendRedirect("/jsp/page1.jsp");
                PrintWriter pr = response.getWriter();
                pr.println("пошел нахер мудак");
                break;
            case "button2":
                response.sendRedirect("/page2.jsp");
                break;
            default:
                response.sendRedirect("error.jsp");
                break;
        }
    }
}