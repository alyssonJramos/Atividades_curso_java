package sef.module8.sample;

public class Carro {
	private String marca;
	private String codigoCor;
	private double preco;
	private boolean ligado;
	private boolean movimento;
	
	public Carro(String marca, String codigoCor, double preco) {
		this.marca = marca;
		this.codigoCor = codigoCor;
		this.preco = preco;
		this.ligado = false;
		this.movimento = false;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getCodigoCor() {
		return codigoCor;
	}
	public void setCodigoCor(String codigoCor) {
		this.codigoCor = codigoCor;
	}
	public double getPreco() {
		return preco;
	}
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public void Exibir() {
		System.out.println("Marca = " + getMarca());
		System.out.println("Cor = " + getCodigoCor());
		System.out.println("Preço = " + getPreco());
	}
	
	public void Ligar() {
		this.ligado = true;
	}
	
	public void Movimentar() {
		if(this.ligado)
			this.movimento = true;
		else
			System.out.println("Ligue o carro!");
	}
	
	public void Buzinar() {
		if(this.movimento)
			System.out.println("Emitir Som");
		else
			System.out.println("Carro não está em movimento!");
	}
	
}
