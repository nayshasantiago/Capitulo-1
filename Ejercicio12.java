/*(Velocidad promedio en kilÃ³metros) Supongamos que un corredor corre 24 millas en 1 hora, 40 minutos,
y 35 segundos. Escribe un programa que muestre la velocidad promedio en kilÃ³metros por
hora. (Tenga en cuenta que 1 milla es de 1,6 kilÃ³metros.)*/
package capitulo1;
public class Ejercicio12 {
     public static void main(String[] strings) {
        double Horas= 1;
        double Minutos= 40;
        double Segundos= 35;
        double DistEnMillas = 24;

        double DistEnKilometros = DistEnMillas * 1.60934;
        
        double TiempEnMinutos = Horas * 60.0 + Minutos + Segundos / 60.0;
        
        double kilometersPerHour = 60.0 * DistEnKilometros / TiempEnMinutos;

        System.out.println("La velocidad promedio en kilometros que recorre es :"+ kilometersPerHour);

    }
}
