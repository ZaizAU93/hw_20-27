package hw_23;

import jakarta.servlet.annotation.MultipartConfig;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

@WebServlet("/upload")
@MultipartConfig(fileSizeThreshold = 1024 * 1024, maxFileSize = 1024 * 1024 * 10)
public class UploadServlet extends HttpServlet {
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        response.sendRedirect("../index.jsp");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws
            IOException {
        try {
            Part filePart = request.getPart("file");
            String name = filePart.getSubmittedFileName();
        //    filePart.write("D:\\" + name);
            InputStream fileContent = filePart.getInputStream();
            Files.copy(fileContent, Paths.get("..\\temp\\load", name), StandardCopyOption.REPLACE_EXISTING);
            response.getWriter().print("The file uploaded successfully :)");
        } catch (Exception e) {
            response.getWriter().print("Something wrong :(");
        }
    }
}