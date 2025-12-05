import java.util.Scanner;
public class Main {
      public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        double []a = new double[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextDouble();
        }
        int min=n;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(Math.abs(a[i]-a[j]) < 1e-9 && i!=j){
                    if(Math.abs(i-j)<min)min=Math.abs(i-j);
                }
            }
        }
        if(min==n) System.out.println("NO");
        else System.out.println(min);
    }
}
