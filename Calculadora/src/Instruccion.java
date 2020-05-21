public class Instruccion {
    private String operacion;
    private int valor;
    private String nombreVariable;

    // constructor para instrucciones que usan solo la variable operacion por ej add
    public Instruccion(String operacion){
        this.operacion = operacion;
    }
    // constructor para instrucciones que usan un valor ademas de la operacion por ejemplo push
    public Instruccion(String operacion, int valor){
        this.operacion = operacion;
        this.valor = valor;
    }
    // constructor para instrucciones que usan un nombre de variable ademas de la operacion ejemplo write
    public Instruccion(String operacion, String nombreVariable){
        this.operacion = operacion;
        this.nombreVariable = nombreVariable;
    }
    //getters
    public String getOperacion() {
        return operacion;
    }

    public int getValor() {
        return valor;
    }

    public String getNombreVariable() {
        return nombreVariable;
    }

    //setters
    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }

    public void setNombreVariable(String nombreVariable) {
        this.nombreVariable = nombreVariable;
    }

}
