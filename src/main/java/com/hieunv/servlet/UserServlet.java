package com.hieunv.servlet;

import com.hieunv.entity.User;
import com.hieunv.service.UserService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet(name = "LoginServlet", value = "/LoginServlet")
public class UserServlet extends HttpServlet {
    private final UserService userService = new UserService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("login.jsp");
        requestDispatcher.forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("") || password.equals("")) {
            request.setAttribute("errMsg", "Username and password is required !");
            request.getRequestDispatcher("login.jsp").forward(request, response);
        } else {
            User user = userService.loginUsingJPA(username, password);
            if (user != null) {
                request.getRequestDispatcher("home.jsp").forward(request, response);
            } else {
                request.setAttribute("errMsg", "Wrong username or password");
                request.getRequestDispatcher("login.jsp").forward(request, response);
            }
        }
    }
}
