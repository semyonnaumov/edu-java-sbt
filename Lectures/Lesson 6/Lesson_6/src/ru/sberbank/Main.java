package ru.sberbank;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {
        Converter<String> converter = new ToStringConverter();
        String s = converter.converter(
                asList(new Child(), new Child())
        );
        System.out.println(s);
    }
}


/*
* <root-child>
*     <child> //classname
*         <id>10<id> //filename
*         <name>Child1</name>
*     </child>
*     <child> //classname
*         <id>10<id> //filename
*         <name>Child1</name>
*     </child>
* </root-child>
*
* */