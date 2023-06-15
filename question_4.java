
import java.util.Scanner;


public class question_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    System.out.println("Enter the length of array");
    int N=sc.nextInt();
    int[] array=new int[N];

    System.out.println("Enter the elements of array");
    for(int i=0;i<N;i++){
        int element=sc.nextInt();
        array[i]=element;
    }

    for(int i=0;i<N;i++){
        if(array[i]%2!=0){                 // to print the odd elements.
            System.out.print(array[i]+" ");   
        }
    }
    System.out.println();  //to change the line after printing the odd elements.

    for(int i=0;i<N;i++){

        if(array[i]%2==0){      //to print the even elements
            System.out.print(array[i]+" ");
        }
    }

        


    
        
    
    }
    

}
