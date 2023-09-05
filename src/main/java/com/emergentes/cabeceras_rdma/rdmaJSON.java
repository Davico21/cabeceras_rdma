package com.emergentes.RDMA_cabeceras;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "rdmaJSON", urlPatterns = {"/rdmaJSON"})
public class rdmaJSON extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        try{
            out.println("{\"empleados\":[");
            out.println("{\"nombre\":\"Ruben\",\"apellidos\":\"Mamani\"},");
            out.println("{\"nombre\":\"Lesly\",\"apellidos\":\"Tarqui\"},");
            out.println("{\"nombre\":\"David\",\"apellidos\":\"Vargas\"},");
            out.println("]}");            
   
        }finally{
            out.close();
                
        }
    }
}
