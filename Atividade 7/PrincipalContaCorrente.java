package sef.module8.sample;

import java.text.SimpleDateFormat;
import java.util.Date;

public class PrincipalContaCorrente {

	public static void main(String[] args) {
		Date theDateToday = new Date();
		SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String dataHojeFormatada = formato.format(theDateToday);
        
		Cliente cliente1 = new Cliente("João", "123456789", "Ramos");
		ContaCorrente conta1 = new ContaCorrente("123", "Conta1", 5000, dataHojeFormatada, cliente1);
		
		System.out.println("Saldo da conta "+ conta1.getNome() + ": R$"+ conta1.ExibirSaldo());
		conta1.Depositar(1000);
		
		conta1.Sacar(500);
		
		Cliente cliente2 = new Cliente("Felipe", "987654321", "José");
		ContaCorrente conta2 = new ContaCorrente("987", "Conta2", 10000, dataHojeFormatada, cliente2);
		
		System.out.println("Saldo da conta "+ conta2.getNome() + ": R$"+ conta2.ExibirSaldo());
		conta1.Transferir(200, conta2);
		conta2.Transferir(1000, conta1);
		
		System.out.println("Nome do cliente da conta 1: "+ conta1.getCliente().getNome() +" "+ conta1.getCliente().getSobrenome());
	}

}
