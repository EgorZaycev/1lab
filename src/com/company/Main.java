package com.company;

public class Main {

    public static void main(String[] args) {
        ArrList test = new ArrList();
        for (int i = 0; i < 10; i++) {
            test.add(i * 2);
        }
        for (int i = 0; i < test.size(); i++) {
            test.print(i);
        }
        test.remove(3);
        test.remove(6);
        test.remove(9);
        test.show();
        test.clear();
        System.out.println(test.get(0));
    }
}
