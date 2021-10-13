package tde3;

import java.util.ArrayList;

public class Cliente extends ContaCorrente{
    private String nome;
    private int numero;
    // ligação entre classes
    private ContaCorrente conta;

    public Cliente(String nome, int numero){
        this.nome = nome;
        this.numero  = numero;
        this.conta = new ContaCorrente(numero);
        this.conta.setCliente(this);
    }

    public Cliente() {
    }

    public void opera(){
        conta.depositaValor(1000);
        conta.retiraValor(500);
    }
    public void imprimir(){
        //opera();
        System.out.println("Cliente: " + nome);
        System.out.println("Numero da conta: " + numero);
        System.out.println("Saldo:" + conta.getSaldo());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public void setConta(ContaCorrente conta) {
        this.conta = conta;
    }


}
