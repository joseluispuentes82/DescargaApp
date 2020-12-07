package descargas;

public class Libro extends Contenido {
	String genero;
//	Book book;
	Autor autor;
	public String getGenero() {
		return genero;
	}
//	public Book getBook() {
//		return book;
//	}
	public Autor getAutor() {
		return autor;
	}
	public Libro() {
		super();
	}
	public Libro(String id, String titulo) {
		super(id, titulo);
	}
//	public Libro(String genero, Book book, Autor autor) {
//		this(null, null, genero, book, autor);
//
//	}
//	public Libro(String id, String titulo, String genero, Book book, Autor autor) {
//		super(id, titulo);
//		this.genero = genero;
//		this.book = book;
//		this.autor = autor;
//	}
	public Libro(String genero, Autor autor) {
		this(null, null, genero, autor);

	}
	public Libro(String id, String titulo, String genero, Autor autor) {
		super(id, titulo);
		this.genero = genero;
		this.autor = autor;
	}
	@Override
	public String toString() {
		return super.toString();
	}
	
}
