package org.assertj.core.util;

import org.junit.jupiter.api.Test;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ListsTest {
  // No elements in list, tests to make sure it returns an empty list
  @Test
  void testNewEmptyList() {
    List<String> emptyList = Lists.newArrayList();

    // Checks if list is not null
    assertNotNull(emptyList);
    // List should be true if it is empty
    assertTrue(emptyList.isEmpty());
  }

  // Single element list test, makes sure list knows the size and the value of the element
  @Test
  void testSingleElementList() {
    List<Integer> singleElementList = Lists.newArrayList(15);
    // Tests the size of the list
    assertEquals(1, singleElementList.size());
    // Tests the value of the element in the list
    assertEquals(15, singleElementList.get(0));
  }

  // Multiple element list test, makes sure list knows the size and the values of each element
  @Test
  void testMultipleElementsList() {
    List<String> multipleElementsList = Lists.newArrayList("a", "b", "c");
    // Tests the size of the list
    assertEquals(3, multipleElementsList.size());
    // Tests the values of each element in the list
    assertEquals("a", multipleElementsList.get(0));
    assertEquals("b", multipleElementsList.get(1));
    assertEquals("c", multipleElementsList.get(2));
  }
}
