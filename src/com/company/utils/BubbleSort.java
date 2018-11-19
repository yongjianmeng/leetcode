package com.company.utils;

public class BubbleSort {

    public static void bubbleSort(Comparable[] items) {
        Comparable temp;
        boolean sorted = false;
        for (int i = 0; i < items.length; i++) {
            for (int j = 1; j < items.length - i; j++) {
                if (items[j].compareTo(items[j - 1]) < 0) {
                    temp = items[j];
                    items[j] = items[j - 1];
                    items[j - 1] = temp;
                    sorted = true;
                }
            }
            if (!sorted) {
                return;
            }
        }
    }

    public static void main(String[] args) {
        Integer[] items = new Integer[] { 2,3,4,5,6,7,6,5,4,3 };
        bubbleSort(items);
        for(int i = 0; i < items.length; i++) {
            System.out.println(items[i] + "");
        }
    }

}
