package Question_4;
import java.util.Scanner;
//    *****
//    **
//    *
//    **
//    *****
public class Pattern4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = (n-1)/2, count1 = 0;
        for (int i = 0; i < n; i++){
            for(int j=0;j<n;j++){
                if((i>0 && j<=count && i<=(n-1)/2) || (i<n-1 && j<=count1 && i>=(n-1)/2) || i==0 || i==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            count--;
            //count++;
            if(i>=(n-1)/2){
                count1++;
            }
            System.out.println();
        }
    }
}
