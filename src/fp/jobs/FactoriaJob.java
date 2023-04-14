package fp.jobs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class FactoriaJob {
	//Devuelve un objeto de tipo Job a partir de una cadena
	public static Job leerEmpleo(String cadena) {
		Job res = new Job(cadena);
		return res;
	}
	
	//Devuelve una lista de objetos del tipo Job
	public static List<Job> leerEmpleos(String nombreFichero) {
		List<Job> res= new ArrayList<Job>();
		try { 
			List<String> lineas=Files.readAllLines(Paths.get(nombreFichero));
			for (String linea:lineas) {
				if(lineas.indexOf(linea) != 0) {
				System.out.println(linea);
				res.add(new Job(linea));	//Constructor a partir de String
			}}
		}catch (IOException e) {
			e.printStackTrace();
		}
		return res;
	}
	



}
		
	