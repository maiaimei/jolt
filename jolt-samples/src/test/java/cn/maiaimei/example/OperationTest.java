package cn.maiaimei.example;

import com.bazaarvoice.jolt.chainr.spec.ChainrEntry;
import org.junit.jupiter.api.Test;

/**
 * {@link ChainrEntry}
 */
public class OperationTest extends AbstractTest {

  @Test
  void test_shift() {
    doTest("/operation/shift.json");
  }

  @Test
  void test_default() {
    doTest("/operation/default.json");
  }

  @Test
  void test_modify_default_beta() {
    doTest("/operation/modify-default-beta.json");
  }

  @Test
  void test_modify_overwrite_beta() {
    doTest("/operation/modify-overwrite-beta.json");
  }

  @Test
  void test_remove() {
    doTest("/operation/remove.json");
  }

  @Test
  void test_sort() {
    doTest("/operation/sort.json");
  }
}
