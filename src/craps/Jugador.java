/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps;

/**
 *
 * @author FAMILIA GUZMAN TOVAR
 */
public class Jugador {
    private String nombre;
    private int saldo;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSaldo() {
        return saldo;
    }

    public String getStringSaldo(){
        return Integer.toString(saldo);
    }
    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public Jugador() {
        this.nombre = "";
        this.saldo = 0;
    }
    public Jugador(String nombre,int saldo) {
        this.nombre = nombre;
        this.saldo = saldo;
    }
    
    public String mostrarDatos(){
        return nombre+" "+saldo;
    }
   
    
}
