import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@interface SimpleAnnotations {
    SimpleAnnotation[] value();
}