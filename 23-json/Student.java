@JSONObject
public class Student {
    @JSONField("Imie")
    public String firstName;
    @JSONField("Nazwisko")
    public String lastName;
    public String address;
    @JSONField
    public int age;
    @JSONField
    public double height;

    public Student(String firstName, String lastName, String address, int age, double height) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.age = age;
        this.height = height;
    }
}
