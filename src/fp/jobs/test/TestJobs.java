package fp.jobs.test;

import java.util.Collection;

import fp.jobs.FactoriaJob;
import fp.jobs.Job;
import fp.jobs.Jobs;

public class TestJobs {
	
	private static Jobs empleos = new Jobs(FactoriaJob.leerEmpleos("data/DataScience.csv"));
	private static Collection<Job> col = FactoriaJob.leerEmpleos("data/DataScience.csv");
	private static String s = "Bida;	509;	Seville;	15/10/06;	2.76;	true;	true;	Information_Technology;	"
			+ "Work Under Pressure:Communication:Learning;	Av-Europa;	"
			+ "27-139-2368;	72'56445532;	 27'43554468 ";
	private static Job j1 = new Job(s);
	
	public static void main(String[] args) {
		//Tes operaciones básicas
		//testOperacionesBasicas();
		
		
		//Tratamientos secuenciales 
			//1
		//testExisteEmpleoEnCiudad("Pamplona"); //Devuelve true
		//testExisteEmpleoEnCiudad("Badalona"); //Devuelve false
			//2
		//testGetMediaPuntuacionEmpresa("Apple Inc.");
			//3
		//testGetGrandesEmpresas();
			//4
		//testGetEmpleosPorCompañias();
			//5
		//testGetNumeroEmpleosPorSector();
		
	}
	
	//Test operaciones básicas
	private static void testOperacionesBasicas() {
		System.out.println("\n----TestVariasOperaciones----");
		try {
		//a --> Obtener el número de elementos
		System.out.println("(a) El numero de elementos del contenedor es: " + empleos.getNumeroEmpleos()+"\n");
		
		//b -->	Añadir un elemento
		System.out.println("(b) Añado j1 al contenedor");
		empleos.anadirEmpleo(j1);
		System.out.println("Empleos contiene a j1: " + empleos.getEmpleos().contains(j1) +
				"\nAhora el numero de elemetos es: " + empleos.getNumeroEmpleos()+ "\n");

		//c --> Añadir una colección de elementos
		System.out.println("(c) Añado una colección de elementos");
		empleos.añadirColeccion(col);
		System.out.println("Ahora el numero de elemetos es: " + empleos.getNumeroEmpleos()+ "\n");
		
		//d --> Eliminar un elemento
		System.out.println("(d) Elimino j1 del contenedor");
		empleos.eliminarEmpleo(j1);
		System.out.println("Empleos contiene a j1: " + empleos.getEmpleos().contains(j1) +
				"\nAhora el numero de elemetos es: " + empleos.getNumeroEmpleos()+ "\n");

		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}	
	
	
	//Test Tratamientos secuenciales
		// 1 -> ¿Existe algun empleo situado en una ciudad pasada por parámetro?
	private static void testExisteEmpleoEnCiudad(String ciudad) {
		System.out.println("\n----TestExisteEmpleoEnCiudad----");
		try {
		System.out.println("¿Hay algun empleo en la ciudad " + ciudad +"?"+"\n");
		System.out.println(empleos.existeEmpleoEnCiudad(ciudad));
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
		// 2 -> Media de puntación de la empresa pasada por parámetro 
	private static void testGetMediaPuntuacionEmpresa(String empresa) {
		System.out.println("\n----TestGetMediaPuntuacionEmpresa(String empresa)----");
		try {
			System.out.println("La puntuación media de la empresa " + empresa +" es: ");
			System.out.print(empleos.getMediaPuntuacionEmpresa(empresa)+"\n");
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
		// 3 -> Selección de empresas con más de 500 empleados
	
	private static void testGetGrandesEmpresas() {
		System.out.println("\n----TestGetGrandesEmpresas()----");
		try {
			System.out.println("Las grandes empresas son: ");
			System.out.print(empleos.getGrandesEmpresas()+"\n");
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
		// 4 -> Agrupa empleos por compañías
	
	private static void testGetEmpleosPorCompañias() {
		System.out.println("\n----TestGetEmpleosPorCompañias()----");
		try {
			System.out.println("Los empleos agrupados por compañías son ");
			System.out.println(empleos.getEmpleosPorCompañias());
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
		// 5 -> Diccionario contador: empleos por sectores
	
	private static void testGetNumeroEmpleosPorSector() {
		System.out.println("\n----TestGetNumeroEmpleosPorSector()----");
		try {
			System.out.println("El número de empleos por sector es: ");
			System.out.println(empleos.getNumeroEmpleosPorSector());
		} catch(Exception e) {
			System.out.println("Excepción capturada:\n   " + e);	
		}
	}
	
}


