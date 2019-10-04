
package Template;

import java.util.List;

public class Implementado {

    public static void main(String[] args) {
        
//        LeeArchivo lee = new LeeArchivo();
//        List<Alumnos> alumnos = lee.getAlumnos();
        
//        for (Alumnos alumno : alumnos) {
//            System.out.println("Los alumnos son..." + "\nNombre: " + alumno.getNombre() + "\nApellido Paterno: " + alumno.getApellido1()
//                                + "\nApellido Materno: " + alumno.getApellido2() + "\nEdad: " + alumno.getEdad() + "\nCalificacion: "  + alumno.getCalificacion());
//            System.out.println("");
//        }
//      
        //String archivo = "C:\\Users\\alber\\Documents\\Osito\\Prueba.xls";
        LeeExcel le = new LeeExcel();
        le.getAlumnos();
        
    }

    
    
}
