package fp.jobs.test;

import java.util.List;

import fp.jobs.FactoriaJob;
import fp.jobs.Job;

public class TestFactoriaJobs {

	public static void main(String[] args) {
		testLeerJobs("data/DataScience.csv");
		}
	
	private static void testLeerJobs(String fichero) {
		System.out.println("\nTestLeerJobs =============");
		List<Job> empleos = FactoriaJob.leerEmpleos(fichero); 
		for (Job j: empleos) {
			System.out.println(j);
		}
	}
	
}
