package biblioteca;

import java.util.ArrayList;
public class AppBiblioteca {
	

	public static void main(String[] args) throws Exception {
		ArrayList<Libro> listaLibro = new ArrayList<>();
        ArrayList<Prestamo> listaPrestamos = new ArrayList<>();
        Pais pais = new Pais("Colombia ", 1000);
        Autor autor = new Autor("Julian de la cruz ", pais);
        Editorial editorial = new Editorial(55621, "Norma", pais);
        Libro libro = new Libro("ashbdd", "Java para todos", "1", 100, autor, editorial);

        System.out.println(libro);

}
}