import java.util.Scanner;

public class ConvertToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number: ");
        int number = sc.nextInt();
        MyStack stack = new MyStack(10);
        while (number!=0){
            int d = number%2;
            stack.push(d);
            number/=2;
        }
        for (int i=0; i<stack.size(); i++){
            System.out.print(stack.pop());
        }
    }
}
