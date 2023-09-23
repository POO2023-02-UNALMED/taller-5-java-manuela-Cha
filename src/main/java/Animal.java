package zooAnimales;
import gestion.*;

public class Animal {
    public static int totalAnimales;
    protected String nombre;
    protected int edad;
    protected String habitat;
    protected String genero;
    protected Zona[] zona = new Zona[1];

    public Animal(){
        Animal.totalAnimales += 1;
    }

    public Animal(String nombre, int edad, String habitat, String genero){
        this.nombre = nombre;
        this.edad = edad;
        this.habitat = habitat;
        this.genero = genero;
        Animal.totalAnimales += 1;
    }

    public String movimiento (){
        return "desplazarse";
    } 

    public void totalPorTipo (){
        System.out.println("Mamiferos: "+ Mamifero.cantidadMamiferos());
        System.out.println("Aves : "+ Ave.cantidadAves());
        System.out.println("Reptiles : "+ Reptil.cantidadReptiles());
        System.out.println("Peces: "+ Pez.cantidadPeces());
        System.out.println("Mamiferos: "+ Anfibio.cantidadAnfibios());
    }

    public void setNombreAnimal(String nombre){
        this.nombre = nombre;
    }
    public String getNombreAnimal(){
        return this.nombre;
    }

    public void setEdadAnimal(int edad){
        this.edad = edad;
    }
    public int getEdadAnimal (){
        return this.edad;
    }

    public void setHabitatAnimal(String habitat){
        this.habitat = habitat;
    }
    public String getHabitatAnimal (){
        return this.habitat;
    }

    public void setGeneroAnimal (String genero){
        this.genero = genero;
    }
    public String getGeneroAnimal (){
        return this.genero;
    }


    public String toString (){
        if (zona[0] != null && zona[1].getNombreZoo() !=  null){ 
            return "Mi nombre es " + this.nombre + ", tengo una edad de " 
        + this.edad + ", habito en" + this.habitat + ", y mi genero es" + this.genero +
        ", la zona en la que me ubico es " + this.zona[0] +", en el zoo " + zona[1].getNombreZoo();
        }
        return "Mi nombre es " + this.nombre + ", tengo una edad de " 
        + this.edad + ", habito en" + this.habitat + ", y mi genero es" + this.genero;
    }
}
