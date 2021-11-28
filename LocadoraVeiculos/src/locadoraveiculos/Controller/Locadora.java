package locadoraveiculos.Controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import javax.swing.JOptionPane;
import locadoraveiculos.model.Carro;
import locadoraveiculos.model.Cliente;
import locadoraveiculos.model.Locacao;
import locadoraveiculos.model.Veiculo;

public class Locadora {

    private List<Cliente> clientes = new ArrayList<>();
    private List<Locacao> locacoes = new ArrayList<>();
    private List<Veiculo> veiculos = new ArrayList<>();

    public List<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(List<Cliente> clientes) {
        this.clientes = clientes;
    }

    public List<Locacao> getLocacoes() {
        return locacoes;
    }

    public void setLocacoes(List<Locacao> locacoes) {
        this.locacoes = locacoes;
    }

    public List<Veiculo> getVeiculos() {
        return veiculos;
    }

    public void setVeiculos(List<Veiculo> veiculos) {
        this.veiculos = veiculos;
    }

    public void addCliente(Cliente c) {
        clientes.add(c);
    }

    public void addLocacao(Locacao l) {
        locacoes.add(l);
    }

    public void addVeiculo(Veiculo v) {
        veiculos.add(v);
    }

    public void listarVeiculos() {
        for (Veiculo item : veiculos) {
            System.out.println(item.toString());
        }
    }

    public void listarClientes() {
        for (Cliente item : clientes) {
            System.out.println(item.toString());
        }
    }

    public void listarVeiculosDisponiveis() {
        for (Veiculo item : veiculos) {
            if (!locacoes.contains(item)) {
                System.out.println(item.toString());
            }
        }
    }

    public void listarLocacoes() {
        for (Locacao item : locacoes) {

                System.out.println(item.toString());

        }
    }

    public Cliente buscaCliente(String nome) {
        for (Cliente item : clientes) {

            if (item.getNome().equals(nome)) {
                return item;
            }
        }

        return null;
    }

    public Veiculo buscaVeiculo(String placa) {
        for (Veiculo item : veiculos) {

            if (item.getPlaca().equals(placa)) {
                return item;
            }
        }

        return null;
    }

    public void alocar() {

        Scanner leitor = new Scanner(System.in);

        System.out.println("Lista de clientes cadastrados");
        this.listarClientes();
        Cliente cli = new Cliente();
        System.out.println("Digite o nome do cliente");
        cli.setNome(leitor.next());

        Cliente ClienteLocacao = buscaCliente(cli.getNome());

        if (ClienteLocacao == null) {
            JOptionPane.showMessageDialog(null, cli.getNome() + " não está cadastrado - tente cadastrar a pessoa", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        System.out.println("Lista de veiculos cadastrados");
        this.listarVeiculos();
        Veiculo vei = new Veiculo();
        System.out.println("Digite a placa do veiculo");
        vei.setPlaca(leitor.next());

        Veiculo veiculoLocacao = buscaVeiculo(vei.getPlaca());

        if (veiculoLocacao == null) {
            JOptionPane.showMessageDialog(null, vei.getPlaca() + " não está cadastrado - tente cadastrar o veiculo", "ERRO", JOptionPane.ERROR_MESSAGE);
            return;
        }

        Locacao loca = new Locacao();
        int seguro;
        System.out.println("Digite 1 se tem seguro ou qualquer outro valor caso não");
        seguro = leitor.nextInt();
        if (seguro == 1) {
            loca.setSeguro(true);
        } else {
            loca.setSeguro(false);
        }

        System.out.println("Digite a data da locacao: dd/MM/AAAA ");
        loca.setData(leitor.next());
        System.out.println("Digite o numero de dias da locacao: ");
        loca.setDiasLocacao(leitor.nextInt());
        System.out.println("Digite o desconto dado: ");
        loca.setDesconto(leitor.nextDouble());
        
        loca.setCliente(ClienteLocacao);
        loca.setVeiculo(veiculoLocacao);
        
        this.addLocacao(loca);

        double valorLocacao = 0;

        valorLocacao += (veiculoLocacao.getValorLocacao() * loca.getDiasLocacao()) - loca.getDesconto();
        
        System.out.println("Locação cadastrada com sucesso - Com Valor de locação = "+valorLocacao);
        
        if(loca.getSeguro()){
            double valorSeguro = 0;
            
            if (veiculoLocacao instanceof Carro) {
                
                valorSeguro = (0.05 * veiculoLocacao.getValorLocacao()) * (1 + ((Carro) veiculoLocacao).getNumeroPassageiro()/20);

        } else {
                valorSeguro = 0.09 * veiculoLocacao.getValorLocacao();
        }      
            
            System.out.println("Valor seguro = "+valorSeguro);
        }
        
    }

}
