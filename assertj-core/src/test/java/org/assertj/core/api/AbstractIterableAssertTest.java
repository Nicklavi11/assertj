package org.assertj.core.api;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.Assertions.*;

public class AbstractIterableAssertTest {

  @Test
  void shouldFilterListBasedOnCondition() {
    // Setup
    List<String> names = List.of("Adam", "Bob", "Chandler");

    // Test
    ListAssert<String> result = assertThat(names).filteredOn(name -> name.startsWith("A"));

    // Verify
    result.containsExactly("Adam");
  }

  @Test
  void shouldNotContainNullElements() {
    // Setup
    List<String> names = List.of("Adam", "Bob", "Chandler");

    // Test and Verify
    assertThat(names).doesNotContainNull();
  }

}
