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
        int lastData = 0;
        if (arr.length > 0) {
            lastData = arr[arr.length - 1];
        }
        return lastData;
    }

    public void clear() {
        int arrTemp[] = {};
        arr = arrTemp;

    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    public boolean contains(int num) {
        Boolean b = false;
        for (int i = 0; i < arr.length; i++) {
            if (num == arr[i]) {
                b = true;
                break;
            }
        }
        return b;
    }

    public int size() {
        return (arr.length);
    }


}
