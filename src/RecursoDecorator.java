public abstract class RecursoDecorator implements Recurso{

    protected Recurso recurso;

    public RecursoDecorator(Recurso recurso){

        this.recurso = recurso;

    }

    @Override
    public String getNombre() {

        return recurso.getNombre();

    }

    @Override
    public double getTamano() {

        return recurso.getTamano();

    }

    @Override
    public void mostrar() {

        recurso.mostrar();
    }
}
