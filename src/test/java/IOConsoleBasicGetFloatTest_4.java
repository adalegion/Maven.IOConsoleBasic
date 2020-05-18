import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class IOConsoleBasicGetFloatTest_4 {

   @Test
   void getFloatInputTest1() {
      // : Given
      float expected = 0;

      test(expected);
   }

   @Test
   void getFloatInputTest2() {
      // : Given
      float expected = 4.4f;

      test(expected);
   }

   @Test
   void getFloatInputTest3() {
      // : Given
      float expected = 44.4f;

      test(expected);
   }

   @Test
   void getFloatInputTest4() {
      // : Given
      float expected = -44.4f;

      test(expected);
   }

   @Test
   void getFloatInputThrowsExceptionTest5() {
      // : Given
      String input = "número NO flotante (puede ser una letra o un simbolo)";
      String message = String.format("Caso: Tipo NO \"float\".\nIngresa un %s para arrojar una excepción:", input);

      testThrowsAnException(message);
   }

   @Test
   void getFloatInputReturnsInfinityTest6() {
      // : Given
      String input = String.valueOf(Float.MAX_VALUE);

      // : When
      String message = String.format("Caso: Fuera de rango.\nEscribe un número > %s para dar un \"infinity\" :", input);
      System.out.println(message);
      IOConsoleBasic console = new IOConsoleBasic();
      float fromConsole = console.getFloatInput();
      boolean actual = Float.isInfinite(fromConsole);

      // : Then
      assertTrue(actual);
   }

   @Test
   void getFloatInputReturnsZeroTest7() {
      // : Given
      String input = String.valueOf(Float.MIN_VALUE);
      float expected = 0.0f;

      // : When
      String message = String.format("Caso: Minimum non-zero value representable by the mantissa and exponent components of a float.\nEscribe un número < %s para dar un \"infinity\" ", input);
      System.out.println(message);
      IOConsoleBasic console = new IOConsoleBasic();
      float actual = console.getFloatInput();

      // : Then
      assertEquals(expected, actual);
   }

   /**
    * Fin de los Tests
    */
   private void testThrowsAnException(String message) {
      // : When
      Exception expected = new InputMismatchException();
      System.out.println(message);

      // : Then
      assertThrows(expected.getClass(), () -> {
         IOConsoleBasic console = new IOConsoleBasic();
         console.getFloatInput();
      });
   }

   private void test(float expected) {
      // : When
      String message = String.format("Ingresa el número %s:", expected);
      System.out.println(message);

      IOConsoleBasic console = new IOConsoleBasic();
      float actual = console.getFloatInput();
      System.out.println(actual);

      // : Then
      assertEquals(expected, actual);
   }

}
