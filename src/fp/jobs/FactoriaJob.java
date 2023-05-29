package fp.jobs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FactoriaJob {
	//----------------------------------- 2ª ENTREGA -----------------------------------
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
	//----------------------------------- 3ª ENTREGA -----------------------------------
	//recibe como parámetro una cadena que contiene el nombre y ruta del fichero CSV, 
	//y devuelve un objeto del tipo contenedor "Jobs" creado mediante el constructor a partir de stream.
	
	 public static Jobs leerEmpleosStream(String nombreFichero){
		 Jobs res = null;
		 try {
			 Stream<Job> empleos = Files.lines(Paths.get(nombreFichero))
					 .skip(1)
					 .map(FactoriaJob::leerEmpleo);
			 
			 res = new Jobs(empleos);
			 
		 }catch(IOException e){
				System.out.println("Fichero no encontrado: " + nombreFichero);
				e.printStackTrace();
			}
		 return res;
		 
	 }

	 


}
		
	