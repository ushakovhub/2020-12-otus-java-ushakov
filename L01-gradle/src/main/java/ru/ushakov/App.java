package ru.ushakov;

import java.util.ArrayList;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i = 1; i <=100; i++){
            list.add(i);
        }
        System.out.println(list.size());

    }
}
