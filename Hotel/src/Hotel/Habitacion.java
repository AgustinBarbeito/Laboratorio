package Hotel;

public class Habitacion {
    private int numero;
    private int capaciad;
    private int precio;
    private boolean estado;


    public int getNumero() {
        return numero;
    }

    public int getPrecio() {
        return precio;
    }

    public int getCapaciad() {
        return capaciad;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setCapaciad(int capaciad) {
        this.capaciad = capaciad;
    }

}
