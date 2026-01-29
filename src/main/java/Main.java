import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    LengthEncoder le1 = new LengthEncoder("wwwwaaadexxxxxx");
    LengthEncoder le2 = new LengthEncoder("aaaabbbccc");
    LengthEncoder le3 = new LengthEncoder("abbbcdddd");
    LengthEncoder le4 = new LengthEncoder("aabcccaazzzz");

    System.out.println("Pre-Tests:");
    System.out.println(le1.encode());
    System.out.println(le2.encode());
    System.out.println(le3.encode());
    System.out.println(le4.encode());

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your test:");
    LengthEncoder le5 = new LengthEncoder(sc.nextLine());

    System.out.println(le5.encode());

  }
}
