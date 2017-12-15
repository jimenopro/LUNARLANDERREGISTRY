/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author josej
 */
@WebServlet(urlPatterns = {"/InitServlet"})
public class CookieGet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String cookieName = "id";

        Cookie[] cookies = request.getCookies();
        if (cookies != null) {
            String name = null;
            for (int i = 0; i < cookies.length; i++) {
                Cookie cookie = cookies[i];
                if (cookieName.equals(cookie.getName())) {
                    name = cookie.getValue();
                }
            }
            //Paso el objeto "name" como "nombre" al jsp
            request.setAttribute("nombre", name);
            RequestDispatcher a = request.getRequestDispatcher("/login.html");
            a.forward(request, response);
        }
        else {
                RequestDispatcher a = request.getRequestDispatcher("/login.html");
                a.forward(request, response);
            }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    @Override
    public void init() {

        String con = "jdbc:mysql://localhost/lunarlander";
        String user = "user";
        String pass = "user";

        FileWriter fichero = null;
        PrintWriter pw = null;

        try {

            Connection connection = DriverManager.getConnection(con, user, pass);
            Statement s = connection.createStatement();
            String createConf = "CREATE TABLE `configuration` (\n"
                    + "  `id` int(11) NOT NULL,\n"
                    + "  `user_id` int(11) DEFAULT NULL,\n"
                    + "  `config_name` varchar(20) DEFAULT NULL,\n"
                    + "  `diff_id` int(11) DEFAULT NULL,\n"
                    + "  `nave_id` int(11) DEFAULT NULL,\n"
                    + "  `moon_id` int(11) DEFAULT NULL\n"
                    + ")";
            String createScore = "CREATE TABLE `score` (\n"
                    + "  `id` int(11) NOT NULL,\n"
                    + "  `conf_id` int(11) DEFAULT NULL,\n"
                    + "  `speed` float DEFAULT NULL,\n"
                    + "  `fuel` float DEFAULT NULL,\n"
                    + "  `init_time` date DEFAULT NULL,\n"
                    + "  `end_time` date DEFAULT NULL\n"
                    + ")";
            String createUser = "CREATE TABLE `usuario` (\n"
                    + "  `id` int(11) NOT NULL,\n"
                    + "  `name` varchar(20) NOT NULL,\n"
                    + "  `username` varchar(20) NOT NULL,\n"
                    + "  `password` varchar(255) NOT NULL\n"
                    + ")";
            String pkConf = "ALTER TABLE `configuration`\n"
                    + "  ADD PRIMARY KEY (`id`),\n"
                    + "  ADD KEY `fk_userid` (`user_id`);";
            String pkScore = "ALTER TABLE `score`\n"
                    + "  ADD PRIMARY KEY (`id`),\n"
                    + "  ADD KEY `fk_confid` (`conf_id`);";
            String pkUser = "ALTER TABLE `usuario`\n"
                    + "  ADD PRIMARY KEY (`id`);";
            String fkConf = "ALTER TABLE `configuration`\n"
                    + "  ADD CONSTRAINT `fk_userid` FOREIGN KEY (`user_id`) REFERENCES `usuario` (`id`);";
            String fkScore = "ALTER TABLE `score`\n"
                    + "  ADD CONSTRAINT `fk_confid` FOREIGN KEY (`conf_id`) REFERENCES `configuration` (`id`);";
            s.executeUpdate(createConf);
            s.executeUpdate(createScore);
            s.executeUpdate(createUser);
            s.execute(pkConf);
            s.execute(pkScore);
            s.execute(pkUser);
            s.execute(fkConf);
            s.execute(fkScore);

            fichero = new FileWriter("initSQL.txt");
            pw = new PrintWriter(fichero);

            pw.println("SQL ejecutado");

        } catch (SQLException e) {

            try {
                fichero = new FileWriter("initSQL.txt");
                pw = new PrintWriter(fichero);
                System.out.println(e);
                pw.println("No se ha podido iniciar la base de datos");
            } catch (IOException ex) {
                System.out.println(ex);
                System.out.println("No se ha podido escribir en el fichero");
                System.out.println("No se ha podido iniciar la base de datos");
            }
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Base de datos iniciada");
            System.out.println("Error al escribir en el fichero");
        }

    }

}
