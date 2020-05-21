import java.util.ArrayList;
import java.util.HashSet;
public class Calculadora {
    private Programa programa;
    private ArrayList<Integer> pilaDeValores = new ArrayList<>();
    private HashSet<DatoAlmacenado> memoria = new HashSet<>();

    //setters
    public void setPrograma(Programa programa){
        this.programa = programa;
    }
    public void ejecutarRutina(String nombreRutina){
        for(Rutinas rutinaActual:this.programa.getRutinas()){
            if(rutinaActual.getNombre() == nombreRutina){
                for (Instruccion instruccionActual: rutinaActual.getInstrucciones()) {
                    ejecutarInstruccion(instruccionActual);
                }
            }
        }
    }
    public void ejecutarInstruccion(Instruccion instruccion){
        switch (instruccion.getOperacion()){
            case "PUSH":
                pilaDeValores.add(instruccion.getValor());
            break;
            case "ADD":
                if(pilaDeValores.size() == 0)
                {
                    pilaDeValores.add(0);
                }
                else if(pilaDeValores.size()>= 2)
                {
                    pilaDeValores.set(0,pilaDeValores.get(0)+pilaDeValores.get(1));
                    pilaDeValores.remove(1);
                }
            break;
            case "SUB":
                if(pilaDeValores.size() == 0)
                {
                    pilaDeValores.add(0);
                }
                else if(pilaDeValores.size()>= 2)
                {
                    pilaDeValores.set(0,pilaDeValores.get(0)-pilaDeValores.get(1));
                    pilaDeValores.remove(1);
                }
            break;
            case "MUL":
                if(pilaDeValores.size() == 0 || pilaDeValores.size() == 1)
                {
                    pilaDeValores.add(0);
                }
                else if(pilaDeValores.size()>= 2)
                {
                    pilaDeValores.set(0,pilaDeValores.get(0)*pilaDeValores.get(1));
                    pilaDeValores.remove(1);
                }
            break;
            case "WRITE":
                if(pilaDeValores.size()>0) {
                    memoria.add(new DatoAlmacenado(instruccion.getNombreVariable(), pilaDeValores.get(0)));
                    pilaDeValores.remove(0);
                }
                else{
                    memoria.add(new DatoAlmacenado(instruccion.getNombreVariable(),0));
                }
            break;
            case "READ":
                for (DatoAlmacenado datoActual:memoria) {
                    if(instruccion.getNombreVariable() == datoActual.getNombre());
                    {
                        pilaDeValores.add(datoActual.getValor());
                    }
                }
            break;
            default:
                System.out.println("instruccion invalida");
            break;
        }
    }
    public void printPilaDeValores(){
        for ( int y: pilaDeValores) {
            System.out.println(y);
        }
    }
    public void printMemoria(){
        for (DatoAlmacenado datoActual: memoria) {
            System.out.println(datoActual.getValor()+", "+ datoActual.getNombre());
        }
    }
    public static void main(String[] args) {
        Calculadora c = new Calculadora();
        ArrayList<Instruccion> instrucciones = new ArrayList<>();
        instrucciones.add(new Instruccion("PUSH", 2));
        instrucciones.add(new Instruccion("PUSH", 4));
        instrucciones.add(new Instruccion("MUL"));
        instrucciones.add(new Instruccion("WRITE", "x"));
        Programa p = new Programa();
        ArrayList <Rutinas> r = new ArrayList<>();
        r.add(new Rutinas("A",instrucciones));
        p.setRutinas(r);
        c.setPrograma(p);
        c.ejecutarRutina("A");
        c.printMemoria();
        c.printPilaDeValores();
    }
}


