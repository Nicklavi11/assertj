package org.assertj.core.api;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class NumberRangeTest {
  // typical case
  @Test
  void testTypicalNumber(){
    int number = 50;

    assertThat(number).isBetween(1, 100);
  }

  // min
  @Test
  void testMinNumber(){
    int number = 1;

    assertThat(number).isBetween(1, 100);
  }

  // min + 1
  @Test
  void testMinPlusOneNumber(){
    int number = 2;

    assertThat(number).isBetween(1, 100);
  }

  // max
  @Test
  void testMaxNumber(){
    int number = 100;

    assertThat(number).isBetween(1, 100);
  }

  // max - 1
  @Test
  void testMaxMinusOneNumber(){
    int number = 99;

    assertThat(number).isBetween(1, 100);
  }
}
