@SimpleAnnotation
public class MyClass {
	
	@SimpleAnnotation(attribute = "pole")
	public int field;
	
	@SimpleAnnotation
	public void myMethod() {
		System.out.println("FOO");
	}
}