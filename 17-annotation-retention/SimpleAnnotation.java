import java.lang.annotation.*;

@Retention(RetentionPolicy.SOURCE)
@interface SimpleAnnotation {
	String value() default "";
	String first() default "";
	int second() default 0;
}