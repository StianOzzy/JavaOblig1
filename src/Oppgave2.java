/* Oppgave 2.2

Gravitasjonen på månen er ca. 16.5 prosent av jordens.
Skriv et program som beregner din vekt på månen.
Google kan være en god ressurs for å finne ut nøyaktig
hvordan man beregner dette :)

 */
import java.util.Scanner;

public class Oppgave2 {

    public static void main(String[] args) {
        Scanner userWeight = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter your weight");

        int userWeightAsInt = Integer.parseInt(userWeight.nextLine());
        double userWeightOnMoon = (userWeightAsInt * 0.165);
        System.out.println("Your weight on the moon is: " + userWeightOnMoon);
    }
}
