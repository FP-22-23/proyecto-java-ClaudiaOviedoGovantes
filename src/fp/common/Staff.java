package fp.common;

public record Staff(Double hombres, Double mujeres) {
	public Boolean getParidad(Staff c) {
		Boolean res = c.mujeres >= 40;
		return res;
	}

}



