package fp.jobs.test;

import fp.jobs.FactoriaJob;
import fp.jobs.Job;
import fp.jobs.Jobs;

public class TestJobs {
	private static Jobs empleos = new Jobs(FactoriaJob.leerEmpleos("data/DataScience.csv"));
	private static String s = "Zepter;	509;	Nizip;	15/10/06;	2.76;	true;	true;	Information_Technology;	"
			+ "Work Under Pressure:Communication:Learning;	Jackson Street- 5847;	"
			+ "27-139-2368;	72'56445532;	 27'43554468 ";
	private static Job j1 = new Job(s);
	
	public static void main(String[] args) {
		
		//Tratamientos secunciales 
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
		
	
	
	//Otras operaciones
	//a --> Obtener el número de elementos
	//System.out.println(empleos1.getNumeroEmpleos());
	//b -->	Añadir un elemento
	//c --> Añadir una colección de elementos
	//d --> Eliminar un elemento
		
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


