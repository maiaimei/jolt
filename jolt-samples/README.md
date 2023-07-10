```java
public class ChainrEntry {
    public static final Map<String, String> STOCK_TRANSFORMS;

    static {
        HashMap<String, String> temp = new HashMap<>();
        temp.put( "shift", Shiftr.class.getName() );
        temp.put( "default", Defaultr.class.getName() );
        temp.put( "modify-overwrite-beta", Modifier.Overwritr.class.getName() );
        temp.put( "modify-default-beta", Modifier.Defaultr.class.getName() );
        temp.put( "modify-define-beta", Modifier.Definr.class.getName() );
        temp.put( "remove", Removr.class.getName() );
        temp.put( "sort", Sortr.class.getName() );
        temp.put( "cardinality", CardinalityTransform.class.getName() );
        STOCK_TRANSFORMS = Collections.unmodifiableMap( temp );
    }
}
```

# shift

copy data from the input tree and put it the output tree

## Wildcards

LHS，Left Hand Side， input JSON keys

RHS，Right Hand Side， output data path

### '\*' Wildcard

仅在LHS侧有效。

用于匹配输入JSON的键。

可以单独使用，在单独使用时，输入JSON的键值必须具有相同的格式。忽略已经被精准匹配的键。

可以模糊匹配，如：`foo-*`匹配`foo-a`,`foo-b`等等。

### '&' Wildcard

'&' 通配符有两个参数`&(0,1)`，第一个参数表示从当前层级回溯多少级去寻找输入JSON的键，第二个参数表示取第几个匹配到的结果（0表示取整体，1表示取第一个匹配结果，2表示取第二个匹配结果），第二个参数可省略，'&' = '&0' = '&(0)' = '&(0,0)'。

### '$' Wildcard

Valid only on the LHS of the spec. Copy the input JSON "key" as the data to be output.

仅在LHS侧有效。

用于获取输入JSON的键，作为输出JSON的值，'$' = '$0' = '$(0)' = '$(0,0)'。

### '@' Wildcard

Valid on both sides of the spec.

This wildcard is necessary if you want to put both the input value and the input key somewhere in the output JSON.

### '#' Wildcard

Valid both on the LHS and RHS, but has different behavior / format on either side.

On the RHS of the spec, # is only valid in the the context of an array, like "[#2]".

### '|' Wildcard

Valid only on the LHS of the spec.

This 'or' wildcard allows you to match multiple input keys.

```json
{
	// match "rating" or "Rating" copy the data to "rating-primary" 
	"rating|Rating" : "rating-primary"
}
```

# default

apply default values to the tree

```json
[
    {
        "operation": "default",
        "spec": {
        }
    }
]
```

# modify-default-beta

修改-默认，当左手边不存在或是为空的时候进行转换。

```json
[
    {
        "operation": "modify-default-beta",
        "spec": {
        }
    }
]
```

# modify-overwrite-beta

修改-覆盖，保留老数据，如果值相同会更新

```json
[
    {
        "operation": "modify-overwrite-beta",
        "spec": {
        }
    }
]
```

# remove

remove data from the tree

```
[
    {
        "operation": "remove",
        "spec": {
        }
    }
]
```

# sort

sort the Map key values alphabetically ( for debugging and human readability )

# cardinality

"fix" the cardinality of input data.  Eg, the "urls" element is usually a List, but if there is only one, then it is a String
