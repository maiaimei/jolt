package cn.maiaimei.example;

import org.junit.jupiter.api.Test;

public class ArrayTest extends AbstractTest {

  @Test
  void test_simple_array() {
    doTest("/array/simple-array.json");
  }

  /**
   * TODO: test_anonymous_array
   */
  @Test
  void test_anonymous_array() {
    doTest("/array/anonymous-array.json");
  }

  @Test
  void test_nested_array() {
    doTest("/array/nested-array.json");
  }

  @Test
  void test_declaredOutputArray() {
    doTest("/array/declaredOutputArray.json");
  }
}
