import java.util.Random;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    double suma = 0;
   double kwadrat =0;

    for (int i = 0; i < 5; i++) {
      double number = random.nextInt(10);
      System.out.println("Wylosowana liczba: " + number);
     kwadrat = (Math.pow(number, 2));
      suma = suma+kwadrat;
    }

    System.out.println("Suma wylosowanych liczb podniesionych do kwadratu: " + suma);
  }
}
 