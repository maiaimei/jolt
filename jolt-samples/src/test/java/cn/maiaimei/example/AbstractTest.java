package cn.maiaimei.example;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;
import java.util.Map;

public abstract class AbstractTest {

  protected void doTest(String pathname) {
    Map<String, Object> testUnit = JsonUtils.classpathToMap(pathname);
    Object input = testUnit.get("input");
    Object spec = testUnit.get("spec");

    System.out.println(JsonUtils.toJsonString(input));

    Chainr chainr = Chainr.fromSpec(spec);
    Object output = chainr.transform(input);
    System.out.println(JsonUtils.toJsonString(output));
  }
}
