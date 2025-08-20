
import java.lang.classfile.instruction.ThrowInstruction;

public class ContaBancaria {
    
    private String numeroConta;
    private String titular;
    private double saldo;

    public ContaBancaria(String titular, String numeroconta){
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0.0;

    }

    public void deposito(double valor){
        if (valor > 0) {
            saldo += valor;
            System.out.println("Depósito de R$" + valor + " realizado.");
        } else {
            System.out.println("Valor inválido.");
        }

    }

    public void sacar(double valor){
         if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de R$" + valor + " realizado.");
        } else {
            System.out.println("Saque não realizado. Seu pobre!");
        }
    }

    public void Saldovalor(){
        System.out.println("Saldo atual: "+ numeroConta + " (Titular: " + titular + "): R$" + saldo);
    }


}
