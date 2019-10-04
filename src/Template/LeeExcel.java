package Template;

import java.io.File;
import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
 

public class LeeExcel {

    //public FileInputStream fi;
    public final String archivo = "C:\\Users\\jesus\\Documents\\ISI\\DSIV\\Practica4\\AlumnosExcel.xlsx";

    public List<Alumnos>  getAlumnos() {
        
        List<Alumnos> lista = new ArrayList<Alumnos>();
        String nombre = "", apellido1 = "", apellido2 = "";
        int edad = 0, calificacion = 0;
        try {
            FileInputStream file = new FileInputStream(new File(archivo));
            XSSFWorkbook workbook = new XSSFWorkbook(file);
            XSSFSheet sheet = workbook.getSheetAt(0);
            Iterator<Row> rowIterator = sheet.iterator();
            Row row;
            // se recorre cada fila hasta el final
            while (rowIterator.hasNext()) {
                row = rowIterator.next();
                //System.out.println(row);
                //se obtiene las celdas por fila
                Iterator<Cell> cellIterator = row.cellIterator();
                Cell cell;
                int contador = 0;
                //se recorre cada celda
                while (cellIterator.hasNext()) {
                    // se obtiene la celda en específico y se la imprime
                    cell = cellIterator.next();
                    nombre = cell.toString();
                    cell = cellIterator.next();
                    apellido1 = cell.toString();
                    cell = cellIterator.next();
                    apellido2 = cell.toString();
                    cell = cellIterator.next();
                    edad = (int) cell.getNumericCellValue();
                    cell = cellIterator.next();
                    calificacion = (int) cell.getNumericCellValue();
                    lista.add(new Alumnos(nombre, apellido1, apellido2, edad, calificacion));
                }
                //System.out.println();
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        
        return lista;
        
    }


}

