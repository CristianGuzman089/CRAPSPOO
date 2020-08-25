/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package craps;

import java.util.Random;

/**
 *
 * @author FAMILIA GUZMAN TOVAR
 */
public class Dado {

    private int valor;

    public void setValor(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }

    public void lanzarDado() {
        Random r = new Random();
        this.valor = r.nextInt(6) + 1;
    }
}
