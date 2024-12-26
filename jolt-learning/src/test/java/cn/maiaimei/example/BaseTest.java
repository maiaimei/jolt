package cn.maiaimei.example;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;
import java.util.Map;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Assertions;

@Slf4j
public abstract class BaseTest {

  protected void doTransform(String pathname) {
    Map<String, Object> testUnit = JsonUtils.classpathToMap(pathname);
    Object input = testUnit.get("input");
    Object spec = testUnit.get("spec");
    Object expected = testUnit.get("expected");

    log.info("Before transform: {}", JsonUtils.toJsonString(input));
    Chainr chainr = Chainr.fromSpec(spec);
    Object output = chainr.transform(input);
    log.info("After transform: {}", JsonUtils.toJsonString(output));

    Assertions.assertEquals(JsonUtils.toJsonString(expected), JsonUtils.toJsonString(output));
  }
}
