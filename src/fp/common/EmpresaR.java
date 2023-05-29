package fp.common;


public record EmpresaR(String calle, String nif, Double hombres, Double mujeres) {
	
	public EmpresaR(String calle, String nif, Double hombres, Double mujeres) {
		this.calle = calle;
		this.nif = nif;
		this.hombres = hombres;
		this.mujeres = mujeres;;
	}
	
	public Boolean getParidad(EmpresaR e) {
		Boolean res = e.mujeres >= 40;
		return res;
	}

}


