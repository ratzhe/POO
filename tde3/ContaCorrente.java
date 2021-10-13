package tde3;

import java.util.Scanner;

public class ContaCorrente{
    private int numero;
    private double saldo;
    // ligação entre Classes
    private Cliente cliente;

    Scanner usuario = new Scanner(System.in);

    public ContaCorrente(int numero) {
        super();
        this.numero = numero;
        saldo = 0;
    }

    public ContaCorrente() {

    }

    public void setCliente(Cliente cliente) {

    }

    public void depositaValor(double deposito) {
        System.out.println("Entre um valor de depósito: ");
        deposito = usuario.nextDouble();
        verificaSaldo();
        saldo += deposito;
        //System.out.println("Saldo: "+ saldo);
        verificaSaldo();
    }

    public void retiraValor(double saque) {
        System.out.println("Entre um valor de saque: ");
        saque = usuario.nextDouble();
        verificaSaldo();
        saldo -= saque;
        //System.out.println("Saldo: " + saldo);
        verificaSaldo();
    }

    public double verificaSaldo() {
        // utilização do assert
        assert (saldo >= 0);
        return saldo;
    }


    public void imprimirConta(){
            System.out.println("Cliente: " + cliente.getNome());
            System.out.println("Numero da conta: " + numero);
            System.out.println("Saldo:" + cliente.getSaldo());

    }
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}