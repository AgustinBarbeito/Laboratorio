package Hotel;

import java.util.ArrayList;

public class main {
    public static void main(String[] args) {
        Habitacion habitacion1 = new Habitacion();
        Habitacion habitacion2 = new Habitacion();
        Habitacion habitacion3 = new Habitacion();
        Habitacion habitacion4 = new Habitacion();
        Habitacion habitacion5 = new Habitacion();
        Habitacion habitacion6 = new Habitacion();
        Habitacion habitacion7 = new Habitacion();
        Habitacion habitacion8 = new Habitacion();
        Habitacion habitacion9 = new Habitacion();
        Habitacion habitacion10 = new Habitacion();
        Habitacion habitacion11 = new Habitacion();
        Habitacion habitacion12 = new Habitacion();
        Habitacion habitacion13 = new Habitacion();

        habitacion1.setNumero(1);
        habitacion1.setCapaciad(1);
        habitacion1.setPrecio(545);
        habitacion1.setEstado(false);

        habitacion2.setNumero(2);
        habitacion2.setCapaciad(1);
        habitacion2.setPrecio(545);
        habitacion2.setEstado(false);

        habitacion3.setNumero(3);
        habitacion3.setCapaciad(1);
        habitacion3.setPrecio(545);
        habitacion3.setEstado(false);

        habitacion4.setNumero(4);
        habitacion4.setCapaciad(1);
        habitacion4.setPrecio(545);
        habitacion4.setEstado(false);

        habitacion5.setNumero(5);
        habitacion5.setCapaciad(1);
        habitacion5.setPrecio(545);
        habitacion5.setEstado(false);

        habitacion6.setNumero(6);
        habitacion6.setCapaciad(1);
        habitacion6.setPrecio(545);
        habitacion6.setEstado(false);

        habitacion7.setNumero(7);
        habitacion7.setCapaciad(1);
        habitacion7.setPrecio(545);
        habitacion7.setEstado(false);

        habitacion8.setNumero(8);
        habitacion8.setCapaciad(1);
        habitacion8.setPrecio(545);
        habitacion8.setEstado(false);

        habitacion9.setNumero(9);
        habitacion9.setCapaciad(2);
        habitacion9.setPrecio(785);
        habitacion9.setEstado(false);

        habitacion10.setNumero(10);
        habitacion10.setCapaciad(2);
        habitacion10.setPrecio(785);
        habitacion10.setEstado(false);

        habitacion11.setNumero(11);
        habitacion11.setCapaciad(2);
        habitacion11.setPrecio(785);
        habitacion11.setEstado(false);

        habitacion12.setNumero(12);
        habitacion12.setCapaciad(2);
        habitacion12.setPrecio(785);
        habitacion12.setEstado(false);

        habitacion13.setNumero(13);
        habitacion13.setCapaciad(2);
        habitacion13.setPrecio(785);
        habitacion13.setEstado(false);

        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        habitaciones.add(habitacion1);
        habitaciones.add(habitacion2);
        habitaciones.add(habitacion3);
        habitaciones.add(habitacion4);
        habitaciones.add(habitacion5);
        habitaciones.add(habitacion6);
        habitaciones.add(habitacion7);
        habitaciones.add(habitacion8);
        habitaciones.add(habitacion9);
        habitaciones.add(habitacion10);
        habitaciones.add(habitacion11);
        habitaciones.add(habitacion12);
        habitaciones.add(habitacion13);



        ArrayList<Huesped> huespedes = new ArrayList<>();

        Huesped h1 = new Huesped();
        Huesped h2 = new Huesped();
        Huesped h3 = new Huesped();
        Huesped h4 = new Huesped();
        Huesped h5 = new Huesped();
        Huesped h6 = new Huesped();


        h1.setNombre("Gustavo");
        h1.setApellido("Rodriguez");
        h1.setEdad(80);
        h1.setDni(10233203);
        h1.setEntrada(3, 4, 2020);
        h1.setEntrada(13, 4, 2020);
        h1.setHabitacion(habitacion1);
        habitacion1.setEstado(true);

        h2.setNombre("Juan Carlos");
        h2.setApellido("Fernandez");
        h2.setEdad(56);
        h2.setDni(423791);
        h2.setEntrada(5, 5, 2020);
        h2.setEntrada(20, 5, 2020);
        h2.setHabitacion(habitacion3);
        habitacion3.setEstado(true);

        h3.setNombre("Facundo");
        h3.setApellido("Garcia");
        h3.setEdad(37);
        h3.setDni(987654);
        h3.setEntrada(15, 10, 2020);
        h3.setEntrada(30, 10, 2020);
        h3.setHabitacion(habitacion5);
        habitacion5.setEstado(true);

        h4.setNombre("Veronica");
        h4.setApellido("Rodriguez");
        h4.setEdad(40);
        h4.setDni(21398190);
        h4.setEntrada(25, 6, 2020);
        h4.setEntrada(5, 7, 2020);
        h4.setHabitacion(habitacion2);
        habitacion2.setEstado(true);

        h5.setNombre("Agustin");
        h5.setApellido("Barbeito");
        h5.setEdad(54);
        h5.setDni(885984);
        h5.setEntrada(20, 4, 2020);
        h5.setEntrada(15, 5, 2020);
        h5.setHabitacion(habitacion4);
        habitacion4.setEstado(true);

        h6.setNombre("Facundo");
        h6.setApellido("Garcia");
        h6.setEdad(37);
        h6.setDni(987654);
        h6.setEntrada(15, 12, 2020);
        h6.setEntrada(25, 12, 2020);
        h6.setHabitacion(habitacion10);
        habitacion10.setEstado(true);

        huespedes.add(h1);
        huespedes.add(h2);
        huespedes.add(h3);
        huespedes.add(h4);
        huespedes.add(h5);
        huespedes.add(h6);
    }

