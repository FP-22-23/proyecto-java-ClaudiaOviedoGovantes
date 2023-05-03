package fp.jobs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import fp.common.Sector;

public class Jobs {
		
		private List<Job> empleos;
		
//----------------------------------- 2ª ENTREGA -----------------------------------
		//Constructor 1: construye una colección vacía
		public Jobs() {
			this.empleos = new ArrayList<Job>();
		}
		//Constructor 2: construye una colección con todos los elementos
		public Jobs(Collection<Job> Jobs) {
			this.empleos = new ArrayList<Job>(Jobs);
		}

		//Getters and setters
		public List<Job> getEmpleos() {
			return empleos;
		}
		public void setEmpleos(List<Job> empleos) {
			this.empleos = empleos;
		}
	
		
		//HashCode
		public int hashCode() {
			return Objects.hash(empleos);
		}
		
		//Equals
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Jobs other = (Jobs) obj;
			return Objects.equals(empleos, other.empleos);
		}
		
		//toString
		public String toString() {
			return "Jobs [empleos=" + empleos + "numEmpleos= "+ empleos.size() + "]";
		}
		
		//a --> Obtener el número de elementos
		public Integer getNumeroEmpleos() {
			return empleos.size();
		}
				
		//b -->	Añadir un elemento
		public void anadirEmpleo(Job j) {
				empleos.add(j);	
		}
		
		//c --> Añadir una colección de elementos
		public void añadirColeccion(Collection<Job> c) {
			empleos.addAll(c);
		}
		
		//d --> Eliminar un elemento
		public void eliminarEmpleo(Job j) {;
			empleos.remove(j);
		}
		

		//Tratamientos secuenciales 
		// 1 -> ¿Existe algun empleo situado en una ciudad pasada por parámetro?
		public Boolean existeEmpleoEnCiudad(String ciudad) {
			Boolean res = false;
			for(Job j: empleos) {
				if (j.getCiudad().equals(ciudad)){
					res = true;
					break;
				}
			}
			return res;
		}
		
		// 2 -> Media de puntación de la empresa pasada por parámetro
		public Double getMediaPuntuacionEmpresa(String empresa) {
			Double total = 0.0;
			Integer contador = 0;
			for (Job j: empleos) {
				if (j.getEmpresa().equals(empresa)) {
					total += j.getPuntuacion();
					contador ++;
				}}
			if (contador != 0 ) {
				Double res = total/contador;
				return res;
			}
			else { 
				return null;
			}
			
		}
		
		// 3 -> Selección de empresas con más de 500 empleados 
		public HashSet<String> getGrandesEmpresas(){
			HashSet<String> res = new HashSet<String>();
			for (Job j : empleos) {
				if(j.getEmpleados() >500) {
					res.add(j.getEmpresa());
					}
				}
			return res;
		}
		
		// 4 -> Agrupa empleos por compañías
		public Map<String, Set<Job>> getEmpleosPorCompañias(){
			Map<String, Set<Job>> dicc = new HashMap<String, Set<Job>>();
			for (Job j: empleos) {
				String key = j.getEmpresa();
				
				if(dicc.containsKey(key)){
					Set<Job> value = dicc.get(key);
					value.add(j);
					dicc.put(key, value);
				}
				else {
					Set<Job> value = new HashSet<Job>();
					value.add(j);
					dicc.put(key, value);		
				}
			}
			return dicc;
			
		}
		
		// 5 -> Diccionario contador: empleos por sectores
		public Map<Sector, Integer> getNumeroEmpleosPorSector(){
			Map<Sector, Integer> res = new HashMap<Sector, Integer>();
			for (Job j :empleos) {
				Sector key = j.getSector();
				
				if(res.containsKey(key)) {
					Integer value = res.get(key);
					value ++;
					res.put(key, value);
					
				}
				else {
					Integer value = 1;
					res.put(key, value);
				}
			}
			return res;
		}
		
//----------------------------------- 3ª ENTREGA -----------------------------------
		//Constructor 3: crea un objeto del tipo contenedor con todos los elementos del stream.
		public Jobs(Stream<Job> empleos) {
			this.empleos = empleos.collect(Collectors.toList());
		}
		
	
		
		
		
		
		
	}


