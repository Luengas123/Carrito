package com.carrito.carrito.app;

import com.carrito.carrito.modelo.dao.ProductoDAO;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppInitializer implements ServletContextListener {

    private ProductoDAO prodDAO = new ProductoDAO();

    @Override
    public void contextInitialized(ServletContextEvent sce) {

        // Verifica que el listener se está ejecutando
        System.out.println("AppInitializer: contextInitialized");

        // Cargar los productos en el contexto de la aplicación
        sce.getServletContext().setAttribute("productos", prodDAO.ListarTodos());
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        // Limpieza si fuera necesario
    }

}
