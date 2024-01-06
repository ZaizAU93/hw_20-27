package hw_23;

import jakarta.servlet.ServletContext;
import jakarta.servlet.ServletContextEvent;
import jakarta.servlet.ServletContextListener;
import jakarta.servlet.annotation.WebListener;

import javax.management.ListenerNotFoundException;
import java.net.http.WebSocket;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

@WebListener
public class Listener implements ServletContextListener {

    public void contextInitialized(ServletContextEvent event) {

        System.out.println("Приложение запущено " + Time.getDate());
    }

    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("Приложение остановлено " + Time.getDate());
    }



}

