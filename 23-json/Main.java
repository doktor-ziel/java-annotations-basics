import java.lang.annotation.*;
import java.lang.reflect.*;

public class Main {

    public static String serializeToJSON(Object o) throws IllegalAccessException {
        Class<?> clazz = o.getClass();
        if (!clazz.isAnnotationPresent(JSONObject.class)) {
            throw new IllegalArgumentException("Not supported class");
        }
        Field[] fields = clazz.getDeclaredFields();

        StringBuilder result = new StringBuilder("{");
        result.append(System.lineSeparator());

        for (Field f : fields) {
            Annotation a = f.getAnnotation(JSONField.class);
            if (a != null) {
                JSONField jf = (JSONField) a;
                String fieldName = f.getName();
                if (!jf.value().isBlank()) {
                    fieldName = jf.value();
                }
                f.setAccessible(true);
                Object value = f.get(o);
                result.append(String.format("'%s' : '%s'", fieldName, value.toString())).append(System.lineSeparator());
            }
        }
        result.append("}");
        return result.toString();
    }

    public static void main(String[] args) throws IllegalAccessException {
        Student s = new Student("Doktor", "Ziel", "Zielony Backlog 13", 44, 1.56);

        System.out.println(serializeToJSON(s));
    }
}
