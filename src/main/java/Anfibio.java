package zooAnimales;
import java.util.ArrayList;

public class Anfibio extends Animal {
    private static ArrayList<Anfibio> listado = new ArrayList<Anfibio>();
    public static int ranas;
    public static int salamandras;
    private String colorPiel;
    private boolean venenoso;
    private static int totalAnfibios = 0;

    public Anfibio(){
        totalAnfibios += 1;
        Anfibio.listado.add(this);
    }
    

    public Anfibio(String colorPiel, boolean venenoso){
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        totalAnfibios += 1;
        Anfibio.listado.add(this);
    }

    public Anfibio(String nombre, int edad, String habitat, String genero, String colorPiel, boolean venenoso){
        super(nombre, edad, habitat, genero);
        this.colorPiel = colorPiel;
        this.venenoso = venenoso;
        totalAnfibios += 1;
        Anfibio.listado.add(this);
    }

    public static int cantidadAnfibios (){
        return totalAnfibios;
    }

    public String movimiento (){
        return "saltar";
    } 

    public static Anfibio crearRana (String nonbre, int edad, String genero){
        ranas += 1;
        Anfibio rana = new Anfibio (nombre, edad, "selva", genero, "rojo", true);
        return rana;
    }

    public static Anfibio crearSalamandra (String nonbre, int edad, String genero){
        salamandras += 1;
        Anfibio salamandra = new Anfibio (nombre, edad, "selva", genero, "negro y amarillo", false);
        return salamandra;
    }

    public void setColorPiel (String color){
        this.colorPiel = color;
    }
    public String getColorPiel (){
        return this.colorPiel;
    }

    public void setVenenoso (boolean venenoso){
        this.venenoso = venenoso;
    }
    public boolean getVenenoso (){
        return this.venenoso;
    }
}
