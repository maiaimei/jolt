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

```json
[
    {
        "operation": "shift",
        "spec": {
        }
    }
]

```

## Wildcards

LHS，Left Hand Side， input JSON keys

RHS，Right Hand Side， output data path

### '\*' Wildcard

Valid only on the LHS ( input JSON keys ) side of a Shiftr Spec.

用在LHS侧

匹配输入JSON的key，忽略已经被精准匹配过的key。

可以单独使用，也可以用于匹配键的一部分。单独使用时，输入JSON的键值必须具有相同的格式。

### '&' Wildcard

Valid on the LHS (left hand side - input JSON keys) and RHS (output data path).

**用在RHS侧？**

取输入JSON的key

&0=&，当前层级

&1，向上1级

&2，向上2级

```json
{
	"foo": {
		"bar": {
			"baz": "&0 = baz, &1 = bar, &2 = foo"
		}
	}
}
```

### '$' Wildcard

Valid only on the LHS of the spec.

用在LHS侧

取输入JSON的key

$0=$，当前层级

$1，向上1级

$2，向上2级

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

### '@' Wildcard

Valid on both sides of the spec.

The basic '@' on the LHS.

This wildcard is necessary if you want to put both the input value and the input key somewhere in the output JSON.

```json
[
    {
        "operation": "shift",
        "spec": {
            // match all input JSON keys 
            "*": {
                // copy the key of the data at this level in the tree, to the output
                "$": "place.to.put.key",
                // copy the value of the data at this level in the tree, to the output
                "@": "place.to.put.value"
            }
        }
    }
]
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
