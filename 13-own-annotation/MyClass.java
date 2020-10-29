@SimpleAnnotation("klasa")
public class MyClass {
	
	@SimpleAnnotation("pole")
	public int field;
	
	@SimpleAnnotation(value = "metoda")
	public void myMethod() {
		System.out.println("FOO");
	}
}