package locadoraveiculos.View;

import javax.swing.JOptionPane;
import java.util.Scanner;
import locadoraveiculos.Controller.Locadora;
import locadoraveiculos.model.Carro;
import locadoraveiculos.model.Cliente;
import locadoraveiculos.model.Moto;

public class Main {

    public static void main(String[] args) {
        
        Locadora l = new Locadora();

        Scanner leitor = new Scanner(System.in);
        int op;
        String firstOp;

        while (true) {

            firstOp = JOptionPane.showInputDialog("Selecione uma opção: \n\n"
                    + "1 -- Cadastrar veiculo\n"
                    + "2 -- Cadastro de clientes\n"
                    + "3 -- Locação de veículos\n"
                    + "4 -- Listagem de veículos cadastrados\n"
                    + "5 -- Listagem de clientes\n"
                    + "6 -- Listagem de locações\n"
                    + "7 -- Listagem de veículos disponíveis\n"
                    + "8 -- Sair\n");
            op = Integer.parseInt(firstOp);

            switch (op) {
                case 1:
                    int opcao;
                    System.out.println("Digite 1 para moto ou 2 para carro");
                    opcao = leitor.nextInt();
                    switch (opcao) {
                        case 1:
                            Moto m = new Moto();
                            int partida = 0;

                            System.out.println("Digite a descrição da moto");
                            m.setDescricao(leitor.next());
                            System.out.println("Digite a placa da moto");
                            m.setPlaca(leitor.next());
                            System.out.println("Digite o valor da alocação");
                            m.setValorLocacao(leitor.nextDouble());
                            System.out.println("Digite 1 se tem partida ou qualquer outro valor caso não");
                            partida = leitor.nextInt();
                            if(partida == 1){
                                m.setTemPartidaEletrica(true);
                            }else{
                                m.setTemPartidaEletrica(false);
                            }
                            l.addVeiculo(m);
                            break;
                        case 2:
                            Carro c = new Carro();
                            
                            System.out.println("Digite a descrição do carro");
                            c.setDescricao(leitor.next());
                            System.out.println("Digite a placa do carro");
                            c.setPlaca(leitor.next());
                            System.out.println("Digite o valor da alocação");
                            c.setValorLocacao(leitor.nextDouble());
                            System.out.println("Digite a quantidade de passageiros");
                            c.setNumeroPassageiro(leitor.nextInt());                       
                           
                            l.addVeiculo(c);
                            break;
                        default:
                        JOptionPane.showMessageDialog(null, opcao + " é uma opção invalida", "ERRO", JOptionPane.ERROR_MESSAGE);
                        break;                                 
                                                     
                    }

                    break;
                case 2:
                    Cliente c = new Cliente();
                    
                    System.out.println("Digite o nome do cliente: ");
                    c.setNome(leitor.next());
                    
                    l.addCliente(c);
                    
                    
                    break;
                case 3:                    
                    l.alocar();
                    break;
                case 4:
                    l.listarVeiculos();
                    break;
                case 5:
                    l.listarClientes();
                    break;
                case 6:
                    l.listarLocacoes();
                    break;
                case 7:
                    l.listarVeiculosDisponiveis();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, op + " é uma opção invalida", "ERRO", JOptionPane.ERROR_MESSAGE);
                    break;

            }

        }

    }

}
