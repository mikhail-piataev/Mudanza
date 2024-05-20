
public class Carga {
	private String nombre;
	private double peso;
	private double maxTamano;
	private boolean empacado;
	public Carga(String nombre, double peso, double maxTamano, boolean empacado) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.maxTamano = maxTamano;
		this.empacado = empacado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public double getMaxTamano() {
		return maxTamano;
	}
	public void setMaxTamano(double maxTamano) {
		this.maxTamano = maxTamano;
	}
	public boolean isEmpacado() {
		return empacado;
	}
	public void setEmpacado(boolean empacado) {
		this.empacado = empacado;
	}
	
}
