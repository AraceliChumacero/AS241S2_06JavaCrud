package pe.edu.vallegrande;

public class Main {
    public static void main(String[] args) {
        System.out.println("cadenas de texto con String");
        TesString.imprimir();


        System.out.println("Enun");
        Dia diaActual=Dia.DOMINGO;

        switch (diaActual) {
            case LUNES,MARTES,MIERCOLES,JUEVES -> System.out.println("Som dias de trabajo");
            case VIERNES -> System.out.println("Es inicio de fin de semana");
            case DOMINGO -> {
                System.out.println("Es fin de semana  en familia");


                System.out.println("Array");
                ListaEdades.ejecutar();

                System.out.println("Interfaz");
                Vehiculo nuevoCoche=new Coche();
                Vehiculo nuevaMoto=new Moto();
                nuevoCoche.arrancar();
                nuevoCoche.detener();
                nuevaMoto.arrancar();
                nuevaMoto.detener();



            }


        }
    }
}