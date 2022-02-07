package modelo;

public class Vehiculo {
	
	private Motor potencia;
	private String marca;
	private String modelo;
	private String matricula;
	private double ultimoArreglo;
	private boolean cobrado;
	private double importeAveriasAcumulado;
	
	
	
	public Vehiculo() {
		
	}



	public Vehiculo(Motor potencia, String marca, String modelo, 
			String matricula, double ultimoArreglo,
			boolean cobrado, double importeAveriasAcumulado) {
		
		this.potencia = potencia;
		this.marca = marca;
		this.modelo = modelo;
		this.matricula = matricula;
		this.ultimoArreglo = ultimoArreglo;
		this.cobrado = cobrado;
		this.importeAveriasAcumulado = importeAveriasAcumulado;
	}



	public Motor getPotencia() {
		return potencia;
	}



	public void setPotencia(Motor potencia) {
		this.potencia = potencia;
	}



	public String getMarca() {
		return marca;
	}



	public void setMarca(String marca) {
		this.marca = marca;
	}



	public String getModelo() {
		return modelo;
	}



	public void setModelo(String modelo) {
		this.modelo = modelo;
	}



	public String getMatricula() {
		return matricula;
	}



	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}



	public double getUltimoArreglo() {
		return ultimoArreglo;
	}



	public void setUltimoArreglo(double ultimoArreglo) {
		this.ultimoArreglo = ultimoArreglo;
	}



	public boolean isCobrado() {
		return cobrado;
	}



	public void setCobrado(boolean cobrado) {
		this.cobrado = cobrado;
	}



	public double getImporteAveriasAcumulado() {
		return importeAveriasAcumulado;
	}



	public void setImporteAveriasAcumulado(double importeAveriasAcumulado) {
		this.importeAveriasAcumulado = importeAveriasAcumulado;
	}



	@Override
	public String toString() {
		return "Vehiculo [potencia=" + potencia + ", marca=" + marca + ", modelo=" + modelo + ", matricula=" + matricula
				+ ", ultimoArreglo=" + ultimoArreglo + ", cobrado=" + cobrado + ", importeAveriasAcumulado="
				+ importeAveriasAcumulado + "]";
	}
	
	
	
	
	
	
	
	
	
	
	

}
