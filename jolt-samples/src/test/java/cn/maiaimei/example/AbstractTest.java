package cn.maiaimei.example;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;
import java.util.List;
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

  protected void doTest(String chainrSpecJSONPath, String inputJSONPath) {
    List<Object> chainrSpecJSON = JsonUtils.classpathToList(chainrSpecJSONPath);
    Chainr chainr = Chainr.fromSpec(chainrSpecJSON);

    Object inputJSON = JsonUtils.classpathToObject(inputJSONPath);

    Object transformedOutput = chainr.transform(inputJSON);
    System.out.println(JsonUtils.toJsonString(inputJSON));
    System.out.println(JsonUtils.toJsonString(transformedOutput));
  }
}
