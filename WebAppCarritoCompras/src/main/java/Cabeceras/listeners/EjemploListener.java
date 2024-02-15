package Cabeceras.listeners;

import Cabeceras.models.Carro;
import jakarta.servlet.*;
import jakarta.servlet.annotation.WebListener;
import jakarta.servlet.http.HttpSession;
import jakarta.servlet.http.HttpSessionEvent;
import jakarta.servlet.http.HttpSessionListener;

//para manejar el contexto general de la applicacion para inicializar recursos globales, configuraciones o conexiones a BD  usamos el Servlet Context Listener de forma general
//para el request ServletRequestListener
// para las sesiones Http HttpSessionListener


@WebListener
public class EjemploListener implements ServletContextListener, ServletRequestListener, HttpSessionListener {
    private ServletContext servletContext;


    @Override
    public void contextInitialized(ServletContextEvent sce) {
        servletContext = sce.getServletContext();
        sce.getServletContext().log("inicializando la aplicacion");
        servletContext.setAttribute("mensaje", "algun valor global de la app");

    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        sce.getServletContext().log("Destruyendo la aplicacion");
    }

    @Override
    public void requestInitialized(ServletRequestEvent sre) {
        sre.getServletContext().log("inicializando el request");
        servletContext.setAttribute("mensahe","guardando algun valor para el request");
    }


    @Override
    public void requestDestroyed(ServletRequestEvent sre) {
        sre.getServletContext().log("Destruyendo el request");
    }

    @Override
    public void sessionCreated(HttpSessionEvent se) {
        servletContext.log("creando la sesion http");
        Carro carro = new Carro();
        HttpSession session = se.getSession();
        session.setAttribute("carro", carro);

    }

    @Override
    public void sessionDestroyed(HttpSessionEvent se) {
        servletContext.log("destruyendo la sesion http");
    }
}