    public ArrayList<Huesped> masFrecuentes(ArrayList<Huesped> huespedes) {
        int i = 0;
        int x = 0;
        int y = 0;
        int cMasRepetido = 0;
        int cMasRepetidoR = 0;
        int masRepetido = 0;
        ArrayList<Huesped> huespedesClon = (ArrayList<Huesped>) huespedes.clone();
        ArrayList<Huesped> masFrecuentes = new ArrayList<>();
        while (y < 6) {
            while (x < huespedesClon.size()) {
                while (i < huespedesClon.size()) {
                    if (huespedesClon.get(x).getDni() == huespedesClon.get(i).getDni()) {
                        cMasRepetido = cMasRepetido + 1;
                    }
                    i = i + 1;
                }
                if (cMasRepetido > cMasRepetidoR) {
                    masRepetido = x;
                    cMasRepetidoR = cMasRepetido;
                }
                x = x + 1;
            }
            masFrecuentes.set(y, huespedesClon.get(masRepetido));
            huespedesClon.remove(masRepetido);
            y = y + 1;
        }
        return masFrecuentes;
    }

    public ArrayList<Huesped> habitacionMasFrecuentes(ArrayList<Huesped> huespedes) {
        int i = 0;
        int x = 0;
        int y = 0;
        int cMasRepetido = 0;
        int cMasRepetidoR = 0;
        int masRepetido = 0;
        ArrayList<Huesped> huespedesClon = (ArrayList<Huesped>) huespedes.clone();
        ArrayList<Huesped> masFrecuentes = new ArrayList<>();
        while (y < 3) {
            while (x < huespedesClon.size()) {
                while (i < huespedesClon.size()) {
                    if (huespedesClon.get(x).getHabitacion() == huespedesClon.get(i).getHabitacion()) {
                        cMasRepetido = cMasRepetido + 1;
                    }
                    i = i + 1;
                }
                if (cMasRepetido > cMasRepetidoR) {
                    masRepetido = x;
                    cMasRepetidoR = cMasRepetido;
                }
                x = x + 1;
            }
            masFrecuentes.set(y, huespedesClon.get(masRepetido));
            huespedesClon.remove(masRepetido);
            y = y + 1;
        }
        return masFrecuentes;
    }

    public double IngresoTotal(ArrayList<Huesped> huespedes){
        int i=0;
        double total=0;
        while(i<huespedes.size()){
            if(huespedes.get(i).cantDias()<30){
                total=total+(huespedes.get(i).getHabitacion().getPrecio() * huespedes.get(i).cantDias());
            }else{
                total=total+(huespedes.get(i).getHabitacion().getPrecio() * huespedes.get(i).cantDias()* (0.75));
            }
            i=i+1;
        }
        return total;
    }

    public int cantidadEstadiaProlongada(ArrayList<Huesped> huespedes){
        int i=0;
        int cant=0;
        while(i<huespedes.size()){
            if(huespedes.get(i).cantDias()>30){
                cant=cant+1;
            }
            i=i+1;
        }
        return cant;
    }

    public ArrayList<Habitacion> habitacionesOcupadas(ArrayList<Habitacion> habitaciones){
        int i=0;
        int x=0;
        ArrayList<Habitacion> habitacionOcupadas = new ArrayList<>();
        while(i<13){
            if(habitaciones.get(i).getEstado()){
                habitacionOcupadas.set(x, habitaciones.get(i));
                x=x+1;
            }
            i=i+1;
        }
        return habitacionOcupadas;
    }

    public ArrayList<Habitacion> habitacionesDisponibles(ArrayList<Habitacion> habitaciones){
        int i=0;
        int x=0;
        ArrayList<Habitacion> habitacionDisponibles = new ArrayList<>();
        while(i<13){
            if(!habitaciones.get(i).getEstado()){
                habitacionDisponibles.set(x, habitaciones.get(i));
                x=x+1;
            }
            i=i+1;
        }
        return habitacionDisponibles;
    }

    public Huesped huespedEnDeterminadaHabitacion(int nHabitacion, ArrayList<Huesped> huespedes){
        int i=huespedes.size();
        while(i>=0){
            if(huespedes.get(i).getHabitacion().getNumero() == nHabitacion){
                return huespedes.get(i);
            }
            i=i-1;
        }
        return null;
    }

    public void modificarFechaSalida(int dniHuesped, int nuevoDia, int nuevoMes, int nuevoAnio, ArrayList<Huesped> huespedes){
        int i=huespedes.size();
        while(i>=0){
            if(huespedes.get(i).getDni()==dniHuesped){
                huespedes.get(i).setSalida(nuevoDia, nuevoMes, nuevoAnio);
            }
            i=i-1;
        }

    }

    public double importeHuesped(int dniHuesped, ArrayList<Huesped> huespedes){
        int i=huespedes.size();
        double importe=0;
        while(i>=0){
            if(huespedes.get(i).getDni()==dniHuesped){
               if(huespedes.get(i).cantDias()<30){
                   importe=(huespedes.get(i).cantDias() * huespedes.get(i).getHabitacion().getPrecio());
               }else{
                   importe=(huespedes.get(i).getHabitacion().getPrecio() * huespedes.get(i).cantDias() * (0.75));
               }
            }
            i=i-1;
        }
        return importe;
    }




}



