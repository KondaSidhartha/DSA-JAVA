import java.util.Scanner;
import java.util.Stack;


public class hackerrank {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=null;
        Stack<String> st =new Stack<String>();
        int q=in.nextInt();
        for(int i=0;i<q;i++)
        {
            int t=in.nextInt();
            switch (t) {
                case 1 -> {
                    s = s+in.next();
                    st.push(s);
                }
                case 2 -> {
                    s=s.substring(0,s.length()-in.nextInt());
                    st.push(s);
                }
                case 3 -> {
                    System.out.println(s.charAt(in.nextInt()-1));
                }
                case 4 -> {
                    st.pop();
                    s = st.peek();
                }
            }
        }
    }
}
