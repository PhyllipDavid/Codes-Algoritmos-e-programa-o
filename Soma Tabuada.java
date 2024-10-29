import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int N1 = 1, N2 = 10, soma = 0;

    System.out.print("Insira um número: ");
    int A = scanner.nextInt();

    while(N1 <= N2){
      System.out.println(A + "x" + N1 + "=" + N1*A);
      N1++;
    }
  }
}
