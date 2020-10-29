@SimpleAnnotation(attribute = "klasa")
public class MyClass {
	
	@SimpleAnnotation(attribute = "pole")
	public int field;
	
	@SimpleAnnotation(attribute = "metoda")
	public void myMethod() {
		System.out.println("FOO");
	}
}