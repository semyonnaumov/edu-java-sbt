import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BeanUtils {

    /**
     * Scans object "from" for all getters. If object "to"
     * contains correspondent setter, it will invoke it
     * to set property value for "to" which equals to the property
     * of "from".
     * <p/>
     * The type in setter should be compatible to the value returned
     * by getter (if not, no invocation performed).
     * Compatible means that parameter type in setter should
     * be the same or be superclass of the return type of the getter.
     * <p/>
     * The method takes care only about public methods.
     *
     * @param to Object which properties will be set.
     * @param from Object which properties will be used to get values.
     */
    public static void assign(Object to, Object from) throws InvocationTargetException, IllegalAccessException {
        Class<?> toClazz = to.getClass();
        Class<?> fromClazz = from.getClass();
        List<Method> getters = getMethodWithPrefix(fromClazz, "get");
        List<Method> setters = getMethodWithPrefix(toClazz, "set");

        Map<Method, Method> correspondences = findCorrespondences(getters, setters);
        for (Map.Entry<Method, Method> entry : correspondences.entrySet()) {
            Method getter = entry.getKey();
            Method setter = entry.getValue();
            setter.invoke(to, getter.invoke(from));
        }
    }

    private static List<Method> getMethodWithPrefix(Class<?> clazz, String prefix){
        Method[] methods = clazz.getMethods();
        List<Method> getters = new ArrayList<>();
        for (Method method : methods) {
            if (method.getName().startsWith(prefix)) {
                getters.add(method);
            }
        }
        return getters;
    }

    private static Map<Method, Method> findCorrespondences(List<Method> getters, List<Method> setters) {
        Map<Method, Method> result = new HashMap<>();
        for (Method getter : getters) {
            String getterName = getter.getName().substring(3, getter.getName().length());
            for (Method setter : setters) {
                String setterName = setter.getName().substring(3, setter.getName().length());

                if (getterName.equals(setterName) &&
                        getter.getReturnType().equals(
                                setter.getParameterTypes().length == 0 ? null : setter.getParameterTypes()[0])) {
                    result.put(getter, setter);
                }
            }
        }
        return result;
    }
}