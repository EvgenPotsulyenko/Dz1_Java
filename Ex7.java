import java.util.Scanner;

public class Ex7
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое число: ");
        int first = in.nextInt();

        System.out.print("Введите второе число: ");
        int second = in.nextInt();

        System.out.print("Нечётные числа");
        if(first > second)
        {
            for(int i = second; i < first;i++)
            {
                if (i % 2 != 0)
                {
                    System.out.print(" " + i );
                }
            }
        }
        if(first < second)
        {
            for(int i = first; i < second;i++)
            {
                if (i % 2 != 0)
                {
                    System.out.print(" " + i );
                }
            }
        }

        in.close();
    }
}