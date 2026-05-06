public class ProxyRecurso implements Recurso {

    private Recurso recurso;
    private boolean accesoPermitido;

    public ProxyRecurso(Recurso recurso, boolean accesoPermitido){

        this.recurso = recurso;
        this.accesoPermitido = accesoPermitido;

    }

    @Override
    public String getNombre(){

        return recurso.getNombre();

    }

    @Override
    public double getTamano() {

        return recurso.getTamano();

    }

    @Override
    public void mostrar() {

        if (accesoPermitido){

            recurso.mostrar();

        } else {

            System.out.println("Acceso restringido a : " + recurso.getNombre());

        }
    }
}
