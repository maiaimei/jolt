package cn.maiaimei.example;

import org.junit.jupiter.api.Test;

public class WildcardsTest extends AbstractTest {

  @Test
  void test_dollar() {
    doTest("/wildcards/dollar.json");
  }

  @Test
  void test_at() {
    doTest("/wildcards/at.json");
  }

  @Test
  void test_dollar_at() {
    doTest("/wildcards/dollar_at.json");
  }

  @Test
  void test_dollar_at_02() {
    doTest("/wildcards/dollar_at_02.json");
  }

  @Test
  void test_dollar_at_03() {
    doTest("/wildcards/dollar_at_03.json");
  }

  @Test
  void test_dollar_at_04() {
    // TODO: test_dollar_at_04, 是否可以配置spec满足expected输出？
    doTest("/wildcards/dollar_at_04.json");
  }

  @Test
  void test_asterisk_fuzzy_matching() {
    doTest("/wildcards/asterisk-fuzzy-matching.json");
  }

  @Test
  void test_asterisk_ampersand_01() {
    doTest("/wildcards/asterisk-ampersand_01.json");
  }

  @Test
  void test_asterisk_ampersand_02() {
    doTest("/wildcards/asterisk-ampersand_02.json");
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
