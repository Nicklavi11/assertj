package org.assertj.core.api;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Disabled;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringValidationTest {
  // Equivalence class: Valid Strings
  @Test
  public void shouldPassForValidString() {
    // These tests are expected to pass
    assertThat("Hello").isNotBlank();
    assertThat("Hello World!").isNotBlank();
    assertThat("12345").isNotBlank();
    assertThat("!!!").isNotBlank();
  }

  // Equivalence class: Empty Strings
  @Disabled // remove to test if the build fails
  @Test
  public void shouldFailForEmptyString() {
    // This test is expected to fail
    assertThatThrownBy(() -> assertThat("").isNotBlank())
      .isInstanceOf(AssertionError.class)
      .hasMessageContaining("blank");
  }

  // Equivalence class: Whitespace Strings
  @Disabled // remove to test if the build fails
  @Test
  public void shouldFailForWhitespaceString() {
    // This test is expected to fail
    assertThat("       ").isNotBlank();
  }

  // Equivalence class: Null Strings
  @Disabled // remove to test if the build fails
  @Test
  public void shouldFailForNullString() {
    // This test is expected to fail
    String nullString = null;
    assertThat(nullString).isNotBlank();
  }
}
