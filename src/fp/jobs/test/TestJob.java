package fp.jobs.test;

import java.time.LocalDate;

import fp.jobs.Job;

public class TestJob {

	public static void main(String[] args) {
		
		//Constructor 1
		Job d1 = new Job("Zepter", 509, "Nizip", LocalDate.of(2006,10,15), 2.76, true, 
				true); 
		
		//System.out.println(d1);
		/*System.out.println(d1.getEmpresa());
		System.out.println(d1.getEmpleados());
		System.out.println(d1.getCiudad());
		System.out.println(d1.getFundacion());
		System.out.println(d1.getPuntuacion());
		System.out.println(d1.getEsPrivada());
		System.out.println(d1.getFacilSolicitud());
		System.out.println(d1.getSector());
		System.out.println(d1.getHabilidades());
		System.out.println(d1.getTamaño());
		*/
		
		//System.out.println(d1.getFormatoCorto());
		

		//Constructor 2
		Job d2 = new Job("Zepter,	509,	Nizip,	15/10/06,	2.76,	true,	"
				+ "true,	Information_Technology,	Work Under Pressure;Teamwork;, Jackson Street- 5847,	"
				+ "27-139-2368,	72'56445532,	 27'43554468  ");
		
		//System.out.println(d2);
		/*
		System.out.println(d2.getEmpresa());
		System.out.println(d2.getEmpleados());
		System.out.println(d2.getCiudad());
		System.out.println(d2.getFundacion());
		System.out.println(d2.getPuntuacion());
		System.out.println(d2.getEsPrivada());
		System.out.println(d2.getFacilSolicitud());
		System.out.println(d2.getSector());
		System.out.println(d2.getHabilidades()); 
		System.out.println(d2.getTamaño());
		System.out.println(d2.getEmpresaR());
		*/
		
		//System.out.println(d2.getFormatoCorto());
		//System.out.println(d2.getPersonal().mujeres());
		
		Job d3 = new Job("Facebook,	892,	Ulloa (Barrial],	7/3/14,	0.6,	"
				+ "false,false,Finance,	Communication;Time Management;Self-motivation,Norland  Pass- 8878,"
				+ "	11-190-2838,	87'78621339,	 12'21378661  ");
		//System.out.println(d3);
		
		
		
		/*
		System.out.println(d1==d2);
		System.out.println(d1==d3);
		System.out.println(d3==d2);
		*/
		
		/*
		System.out.println(d1.equals(d2)); // Son iguales
		System.out.println(d1.equals(d3));
		System.out.println(d3.equals(d2));
		*/
		
		/*
		System.out.println(d2.hashCode() == d1.hashCode()); //son iguales
		System.out.println(d2.hashCode() == d3.hashCode()); //son distintos
		*/
		
		/*
		System.out.println(d1.compareTo(d2)); // Son iguales
		System.out.println(d1.compareTo(d3)); // Zepter (empresa d1) va después que Facebook(empresa d3) 
		*/
		
		
	}

}