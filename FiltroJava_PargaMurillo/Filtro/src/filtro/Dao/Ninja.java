
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package filtro.Dao;



/**
 *
 * @author camper
 */
public class Ninja {
    
    private int id_ninja;
    private String nombre;
    private String rango;
    private Double recompensa;
    

       
    public Ninja() {
    }

    public Ninja (int id_ninja, String nombre, String rango, double recompensa) {
        this.id_ninja = id_ninja;
        this.nombre = nombre;
        this.rango= rango;
        this.recompensa= recompensa;
       

}

    public int getId_ninja() {
        return id_ninja;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRango() {
        return rango;
    }

    public Double getRecompensa() {
        return recompensa;
    }

    public void setId_ninja(int id_ninja) {
        this.id_ninja = id_ninja;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRango(String rango) {
        this.rango = rango;
    }

    public void setRecompensa(Double recompensa) {
        this.recompensa = recompensa;
    }
    
     public boolean addNinja (){
    
     

       
        return false;
    
     

       
  }
}


 


