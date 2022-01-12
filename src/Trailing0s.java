import java.util.Scanner;
public class Trailing0s {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int f=1,c=0;
        for (int i=1; i<=n; i++) {
            f*=i;
        }
        while(f%10==0) {
            c++;
            f=f/10;
        }
        System.out.println(c);
    }
}
