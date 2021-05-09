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
		if (!isbnSearch(livro.getIsbn())) {
			livros.add(livro);
		} else {
			JOptionPane.showMessageDialog(null, "ISNB existente");
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
