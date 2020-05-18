import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class IOConsoleBasicGetFloatTest {

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
   void getFloatInputThrowsPositiveInfinityTest6() {
      // : Given
      String input = String.valueOf(Float.MAX_VALUE);
      String message = String.format("Caso: Fuera de rango positivo.\nEscribe un número > %s para dar un \"infinity\" positivo:", input);

      testThrowsInfinity(message);
   }

   @Test
   void getFloatInputThrowsNegativeInfinityTest7() {
      // : Given
      String input = String.valueOf(Float.MIN_VALUE);
      String message = String.format("Caso: Fuera de rango negativo.\nEscribe un número < %s para dar un \"infinity\" negativo ", input);

      testThrowsInfinity(message);
   }

   /**
    * Fin de los Tests
    */
   private void testThrowsInfinity(String message) {
      // : When
      System.out.println(message);
      float floatInput = IOConsoleBasic.getFloatInput();
      System.out.println(floatInput);

      // : Then
      if (Float.isInfinite(floatInput)) {
         assertTrue(true);
      } else {
         fail();
      }
   }

   private void testThrowsAnException(String message) {
      // : When
      Exception expected = new InputMismatchException();
      System.out.println(message);

      // : Then
      assertThrows(expected.getClass(), IOConsoleBasic::getFloatInput);
   }

   private void test(float expected) {
      // : When
      String message = String.format("Ingresa el número %s:", expected);
      System.out.println(message);

      float actual = IOConsoleBasic.getFloatInput();
      System.out.println(actual);

      // : Then
      assertEquals(expected, actual);
   }

}
