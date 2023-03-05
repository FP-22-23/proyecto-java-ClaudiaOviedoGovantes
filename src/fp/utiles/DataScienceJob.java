package fp.utiles;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

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
	private String sector; //hay que poner sector aqui?? 
	private String skills;

	
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
		this.sector = null;
		this.skills = null;
		
	}
		//2
	public DataScienceJob(String s) {
		String[] sp = s.split(",");
		if (sp.length != 9) {
			throw new IllegalArgumentException(
					"Cadena con formato no válido");
		}
		this.company = sp[0].trim();
		this.employee = Integer.valueOf(sp[1].trim()); 
		this.city = sp[2].trim();
		this.foundation = LocalDate.parse(sp[3].trim(), DateTimeFormatter.ofPattern("dd/MM/yy"));
		this.rating = Double.valueOf(sp[4].trim());
		this.isPrivate = formateoBooleano(sp[5].trim());
		this.easyApply = formateoBooleano(sp[6].trim());
		this.sector = sp[7].trim();
		this.skills = sp[8].trim();
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
	private LocalDate fechaFormateada(LocalDate d) {
		LocalDate res;
		String d2 = String.valueOf(d);
		System.out.println();
		res =  LocalDate.parse(d2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
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
	
	public Sector getSectorEnum(String s) {
		Sector res = null;
		switch (s) {
		case "Tourism":
			res = Sector.TOURISM;
			break;
		case "Information_Technology":
			res = Sector.INFORMATION_TECHNOLOGY;
			break;
		case "Consumer_Services":
			res = Sector.CONSUMER_SERVICES;
			break;
		case "Finance":
			res = Sector.FINANCE;
			break;
		default:
			res = Sector.MEDIA;
			
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
	
//____FormatoCorto___
	public String getFormatoCorto() {
		String res = getCompany();
		if (getFoundation() != null) {
			res += ", was founded in " + getFoundation().getYear();
		}
		if (getRating() != null) {
			res += ", has a rating of " + getRating()+"/5";
		}
		return res;
	}
	

	
//____ToString____
	public String toString() {
		String res =  "DataScienceJob [company=" + company + ", employee=" + employee + ", city=" + city + ", foundation="
				+ foundation + ", rating=" + rating + ", isPrivate=" + isPrivate + ", easyApply=" + easyApply;
		if (sector != null) {
				res +=", sector=" + getSectorEnum(sector);
			}
		if (skills != null) {
			res += ", skills=" + skills + "]";
		}
		return res;
				
	}
//____HashCode____
	public int hashCode() {
		return Objects.hash(city, company, easyApply, employee, foundation, isPrivate, rating);
	}

//_____Equals____
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataScienceJob other = (DataScienceJob) obj;
		return Objects.equals(city, other.city) && Objects.equals(company, other.company)
				&& Objects.equals(easyApply, other.easyApply) && Objects.equals(employee, other.employee)
				&& Objects.equals(foundation, other.foundation) && Objects.equals(isPrivate, other.isPrivate)
				&& Objects.equals(rating, other.rating);
	}


//___CompareTo
	public int compareTo(DataScienceJob j1) {
		int r = this.getCity().compareTo(j1.getCity());
		if (r==0) {
			r = this.getCompany().compareTo(j1.getCompany());
		}
		if (r==0) {
			r = this.getFoundation().compareTo(j1.getFoundation());
		}
		
		return r;
	}
	

	
	
	
	
	

}
