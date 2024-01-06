package org.example;

import FileReader.FileReader;

import java.lang.reflect.InvocationTargetException;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        String filePatch  = "..\\web-project\\web\\html\\minsk.html";
        workWithJDBC();
        String html = FileReader.readFileToString(filePatch);
        System.out.println(html);
        System.out.println(getDate());
    }
    private static void workWithJDBC() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver").getDeclaredConstructor().newInstance();
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/root", "root", "!12345678q");
            Statement statement = connection.createStatement();
            statement.executeUpdate("create table if not exists userss (id bigint primary key auto_increment," +
                    "name varchar(200),age int)");
            statement.executeUpdate("insert into userss(name,age) values ('Kon',25),('Kor',30)");
            ResultSet userRes = statement.executeQuery("select * from userss");
            User user = new User();
            if (userRes.next()) {
                user.setId(userRes.getLong("id"));
                user.setName(userRes.getString("name"));
                user.setAge(userRes.getInt("age"));
            }
            System.out.println(user);
            ResultSet averageAge = statement.executeQuery("select avg(age)as average from userss");
            if (averageAge.next())
                System.out.println("Средний возраст: " + averageAge.getDouble("average"));
        } catch (InstantiationException | IllegalAccessException | InvocationTargetException | NoSuchMethodException |
                 SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static String getDate() {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(("yy/MM/dd/HH/mm"));
        return date.format(formatter);
    }
}