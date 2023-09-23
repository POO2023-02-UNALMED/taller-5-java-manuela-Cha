package zooAnimales;
import java.util.ArrayList;

public class Mamifero extends Animal {
    private static ArrayList<Mamifero> listado = new ArrayList<Mamifero>();
    public static int caballos;
    public static int leones;
    private boolean pelaje;
    private int patas;
    private static int totalMamiferos = 0;

    public Mamifero(){
        Mamifero.listado.add(this);
        totalMamiferos += 1;
    }

    public Mamifero(boolean pelaje, int patas){
        this.pelaje = pelaje;
        this.patas = patas;
        Mamifero.listado.add(this);
        totalMamiferos += 1;
    }

    public Mamifero(String nombre, int edad, String habitat, String genero, boolean pelaje, int patas){
        super(nombre, edad, habitat, genero);
        this.pelaje = pelaje;
        this.patas = patas;
        Mamifero.listado.add(this);
        totalMamiferos += 1;
    }

    public static int cantidadMamiferos (){
        return totalMamiferos;
    }

    public static Mamifero crearCaballo (String nombre, int edad, String genero){
        caballos += 1;
        Mamifero caballo = new Mamifero(nombre, edad, "pradera", genero, true, 4);
        return caballo;
    }

    public static Mamifero crearLeon (String nombre, int edad, String genero){
        leones += 1;
        Mamifero leon = new Mamifero(nombre, edad, "selva", genero, true, 4);
        return leon;
    }

    public void setPelaje (boolean pelaje){
        this.pelaje = pelaje;
    }
    public boolean getPelaje (){
        return this.pelaje;
    }

    public void setPatas(int patas){
        this.patas = patas;
    }
    public int getPatas (){
        return this.patas;
    }

}
