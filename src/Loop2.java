import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double nota = 0;
        double nota_media = 0;
        int total_notas = 0;
        while (nota != -1) {
            System.out.println("Escribe su nota de 1 al 10 o -1 para salir");
            nota = lectura.nextDouble();
            if (nota != -1) {
                nota_media += nota;
                total_notas++;
        }
        
    } 
        nota_media = nota_media / total_notas;
        System.out.println("La nota media de la pelicula es " + nota_media);
    }
}
