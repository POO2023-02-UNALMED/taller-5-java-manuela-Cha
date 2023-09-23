package zooAnimales;
import java.util.ArrayList;

public class Ave extends Animal {
    private static ArrayList<Ave> listado = new ArrayList<Ave>();
    public static int halcones;
    public static int aguilas;
    private String colorPlumas;
    private static int totalAves = 0;

    public Ave(){
        totalAves += 1;
        Ave.listado.add(this);
    }

    public Ave(String colorPlumas){
        this.colorPlumas = colorPlumas;
        totalAves += 1;
        Ave.listado.add(this);
    }

    public Ave(String nombre, int edad, String habitat, String genero, String colorPlumas){
        super(nombre, edad, habitat, genero);
        this.colorPlumas = colorPlumas;
        totalAves += 1;
        Ave.listado.add(this);
    }
    
    public static int cantidadAves(){
        return Ave.totalAves;
    }

    public String movimiento (){
        return "volar";
    } 

    public Ave crearHalcon (String nombre, int edad, String genero){
        halcones += 1;
        Ave halcon = new Ave(nombre, edad, "montanas", genero, "cafe glorioso");
        return halcon;
    }

    public Ave crearAguila (String nombre, int edad, String genero){
        aguilas += 1;
        Ave aguila = new Ave(nombre, edad, "montanas", genero, "blanco y amarillo");
        return aguila;
    }

    public void setColorPlumas (String color){
        this.colorPlumas = color;
    }
    public String getColorPlumas (){
        return this.colorPlumas;
    }
}
