//package com.mvc.jee;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//import java.io.IOException;
//
//@WebServlet(urlPatterns = "/login")
//public class LoginServlet extends HttpServlet {
//
//    private UserValidationService userValidationService = new UserValidationService();
//    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
////        PrintWriter writer = response.getWriter();
////        writer.println("<html>");
////        writer.println("<head>");
////        writer.println("<title>Yahoo</title>");
////        writer.println("<head>");
////        writer.println("<body>My First Servlet</body></html");
////        request.setAttribute("name",request.getParameter("name"));
////        request.setAttribute("password",request.getParameter("password"));
//        request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request,response);
//    }
//
//    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String name = request.getParameter("name");
//        String password = request.getParameter("password");
//        boolean isUserValid = userValidationService.isUserValid(name,password);
//        if(isUserValid == true) {
//            request.setAttribute("name", name);
//            request.setAttribute("password", password);
//            request.getRequestDispatcher("/WEB-INF/views/welcome.jsp").forward(request, response);
//        }
//        else {
//            request.setAttribute("errorMessage","Invalid credentials!");
//            request.getRequestDispatcher("/WEB-INF/views/login.jsp").forward(request, response);
//        }
//    }
//}
