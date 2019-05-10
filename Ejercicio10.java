package capitulo1;
public class Ejercicio10 {
     public static void main(String[] strings) {

        double Kilometros = 14.0;
        double Millas = Kilometros / 1.6;

        double Tarifa = (45.5 * 60.0 + 30.0) / (60.0 * 60.0);
        double MillasPorHora = Millas / Tarifa;

        System.out.println(MillasPorHora);
    }  
}
