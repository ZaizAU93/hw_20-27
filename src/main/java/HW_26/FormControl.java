package HW_26;
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

@WebServlet(urlPatterns = "/formcontrol")
public class FormControl extends HttpServlet {
    public ArrayList<String> paramForm;


  //  protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //   RequestDispatcher requestDispatcher = req.getRequestDispatcher("../jsp/save-request.jsp");
        //   requestDispatcher.forward(req, resp);
       // resp.sendRedirect("../web/jsp/save-request.jsp");
 //   }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
      //  resp.sendRedirect("web/jsp/save-request.jsp");
        ArrayList<String> listParam = new ArrayList<>();
        String firstName = req.getParameter("firstName");
        String name = req.getParameter("name");
        String phoneNumber = req.getParameter("phoneNumber");
        String email = req.getParameter("email");
        String comment = req.getParameter("comment");


        listParam.add(firstName);
        listParam.add(name);
        listParam.add(phoneNumber);
        listParam.add(email);
        listParam.add(comment);

        for (String element : listParam) {
            System.out.println(element);
        }


        boolean anchor = true;
       // RequestDispatcher requestDispatcher = req.getRequestDispatcher("web/jsp/save-request.jsp");
        for (String element: listParam) {
            if (element == null || element.equals("")) {
               // resp.sendRedirect("web/jsp/save-request.jsp");
                req.setAttribute("message", "Вы заполнили не все поля формы");
                getServletContext().getRequestDispatcher("/save-request.jsp").forward(req, resp);
                anchor = false;
                break;
            }
        }

        if (anchor = true){
            req.setAttribute("message", "Все гуд, вы в клане человека паука");
            getServletContext().getRequestDispatcher("/save-request.jsp").forward(req, resp);
        }

    }
}
