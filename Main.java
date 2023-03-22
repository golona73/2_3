import java.util.Random;

public class Main {
  public static void main(String[] args) {
    Random random = new Random();
    int suma = 0;
    int kwadrat =0;

    for (int i = 0; i < 5; i++) {
      int number = random.nextInt(10);
      System.out.println("Wylosowana liczba: " + number);
     kwadrat = number*number;
      suma = suma+kwadrat;
    }

    System.out.println("Suma wylosowanych liczb do kwadratu: " + suma);
  }
}
 