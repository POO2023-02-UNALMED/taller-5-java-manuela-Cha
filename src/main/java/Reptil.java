package zooAnimales;
import java.util.ArrayList;

public class Reptil extends Animal {
    private static ArrayList<Reptil> listado = new ArrayList<Reptil>();
    public static int iguanas;
    public static int serpientes;
    private String colorEscamas;
    private int largoCola;
    private static int totalReptiles = 0;

    public Reptil(){
        totalReptiles += 1;
        Reptil.listado.add(this);
    }

    public Reptil(String colorEscamas, int largoCola){
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        totalReptiles += 1;
        Reptil.listado.add(this);
    }

    public Reptil(String nombre, int edad, String habitat, String genero, String colorEscamas, int largoCola){
        super(nombre, edad, habitat, genero);
        this.colorEscamas = colorEscamas;
        this.largoCola = largoCola;
        totalReptiles += 1;
        Reptil.listado.add(this);
    }

    public static int cantidadReptiles (){
        return totalReptiles;
    }

    public String movimiento (){
        return "reptar";
    }  

    public static Reptil crearIguana (String nombre, int edad, String genero){
        iguanas += 1;
        Reptil iguana = new Reptil (nombre, edad, "humedal", genero, "verde", 3);
        return iguana; 
    }

    public static Reptil crearSerpiente (String nombre, int edad, String genero){
        serpientes += 1;
        Reptil serpiente = new Reptil (nombre, edad, "jungla", genero, "blanco", 1);
        return serpiente; 
    }

    public void setColorEscamas (String color){
        this.colorEscamas = color;
    }
    public String getColorEscamas (){
        return this.colorEscamas;
    }

    public void setLargoCola (int largo){
        this.largoCola = largo;
    }
    public int getLargoCola  (){
        return this.largoCola;
    }

}
