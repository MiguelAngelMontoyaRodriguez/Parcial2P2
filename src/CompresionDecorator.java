public class CompresionDecorator  extends RecursoDecorator{

    public CompresionDecorator(Recurso recurso){

        super(recurso);

    }

    @Override
    public double getTamano() {

        return recurso.getTamano() * 0.5;

    }

    @Override
    public void mostrar() {

        super.mostrar();
        System.out.println(" + Recurso comprimido (50%) ");

    }
}
