package pe.edu.vallegrande;

public class ClasePersona {
    public static void ejecutar(){
        Persona estudiante =new Persona("Araceli", 20);
        estudiante.hablar();
        estudiante.caminar();
    }
}
class Persona{
    private String nombre;
    private int edad;
    public Persona(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
    }
    public void hablar(){
        System.out.println(nombre + "dice hola!!");

    }
    public void caminar(){
        System.out.println(nombre + "esta caminando.");
    }
}
