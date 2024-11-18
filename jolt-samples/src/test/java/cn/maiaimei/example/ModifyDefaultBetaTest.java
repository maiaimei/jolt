package cn.maiaimei.example;

import org.junit.jupiter.api.Test;

/**
 * modify-default-beta 修改-默认，当左手边不存在或是为空的时候进行转换。
 * <p>
 * 左手边
 * <p>
 * 不存在：即没有该属性
 * <p>
 * 空：null，不包括空串
 */
public class ModifyDefaultBetaTest extends AbstractTest {

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

  @Test
  void test_array_04() {
    doTest("/modify-default-beta/array-04.json");
  }

}
