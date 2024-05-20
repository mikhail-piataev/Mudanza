
public class Camion {
	private String matricula;
	private double maxPeso;
	private double longitud;
	private double ancho;
	private double altura; 
	private int maxCantidadCarga;
	
	public Camion(String matricula, double maxPeso, double longitud, double ancho, double altura,
			int maxCantidadCarga) {
		super();
		this.matricula = matricula;
		this.maxPeso = maxPeso;
		this.longitud = longitud;
		this.ancho = ancho;
		this.altura = altura;
		this.maxCantidadCarga = maxCantidadCarga;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	public double getMaxPeso() {
		return maxPeso;
	}
	public void setMaxPeso(double maxPeso) {
		this.maxPeso = maxPeso;
	}
	public double getLongitud() {
		return longitud;
	}
	public void setLongitud(double longitud) {
		this.longitud = longitud;
	}
	public double getAncho() {
		return ancho;
	}
	public void setAncho(double ancho) {
		this.ancho = ancho;
	}
	public double getAltura() {
		return altura;
	}
	public void setAltura(double altura) {
		this.altura = altura;
	}
	public int getMaxCantidadCarga() {
		return maxCantidadCarga;
	}
	public void setMaxCantidadCarga(int maxCantidadCarga) {
		this.maxCantidadCarga = maxCantidadCarga;
	}
	@Override
	public String toString() {
		return "Camion [matricula=" + matricula + ", maxPeso=" + maxPeso + ", maxCantidadCarga=" + maxCantidadCarga
				+ "]";
	}
	
}
