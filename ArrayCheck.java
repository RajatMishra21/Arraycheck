import java.util.Scanner;

public class ArrayCheck {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int f=0;
        int[] arr = new int[s.nextInt()];

        for(int i=0;i< arr.length;i++)
            arr[i]=s.nextInt();

        for(int a: arr)
            if(a!=1 && a!=4) {
                f = 1;
                break;
            }
        System.out.println(f!=1);



    }
}
