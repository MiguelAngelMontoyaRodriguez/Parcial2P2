public class RecursoBuilder implements Builder{

    //Obligatorios
    private String codigo;
    private String nombre;
    private String autor;

    //Opcionales
    private String editorial = "Sin editorial";
    private int anio = 0;
    private String ISBN= "Sin ISBN";
    private String formato="PDF";
    private double tamano=0;
    private String licencia="Libre";
    private String descripcion= "";
    private boolean disponible= true;

    public RecursoBuilder setCodigo(String codigo) {
        this.codigo = codigo;
        return this;
    }

    public RecursoBuilder setNombre(String nombre){

            this.nombre = nombre;
            return this;
    }
    public RecursoBuilder setAutor(String autor) {
        this.autor = autor;
        return this;
    }
    public RecursoBuilder setEditorial(String editorial){
        this.editorial = editorial;
        return this;
    }
    public RecursoBuilder setAnio(int anio) {
        this.anio = anio;
        return this;
    }
    public RecursoBuilder setISBN(String ISBN) {
        this.ISBN = ISBN;
        return this;
    }
    public RecursoBuilder setFormato(String formato) {
        this.formato = formato;
        return this;
    }

    public RecursoBuilder setTamano(double tamano){

        this.tamano = tamano;
        return this;

    }
    public RecursoBuilder setLicencia(String licencia) {
        this.licencia = licencia;
        return this;
    }
    public RecursoBuilder setDescripcion(String descripcion) {
        this.descripcion = descripcion;
        return this;
    }
    public RecursoBuilder setDisponible(boolean disponible) {
        this.disponible = disponible;
        return this;
    }

    @Override
    public RecursoSimple build(){

        return new RecursoSimple(codigo, nombre, autor, editorial,
                anio, ISBN, formato, tamano, licencia, descripcion, disponible);

    }
}
