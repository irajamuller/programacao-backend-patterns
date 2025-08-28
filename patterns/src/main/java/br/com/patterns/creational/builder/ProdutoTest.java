package br.com.patterns.creational.builder;

import java.math.BigDecimal;
import java.util.UUID;

public class ProdutoTest {
	public static void main(String[] args) {
		Produto p = Produto.builder("nome")
						.id(UUID.randomUUID())
						.qtde(5)
						.vlrUnitario(BigDecimal.valueOf(5.5))
						.build();
		System.out.println(p);
	}
}
