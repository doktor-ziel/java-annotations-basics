import java.lang.annotation.*;

public class Main {
	public static void main(String [] args) {
		Class<Foo> clazz = Foo.class;
		for (Annotation a : clazz.getAnnotations()) {
			System.out.println(a.annotationType().getName());
		}
	}
}