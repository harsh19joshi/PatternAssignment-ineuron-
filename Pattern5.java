package Question_5;
import java.util.Scanner;
/*
*   *****
*   ** **
*   *   *
*   ***** */
public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count=(n-1)/2,count1=(n-1)/2;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if((i>0 && j<(n-1)/2 && j<=count) || (i>0 && j>(n-1)/2 && j>=count1) || i==0 || i==n-1 || j==0 || j==n-1){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            count--;
            count1++;

            System.out.println();
        }
    }
}
