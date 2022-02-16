package modelo;

public class Libro extends Publicacion {
	
	private String titulo;
	private String autor;
	private String editorial;
	
	public Libro() {
		super();
	}
	public Libro(String titulo, String autor, String editorial, double precio, int unidades) {
		super(precio, unidades);
		this.titulo = titulo;
		this.autor = autor;
		this.editorial = editorial;
	}
	
	
	
	@Override
	public String toString() {
		
		return "Libro : \n "
				+ "Título : " + titulo + "\n " 
				+  "Autor : " + autor + "\n "
				+ "Editorial: " + editorial + "\n " 
				+ " " + super.toString();
	}
	
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	
	
	
	

}
