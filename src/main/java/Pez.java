package zooAnimales;
import java.util.ArrayList;

public class Pez extends Animal {
    private static ArrayList<Pez> listado = new ArrayList<Pez>();
    public static int salmones;
    public static int bacalaos;
    private String colorEscamas;
    private int cantidadAletas;
    private static int totalPeces = 0;

    public Pez(){
        totalPeces += 1;
        Pez.listado.add(this);
    }

    public Pez(String colorEscamas, int cantidadAletas){
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        totalPeces += 1;
        Pez.listado.add(this);
    }

    public Pez(String nombre, int edad, String habitat, String genero, String colorEscamas, int cantidadAletas){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.cantidadAletas = cantidadAletas;
        totalPeces += 1;
        Pez.listado.add(this);
    }

    public static int cantidadPeces (){
        return totalPeces;
    }

    public String movimiento (){
        return "nadar";
    }

    public static Pez cerarSalmon (String nombre, int edad, String genero ){
        salmones += 1;
        Pez salmon = new Pez (nombre, edad, "oceano", genero, "rojo", 6);
        return salmon;
    }

    public static Pez crearBacalao (String nombre, int edad, String genero){
        bacalaos += 1;
        Pez bacalao = new Pez (nombre, edad, "oceano", genero, "gris", 6);
        return bacalao;
    }

    public void setColorEscamas (String color){
        this.colorEscamas = color;
    }
    public String getColorEscamas (){
        return this.colorEscamas;
    }

    public void setCantidadAletas (int cantidad ){
        this.cantidadAletas = cantidad;
    }
    public int getCantidadAletas (){
        return this.cantidadAletas;
    }
}
