package br.com.patterns.creational.builder;

import java.math.BigDecimal;
import java.util.UUID;

public class Produto {
	private UUID id;
	private String nome;
	private Integer qtde;
	private BigDecimal vlrUnitario;

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", qtde=" + qtde + ", vlrUnitario=" + vlrUnitario + "]";
	}
	
	public Produto(Builder builder) {
		this.id = builder.id;
		this.nome = builder.nome;
		this.qtde = builder.qtde;
		this.vlrUnitario = builder.vlrUnitario;
	}
	
	public static Builder builder(String nome) {
		return new Builder(nome);
	}
	
	public static class Builder {
		private UUID id;
		private String nome;
		private Integer qtde;
		private BigDecimal vlrUnitario;
		
		public Builder(String nome) {
			this.nome = nome;
		}
		
		public Builder id(UUID id) {
			this.id = id;
			return this;
		}
		
		public Builder nome(String nome) {
			this.nome = nome;
			return this;
		}
		
		public Builder qtde(Integer qtde) {
			this.qtde = qtde;
			return this;
		}
		
		public Builder vlrUnitario(BigDecimal vlrUnitario) {
			this.vlrUnitario = vlrUnitario;
			return this;
		}
		
		public Produto build() {
			return new Produto(this);
		}
	}
}

