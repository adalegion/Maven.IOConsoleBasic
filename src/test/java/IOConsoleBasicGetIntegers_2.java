import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class IOConsoleBasicGetIntegers_2 {

   @Test
   void getIntegerOneDigitTest1() {
      // : Given
      int expected = 0;

      test(expected);
   }

   @Test
   void getIntegerOneDigitTest2() {
      // : Given
      int expected = 4;

      test(expected);
   }

   @Test
   void getIntegerTwoDigitsTest3() {
      // : Given
      int expected = 44;

      test(expected);
   }

   @Test
   void getIntegerTwoDigitsTest4() {
      // : Given
      int expected = -44;

      test(expected);
   }

   @Test
   void getIntegerThrowsExceptionTest5() {
      // : Given
      String input = "número NO entero (puede ser una letra, un decimal o un simbolo)";
      String message = String.format("Caso: Tipo NO \"int\".\nIngresa un %s para arrojar una excepción:", input);

      testThrowsAnException(message);
   }

   @Test
   void getIntegerThrowsExceptionTest6() {
      // : Given
      String input = String.valueOf(Integer.MAX_VALUE);
      String message = String.format("Caso: Fuera de rango positivo.\nIngresa un número > %s para arrojar una excepción:", input);

      testThrowsAnException(message);
   }

   @Test
   void getIntegerThrowsExceptionTest7() {
      // : Given
      String input = String.valueOf(Integer.MIN_VALUE);
      String message = String.format("Caso: Fuera de rango negativo.\nIngresa un número < %s para arrojar una excepción:", input);

      testThrowsAnException(message);
   }

   /**
    * Fin de los Tests
    */
   private void test(int expected) {
      // : When
      String message = String.format("Ingresa el número %s:", expected);
      System.out.println(message);

      IOConsoleBasic console = new IOConsoleBasic();
      int actual = console.getIntegerInput();
      System.out.println(actual);

      // : Then
      assertEquals(expected, actual);
   }

   private void testThrowsAnException(String message) {
      // : When
      Exception expected = new InputMismatchException();
      System.out.println(message);

      // : Then
      assertThrows(expected.getClass(), () -> {
         IOConsoleBasic console = new IOConsoleBasic();
         console.getIntegerInput();
      });
   }

}
