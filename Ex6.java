import java.util.Scanner;

public class Ex6 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

       
        System.out.print("Введите число в метрах:");
        float first = in.nextFloat();

        System.out.print("Введите в какие единицы перевести(mm, mili, yard):");
        String ed = in.next();
        System.out.println(ed);

        if(ed.equals("mm"))
        {
            first *= 100;
            System.out.println(first + " mm");             
        }
        if(ed.equals("mili"))
        {
            first *= 0.000621371;
            System.out.println(first + " mili");             
        }
        if(ed.equals("yard"))
        {
            first *= 1.09361;
            System.out.println(first + " yard");             
        }
        in.close();
    }
}
