package org.assertj.core.api;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.*;

public class ConditionTest {

  @Test
  void returnTrueWhenConditionIsMet() {
    Condition<String> mockCondition = mock(Condition.class);
    when(mockCondition.matches("hello")).thenReturn(true);

    boolean result = mockCondition.matches("hello");

    assertThat(result).isTrue();

    verify(mockCondition).matches("hello");
  }

  @Test
  void returnFalseWhenConditionIsNotMet() {
    Condition<String> mockCondition = mock(Condition.class);
    when(mockCondition.matches("fail")).thenReturn(false);

    boolean result = mockCondition.matches("fail");

    assertThat(result).isFalse();

    verify(mockCondition).matches("fail");
  }
}
