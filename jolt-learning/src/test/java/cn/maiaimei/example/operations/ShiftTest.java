package cn.maiaimei.example.operations;

import cn.maiaimei.example.BaseTest;
import org.junit.jupiter.api.Test;

public class ShiftTest extends BaseTest {

  @Test
  void transform_flat_json() {
    doTransform("/operations/shift/flat_json.json");
  }

  @Test
  void transform_nested_json() {
    doTransform("/operations/shift/nested_json.json");
  }

}
