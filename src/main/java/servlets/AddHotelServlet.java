package servlets;

import models.DbManager;
import models.Hotel;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(value = "/add")
public class AddHotelServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String location = request.getParameter("location");
        int stars = Integer.parseInt(request.getParameter("stars"));

        DbManager.add(new Hotel(name, location, stars));

        response.sendRedirect("/");
    }
}
