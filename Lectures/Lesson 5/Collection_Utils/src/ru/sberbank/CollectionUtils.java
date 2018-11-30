package ru.sberbank;

import java.util.*;

public class CollectionUtils {
    //         Person extends Comparable<Person>
    //         JavaPerson extends Comparable<Person>
    public static<T extends  Comparable<T>> T max(List<T> list){
        T max = list.get(0);
        for ( T current : list) {
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }

    // Правильно!
    public static<T extends  Comparable<? super T>> T max2(List<T> list){
        T max = list.get(0);
        for ( T current : list) {
            if (current.compareTo(max) > 0) {
                max = current;
            }
        }
        return max;
    }

    public static<T> T max3(List<T> list, Comparator<T> comparator){
        T max = list.get(0);
        for ( T current : list) {
            if (comparator.compare(current, max) > 0) {
                max = current;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        List<Comparable> comparables = List.of("2", 4);
        max(comparables);

        List<Integer> integers = List.of()
    }
}
