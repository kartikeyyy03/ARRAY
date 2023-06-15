import java.util.Scanner;
import java.util.*;



public class question_3 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the size of array ");
        int N=sc.nextInt();
        int[] array=new int[N];

       System.out.println("Enter the array elements");

       for(int i=0;i<N;i++){
       int element=sc.nextInt();
       array[i]=element;

    } 

    int[] Odd=new int[N];
    int[] Even=new int[N];

    for(int i=0;i<N;i++){
        if(array[i]%2==0){
            Even[i]=array[i];

        }
        else{Odd[i]=array[i];}

        
    }
    int MinimumOdd=0;

    Arrays.sort(Even);
    int MaximumEven=Even[N-1];



    
    Arrays.sort(Odd);

    for(int i=0;i<N;i++){

        if(Odd[i]!=0){
          MinimumOdd+=Odd[i];
            break;
        }
    }

    System.out.println(MaximumEven-MinimumOdd);
    
    
    
    
    
    

    
    




}
}


       
    

    
    

    
    
    

    

    
    

// 
