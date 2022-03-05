import java.util.Scanner;

public class today {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n= in.nextInt();
        int same=n;
        if((n&1)==0)
        {
            int ans=0;
            while(n>0)
            {
                ans=ans+1;
                ans=ans<<2;
                n=n>>2;
            }
            System.out.println((same&ans)==0);
        }
        else
        {
            int ans=0;
            while(n>0)
            {
                ans=ans+2;
                ans=ans<<2;
                n=n>>2;
            }
            System.out.println((same&ans)==0);
        }
    }
}
