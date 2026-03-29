package basic.annotations.Example3;

import java.lang.annotation.Repeatable;

@Repeatable(Categories.class)
@interface Category {

    String name();
}
