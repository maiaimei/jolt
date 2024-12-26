package cn.maiaimei.example;

import org.junit.jupiter.api.Test;

public class ShiftJoltTest extends AbstractJoltTest {

  @Test
  void test_shift_simple_object() {
    doTest("/operation/shift_simple_object.json");
  }

  @Test
  void test_shift_object2array() {
    doTest("/operation/shift_object2array.json");
  }

}
