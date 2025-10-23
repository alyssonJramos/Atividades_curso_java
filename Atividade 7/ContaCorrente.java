package sef.module8.sample;


public class ContaCorrente {
	
	private String numero;
	private String nome;
	private double saldo;
	private String data;
	private Cliente cliente;
	
	public ContaCorrente(String numero, String nome, double saldo, String data, Cliente cliente) {
		this.numero = numero;
		this.nome = nome;
		this.saldo = saldo;
		this.data = data;
		this.cliente = cliente;
	}

	public void Depositar(double value) {
		this.saldo = this.saldo + value;
		System.out.println("Valor de R$" + value + " depositado com sucesso na conta de número " + this.numero + "!");
	}
	
	public void Sacar(double value) {
		if((this.saldo - value) < 0 )
			System.out.println("Saldo insuficiente para realizar o saque.");
		else{
			this.saldo = this.saldo - value;
			System.out.println("Saque de R$" + value + " realizado com sucesso!");
		}
	}
	
	public double ExibirSaldo() {
		return getSaldo();
	}
	
	public void Transferir(double value, ContaCorrente conta) {
		if((this.saldo - value) < 0 )
			System.out.println("Saldo insuficiente para realizar a transferência.");
		else{
			this.saldo = this.saldo - value;
			conta.setSaldo(conta.getSaldo() + value);
			System.out.println();
			System.out.println("************");
			System.out.println("Transferência realizada com sucesso!");
			System.out.println("Saldo restante na conta "+ this.nome + ": R$" + this.saldo);
			System.out.println("************");
			System.out.println();
		}
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}
	
	public Cliente getCliente() {
		return cliente;
	}

	public void setData(Cliente cliente) {
		this.cliente = cliente;
	}
	
	
}
