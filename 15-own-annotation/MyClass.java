@SimpleAnnotation
public class MyClass {
	
	@SimpleAnnotation("pole")
	public int field;
	
	@SimpleAnnotation(value = {"metoda", "bez", "argumentu"})
	public void myMethod() {
		System.out.println("FOO");
	}
}