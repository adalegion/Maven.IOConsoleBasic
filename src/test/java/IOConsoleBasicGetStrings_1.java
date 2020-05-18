import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class IOConsoleBasicGetStrings_1 {

   @Test
   void getAStringTest1() {
      // : Given
      String expected = "adalegion";
      System.out.println("Escribe la palabra \"adalegion\" sin comillas:");

      // : When
      IOConsoleBasic console = new IOConsoleBasic();
      String actual = console.getStringInput();

      // : Then
      assertEquals(expected, actual);
   }

   @Test
   void getAStringTest2() {
      // : Given
      String expected = "14";
      System.out.println("Escribe el número 14:");

      // : When
      IOConsoleBasic console = new IOConsoleBasic();
      String actual = console.getStringInput();

      // : Then
      assertEquals(expected, actual);
   }

   @Test
   void getAStringTest3() {
      // : Given
      String expected = "";
      System.out.println("Manda un string vacío:");

      // : When
      IOConsoleBasic console = new IOConsoleBasic();
      String actual = console.getStringInput();

      // : Then
      assertEquals(expected, actual);
   }

   @Test
   void getAStringTest4() {
      // : Given
      String expected = " ";
      System.out.println("Escrbe un espacio en blanco:");

      // : When
      IOConsoleBasic console = new IOConsoleBasic();
      String actual = console.getStringInput();

      // : Then
      assertEquals(expected, actual);
   }

}
