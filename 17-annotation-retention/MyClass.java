@SimpleAnnotation
public class MyClass {
	
	// @SimpleAnnotation("pole", first = "Pawel") - compilation error
	@SimpleAnnotation(value = "pole", first = "Pawel")
	private int field;
	
	@SimpleAnnotation(second = 7)
	public void myMethod() {
		System.out.println("FOO");
	}
}