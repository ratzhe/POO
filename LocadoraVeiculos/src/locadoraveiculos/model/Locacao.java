
package locadoraveiculos.model;


public class Locacao {
    
    private Cliente cliente;
    private Veiculo veiculo;
    private String data;
    private int diasLocacao;
    private boolean seguro;
    private double desconto;


    public Locacao(Cliente cliente, Veiculo veiculo, String data, int diasLocacao, boolean seguro, double desconto) {
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.data = data;
        this.diasLocacao = diasLocacao;
        this.seguro = seguro;
        this.desconto = desconto;
    }    
    
    public Locacao(){
        
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Veiculo getVeiculo() {
        return veiculo;
    }

    public void setVeiculo(Veiculo veiculo) {
        this.veiculo = veiculo;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getDiasLocacao() {
        return diasLocacao;
    }

    public void setDiasLocacao(int diasLocacao) {
        this.diasLocacao = diasLocacao;
    }

    public boolean getSeguro() {
        return seguro;
    }

    public void setSeguro(boolean seguro) {
        this.seguro = seguro;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    
    
    
    
    
    
    
    
}
