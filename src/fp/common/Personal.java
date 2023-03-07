package fp.common;

public record Personal(Double hombres, Double mujeres) {
	public Boolean getParidad(Personal c) {
		Boolean res = c.mujeres >= 40;
		return res;
	}

}



