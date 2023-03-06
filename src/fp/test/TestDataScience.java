package fp.test;

import java.time.LocalDate;

import fp.jobs.DataScienceJob;

public class TestDataScience {

	public static void main(String[] args) {
		
		//Constructor 1
		DataScienceJob d1 = new DataScienceJob("Zepter", 509, "Nizip", LocalDate.of(6,10,15), 2.76, true, 
				true); 
		/*
		System.out.println(d1);
		System.out.println(d1.getCompany());
		System.out.println(d1.getEmployee());
		System.out.println(d1.getCity());
		System.out.println(d1.getFoundation());
		System.out.println(d1.getRating());
		System.out.println(d1.getIsPrivate());
		System.out.println(d1.getEasyApply());
		*/
		System.out.println(d1.getFormatoCorto());
		

		//Constructor 2
		DataScienceJob d2 = new DataScienceJob("Zepter,	509,	Nizip,	15/10/06,	2.76,	true,	"
				+ "true,	Information_Technology,	(Work Under Pressure)");
		/*
		System.out.println(d2);
		System.out.println(d2.getCompany());
		System.out.println(d2.getEmployee());
		System.out.println(d2.getCity());
		System.out.println(d2.getFoundation());
		System.out.println(d2.getRating());
		System.out.println(d2.getIsPrivate());
		System.out.println(d2.getFormatoCorto());
		
		
		System.out.println(d1.compareTo(d2));
		System.out.println(d1.equals(d2)); //???*/
		//HACER COMPROBACIONES EQUALS, HASHCODE, TOSTRING
		
	}

}