package capitulo1;
public class Ejercicio11 {
       public static void main(String[] args) {
    	int tiempo = 3600 * 24 * 365;  // Calculate 1 year in second
		int nacen = tiempo / 7;  // Born in 1 year
		int mueren = tiempo / 13;  // Death in 1 year
		int immigrantes = tiempo / 45;  // Immigrant in 1 year

		int current_population = 312032486;
		int poblacion = nacen + immigrantes - mueren ;

		for (int i = 1; i <= 5; i++) {
			current_population = current_population + poblacion;  // Calculate total population
			System.out.println(i + " año la poblacion es : " + current_population);
		}
    }
}
