package cn.maiaimei.example;

import org.junit.jupiter.api.Test;

public class ModifierTest extends AbstractTest {

  @Test
  void test_split() {
    doTest("/modifier/split.json");
  }

  @Test
  void test_leftPad() {
    doTest("/modifier/leftPad.json");
  }
}
