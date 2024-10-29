import java.util.Scanner;
public class Main{
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o número: ");
    int N = scanner.nextInt();

    if(N == 0){
      System.out.println("O número é zero");
    } 
    else if(N > 0){
      System.out.println("O número é positivo");
    }
    else{
      System.out.println("O número é negativo");
    }
  }
}
