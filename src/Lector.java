public class Lector {
    
    private String nombre;
    private String cedula;
    private Libro LibroActual;

    public Lector(){
    }
    public Lector(String nombre, String cedula){
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public String getCedula() {
        return cedula;
    }
    public String getNombre() {
        return nombre;
    }
    public Libro getLibroActual() {
        return LibroActual;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    public void setLibroActual(Libro libroActual) {
        LibroActual = libroActual;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void tomerprestado(Libro Libro){
        if( LibroActual != null){
            System.out.println(nombre + " ya tiene el libro \" " + LibroActual.getTitulo()+ "\" .Debe devolverlo primero");
        }else{
            if(Libro.prestar()){
                LibroActual= Libro;
            }
        }
    }
    public void regresarLibro(){
        if(LibroActual == null){
            System.out.println(nombre + " no tiene ningun libro.");
        }else{ 
            LibroActual.devolver();
            LibroActual = null;
        }
    }
    public void mostrarEstado(){
        String estado = (LibroActual != null) ? LibroActual.getTitulo() : "sin titulo";
        System.out.println("Lector: " + nombre + "|Libro: " + estado);
    }
}
