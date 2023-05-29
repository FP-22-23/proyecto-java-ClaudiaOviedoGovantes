package fp.jobs.test;

import java.util.List;
import java.util.stream.Collectors;

import fp.jobs.FactoriaJob;
import fp.jobs.Job;
import fp.jobs.Jobs;

public class TestFactoriaJobs {

	public static void main(String[] args) {
		String s = "Bida;	509;	Seville;	15/10/06;	2.76;	true;	true;	Information_Technology;	"
				+ "Work Under Pressure:Communication:Learning;	Av-Europa;	"
				+ "27-139-2368;	72'56445532;	 27'43554468 ";
		
		//----------------------------------- 2ª ENTREGA
		//testLeerEmpleo(s);
		//testLeerEmpleos("data/DataScience.csv");

		//----------------------------------- 3ª ENTREGA
		//testLeerEmpleosStream("data/DataScience.csv");
		}
	//----------------------------------- 2ª ENTREGA -----------------------------------
	private static void testLeerEmpleo(String cadena) {
		System.out.println("\nTestLeerEmpleo =============");
		Job j = FactoriaJob.leerEmpleo(cadena);
		System.out.println(j);
		}
	
	private static void testLeerEmpleos(String fichero) {
		System.out.println("\nTestLeerEmpleos =============");
		List<Job> empleos = FactoriaJob.leerEmpleos(fichero); 
		for (Job j: empleos) {
			System.out.println(j);
			}
			}
	//----------------------------------- 3ª ENTREGA -----------------------------------
	private static void testLeerEmpleosStream(String fichero) {
			System.out.println("\nTestLeerEmpleosStream =============");
			Jobs contenedor = FactoriaJob.leerEmpleosStream(fichero); 
			for (Job j: contenedor.getEmpleos()) {
				System.out.println(j);
			}
			}
	
}
