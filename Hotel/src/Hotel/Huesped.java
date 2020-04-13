package Hotel;

public class Huesped {
    private String nombre;
    private String apellido;
    private Fecha Entrada = new Fecha();
    private Fecha Salida = new Fecha();
    private int edad;
    private int dni;
    private Habitacion habitacion;

    public String getNombre() {

        return nombre;
    }

    public String getApellido() {

        return apellido;
    }

    public int getEdad() {

        return edad;
    }

    public int getDni() {

        return dni;
    }

    public Fecha getEntrada() {
        return Entrada;
    }

    public Fecha getSalida() {
        return Salida;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {

        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDni(int dni) {

        this.dni = dni;
    }

    public void setEntrada(int dia, int mes, int anio) {
       this.Entrada.setDia(dia);
        this.Entrada.setMes(mes);
        this.Entrada.setAnio(anio);
    }

    public void setSalida(int dia, int mes, int anio) {
        this.Salida.setDia(dia);
        this.Salida.setMes(mes);
        this.Salida.setAnio(anio);
    }

    public void setHabitacion(Habitacion habitacion) {
        this.habitacion = habitacion;
    }

    public int cantDias(){

        Fecha fechaEntrada;
        fechaEntrada=this.Entrada;
        Fecha fechaSalida;
        fechaSalida=this.Salida;

        int cantDias=1;

        while(fechaEntrada.getDia() != fechaSalida.getDia() ||  fechaEntrada.getMes() != fechaSalida.getMes() || fechaEntrada.getAnio() != fechaSalida.getAnio()) {
            if (fechaEntrada.getMes() == 1 ||  fechaEntrada.getMes() == 3  || fechaEntrada.getMes() == 5 || fechaEntrada.getMes() == 7 || fechaEntrada.getMes() == 8 || fechaEntrada.getMes() == 10 ||  fechaEntrada.getMes() == 12) {
                if (fechaEntrada.getDia() == 31) {
                    if (fechaEntrada.getMes() == 12) {
                        fechaEntrada.setMes(1);
                        fechaEntrada.setDia(1);
                        fechaEntrada.setAnio(fechaEntrada.getAnio()+1);
                        cantDias=cantDias+1;
                    }
                    else {
                        fechaEntrada.setMes(fechaEntrada.getMes()+1);
                        fechaEntrada.setDia(1);
                        cantDias=cantDias+1;
                    }
                }
                else {
                    fechaEntrada.setDia(fechaEntrada.getDia()+1);
                    cantDias=cantDias+1;
                }
            }
            else if ((fechaEntrada.getMes() == 4 || fechaEntrada.getMes() == 6 || fechaEntrada.getMes() == 9 || fechaEntrada.getMes() == 11)) {
                if(fechaEntrada.getDia()==30){
                    fechaEntrada.setMes(fechaEntrada.getMes()+1);
                    fechaEntrada.setDia(1);
                    cantDias=cantDias+1;
                }
                else{
                    fechaEntrada.setDia(fechaEntrada.getDia()+1);
                    cantDias=cantDias+1;
                }
            }
            else{
                if(fechaEntrada.getDia()==28  &&  fechaEntrada.getAnio() % 4  !=  0 || fechaEntrada.getDia()==29  &&  fechaEntrada.getAnio() % 4  ==  0){
                    fechaEntrada.setDia(1);
                    fechaEntrada.setMes(fechaEntrada.getMes()+1);
                    cantDias=cantDias+1;
                }
            }
        }
        return cantDias;
    }


}
