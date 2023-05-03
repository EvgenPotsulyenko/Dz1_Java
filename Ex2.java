import java.util.Scanner;

public class Ex2 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите число: ");
        float handred = in.nextFloat();

        System.out.print("Введите процент: ");
        float prosent = in.nextFloat();

        float one = handred / 100;
        handred = one * prosent;

        System.out.println(handred);
        in.close();
    }
}
