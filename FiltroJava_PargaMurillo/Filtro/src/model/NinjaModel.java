/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import com.sun.jdi.connect.spi.Connection;
import filtro.ConnectioLan.Conexion;
import java.sql.PreparedStatement;
import Dao.Ninja;
/**
 *
 * @author camper
 */
class NinjaModel {
    
    public boolean addNinja( DaoNinja ninja) {
        if (isNinjaNameExists(ninja.getName())) {
            System.out.println("Ya existe un ninja con el mismo nombre.");
            return false;
        

        String sql = "INSERT INTO event (nombre, rango, recompensa) VALUES (?, ?, ?, )";
        Conexion conexion = new Conexion();
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            connection = conexion.establecerConexion();
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, ninja.nombre());
            stmt.setString(2, event.recompensa());
            
}
         int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            System.out.println("Error al insertar el ninja: " + e.getMessage());
            return false;
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexion: " + e.getMessage());
            }
        }
