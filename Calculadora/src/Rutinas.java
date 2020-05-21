import java.lang.reflect.Array;
import java.util.ArrayList;

public class Rutinas {
    private String nombre;
    private ArrayList<Instruccion> instrucciones;
    public Rutinas(String nombre, ArrayList<Instruccion> instrucciones){
        this.nombre = nombre;
        this.instrucciones = instrucciones;
    }

    public String getNombre() {
        return nombre;
    }
    public ArrayList<Instruccion> getInstrucciones() {
        return instrucciones;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setInstrucciones(ArrayList<Instruccion> instrucciones) {
        this.instrucciones = instrucciones;
    }
}
