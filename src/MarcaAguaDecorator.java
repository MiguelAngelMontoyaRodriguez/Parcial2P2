public class MarcaAguaDecorator extends RecursoDecorator{

    public MarcaAguaDecorator(Recurso recurso){

        super(recurso);

    }

    @Override
    public void mostrar() {

        super.mostrar();
        System.out.println(" + Marca de agua institucional");

    }
}
