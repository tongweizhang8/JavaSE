import java.lang.annotation.*;

import java.lang.annotation.*;

import static java.lang.annotation.ElementType.*;

/**
 * @author shkstart
 * @create 2019 上午 11:56
 */
@Inherited
@Retention(RetentionPolicy.RUNTIME)
@Target({TYPE, FIELD, METHOD, PARAMETER, CONSTRUCTOR, LOCAL_VARIABLE,TYPE_PARAMETER,TYPE_USE})
public @interface MyAnnotation {

    String value() default "hello";
}
