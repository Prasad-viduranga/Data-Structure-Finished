package ds;

import java.util.Arrays;

public class Queue {

    int data;
    int arr[] = {};

    public void enqueue(int num) {
        int arrTemp[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arrTemp[i] = arr[i];
        }
        arrTemp[arr.length] = num;

    }

    public void dequeue() {

    }

    public boolean empty() {
        return true;
    }

    public int peek() {
        return 0;
    }

    public void clear() {

    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    public boolean contains(int num) {
        return true;
    }

    public int size() {
        return 0;
    }


}
