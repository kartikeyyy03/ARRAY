import java.rmi.server.SocketSecurityException;
import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class question_1 {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the size of array");
        int N=sc.nextInt();

        int[] array=new int[N];

        System.out.println("Enter the elements of the array");
        for(int i=0;i<N;i++){
            int element=sc.nextInt();
            array[i]=element;
        }

        System.out.println("Enter the integer");

        int target=sc.nextInt();

        for(int i=0;i<N;i++){

            if(array[i]==target){
                System.out.print(1);
                break;
            }

            
            


        }

        
        

        
    }
    
}
