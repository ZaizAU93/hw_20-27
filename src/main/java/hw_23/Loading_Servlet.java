package hw_23;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;


@WebServlet("/load")
@MultipartConfig
public class Loading_Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter writer = response.getWriter();
        writer.print("Проверка");

        Part part = request.getPart("file");
        String fileName = part.getSubmittedFileName();

        InputStream fileContent = part.getInputStream();
        //  Files.copy(fileContent, Paths.get("С:\\Рабочий стол\\load", fileName), StandardCopyOption.REPLACE_EXISTING);
        //  Files.copy(.toPath(), response.getOutputStream());
        writer.print("Файл звгруужен");
    }
}
