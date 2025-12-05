import java.util.Scanner;
public class Main {
    public static boolean pr(int n){
        if(n<2)return false;
        int j = 2;
        boolean f = true;
        while(j*j<=n && f){
            if(n%j==0)f=false;
            j++;
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while(n!=-1){
            boolean f = false;
            while(n>0){
                int j=2;
                while(j*j<=n){
                    if(n%j==0){
                        if(pr(j) && pr(n/j)){
                            System.out.print(n + " ");
                            f = true;
                            n = 0;
                        }
                    }
                    j++;
                }
                n--;
            }
            if(!f) System.out.print(-1 + " ");
            n = in.nextInt();
            }
    }
}
