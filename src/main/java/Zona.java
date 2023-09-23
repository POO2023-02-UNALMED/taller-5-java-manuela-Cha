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

    public void setZona (String nombre){
        this.nombre = nombre;
    }
    public String getZona (){
        return this.nombre;
    }

    public Zoologico getZoo (){
        return this.zoo[0];
    }

    public Zoologico getUbicacionZoo (){
        return this.zoo[1];
    }
}
