package modelo;
import java.util.List;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class PrincipalPI {

	public static void main(String[] args) {
		    String archivo = "C:\\Users\\proca\\eclipse-workspace\\Apuestas\\src\\Metodos\\apuestas.csv";		    
		    List<List<String>> lineas = leerArchivo(archivo);
		    for (List<String> linea : lineas) {
		        System.out.println(linea);
		    }
		}

	public static List<List<String>> leerArchivo(String archivo) {
		    List<List<String>> lineas = new ArrayList<>();
		    try (BufferedReader br = new BufferedReader(new FileReader(archivo))) {
		        String linea;
		        while ((linea = br.readLine()) != null) {
		            String[] valores = linea.split(",");
		            List<String> valoresLista = new ArrayList<>();
		            for (String valor : valores) {
		                valoresLista.add(valor);
		            }
		            lineas.add(valoresLista);
		        }
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		    return lineas;
		}
}