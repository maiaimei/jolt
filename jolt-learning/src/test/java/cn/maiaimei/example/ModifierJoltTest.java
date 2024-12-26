package cn.maiaimei.example;

import com.bazaarvoice.jolt.Modifier;
import com.bazaarvoice.jolt.chainr.spec.ChainrEntry;
import org.junit.jupiter.api.Test;

/**
 * see {@link ChainrEntry} and {@link Modifier}
 */
public class ModifierJoltTest extends BaseTest {

  @Test
  void test_isPresent() {
    doTransform("/modifier/isPresent.json");
  }

  @Test
  void test_isNull() {
    doTransform("/modifier/isNull.json");
    System.out.println("--------------------");
    doTransform("/modifier/isNull2.json");
  }

  @Test
  void test_notNull() {
    doTransform("/modifier/notNull.json");
  }

  @Test
  void test_split_date() {
    // "9/15/2023" -> ["9","15","2023"]
    doTransform("/modifier/split-date.json");
  }

  @Test
  void test_format_date() {
    // "9/2/2023" -> "09/02/2023"
    doTransform("/modifier/format-date.json");
  }
}
