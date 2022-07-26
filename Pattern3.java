package Question_3;
import java.util.Scanner;
//    *        *
//    **      **
//    ***    ***
//    ****  ****
//    **********
public class Pattern3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int count1=0,count2=m-1;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if((j<=(m-1)/2 && j<=count1) || (j>=(m-1)/2 && j>=count2)){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            count1++;
            count2--;
            System.out.println();
        }
    }
}
