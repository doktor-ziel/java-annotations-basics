import java.lang.annotation.*;
import java.lang.reflect.*;

public class Main {
	
	private static void printClassMetadata(Class<?> clazz) {
		System.out.println("Klasa: " + clazz.getName());
		Annotation[] annotations = clazz.getAnnotations();
		
		for (Annotation a: annotations) {
			System.out.println("    adnotacja: " + a.annotationType().getName());
		}
	}
	
	public static void main(String[] args) {
		printClassMetadata(SuperClass.class);
		printClassMetadata(SubClass.class);
		
	}
}