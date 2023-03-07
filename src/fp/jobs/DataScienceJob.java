package fp.jobs;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;

import fp.common.Personal;
import fp.common.Sector;
import fp.common.Tamaño;
import fp.utiles.Checkers;

public class DataScienceJob {
	//Atributos
	private String empresa;
	private Integer empleados;
	private String ciudad;
	private LocalDate fundacion;
	private Double puntuacion;
	private Boolean esPrivada;
	private Boolean facilSolicitud;
	private Sector sector; 
	private List<String> habilidades;
	private Personal personal;

	
	//-----Constructores-----
		//1 public static void check(String textoRestriccion, Boolean condicion)
	public DataScienceJob(String empresa, Integer empleados, String ciudad,
			LocalDate fundacion, Double puntuacion, Boolean esPrivada, Boolean facilSolicitud) {
		Checkers.check("El nombre de la empresa no puede estar vacio", 
				empresa.trim() != "");
		Checkers.check("El numero de empleados tiene que ser mayor que 0",
				empleados > 0);
		
		this.empresa = empresa;
		this.empleados = empleados;
		this.ciudad = ciudad;
		this.fundacion = fundacion;
		this.puntuacion = puntuacion;
		this.esPrivada = esPrivada;
		this.facilSolicitud = facilSolicitud;
		this.sector = null;
		this.habilidades = null;
		this.personal = null;
	}
		//2
	public DataScienceJob(String s) {
		String[] sp = s.split(",");
		if (sp.length != 11) {
			throw new IllegalArgumentException(
					"Cadena con formato no válido");
		}
		Checkers.check("El nombre de la empresa no puede estar vacio", 
				sp[0].trim() != "");
		Checkers.check("El numero de empleados tiene que ser mayor que 0",
				Integer.valueOf(sp[1].trim()) > 0);
		
		this.empresa = sp[0].trim();
		this.empleados = Integer.valueOf(sp[1].trim()); 
		this.ciudad = sp[2].trim();
		this.fundacion = LocalDate.parse(sp[3].trim(), DateTimeFormatter.ofPattern("d/M/yy"));
		this.puntuacion = Double.valueOf(sp[4].trim());
		this.esPrivada = Boolean.valueOf(sp[5].trim());
		this.facilSolicitud = Boolean.valueOf(sp[6].trim());
		this.sector = Sector.valueOf(sp[7].trim().toUpperCase());
		
		List<String> lista = new LinkedList<String>();
		String[] habilidades = sp[8].trim().split(";");
		for (String h : habilidades) {
			lista.add(h);
			this.habilidades = lista;
		}
		this.personal = new Personal(Double.valueOf(sp[9].trim().replace("'", ".")), 
				Double.valueOf(sp[10].trim().replace("'", ".")));
		
	}
	
	//-----Parseo-----
	
	public Sector formateoEnum(String s) {
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
	
	//-----GETTERS AND SETTERS-----;	
		
	public String getEmpresa() {
		return empresa;
	}
	public Integer getEmpleados() {
		return empleados;
	}
	public String getCiudad() {
		return ciudad;
	}
	public LocalDate getFundacion() {
		return fundacion;
	}
	public Double getPuntuacion() {
		return puntuacion;
	}
	public Boolean getEsPrivada() {
		return esPrivada;
	}
	public Boolean getFacilSolicitud() {
		return facilSolicitud;
	}
	public Sector getSector() {
		return sector;
	}
	public List<String> getHabilidades() {
		return habilidades;
	}
	/*public Personal getPersonal() {
		return personal;
	}*/
	public void setEmpresa(String empresa) {
		Checkers.check("El nombre de la empresa no puede estar vacio", 
				empresa.trim() != "");
		this.empresa = empresa;
	}
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}
	public void setFundacion(LocalDate fundacion) {
		this.fundacion = fundacion;
	}
	public void setPuntuacion(Double puntuacion) {
		this.puntuacion = puntuacion;
	}
	public void setFacilSolicitud(Boolean facilSolicitud) {
		this.facilSolicitud = facilSolicitud;
	}
	
	//-----Pequeñe/Mediana/Gran empresa (propiedad derivada)-----
	public Tamaño getTamaño() {
		Tamaño res = Tamaño.PEQUEÑA;
		
		if (getEmpleados() > 250) {
			res = Tamaño.MEDIANA;
		}
		else if(getEmpleados() > 500) {
			res = Tamaño.GRAN;
		}
		return res;
	}

	//-----FormatoCorto ----- (propiedad derivada)-----
	public String getFormatoCorto() {
		String res = getEmpresa();
		if (getFundacion() != null) {
			res += ", fue fundada en el año " + getFundacion().getYear();
		}
		if (getPuntuacion() != null) {
			res += ", tiene una puntuacion de " + getPuntuacion()+"/5";
		}
		return res;
	}
	
	//-----ToString-----
	public String toString() {
		String res =  "DataScienceJob [empresa=" + empresa + ", empleados=" + empleados + ", ciudad=" + ciudad + ", fundacion="
				+ fundacion + ", puntuacion=" + puntuacion + ", esPrivada=" + esPrivada + ", facilSolicitud=" + facilSolicitud;
		if (sector != null) {
				res +=", sector=" + sector;
			}
		if (habilidades != null) {
			res += ", habilidades=" + habilidades + "]";
		}
		return res;	
	}
	
	//-----HashCode-----
	public int hashCode() {
		return Objects.hash(ciudad, empresa, facilSolicitud, empleados, fundacion, esPrivada, puntuacion);
	}

	//-----Equals-----
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		DataScienceJob other = (DataScienceJob) obj;
		return Objects.equals(ciudad, other.ciudad) && Objects.equals(empresa, other.empresa)
				&& Objects.equals(facilSolicitud, other.facilSolicitud) && Objects.equals(empleados, other.empleados)
				&& Objects.equals(fundacion, other.fundacion) && Objects.equals(esPrivada, other.esPrivada)
				&& Objects.equals(puntuacion, other.puntuacion);
	}

	//-----CompareTo-----
	public int compareTo(DataScienceJob j1) {
		int r = this.getEmpresa().compareTo(j1.getEmpresa());
		if (r==0) {
			r = this.getCiudad().compareTo(j1.getCiudad());
		}
		if (r==0) {
			r = this.getFundacion().compareTo(j1.getFundacion());
		}
		if (r==0) {
			r = this.getEmpleados().compareTo(j1.getEmpleados());
		}
		return r;
	}
	

	/*POR HACER
	 * */
	
	/*DUDAS
	 * Preguntar readme
	 * ¿Cómo hacer el test de la propiedad auxiliar?
	 * */
	

}
