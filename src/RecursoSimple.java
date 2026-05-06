public class RecursoSimple implements Recurso {

    private String codigo;
    private String nombre;
    private String autor;
    private String editorial;
    private int anio;
    private String ISBN;
    private String formato;
    private double tamano;
    private String licencia;
    private String descripcion;
    private boolean disponible;


    public RecursoSimple(String codigo, String nombre, String autor,
                         String editorial, int anio, String ISBN, String formato
                         , double tamano, String licencia, String descripcion, boolean disponible) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.autor = autor;
        this.editorial = editorial;
        this.anio = anio;
        this.ISBN = ISBN;
        this.formato = formato;

        this.tamano = tamano;
        this.licencia = licencia;
        this.descripcion = descripcion;
        this.disponible = disponible;

    }

    @Override
    public String getNombre() {
        return nombre;
    }
    @Override
    public double getTamano() {
        return tamano;
    }

    public boolean isDisponible() {
        return disponible;
    }
    public String getLicencia(){
        return licencia;
    }
    public String getFormato() {
        return formato;
    }
    public String getAutor() {
        return autor;
    }
    public String getEditorial() {
        return editorial;
    }
    public int getAnio() {
        return anio;
    }
    public String getISBN() {
        return ISBN;
    }

    public String getDescripcion() {
        return descripcion;
    }
    public String getCodigo() {
        return codigo;
    }

    @Override
    public void mostrar() {
        System.out.println("Nombre: "+nombre+
                            "\n Codigo: "+ codigo+
                            "\n Autor: "+ autor+
                            "\n Editorial: "+ editorial+
                            "\n Anio: "+ anio+
                            "\n ISBN: "+ ISBN+
                "\n Formato: "+ formato+
                "\n Tamano: "+ tamano+
                "\n Licencia: "+ licencia+
                "\n Descripcion: "+ descripcion+
                "\n Disponible: "+ disponible);
    }
}
