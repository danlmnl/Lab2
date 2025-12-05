import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
              Scanner in = new Scanner(System.in);
              int n = in.nextInt(), x, k1=0, k2=0;
              for (int i = 0; i < n; i++) {
                  x = in.nextInt();
                  if(Math.abs(x)%2==0)k1++;
                  else k2++;
              }
              if(Math.abs(k1-k2)<=1) System.out.println("YES");
              else System.out.println("NO");
          }
}
