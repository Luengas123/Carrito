package com.carrito.carrito.modelo.dao;

import com.carrito.carrito.config.Conexion;
import com.carrito.carrito.modelo.Producto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class ProductoDAO {
    private Connection cn = null;
    private PreparedStatement ps = null;
    private ResultSet rs = null;
    
    public ArrayList<Producto> ListarTodos(){
        ArrayList<Producto> lista= new ArrayList<Producto>();
        
        try {
            cn = Conexion.getConnection();
            String sql = "select * from Producto";
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            while (rs.next()) {                
                Producto obj = new Producto();
                obj.setIdProd(rs.getInt("id_prod"));
                obj.setNombre(rs.getString("nombre"));
                obj.setPrecio(rs.getDouble("precio"));
                obj.setImagen(rs.getString("imagen"));
                lista.add(obj);
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if (cn != null) {
                    cn.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return lista;
    }
    
    public Producto BuscarPorId(int id){
        Producto obj = null;
        
        try {
            cn = Conexion.getConnection();
            String sql = "select * from Producto where id_prod = ?";
            ps=cn.prepareStatement(sql);
            rs=ps.executeQuery();
            
            if (rs.next()) {                
                obj = new Producto();
                obj.setIdProd(rs.getInt("id_prod"));
                obj.setNombre(rs.getString("nombre"));
                obj.setPrecio(rs.getDouble("precio"));
                obj.setImagen(rs.getString("imagen"));
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        }finally{
            try {
                if (cn != null) {
                    cn.close();
                }
                if (ps != null) {
                    ps.close();
                }
                if (rs != null) {
                    rs.close();
                    
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        
        return obj;
    }
}
