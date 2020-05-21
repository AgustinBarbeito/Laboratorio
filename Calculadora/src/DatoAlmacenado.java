public class DatoAlmacenado {
    private String nombre;
    private int valor;

    public DatoAlmacenado(String nombre, int valor){
        this.nombre = nombre;
        this.valor = valor;
    }

    //getters
    public int getValor() {
        return valor;
    }

    public String getNombre() {
        return nombre;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}
