public class Condicional {
    public static void main(String[] args) {
        int año = 2016;
        boolean dentro_del_plan = true;
        double nota = 9.9;
        String tipoPlan = "plus";
        if (año > 2024) {
            System.out.println("Estrenos Aclamados");

        } else {
            System.out.println("Peliculas Antiguas Aclamadas");
        }

        if(dentro_del_plan == true || tipoPlan.equals("plus") ){
            System.out.println("Pelicula Disponible");

        }else{
            System.out.println("Pelicula bloqueada");
        }
    }
}
