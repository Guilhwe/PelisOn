import java.util.Scanner;

public class Lectura {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        System.out.println("Escriba tu pelicula favorita");
        String pelicula = lectura.nextLine();
        
        System.out.println("Cual es su año de lanzamiento?");
        int año_de_estreno = lectura.nextInt();
        
        System.out.println("Que nota le das a la pelicula de 1 al 10?");
        double nota = lectura.nextDouble();
        
        if (nota < 1 || nota >10) {
            System.out.println("La nota no es valida");
        } else{
            System.out.println(pelicula);
            System.out.println(año_de_estreno);
            System.out.println(nota);
         }  
            
     }
        
}
