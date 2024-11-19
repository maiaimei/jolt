package cn.maiaimei.example;

import org.junit.jupiter.api.Test;

/**
 * modify-default-beta 修改-默认，当左手边不存在（没有该属性）或是为空（null，不包括空串）的时候进行转换。
 */
public class ModifyDefaultBetaJoltTest extends AbstractJoltTest {

  /**
   * modify-default-beta 修改-默认，当左手边不存在的时候设置默认值。
   */
  @Test
  void test_object_01() {
    doTest("/modify-default-beta/object-01.json");
  }

  /**
   * modify-default-beta 修改-默认，当左手边为空（null）的时候设置默认值。
   */
  @Test
  void test_object_02() {
    doTest("/modify-default-beta/object-02.json");
  }

  /**
   * modify-default-beta 修改-默认，当左手边为空串（""）的时候原样输出。
   */
  @Test
  void test_object_03() {
    doTest("/modify-default-beta/object-03.json");
  }

  /**
   * modify-default-beta 修改-默认，当左手边不存在的时候设置默认值。
   */
  @Test
  void test_array_01() {
    doTest("/modify-default-beta/array-01.json");
  }

  /**
   * modify-default-beta 修改-默认，当左手边为空（null）的时候设置默认值。
   */
  @Test
  void test_array_02() {
    doTest("/modify-default-beta/array-02.json");
  }

  /**
   * modify-default-beta 修改-默认，当左手边为空串（""）的时候原样输出。
   */
  @Test
  void test_array_03() {
    doTest("/modify-default-beta/array-03.json");
  }

}
