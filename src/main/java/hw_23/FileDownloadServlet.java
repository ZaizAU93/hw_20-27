package hw_23;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.*;
import java.io.File;
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/fileDownload")
public class FileDownloadServlet extends HttpServlet {

    String fileName;
    String filePath;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {


         response.sendRedirect("../download.jsp");
   }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        fileName = request.getParameter("fileName");
        filePath = getServletContext().getRealPath(fileName);

        File file = new File(filePath);

            response.setHeader("Content-Disposition", "attachment;filename=\"" + new String(fileName.getBytes("UTF-8"), "ISO-8859-1")+"\"");
            response.setHeader("Content-Type", getServletContext().getMimeType(fileName));
            response.setHeader("Content-Length", String.valueOf(file.length()));

            try (InputStream inputStream = new FileInputStream(file);
                 OutputStream outputStream = response.getOutputStream()) {

                byte[] buffer = new byte[10000];
                int bytesRead;
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead);
                    outputStream.flush();
                    outputStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }


