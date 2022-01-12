package advance;
import java.util.Scanner;
public class MaximumSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len[]=new int [2];

        for(int i=0;i<2;i++)
            len[i]=sc.nextInt();

        int a[]=new int[len[0]+1];
        int b[]=new int[len[1]+1];
        a[a.length-1]=0;
        b[b.length-1]=0;

        for(int i=0;i<a.length-1;i++)
            a[i]=sc.nextInt();

        for(int i=0;i<b.length-1;i++)
            b[i]=sc.nextInt();

        int sum1=0,sum2=0,temp=0;
        for(int i=0; i<a.length;i++){       //2 4 5 1 1
            if(a[i]==b[i]){                 //1 3 5 6 7
                if(sum1>sum2) {
                    temp += sum1 + a[i];
                    sum1=0;
                    sum2=0;
                }
                else {
                    temp += sum2 + a[i];
                    sum2=0;
                    sum1=0;
                }
            }
            else{
                sum1+=a[i];
                sum2+=b[i];
            }


        }
        System.out.println(temp);
    }
}
