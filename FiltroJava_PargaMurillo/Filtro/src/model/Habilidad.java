/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/**
 *
 * @author camper
 */
public class Habilidad {

    private int id_ninja
    private String nombre;
    private String descripcion;

    public Habilidad() {
    }

    public Habilidad(int id_ninja, String nombre, String descripcion) {
        this.id_ninja = id_ninja;
        this.nombre = nombre;
        this.descripcion = descripcion;

    }

    public int getId_event() {
        return id_ninja;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId_ninja(int id_ninja) {
        this.id_ninja = id_ninja;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getDescripcion() {
        return descripcion;
    }

  
        String sql = "INSERT INTO Habilidad (name, descripcion) VALUES (?, ? )";
        Connection connection = null;
        PreparedStatement stmt = null;

        try {
            stmt = connection.prepareStatement(sql);
            stmt.setString(1, Habilidad.getNombre());
            stmt.setString(2, event.getDescripcion());
      

            int rowsInserted = stmt.executeUpdate();
            return rowsInserted > 0;
        } catch (SQLException e) {
            System.out.println("Error al crear habilidad: " + e.getMessage());
            return false;
        } finally {
            try {
                if (stmt != null) stmt.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                System.out.println("Error al cerrar la conexión: " + e.getMessage());
            }
}


       
//
