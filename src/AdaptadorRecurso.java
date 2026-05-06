public class AdaptadorRecurso implements Recurso{

    private ProveedorExterno externo;

    public AdaptadorRecurso(ProveedorExterno externo){

        this.externo = externo;

    }

    @Override
    public String getNombre(){

        return externo.obtenerNombre();

    }

    @Override
    public double getTamano() {

        return externo.obtenerPeso();

    }

    @Override
    public void mostrar() {

        System.out.println("Recurso externo adaptado: " + getNombre());

    }
}
