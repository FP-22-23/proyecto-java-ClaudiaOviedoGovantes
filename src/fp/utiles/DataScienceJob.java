package fp.utiles;

import java.time.LocalDate;

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
	
	//Constructores
		//1
	public DataScienceJob(String company, Integer employee, String city,
			LocalDate foundation, Double rating, Boolean isPrivate, Boolean easyApply) {
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
		this.employee = employee; // Hay que convertir los tipos con value of.
		this.city = city;
		this.foundation = foundation;
		this.rating = rating;
		this.isPrivate = isPrivate;
		this.easyApply = easyApply;
		
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
	
	//public Sector getSector() {
	//	Sector res = null;
		
	//}

	
	
	

}
