package sef.module8.sample;

public class Dog {
	public String nome;
	public int idade;
	
	public Dog(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void emitirSom() {
		System.out.println("auau");
	}
}
