package com.fatec.cap10testeagil;

import java.util.List;

import javax.swing.JOptionPane;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import entities.Biblioteca;
import entities.Livro;

class REQ001 {

	@Test
	void ct01_quando_dados_validos_cadastra_com_sucesso() {
		Biblioteca biblioteca = new Biblioteca();
		Livro umLivro = new Livro("1111", "Engenharia de Software", "Pressman");
		biblioteca.save(umLivro);
		List<Livro> lista = biblioteca.getLivros();
		assertEquals("Engenharia de Software", lista.get(0).getTitulo());
	}

	
	@Test
	void ct02_cadastra_isbn_existente_e_retorna_invalido() {
		
		Biblioteca biblioteca = new Biblioteca();
		Livro umLivro = new Livro("1111", "Engenharia de Software", "Pressman");
		biblioteca.save(umLivro);
		
		Livro novoLivro = new Livro("1111", "Engenharia", "Pressman");
		biblioteca.save(novoLivro);
		biblioteca.listarLivros();
		
		
	}

}
