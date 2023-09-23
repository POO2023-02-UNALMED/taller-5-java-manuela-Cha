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

    public static String totalPorTipo (){
        int mam = Mamifero.cantidadMamiferos(); 
        int av = Ave.cantidadAves();
        int rep = Reptil.cantidadReptiles();
        int pex = Pez.cantidadPeces();
        int An =Anfibio.cantidadAnfibios();
        return "Mamiferos: " + mam + "/nAves: " + av + "/nReptiles: " + rep + "/nPeces: " + pex + "/nAnfibios: " + An;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public String getNombre(){
        return this.nombre;
    }

    public void setEdad(int edad){
        this.edad = edad;
    }
    public int getEdad (){
        return this.edad;
    }

    public void setHabitat(String habitat){
        this.habitat = habitat;
    }
    public String getHabitat (){
        return this.habitat;
    }

    public void setGenero (String genero){
        this.genero = genero;
    }
    public String getGenero (){
        return this.genero;
    }


    public String toString (){
        if (zona[0] != null && zona[1].getZoo() !=  null){ 
            return "Mi nombre es " + this.nombre + ", tengo una edad de " 
        + this.edad + ", habito en" + this.habitat + ", y mi genero es" + this.genero +
        ", la zona en la que me ubico es " + this.zona[0] +", en el zoo " + zona[1].getZoo();
        }
        return "Mi nombre es " + this.nombre + ", tengo una edad de " 
        + this.edad + ", habito en" + this.habitat + ", y mi genero es" + this.genero;
    }
}
