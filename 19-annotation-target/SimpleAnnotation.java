import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.FIELD, ElementType.METHOD})
@interface SimpleAnnotation {
	String value() default "";
	String first() default "";
	int second() default 0;
}