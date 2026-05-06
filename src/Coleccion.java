import java.util.ArrayList;
import java.util.List;

public class Coleccion implements Recurso {

    private String nombre;
    private List<Recurso> recursos = new ArrayList<>();

    public Coleccion(String nombre){

        this.nombre = nombre;

    }

    public void agregar(Recurso recurso){

        recursos.add(recurso);

    }

    @Override
    public String getNombre(){

        return nombre;

    }

    @Override
    public double getTamano(){

        double total = 0;
        for (Recurso r : recursos){

            total += r.getTamano();
        }

        return total;

    }

    @Override
    public void mostrar(){

        System.out.println("\nColección: " + nombre);
        for (Recurso r : recursos){

            r.mostrar();

        }
    }

}
