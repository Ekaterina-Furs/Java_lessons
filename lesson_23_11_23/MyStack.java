
public class MyStack {
    private int[] arr = new int[10];
    private int size = 0;

    public int size(){
        return size;
    }

    public boolean empty(){
        return size == 0;
    }

    public void push(int el){
        if (size >= arr.length){
            int[] arr2 = new int[arr.length * 2];
            System.arraycopy(arr, 0, arr2, 0, arr.length);
            arr = arr2;
        }
        arr[size++] = el;
    }

    public int peek(){
        return arr[size - 1];
    }

    public int pop(){
        return arr[--size];
    }
}