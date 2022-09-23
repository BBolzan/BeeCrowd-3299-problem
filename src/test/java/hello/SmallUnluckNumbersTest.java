package hello;
import static org.hamcrest.CoreMatchers.containsString;
import static org.junit.Assert.*;

import org.junit.Test;

public class SmallUnluckNumbersTest {
  private SmallUnluckNumbers SmallUnluckNumbers = new SmallUnluckNumbers();

  @Test
  public void smallUnluckNumbersTestSaysHello() {
      long numero = 13;
      assertEquals(numero+" es de Mala Suerte", SmallUnluckNumbers.contemNumero13(numero));
  }

}
