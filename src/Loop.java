import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        double nota = 0;
        double nota_media = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Que nota le das a la pelicula de 1 al 10?");
            
            nota = lectura.nextDouble();
            nota_media += nota;
            
        }
        nota_media = nota_media/3;
        System.out.println("La nota media de la pelicula es " + nota_media);
        
    }
}

