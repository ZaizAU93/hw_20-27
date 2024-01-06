package servlet;

import FileReader.FileReader;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Calendar;
import java.util.TimeZone;

@WebServlet(name = "Time", urlPatterns = {"/minsk", "/washington", "/beijing"})
public class Time extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String pathInfo = request.getServletPath();
            //  RequestDispatcher requestDispatcher = getServletContext().getRequestDispatcher("../web/jsp/page1.jsp");

            if (pathInfo != null) {
                switch (pathInfo) {
                    case "/minsk":
                        response.sendRedirect("../web/jsp/page1.jsp");
                        break;
                    case "/washington":
                        response.sendRedirect("../web/jsp/page3.jsp");
                        break;
                    case "/beijing":
                        response.sendRedirect("../web/jsp/page2.jsp");
                        break;
                    default:
                        out.println("Неверный URL");
                }
            } else
                out.println("Неверный URL");
        }
    }
    public static String getTimeInTimezone(String timezone) {
        Calendar calendar = Calendar.getInstance(TimeZone.getTimeZone(timezone));
        return calendar.getTime().toString();
    }


}