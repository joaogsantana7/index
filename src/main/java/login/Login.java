/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package login;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author 232.003479
 */
@WebServlet("/login")
public class Login extends HttpServlet{
    
    private static final long serialVersionUID = 1L;
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
        String usuario = request.getParameter("users");
        String senha = request.getParameter("passw");
        
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        try (var con = ConnectionFactory.getConnect){
            
        } catch (Exception e) {
        }
        
    }  
}