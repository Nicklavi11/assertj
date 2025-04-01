package org.assertj.core.util;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringEmptyOrNullTest {
  @Test
  void returnTrueIfStringIsNull() {
    // setup
    String input = null;

    // test
    boolean result = Strings.isNullOrEmpty(input);

    //verify
    assertTrue(result);
  }

  @Test
  void returnTrueIfStringIsEmpty() {
    // setup
    String input = "";

    // test
    boolean result = Strings.isNullOrEmpty(input);

    // verify
    assertTrue(result);
  }

  @Test
  void returnFalseIfStringIsNotEmpty() {
    // setup
    String input = "Hello World!";

    // test
    boolean result = Strings.isNullOrEmpty(input);

    // verify
    assertFalse(result);
  }
}
