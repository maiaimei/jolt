package cn.maiaimei.example;

import com.bazaarvoice.jolt.chainr.spec.ChainrEntry;
import org.junit.jupiter.api.Test;

/**
 * {@link ChainrEntry}
 */
public class OperationJoltTest extends BaseTest {

  /**
   * default：功能类似 modify-default-beta ，两者有什么区别？
   */
  @Test
  void test_default() {
    doTransform("/operations/default.json");
  }

  /**
   * modify-overwrite-beta：创建缺少的键/索引，如果键/索引存在则覆盖该值。
   */
  @Test
  void test_modify_overwrite_beta() {
    doTransform("/operations/modify-overwrite-beta.json");
  }

  /**
   * modify-default-beta：创建缺少的键/索引，如果键/索引的值为null则覆盖该值。
   */
  @Test
  void test_modify_default_beta() {
    doTransform("/operations/modify-default-beta.json");
  }

  /**
   * modify-define-beta：创建缺少的键/索引
   */
  @Test
  void test_modify_define_beta() {
    doTransform("/operations/modify-define-beta.json");
  }

  @Test
  void test_remove() {
    doTransform("/operations/remove.json");
  }

  @Test
  void test_sort() {
    doTransform("/operations/sort.json");
  }
}
