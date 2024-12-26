# JOLT 快速入门

## 基本概念

LHS，Left Hand Side， input JSON keys

RHS，Right Hand Side， output data path

## 转换方法

```java
public class ChainrEntry {

  public static final Map<String, String> STOCK_TRANSFORMS;

  static {
    HashMap<String, String> temp = new HashMap<>();
    temp.put("shift", Shiftr.class.getName());
    temp.put("default", Defaultr.class.getName());
    temp.put("modify-overwrite-beta", Modifier.Overwritr.class.getName());
    temp.put("modify-default-beta", Modifier.Defaultr.class.getName());
    temp.put("modify-define-beta", Modifier.Definr.class.getName());
    temp.put("remove", Removr.class.getName());
    temp.put("sort", Sortr.class.getName());
    temp.put("cardinality", CardinalityTransform.class.getName());
    STOCK_TRANSFORMS = Collections.unmodifiableMap(temp);
  }
}
```

| 转换方法              | 说明                                                         |
| --------------------- | ------------------------------------------------------------ |
| shift                 | copy data from the input tree and put it the output tree<br />拷贝，将输入json的某个结构拷贝到目标json |
| default               | apply default values to the tree<br />设置默认值，如果输入json某个value不存在，则使用默认值补齐 |
| modify-default-beta   | 修改-默认，当左手边不存在（没有该属性）或是为空（null，不包括空串）的时候进行转换。 |
| modify-overwrite-beta | 修改-覆盖，保留老数据，如果值相同会更新                      |
| remove                | remove data from the tree<br />删除，可以删除输入json结构的某个结构 |
| sort                  | sort the Map key values alphabetically ( for debugging and human readability )<br />对key值进行排序 |
| cardinality           | "fix" the cardinality of input data. Eg, the "urls" element is usually a List, but if there is only one, then it is a String<br />jsonobject和jsonarray之间的切换 |

使用语法：

```
[
  {
    "operation": "转换方法",
    "spec": {
    }
  }
]
```

## 通配符

| 通配符 | 说明                                                         |
| ------ | ------------------------------------------------------------ |
| \*     | 仅在LHS侧有效。<br />用于匹配输入JSON的键。<br />可以单独使用。<br />在单独使用时，输入JSON的键值必须具有相同的格式。<br />在单独使用时，忽略已经被精准匹配的键。<br />可以模糊匹配，如：`foo-*`匹配`foo-a`,`foo-b`等等。 |
| &      | Valid on the LHS (left hand side - input JSON keys) and RHS (output data path)<br />两侧均有效。<br />'&' 通配符有两个参数`&(0,1)`<br/>第一个参数表示从当前层级回溯多少级去寻找输入JSON的键<br/>第二个参数表示取第几个匹配到的结果（0表示取整体，1表示取第一个匹配结果，2表示取第二个匹配结果）第二个参数可省略<br/>'&' = '&0' = '&(0)' = '&(0,0)'。 |
| $      | Valid only on the LHS of the spec. <br/>Copy the input JSON "key" as the data to be output.<br/>仅在LHS侧有效。<br/>用于获取输入JSON的键，作为输出JSON的值<br/>'$' = '$0' = '$(0)' = '$(0,0)' |
| @      | Valid on both sides of the spec.<br/>This wildcard is necessary if you want to put both the input value and the input key somewhere in the output JSON.<br />两侧均有效。 |
| #      | Valid both on the LHS and RHS, but has different behavior / format on either side.<br />On the RHS of the spec, # is only valid in the the context of an array, like "[#2]".<br />在LHS和RHS上都有效，但两侧的行为/格式不同。<br />在规范的RHS中，#仅在数组的上下文中有效，如“[#2]”。 |
| \|     | Valid only on the LHS of the spec.<br />This 'or' wildcard allows you to match multiple input keys.<br />仅在LHS侧有效。<br />此“\|”通配符允许您匹配多个输入键。 |

### '#' 通配符

```json
"hidden" : {
    // if the value of "hidden" is true
    "true": {
        // write the word "disabled" to the path "clients.clientId"
        "#disabled": "clients.clientId"
    }
}
```

### '|' 通配符

```json
{
  // match "rating" or "Rating" copy the data to "rating-primary" 
  "rating|Rating": "rating-primary"
}
```
