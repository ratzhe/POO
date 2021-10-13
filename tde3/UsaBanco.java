package tde3;

public class UsaBanco {

    public static void main(String[] args) {

        Banco b = new Banco("b");
        Cliente maria = new Cliente("Maria", 1234);
        Cliente jose = new Cliente("José", 5678);
        Cliente joao = new Cliente("João", 7890);
        b.addCliente(maria);
        b.addCliente(jose);
        b.addCliente(joao);

        // leitura de dados do teclado

        System.out.println("*** BANCO XXX&YYY - OPERAÇÕES");
        System.out.println("----------------------------");
        System.out.println("Cliente: " + maria.getNome() + " - Operações");
        maria.opera();

        System.out.println("----------------------------");
        System.out.println("Cliente: " + jose.getNome() + " - Operações");
        jose.opera();

        System.out.println("----------------------------");
        System.out.println("Cliente: " + joao.getNome() + " - Operações");
        joao.opera();

        System.out.println("*** BANCO XXX&YYY - CLIENTES");
        System.out.println("----------------------------");
        maria.imprimir();

        System.out.println("----------------------------");
        jose.imprimir();

        System.out.println("----------------------------");
        joao.imprimir();
    }
}
