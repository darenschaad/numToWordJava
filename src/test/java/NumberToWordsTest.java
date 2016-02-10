import org.junit.*;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;

public class NumberToWordsTest {

  @Test
  public void convert_forUserInput1_returnOne() {
    NumberToWords inNum = new NumberToWords();
    assertEquals("One", inNum.convert(1));
  }

  @Test
  public void convert_forUserInput11_returnEleven() {
    NumberToWords inNum = new NumberToWords();
    assertEquals("Eleven", inNum.convert(11));
  }
  @Test
  public void convert_forUserInput67_returnSixty_Seven() {
    NumberToWords inNum = new NumberToWords();
    assertEquals("Sixty Seven", inNum.convert(67));
  }
  @Test
  public void convert_forUserInput80_returnEighty() {
    NumberToWords inNum = new NumberToWords();
    assertEquals("Eighty", inNum.convert(80));
  }
  @Test
  public void convert_forUserInput300_returnThree_Hundred() {
    NumberToWords inNum = new NumberToWords();
    assertEquals("Three Hundred", inNum.convert(300));
  }
  // @Test
  // public void convert_forUserInput334_returnThree_Hundred_Thirty_Four() {
  //   NumberToWords inNum = new NumberToWords();
  //   assertEquals("Three Hundred Thirty Four", inNum.convert(334));
  // }

}
