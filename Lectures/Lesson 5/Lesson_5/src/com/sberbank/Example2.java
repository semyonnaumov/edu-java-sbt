package com.sberbank;

import java.util.*;

public class Example2 {
    List<Number> integers = new ArrayList<Number>();
    List<Number> numbers = integers;

    numbers.add(10);
}
