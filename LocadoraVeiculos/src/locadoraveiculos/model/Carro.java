
package locadoraveiculos.model;


public class Carro extends Veiculo {
    
    private int numeroPassageiro;

    public int getNumeroPassageiro() {
        return numeroPassageiro;
    }

    public void setNumeroPassageiro(int numeroPassageiro) {
        this.numeroPassageiro = numeroPassageiro;
    }    

    @Override
    public String toString() {
        return super.toString() + " Carro{" + "numeroPassageiro=" + numeroPassageiro + '}';
    }
    
    
    
}
