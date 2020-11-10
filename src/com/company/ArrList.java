package com.company;

import java.util.Arrays;

public class ArrList {
    private int[] body;
    private int last_id, size;

    public ArrList() {
        size = 20;
        body = new int[size];
        last_id = 0;
    }

    public void add(int element) {
        if (last_id == size) {
            size += 20;
            body = Arrays.copyOf(body, size);
        }
        body[last_id] = element;
        last_id++;
    }

    public void print(int element_id) {
        if (element_id >= last_id || element_id < 0) {
            System.out.println("Array index out of bounds");
        } else  {
            System.out.println(body[element_id]);
        }
    }

    public void show() {
        if (last_id == 0) {
            System.out.println("Array is empty");
        }
        else {
            for (int i = 0; i < last_id; i++) {
                System.out.print(body[i] + " ");
            }
            System.out.println();
        }
    }
    public Integer get(int element_id) {
        if (element_id >= last_id || element_id < 0) {
            System.out.println("Array index out of bounds");
            return null;
        } else {
            return body[element_id];
        }
    }

    public void remove(int element_id) {
        if (element_id >= last_id || element_id < 0) {
            System.out.println("Array index out of bounds");
        } else {
            size--;
            int[] new_body = new int[size];
            int iterator = 0;
            for (int i = 0; i < last_id; i++) {
                if (i != element_id) {
                    new_body[iterator] = body[i];
                    iterator++;
                }
            }
            body = new_body;
            last_id--;
        }
    }

    public void clear() {
        size = 20;
        body = new int[size];
        last_id = 0;
    }

    public int size() {
        return last_id;
    }
}
