import java.util.Scanner;

public class IOConsoleBasic {

   public static String getAString() {
      Scanner scanner = new Scanner(System.in);
      return scanner.next();
   }


   public static int getAnInteger() {
      Scanner scanner = new Scanner(System.in);
      return scanner.nextInt();
   }


   public static int sumTwoNumbers() {
      Scanner scanner = new Scanner(System.in);
      int firstSummand = scanner.nextInt();
      int secondSummand = scanner.nextInt();

      return firstSummand + secondSummand;
   }

}
