package sef.module8.sample;

public class Gato {
	public String nome;
	public int idade;
	
	public Gato(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void emitirSom() {
		System.out.println("miau");
	}
}
