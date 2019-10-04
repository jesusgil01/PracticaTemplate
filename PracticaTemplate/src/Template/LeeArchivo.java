/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Template;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;




/**
 *
 * @author alber
 */
public class LeeArchivo {

    public final String archivo = "C:\\Users\\alber\\Documents\\Osito\\Prueba.txt";
    
    public List<Alumnos> getAlumnos() {
        Alumnos alumnos;
        List<Alumnos> lista = new ArrayList<Alumnos>();
        try {
            String cadena;
            FileReader f = new FileReader(archivo);
            BufferedReader b = new BufferedReader(f);
            while ((cadena = b.readLine()) != null) {
                String [] partes = cadena.split(",");
                String nombre = partes[0];
                String apellido1 = partes[1];
                String apellido2 = partes[2];
                String edad = partes[3];
                String calificacion = partes[4];
                alumnos = new Alumnos(nombre, apellido1, apellido2, Integer.parseInt(edad), Integer.parseInt(calificacion));
                lista.add(alumnos);
            }
            b.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

        return lista;
    }

}
