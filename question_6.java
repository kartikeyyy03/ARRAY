import java.util.Scanner;
public class question_6 {
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

        System.out.println("Enter the target number");

        int B=sc.nextInt();

        for(int i=0;i<N;i++){
            int j=i+1;
            while(j<N){
                if(array[i]+array[j]==B&&i!=j){
                    System.out.println(1);
                }
                j++;
                break;

                
            }
            
        }
        
        
    }
}
                


                    


               

