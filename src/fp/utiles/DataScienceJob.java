package fp.utiles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import fp.common.Sector;

public class DataScienceJob {
	//Atributos
	private String company;
	private Integer employee;
	private String city;
	private LocalDate foundation;
	private Double rating;
	private Boolean isPrivate;
	private Boolean easyApply;
	private String sector;
	private String skills;
	
	//Constructores
		//1
	public DataScienceJob(String company, Integer employee, String city,
			LocalDate foundation, Double rating, Boolean isPrivate, Boolean easyApply, 
			String sector, String skills) {
		this.company = company;
		this.employee = employee;
		this.city = city;
		this.foundation = foundation;
		this.rating = rating;
		this.isPrivate = isPrivate;
		this.easyApply = easyApply;
		
	}
		//2
	public DataScienceJob(String s) {
		String[] sp = s.split(",");
		if (sp.length != 9) {
			throw new IllegalArgumentException(
					"Cadena con formato no válido");
		}
		this.company = sp[0].trim();
		this.employee = Integer.valueOf(sp[1].trim()); // Hay que convertir los tipos con value of.
		this.city = sp[2].trim();
		this.foundation = LocalDate.parse(sp[3].trim(), DateTimeFormatter.ofPattern("dd/MM/yy"));
		this.rating = Double.valueOf(sp[4].trim());
		this.isPrivate = formateoBooleano(sp[5].trim());
		this.easyApply = formateoBooleano(sp[6].trim());
	}
	
	private Boolean formateoBooleano(String s){
		Boolean res;
		if (s == "true") {
			res = true;
		}
		else {
			res = false;
		}
		return res;
	}

	//GETTERS AND SETTERS;	
	public String getCompany() {
		return company;
	}

	public Integer getEmployee() {
		return employee;
	}

	public String getCity() {
		return city;
	}

	public LocalDate getFoundation() {
		return foundation;
	}

	public Double getRating() {
		return rating;
	}

	public Boolean getIsPrivate() {
		return isPrivate;
	}

	public Boolean getEasyApply() {
		return easyApply;
	}
	
	public String getSector() {
		return sector;
		
		}
	
	public String getSkills() {
	return skills;
	
	}
	
	public Sector getSectorEnum() {
		String s = getSector();
		Sector res = null;
		switch (s) {
		case "TOURISM":
			//res = Sector.TOURISIM;
			break;
			
			
		}
		return res;
	}
//---------------------------------
	public void setCompany(String company) {
		this.company = company;
	}

	public void setEmployee(Integer employee) {
		this.employee = employee;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public void setFoundation(LocalDate foundation) {
		this.foundation = foundation;
	}

	public void setRating(Double rating) {
		this.rating = rating;
	}

	public void setIsPrivate(Boolean isPrivate) {
		this.isPrivate = isPrivate;
	}

	public void setEasyApply(Boolean easyApply) {
		this.easyApply = easyApply;
	}
		
	public void setSector(String sector) {
		this.sector = sector;
	}
	
	public void setSkills(String skills) {
		this.skills = skills;
	}

	
	//public Sector getSector() {
	//	Sector res = null;
		
	//}

	
	
	
	
	

}
