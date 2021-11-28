
package locadoraveiculos.model;


public class Veiculo {
    private double valorLocacao;
    private String descricao;
    private String placa;

    public double getValorLocacao() {
        return valorLocacao;
    }

    public void setValorLocacao(double valorLocacao) {
        this.valorLocacao = valorLocacao;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public Veiculo(double valorLocacao, String descricao, String placa) {
        this.valorLocacao = valorLocacao;
        this.descricao = descricao;
        this.placa = placa;
    }
    
    public Veiculo(){
        
    }

    @Override
    public String toString() {
        return "Veiculo{" + "valorLocacao=" + valorLocacao + ", descricao=" + descricao + ", placa=" + placa + '}';
    }
    
    
    
    
    
    
    
    
}
