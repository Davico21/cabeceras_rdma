package com.emergentes.cabeceras_rdma;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "rdmaPDF", urlPatterns = {"/rdmaPDF"})
public class rdmaPDF extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("application/pdf");
        response.setHeader("Content-Disposition", "attachment; filename=RubenDavidMamaniAli.pdf");
        PrintWriter out = response.getWriter();
        try {
            out.println("%PDF-1.7");
            // Objeto de página
            out.println("1 0 obj");
            out.println("<< /Type /Page");
            out.println("   /Parent 2 0 R");
            out.println("   /Resources 3 0 R");
            out.println("   /Contents 4 0 R");
            out.println(">>");
            out.println("endobj");

            // Otros objetos requeridos, como recursos y contenido
            // Contenido de la página
            out.println("4 0 obj");
            out.println("<< /Length 58");
            out.println(">>");
            out.println("stream");
            out.println("BT");
            out.println("/F1 12 Tf");
            out.println("72 712 Td");
            out.println("(Mi primer PDF sin biblioteca externa) Tj");
            out.println("ET");
            out.println("endstream");
            out.println("endobj");

        } finally {
            out.close();
        }
    }
}
