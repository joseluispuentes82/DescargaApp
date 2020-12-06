package descargas;

import java.awt.print.Book;

public class Libro extends Contenido {
	String genero;
	Book book;
	Autor autor;
	public String getGenero() {
		return genero;
	}
	public Book getBook() {
		return book;
	}
	public Autor getAutor() {
		return autor;
	}
	public Libro() {
		super();
	}
	public Libro(String id, String titulo) {
		super(id, titulo);
	}
	public Libro(String genero, Book book, Autor autor) {
		super();
		this.genero = genero;
		this.book = book;
		this.autor = autor;
	}
	@Override
	public String toString() {
		return "Libro [getGenero()=" + getGenero() + ", getBook()=" + getBook() + ", getAutor()=" + getAutor()
				+ ", getId()=" + getId() + ", getTitulo()=" + getTitulo() + "]";
	}
	
}
