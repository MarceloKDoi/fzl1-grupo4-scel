package entities;

import javax.swing.JOptionPane;

public class Livro {

	private String isbn;
	private String titulo;
	private String autor;

	public Livro() {
	}

	public Livro(String isbn, String titulo, String autor) {

		super();
		this.isbn = isbn;
		this.titulo = titulo;
		this.autor = autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		
		String x = this.isbn;
		if (x.length() <= 0 || x.length() > 5) {
			
			this.isbn = isbn;
		}
		else{
			JOptionPane.showMessageDialog(null,"O isbn deve conter 4 caracteres");	
		}
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

	public void isbnCkeck() {
		String x = this.isbn;
		if (x.length() <= 0 || x.length() > 5) {

		}
	}

}
