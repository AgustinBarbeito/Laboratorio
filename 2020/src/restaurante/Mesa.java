package restaurante;

public class Mesa {

    private int numero;
    private boolean ocupada;
    private boolean disponible;
    private int tamanioEnPersonas;
    private String lugar;
    private int vecesOcupada;

    Mesa(){
        this.numero=100;
        this.disponible=false;
        this.lugar="";
        this.ocupada=true;
        this.tamanioEnPersonas=0;
        this.vecesOcupada=0;
    }

    Mesa(int n, boolean ocup, boolean disp, int tamanio, String lug){
        this.numero=n;
        this.disponible=disp;
        this.lugar=lug;
        this.ocupada=ocup;
        this.tamanioEnPersonas=tamanio;
        this.vecesOcupada=0;
    }

    public int getNumero() {
        return numero;
    }

    public int getTamanioEnPersonas() {
        return tamanioEnPersonas;
    }

    public String getLugar() {
        return lugar;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setOcupada(boolean ocupada) {
        this.ocupada = ocupada;
    }

    public void setTamanioEnPersonas(int tamanioEnPersonas) {
        this.tamanioEnPersonas = tamanioEnPersonas;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public int getVecesOcupada() {
        return vecesOcupada;
    }

    public void setVecesOcupada(int vecesOcupada) {
        this.vecesOcupada = vecesOcupada;
    }

}
