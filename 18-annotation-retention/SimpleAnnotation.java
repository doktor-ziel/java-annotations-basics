import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface SimpleAnnotation {
	String value() default "";
	String first() default "";
	int second() default 0;
}