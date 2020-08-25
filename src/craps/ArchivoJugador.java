package craps;

import java.io.*;
import java.util.ArrayList;


public class ArchivoJugador {

    private static File archivo;

    public ArchivoJugador() {
        archivo = new File("ArchivoRegistro.txt");
    }

    public ArchivoJugador(Jugador j) {
        archivo = new File("ArchivoRegistro.txt");
        grabar(j);
    }

    public static void grabar(Jugador j) {
        FileWriter salida;
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
                salida = new FileWriter(archivo, true);
                String texto = j.getNombre() + "%" + j.getSaldo() + "\n";
                salida.write(texto);
                salida.close();
            } catch (IOException ioe) {
                System.out.println("Error al escribir en el archivo");
            }
        } else {
            try {
                salida = new FileWriter(archivo, true);
                String texto = j.getNombre() + "%" + j.getSaldo() + "\n";
                salida.write(texto);
                salida.close();
            } catch (IOException ioe) {
                System.out.println("Error al escribir en el archivo");
            }
        }

    }

    public ArrayList<Jugador> leer() {
        ArrayList<Jugador> listaJugadores = new ArrayList<>();

        try {

            //lectura de datos
            BufferedReader entrada = new BufferedReader(new FileReader("ArchivoRegistro.txt"));
            String s, s2 = new String();
            String nombre;
            String saldo;
            while ((s = entrada.readLine()) != null) {
                s2 += s + "\n";
                String[] informacion = s.split("%");
                nombre = informacion[0];
                saldo = informacion[1];
                Jugador j = new Jugador(nombre, Integer.parseInt(saldo));
                listaJugadores.add(j);
            }
            entrada.close();
        } catch (java.io.IOException e) {
            System.out.println("Error al leer del archivo");
        }
        return listaJugadores;
    }

}
