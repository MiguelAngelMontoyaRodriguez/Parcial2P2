public class Main {

    public static void main(String[] args) {

        //BUILDER
        Recurso libro = new RecursoBuilder().setCodigo("109029").
                setAutor("Benito").
                setNombre("Libro Programación Java").
                setTamano(120).
                build();

        //ADAPTER
        Recurso externo = new AdaptadorRecurso(new ProveedorExterno());

        //DECORATOR
        Recurso funcionalidadNueva = new MarcaAguaDecorator(new CompresionDecorator(libro));

        //PROXY
        Recurso accesoPermitido = new ProxyRecurso(funcionalidadNueva, true);
        Recurso accesoDenegado = new ProxyRecurso(externo, false);

        //COMPOSITE
        Coleccion biblioteca = new Coleccion("Biblioteca Digital");

        biblioteca.agregar(accesoPermitido);
        biblioteca.agregar(accesoDenegado);

        //IMPRIMIR
        biblioteca.mostrar();

        System.out.println("\n Tamaño total de la colección: " + biblioteca.getTamano());

    }

}
