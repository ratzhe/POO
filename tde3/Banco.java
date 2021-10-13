package tde3;

import java.util.ArrayList;
import java.util.Scanner;

public class Banco extends Cliente {
    private String nome;
    private ArrayList <Cliente> clientes;

    Scanner usuario = new Scanner(System.in);

    public Banco(String nome){
        super();
        this.nome = nome;
        clientes = new ArrayList<Cliente>();
    }

    public void addCliente(String nome, int conta){

    }

    void addCliente(Cliente ana) {
    }

    // interador
    public void imprimirClientes(){
        for (Cliente c : clientes){
            c.imprimir();
        }
    }

}
