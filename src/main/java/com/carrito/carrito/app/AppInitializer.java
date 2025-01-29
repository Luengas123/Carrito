package com.carrito.carrito.app;

import com.carrito.carrito.modelo.ProductoDAO;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

public class AppInitializer implements ServletContextListener{
    private ProductoDAO prodDAO = new ProductoDAO();

    @Override
    public void contextInitialized(ServletContextEvent sce) {
       sce.getServletContext().setAttribute("productos", prodDAO.ListarTodos());
    }
    
    @Override
    public void contextDestroyed(ServletContextEvent sce){
    }

}
