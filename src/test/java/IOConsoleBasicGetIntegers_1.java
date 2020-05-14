import org.junit.jupiter.api.Test;

import java.util.InputMismatchException;

import static org.junit.jupiter.api.Assertions.*;

class IOConsoleBasicGetIntegers_1 {

   @Test
   void getAnIntegerTest1() {
      // : Given
      int input1 = 0;
      int input2 = 10;
      String message = String.format("Ingresa %s número(s) entero entre el %s y el %s:", 1, input1, input2);
      System.out.println(message);

      // : When
      int actual = IOConsoleBasic.getAnInteger();
      System.out.println(actual);

      // : Then
      if ((actual >= input1) & (actual <= input2)) {
         assertTrue(true);
      } else {
         fail();
      }
   }

   @Test
   void getAnIntegerTest2() {
      // : Given
      int input1 = -10;
      int input2 = 10;
      String message = String.format("Ingresa %s número(s) entero entre el %s y el %s:", 1, input1, input2);
      System.out.println(message);

      // : When
      int actual = IOConsoleBasic.getAnInteger();
      System.out.println(actual);

      // : Then
      if ((actual >= input1) & (actual <= input2)) {
         assertTrue(true);
      } else {
         fail();
      }
   }

   @Test
   void getAnIntegerThrowsExceptionTest3() {
      // : Given
      Exception expected = new InputMismatchException();

      // : When
      String message = String.format("Ingresa un NO numero entero (puede ser una letra, un decimal o un simbolo):");
      System.out.println(message);

      // : Then
      assertThrows(expected.getClass(), IOConsoleBasic::getAnInteger);
   }


   @Test
   void sum() {
      // : Given
      String message = String.format("Ingresa %s números en diferentes líneas para que el resultado sea %s:", "2", "10");
      System.out.println(message);
      int expected = 10;

      // : When
      int actual = IOConsoleBasic.sumTwoNumbers();

      // : Then
      assertEquals(expected, actual);
   }
}
