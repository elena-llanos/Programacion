package alumno;

public class Alumno {

	private String nombre = null;
	private String apellido1 = null;
	private String apellido2 = null;
	private String fechaDeNacimiento = null;
	private int curso = 0; 
	private int clase = 0;
	
	public String getNombre() {
		return nombre;
	} 
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido1() {
		return apellido1;
	}
	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}
	public String getApellido2() {
		return apellido2;
	}
	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}
	public String getFechaDeNacimiento() {
		return fechaDeNacimiento;
	}
	public void setFechaDeNacimiento(String fechaDeNacimiento) {
		this.fechaDeNacimiento = fechaDeNacimiento;
	}
	public int getCurso() {
		return curso;
	}
	public void setCurso(int curso) {
		this.curso = curso;
	}
	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", apellido1=" + apellido1 + ", apellido2=" + apellido2
				+ ", fechaDeNacimiento=" + fechaDeNacimiento + ", curso=" + curso + ", clase=" + clase + "]";
	}
	public int getClase() {
		return clase;
	}
	public void setClase(int clase) {
		this.clase = clase;
	} 
}
