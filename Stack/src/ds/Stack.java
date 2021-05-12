package ds;

import java.util.Arrays;

public class Stack {
    int data = 0;
    int arr[] = {};

    public void push(int num) {
        int arrTemp[] = new int[arr.length + 1];
        for (int i = 0; i < arr.length; i++) {
            arrTemp[i] = arr[i];
        }
        arrTemp[arrTemp.length - 1] = num;
        arr = arrTemp;
    }

    public void pop() {
        int arrTemp[] = new int[arr.length - 1];
        for (int i = 0; i < arr.length - 1; i++) {
            arrTemp[i] = arr[i];
        }
        arr = arrTemp;
    }

    public boolean empty() {

        return (arr.length < 0);
    }

    public int peek() {

        return arr[arr.length - 1];
    }

    public void clear() {
        int arrTemp[] = {};
        arr = arrTemp;
    }

    public void print() {
        System.out.println(Arrays.toString(arr));
    }

    public boolean contains(int num) {
        return false;
    }


}
