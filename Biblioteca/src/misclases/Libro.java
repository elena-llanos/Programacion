package misclases;

public class Libro {
	
	private String isbn;
	private String autor;
	private String titulo;
	
	public Libro() {
		
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(": Isbn = ");
		builder.append(isbn);
		builder.append(", Autor = ");
		builder.append(autor);
		builder.append(", Titulo = ");
		builder.append(titulo);
		builder.append(" \r");
		
		
		return builder.toString();
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Libro(String isbn, String autor, String titulo) {
		
		this.isbn = isbn;
		this.autor = autor;
		this.titulo = titulo;
	}
	
}	
