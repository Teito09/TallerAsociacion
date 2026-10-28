public class Libro {
    private String titulo;
    private String autor;
    private boolean disponible = true;

    public Libro() {
        this.disponible = true;
    }
    public Libro(String titulo, String autor) {
        this.autor = autor;
        this.titulo = titulo;
    }
    public Libro (String titulo, String autor, boolean disponible){
        this.autor = autor;
        this.titulo = titulo;
        this.disponible = disponible;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        if(!titulo.isEmpty()){
            this.titulo = titulo;
        }else{
            System.out.println("El titulo está vacio.");
        }   
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }
    public boolean isDisponible() {
        return disponible;
    }
    public void mostrarInfo(){
        System.out.println("Titulo: "+getTitulo());
        System.out.println("El autor es: "+getAutor());
        if(isDisponible()){
            System.out.println("Esta disponible.");
        }
    }
    public boolean prestar(){
        if(disponible){setDisponible(false);
            System.out.println("El libro \"" + titulo + "\" fue prestado.");
            return true;
        }else{
            System.out.println("El libro \"" + titulo + "\" ya fue prestado.");
            return false;
        }
    }
    public void devolver(){
        if(!disponible){
            setDisponible(true);
            System.out.println("El libro \"" + titulo + "\" ya fue devuelto.");
        }else{
            System.out.println("El libro \"" + titulo + "\" ya esta prestado.");
        }
    }
}
