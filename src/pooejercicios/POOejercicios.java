

package pooejercicios;

import java.util.Scanner;
import pooejercicios.ejercicio1.Libro;

/**Crear una clase llamada Libro que contenga los siguientes atributos: ISBN, Título, Autor,
Número de páginas, y un constructor con todos los atributos pasados por parámetro y un
constructor vacío. Crear un método para cargar un libro pidiendo los datos al usuario y
luego informar mediante otro método el número de ISBN, el título, el autor del libro y el
numero de páginas.
 *
 * @author chech
 */
public class POOejercicios {

 
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
        Libro l1 = new Libro(l1.autor, l1.isbn, l1.paginas, l1.titulo);
        
      l1.setAutor = leer.next();
      l1.isbn = leer.next();
      l1.titulo = leer.next();
      l1.paginas = leer.next();
      
        System.out.println(l1.toString());
              
      
//    public String isbn;
//    public String titulo;
//    public String autor;
//    public String paginas;
    }
    
}
