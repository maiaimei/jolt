package cn.maiaimei.example;

import org.junit.jupiter.api.Test;

public class WildcardsJoltTest extends BaseTest {

  @Test
  void test_dollar() {
    doTransform("/wildcards/dollar.json");
  }

  @Test
  void test_at() {
    doTransform("/wildcards/at.json");
  }

  @Test
  void test_dollar_at() {
    doTransform("/wildcards/dollar_at.json");
  }

  @Test
  void test_dollar_at_02() {
    doTransform("/wildcards/dollar_at_02.json");
  }

  @Test
  void test_dollar_at_03() {
    doTransform("/wildcards/dollar_at_03.json");
  }

  @Test
  void test_dollar_at_04() {
    // TODO: test_dollar_at_04, 是否可以配置spec满足expected输出？
    doTransform("/wildcards/dollar_at_04.json");
  }

  @Test
  void test_asterisk_fuzzy_matching() {
    doTransform("/wildcards/asterisk_fuzzy_matching.json");
  }

  @Test
  void test_asterisk_ampersand_01() {
    doTransform("/wildcards/asterisk_ampersand_01.json");
  }

  @Test
  void test_asterisk_ampersand_02() {
    doTransform("/wildcards/asterisk_ampersand_02.json");
  }

  @Test
  void test_asterisk_dollar() {
    doTransform("/wildcards/asterisk_dollar.json");
  }

  @Test
  void test_dollar_ampersand() {
    doTransform("/wildcards/dollar_ampersand.json");
  }

  @Test
  void test_asterisk_dollar_at() {
    doTransform("/wildcards/asterisk_dollar_at.json");
  }

  @Test
  void test_advanced_at() {
    doTransform("/wildcards/advanced_at.json");
  }

  @Test
  void test_hash() {
    doTransform("/wildcards/hash.json");
  }
}
