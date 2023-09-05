package com.emergentes.RDMA_cabeceras;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "rdmaCSV", urlPatterns = {"/rdmaCSV"})
public class rdmaCSV extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/CSV");
        response.setHeader("Content-Disposition","attachment;filename=RubenDavidMamaniAli.csv");
        PrintWriter out = response.getWriter();
        try{
            out.println("id;nombre;apellidos;edad");
            out.println("1;Ruben;Mamani;22");
            out.println("2;Lesly;Tarqui;20");
            out.println("3;David;Vargas;20");
        }finally{
            out.close();
               
        }
    }
}
