import java.util.Arrays;
import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        while(a>0){
            int n = sc.nextInt();
            int [] array = new int[n];
            for (int i=0;i<n;i++){
                array[i]=sc.nextInt();
            }
            int count =0,f=0,z=0;
            int key= sc.nextInt();
            for (int i=0;i<n;i++){
                z++;
                if(array[i]==key){
                    f=1;
                    count= array[i];
                    break;
                }
            }
            if (f ==1){
                System.out.println("Present" + " " + count);
                System.out.println("No of tries : "+ " "+ z);
            }
            else{
                System.out.println("Not Present"+ " " + count);
                System.out.println("Total No Of Comparison : "+ " "+ z);
            }
            a--;
        }
    }
}
