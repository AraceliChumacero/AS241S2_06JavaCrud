package pe.edu.vallegrande;

public class Moto implements  Vehiculo{
    @Override
    public void arrancar(){
        System.out.println("La moto esta arrancado");
    }
    @Override
    public void detener(){
        System.out.println("La moto esta detenido");
    }
}
