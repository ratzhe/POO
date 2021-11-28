
package locadoraveiculos.model;

public class Moto extends Veiculo {
    
    private boolean temPartidaEletrica;

    public boolean isTemPartidaEletrica() {
        return temPartidaEletrica;
    }

    public void setTemPartidaEletrica(boolean temPartidaEletrica) {
        this.temPartidaEletrica = temPartidaEletrica;
    }  

    @Override
    public String toString() {
        return super.toString() + " Moto{" + "temPartidaEletrica=" + temPartidaEletrica + '}';
    }
    
    
    
}
