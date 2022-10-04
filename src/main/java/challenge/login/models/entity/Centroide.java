package challenge.login.models.entity;

public class Centroide {

	private Double lat;
	private Double lon;

	public Centroide() {
	}

	public Centroide(Double lat, Double lon) {
		super();
		this.lat = lat;
		this.lon = lon;
	}

	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

}
