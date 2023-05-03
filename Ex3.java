import java.util.Scanner;

public class Ex3 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        int first = in.nextInt();

        System.out.print("Введите 2 число: ");
        int second = in.nextInt();

        System.out.print("Введите 3 число: ");
        int fird = in.nextInt();

        int multi = first * 100;
        multi += second * 10;
        multi += fird;
        
        System.out.println(multi);
        in.close();
    }
}
