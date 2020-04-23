public class MyStack {
    private int size;
    private int index = 0;
    private int[] arr;
    public MyStack(){};
    public MyStack( int size){
        this.size = size;
        arr = new int[size];
    }
    public void isFull(){
        if(index == arr.length-1){
            int [] newArray = new int[arr.length*2];
            for (int i=0; i<arr.length; i++){
                newArray[i] = arr[i];
            }
            arr = newArray;
        }
    }
    public Boolean isEmpty(){
        if(size == 0) return true;
        else return false;
    }
    public void push(int data){
        isFull();
        arr[index] = data;
        index++;
    }
    public int pop(){
        if(isEmpty()) throw new StackOverflowError("Empty");
        else {
            return arr[--index];
        }
    }
    public int size(){
        return arr.length;
    }
}
