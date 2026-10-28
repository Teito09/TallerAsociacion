public class App {
    public static void main(String[] args) throws Exception{
    Libro  Libro1 = new Libro("Cien años de soledad", "Gabriel Garcia Marquez");
    Libro Libro2 = new Libro("El principito", "Antoine de saint");

    Lector Lector1 = new Lector("Laura Rojas", "10533337731");
    Lector Lector2 = new Lector("Viviana Salinas", "1053337754");

    Lector1.tomarprestado(Libro1);
    Lector2.tomarprestado(Libro2);

    System.out.println();
    Lector1.mostrarEstado();
    Lector2.mostrarEstado();

    System.out.println();
    Lector1.tomarprestado(Libro2);

    System.out.println();
    Lector1.regresarLibro();
    Lector1.tomarprestado(Libro2);

    System.out.println();
    Lector1.mostrarEstado();
    Lector2.mostrarEstado();
    }
}
