package com.enterprise.ecommerce;

import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body><h1>Enterprise E-commerce Catalog</h1>");
        out.println("<ul><li>iPhone 15 Pro - $999</li><li>MacBook Air M3 - $1299</li></ul>");
        out.println("<p>Environment: " + System.getenv("ENV_NAME") + "</p>");
        out.println("</body></html>");
    }
}

