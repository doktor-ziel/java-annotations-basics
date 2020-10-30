import java.lang.annotation.*;

@Repeatable(SimpleAnnotations.class)
@Retention(RetentionPolicy.RUNTIME)
@interface SimpleAnnotation {
    String value() default "";
}