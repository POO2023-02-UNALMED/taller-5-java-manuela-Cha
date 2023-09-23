package gestion;
import java.util.ArrayList;
import zooAnimales.Animal;

public class Zona {
    private String nombre;
    private Zoologico[] zoo = new Zoologico[1];
    private ArrayList<Animal> animales = new ArrayList<Animal>();


    public Zona(){}

    public Zona(String nombre, Zoologico zoo){
        this.nombre = nombre;
        this.zoo[0] = zoo;
    }


    public void agregarAnimales (Animal animalNuevo){
        animales.add(animalNuevo);
    }

    public int cantidadAnimales (){
        int numAnimalesEnZona = 0;
        for (Animal animal : animales){
            if (animal != null) {
            numAnimalesEnZona += 1;
            }
        }
        return numAnimalesEnZona;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return nombre;
    }

    public Zoologico getZoo (){
        return zoo[0];
    }
    public void setZoo(Zoologico[] zoo){
        this.zoo = zoo;
    }

    public ArrayList<Animal> getAnimales(){
        return animales;
    }

    public Zoologico getUbicacionZoo (){
        return zoo[1];
    }
}
