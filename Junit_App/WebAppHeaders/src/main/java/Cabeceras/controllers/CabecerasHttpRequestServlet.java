package Cabeceras.controllers;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet("/cabeceras-request")
public class CabecerasHttpRequestServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        String metodoHttp = req.getMethod();
        String requestUri = req.getRequestURI();
        String requestUrl = req.getRequestURL().toString();
        String contextPath = req.getContextPath();
        String servletPath = req.getServletPath();
        String ip = req.getLocalAddr();
        int port = req.getLocalPort();
        String schema = req.getScheme();
        String host = req.getHeader("host");
        String url = schema+"://"+host+contextPath+servletPath;
        String ipCliente = req.getRemoteAddr();
        try (PrintWriter out = resp.getWriter()) {
            out.print("<!DOCTYPE html>");
            out.print("<html>");
            out.print(" <head>");
            out.print("     <meta charset\"UTF-8\">");
            out.print("     <title>Cabeceras HTTp Request</title>");
            out.print(" </head>");
            out.print(" <body>");
            out.print("     <h1>Cabeceras HTTp Request</h1>");
            out.print("     <ul>");
            out.print("         <li>Metodo HTTP: "+metodoHttp+"</li>");
            out.print("         <li>requestUri : "+requestUri+"</li>");
            out.print("         <li>requestUrl: "+requestUrl+"</li>");
            out.print("         <li>contextPath: "+contextPath+"</li>");
            out.print("         <li>servletPath: "+servletPath+"</li>");
            out.print("         <li>ip: "+ip+"</li>");
            out.print("         <li>port: "+port+"</li>");
            out.print("         <li>schema: "+schema+"</li>");
            out.print("         <li>host: "+host+"</li>");
            out.print("         <li>url: "+url+"</li>");
            out.print("         <li>ipCliente: "+ipCliente+"</li>");
            Enumeration<String> headerNames = req.getHeaderNames();
            while (headerNames.hasMoreElements()){
                String header = headerNames.nextElement();
                out.println("<li>"+header+":"+ req.getHeader(header)+"</li>");
            }
            out.print("     </ul>");
            out.print("<a href=\"" +req.getContextPath()+"/" + "\"> volver</a>");
            out.print(" </body>");
            out.print("</html>");
        }
    }
}
