package br.com.patterns.creational.prototype;

public class Aluno {

	private String nome;
	
	public Aluno(String nome) {
		this.nome = nome;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return new Aluno(nome);
	}
	
	public static void main(String[] args) {
		Aluno a = new Aluno("Cristiano");
		try {
			Aluno other = (Aluno) a.clone();
			System.out.println(a + " " + other);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
	}
	
}
