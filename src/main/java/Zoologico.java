package gestion;
import java.util.ArrayList;


public class Zoologico {
    private String nombre;
    private String ubicacion;
    private ArrayList<Zona> zonas = new ArrayList<Zona>();

    public Zoologico(){}

    public Zoologico(String nombre, String ubicacion){
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public void agregarZonas(Zona zonaNueva){
        zonas.add(zonaNueva);
    }

    public int cantidadTotalAnimales(){
        int totalAnimales = 0;
        for (Zona zona : zonas){
             totalAnimales += zona.cantidadAnimales();
        } 
        return totalAnimales;
    }

    public void setNombre (String nombre){
        this.nombre = nombre;
    }
    public String getNombre (){
        return this.nombre;
    }
    public ArrayList<Zona> getZona(){
        return zonas;
    }

    public void setUbicacionZoo (String ubicacion){
        this.ubicacion = ubicacion;
    }
    public String getUbicacionZoo (){
        return this.ubicacion;
    }
}
