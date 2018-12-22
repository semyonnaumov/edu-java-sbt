import java.util.HashMap;
import java.util.Map;

public class CountMapImpl<E> implements CountMap<E> {
    private Map<E, Integer> container = new HashMap<>();

    @Override
    public void add(E object) {
        if (container.containsKey(object)) {
            int numberOfElements = container.get(object);
            container.put(object, numberOfElements + 1);
        } else {
            container.put(object, 1);
        }
    }

    @Override
    public int getCount(E object) {
        return container.getOrDefault(object, 0);
    }

    @Override
    public int remove(E object) {
        int count = getCount(object);
        container.remove(object);
        return count;
    }

    @Override
    public int size() {
        return container.size();
    }

    @Override
    public void addAll(CountMap<? extends E> source) {
        Map<? extends E, Integer> sourceMap = source.toMap();
        for (Map.Entry<? extends E, Integer> entry : sourceMap.entrySet()) {
            E key = entry.getKey();
            Integer value = entry.getValue();
            for (int i = 0; i < value; i++) {
                 this.add(key);
            }
        }
    }

    @Override
    public Map<E, Integer> toMap() {
        return container;
    }

    @Override
    public void toMap(Map<? super E, Integer> destination) {
        destination = container;
    }
}
