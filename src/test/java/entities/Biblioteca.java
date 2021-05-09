package entities;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Biblioteca {

	private List<Livro> livros = new ArrayList<Livro>();

	public List<Livro> getLivros() {
		return livros;
	}

	public void setLivros(List<Livro> livros) {
		this.livros = livros;
	}

	public void save(Livro livro) {
		if (!livro.getIsbn().equals("")) {

			if (!livro.getTitulo().equals("")) {

				if (!livro.getAutor().equals("")) {

					if (!isbnSearch(livro.getIsbn())) {
						livros.add(livro);
					}

					else {
						JOptionPane.showMessageDialog(null, "ISNB existente");
					}
				} else {
					JOptionPane.showMessageDialog(null, "Preencha o campo com nome de autor valido");
				}
			} else {
				JOptionPane.showMessageDialog(null, "Preencha o campo com nome de titulo valido");
			}
		} else {
			JOptionPane.showMessageDialog(null, "Preencha o campo ISBN com 4 caracteres");

		}

	}

	public boolean isbnSearch(String isbn) {

		List<Livro> lista = getLivros();
		for (Livro item : lista) {
			if (item.getIsbn() == isbn) {
				return true;
			}
		}
		return false;

	}

	public void listarLivros() {

		List<Livro> lista = getLivros();
		for (Livro item : lista) {

			JOptionPane.showMessageDialog(null, item.getTitulo());
		}

	}

	public int size() {
		return livros.size();

	}

}
