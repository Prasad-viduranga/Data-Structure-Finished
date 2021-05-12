package ds;

import java.util.Arrays;

public class Queue {

    int data;
    int arr[] = {};

    public void enqueue(int num) {
        int arrTemp[] = new int[arr.length + 1];
        for (int i = 0; i < arrTemp.length - 1; i++) {
            arrTemp[i] = arr[i];
        }
        arrTemp[arr.length] = num;
        arr = arrTemp;
    }

    public void dequeue() {
        int arrTemp[] = new int[arr.length - 1];
        for (int i = 0; i < arrTemp.length; i++) {
            arrTemp[i] = arr[i];
        }
        arr = arrTemp;
    }

    public boolean empty() {

        return (!(arr.length > 0));
    }

    public int peek() {

        return 0;
    }

    public void clear() {
        int arrTemp[] = {};
        arr = arrTemp;

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
