package fp.jobs;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Objects;

public class Jobs {
		
		private List<Job> empleos;
		
		//Constructor 1: construye una colección vacía
		public Jobs() {
			this.empleos = new ArrayList<Job>();
		}
		//Constructor 2: construye una colección con todos los elementos
		public Jobs(Collection<Job> Jobs) {
			this.empleos = new ArrayList<Job>(Jobs);
		}

		//a --> Obtener el número de elementos
		public Integer getNumeroEmpleos() {
			return empleos.size();
		}
				
		//b -->	Añadir un elemento
		public void anadirEmpleo(Job j) {
			this.empleos.add(j);
		}
		
		//c --> Añadir una colección de elementos
		public void añadirColeccion(Collection c) {
			this.empleos.addAll(c);
		}
		
		//d --> Eliminar un elemento
		public void eliminarEmpleo(Job j) {
			Integer indice = empleos.indexOf(j);
			this.empleos.remove(indice);
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
			return "Jobs [empleos=" + empleos + "]";
		}
		
		
		

		
	
		

	}


