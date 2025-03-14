package pe.edu.vallegrande;

public class Coche implements Vehiculo{
    @Override
    public void arrancar(){
        System.out.println("El coche esta arrancado");
    }

    @Override
    public void detener(){
        System.out.println("El coche esta detenido");
    }

}
