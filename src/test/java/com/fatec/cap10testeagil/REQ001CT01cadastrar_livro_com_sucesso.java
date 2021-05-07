package com.fatec.cap10testeagil;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class REQ001CT01cadastrar_livro_com_sucesso {

	@Test
	void ct01_quando_dados_validos_cadastra_com_sucesso() {
		Biblioteca biblioteca = new Biblioteca();
		Livro umLivro = new Livro("1111", "Engenharia de Software", "Pressman");
		biblioteca.add(umLivro);
		assertEquals (1, biblioteca.size());
		}
}
