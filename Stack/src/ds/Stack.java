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
        arrTemp[arrTemp.length-1] = num;
        arr=arrTemp;

    }

    public void pop() {


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
        return false;
    }


}
