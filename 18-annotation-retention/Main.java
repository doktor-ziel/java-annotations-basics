import java.lang.annotation.*;
import java.lang.reflect.*;

public class Main {
	public static void main(String [] args) {
		Class<?> clazz = MyClass.class;
		// or:
		// MyClass object = new MyClass();
		// Class<?> clazz = object.getClass();
		
		System.out.println("Nazwa klasy: " + clazz.getName());
		Field[] fields = clazz.getDeclaredFields();
		
		for (Field f: fields) {
			System.out.println("Pole:");
			System.out.println("    nazwa: " + f.getName());
			System.out.println("    typ: " + f.getType());
			
			Annotation[] annotations = f.getAnnotations();
			for (Annotation a: annotations) {
				System.out.println("    adnotacja: " + a.annotationType().getName());
				if (a.annotationType() == SimpleAnnotation.class) {
					SimpleAnnotation sa = (SimpleAnnotation) a;
					System.out.println("        value: " + sa.value());
					System.out.println("        first: " + sa.first());
					System.out.println("        second:  " + sa.second());
				}
			}
		}
		
	}
}