package cn.maiaimei.example;

import org.junit.jupiter.api.Test;

public class ArrayJoltTest extends BaseTest {

  @Test
  void test_simple_array() {
    doTransform("/array/simple-array.json");
  }

  /**
   * TODO: test_anonymous_array
   */
  @Test
  void test_anonymous_array() {
    doTransform("/array/anonymous-array.json");
  }

  @Test
  void test_nested_array() {
    doTransform("/array/nested-array.json");
  }

  @Test
  void test_declaredOutputArray() {
    doTransform("/array/declaredOutputArray.json");
  }
}
