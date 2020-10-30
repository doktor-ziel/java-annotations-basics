import java.lang.reflect.Field;

public class Main {

    public static String serializeToJSON(Object o) throws IllegalAccessException {
        Class<?> clazz = o.getClass();
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder result = new StringBuilder("{");
        result.append(System.lineSeparator());

        for (Field f : fields) {
            String fieldName = f.getName();
            f.setAccessible(true);
            Object value = f.get(o);
            result.append(String.format("'%s' : '%s'", fieldName, value.toString())).append(System.lineSeparator());
        }
        result.append("}");
        return result.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        Student s = new Student("Doktor", "Ziel", "Zielony Backlog 13", 44, 1.56);

        System.out.println(serializeToJSON(s));
    }
}
