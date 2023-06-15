import java.util.Scanner;
import java.util.*;

public class question_2 {

    public static void main(String[] args) {
        
        
        Scanner sc=new Scanner(System.in);


         System.out.println("Enter the size of array");
         int N=sc.nextInt();

         int[] array=new int[N];


         System.out.println("enter the array elements");

         for(int i=0;i<N;i++ ){

            int element=sc.nextInt();

            array[i]=element;
         

            
        }
        
        Arrays.sort(array);

        System.out.println(array[N-2]);
        // if(N==1){System.out.println(-1);} //when there is no second largest element as there is only one element in the array
        // else{

        //     for(int i=N-2;i>=0;){
        //         if(array[i]==array[N-1]&&array[i-1]!=array[i]){System.out.println(array[i-1]);}
                
        //         break;

                
                
        //     }



            
        
        
        
        
        }
        


    }
    

