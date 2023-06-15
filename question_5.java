import java.util.Scanner;

public class question_5 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the length of array");
        int N=sc.nextInt();

        int[] nums=new int[N];

        System.out.println("enter the elements of the array");

        for(int i=0;i<N;i++){
            int element=sc.nextInt();
            nums[i]=element;

        }

        System.out.println("How many times do you want to rotate the array? ");
        int k=sc.nextInt();

        int[] a = new int[N];
        for (int i = 0; i < N; i++) {
            a[(i + k) % N] = nums[i];
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
            System.out.print(nums[i]+" ");
        }

    }
}
