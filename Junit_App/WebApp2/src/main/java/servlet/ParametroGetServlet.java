package servlet;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/parametros/url-get")
public class ParametroGetServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        String saludo = req.getParameter("saludos");
        String nombre = req.getParameter("nombre");

        out.print("<!DOCTYPE html>");
        out.print("<html>");
        out.print(" <head>");
        out.print("     <meta charset\"UTF-8\">");
        out.print("     <title>parametros get de la url</title>");
        out.print(" </head>");
        out.print(" <body>");
        out.print("     <h1>Parametros Get de la URL!</h1>");
        if (saludo!=null && nombre!=null)
        {
            out.println("   <h2>El salido enviado es: " + saludo + " " + nombre + "</h2>");
        }
        else if (saludo!= null)
        {
            out.println("   <h2>El salido enviado es: " + saludo + "</h2>");
        }
        else if (nombre!=null)
        {
            out.println("   <h2>El nombre es: " + nombre + "</h2>");
        }
        else {
            out.println("<h2>no se paso ningun parametro</h2>");
        }
        try {
            Integer codigo = Integer.parseInt(req.getParameter("codigo"));
            out.println("<h3>El codigo enviado es : " + codigo + "<h3>");
        }catch (NumberFormatException e){
            out.println("<h3>El codigo no se ha enviado<h3>");
        }


        out.print(" </body>");
        out.print("</html>");
        out.close();
    }
}
