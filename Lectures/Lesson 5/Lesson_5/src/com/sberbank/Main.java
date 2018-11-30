package com.sberbank;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Usual:
        List list = new ArrayList();
        list.add(1212);
        list.add("asdasd");
        Object o = list.get(1);
        String s = (String) o;
        getList();


        // Generics:
        List<String> strList = new ArrayList<String>();
        // Also possible
        List<String> strList1 = new ArrayList();

        List<Number> =


    }

    private static List<String> getList() {
        List<String> list = new ArrayList<> ();
        list.add("asasdasd");
        list.add("a");
        list.add("as");
        return list;
    }

    public static<T> void addInMiddle(List<T> list, T o){
        list.add(list.size()/2, o);
    }

    // Ограничение на параметр
    static<T extends Number> void func(List<T> list){
        long v = list.get(0).longValue();
        System.out.println(v * v);
    }

    // Или так
    static void func1(List<? extends Number> list){
        // Можно добавить только null! Ничего другого класть нельзя, можем только читать
        list.add(null);
        long v = list.get(0).longValue();
        System.out.println(v * v);
    }

    // Чтобы передавать лист Number и всех его предков
    // Добавлять в этот лист мы можем Number и всех всех предков
    // Присваивать можем Number и его потомков
    static<T> void addInMiddle2(List<? super Number> list) {
        long time = System.currentTimeMillis();
        list.add(list.size()/2, time);
    }

}
