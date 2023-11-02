	package modelo;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;


public class LectorDeArchivos {
	
	   private List<String[]> ronda;
	   private List<String[]> pronosticos;

	   public LectorDeArchivos(String rutaArchivo1, String rutaArchivo2) throws IOException {
	        Path pathArchivo1 = Paths.get(rutaArchivo1);
	        Path pathArchivo2 = Paths.get(rutaArchivo2);

	        String linea;
	        String cvsSplitBy = ";";

	        List<String[]> data1 = new ArrayList<>();
	        List<String[]> data2 = new ArrayList<>();

	        try (BufferedReader br1 = new BufferedReader(new FileReader(pathArchivo1.toString()))) {
	            while ((linea = br1.readLine()) != null) {
	                String[] filaData1 = linea.split(cvsSplitBy);
	                data1.add(filaData1);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }

	        try (BufferedReader br2 = new BufferedReader(new FileReader(pathArchivo2.toString()))) {
	            while ((linea = br2.readLine()) != null) {
	                String[] filaData2 = linea.split(cvsSplitBy);
	                data2.add(filaData2);
	            }
	        } catch (IOException e) {
	            e.printStackTrace();
	        }
	        
	    }
	   
	   public List<String[]> getRondas(){
		   return null;
	   }
	   
	   public List<String[]> getEquipos(){
		   return null;
	   }
}
//	    public static void main(String[] args) {
//	    	LectorDeArchivos objeto = new LectorDeArchivos();
//
//	        String pathArchivo1 = "Resultados.csv";
//	        String pathArchivo2 = "Pronosticos.csv";
//
//	        Resultados resultado;
//	        try {
//	            resultado = objeto.leerArchivos(pathArchivo1, pathArchivo2);
//
//	            List<String[]> data1 = resultado.data1;
//	            List<String[]> data2 = resultado.data2;
//	            
//	            // Imprimir encabezado
//	          for (String dato : data1.get(0)) {
//	                System.out.print(dato + " |");
//	            }
//	            System.out.println();
//
//	            // Imprimir datos
//	            for (int i = 1; i < data1.size(); i++) {
//	                for (String dato : data1.get(i)) {
//	                    System.out.print(dato + "|");
//	                }
//	                System.out.println();
//	            }
//
//	            System.out.println();
//	            
//	            // Imprimir encabezado
//	            for (String dato : data2.get(0)) {
//	                System.out.print(dato + "| ");
//	            }
//	            System.out.println();
//
//	            // Imprimir datos
//	            for (int i = 1; i < data2.size(); i++) {
//	                for (String dato : data2.get(i)) {
//	                    System.out.print(dato + " |");
//	                }
//	                System.out.println();
//	            }
//	        } catch (IOException e) {
//	            e.printStackTrace();
//	        }
//	    }
//}
