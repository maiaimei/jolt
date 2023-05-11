package cn.maiaimei.example;

import com.bazaarvoice.jolt.Chainr;
import com.bazaarvoice.jolt.JsonUtils;
import org.junit.jupiter.api.Test;

import java.util.List;

public class JoltTest {

    @Test
    void test01() {
        doTest("/spec-02.json", "/input-01.json");  // * &
    }

    @Test
    void test02() {
        doTest("/spec-04.json", "/input-02.json");  // * &
    }

    @Test
    void test03() {
        doTest("/spec-01.json", "/input-01.json");  // * $
    }

    @Test
    void test04() {
        doTest("/spec-03.json", "/input-01.json");  // * $ &
    }

    @Test
    void test05() {
        doTest("/spec-05.json", "/input-03.json");  // * $ @
    }

    @Test
    void test06() {
        doTest("/spec-06.json", "/input-04.json");  // * $ @
    }

    @Test
    void test07() {
        doTest("/spec-07.json", "/input-05.json");  // * @
    }

    void doTest(String chainrSpecJSONPath, String inputJSONPath) {
        List<Object> chainrSpecJSON = JsonUtils.classpathToList(chainrSpecJSONPath);
        Chainr chainr = Chainr.fromSpec(chainrSpecJSON);

        Object inputJSON = JsonUtils.classpathToObject(inputJSONPath);

        Object transformedOutput = chainr.transform(inputJSON);
        System.out.println(JsonUtils.toJsonString(inputJSON));
        System.out.println(JsonUtils.toJsonString(transformedOutput));
        System.out.println("--------------------------------------------------------------------------------");
    }
}
