package cn.maiaimei.example;

import org.junit.jupiter.api.Test;

public class WildcardsTest extends AbstractTest {

  @Test
  void test_asterisk_fuzzy_matching() {
    doTest("/wildcards/asterisk-fuzzy-matching.json");
  }

  @Test
  void test_asterisk_ampersand() {
    doTest("/wildcards/asterisk-ampersand.json");
  }

  @Test
  void test_rhs_ampersand() {
    doTest("/wildcards/rhs-ampersand.json");
  }

  @Test
  void test_lhs_ampersand() {
    doTest("/wildcards/lhs-ampersand.json");
  }

  @Test
  void test_asterisk_dollar() {
    doTest("/wildcards/asterisk-dollar.json");
  }

  @Test
  void test_1() {
    doTest("/wildcards/1.json");
  }

  @Test
  void test_2() {
    doTest("/wildcards/2.json");
  }

  @Test
  void test_3() {
    doTest("/wildcards/3.json");
  }

  @Test
  void test_4() {
    doTest("/wildcards/4.json");
  }
}
