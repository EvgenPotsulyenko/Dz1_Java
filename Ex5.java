import java.util.Scanner;

public class Ex5 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
       
        System.out.print("Введите число в диапазоне от 1 до 12: ");
        int first = in.nextInt();
        
        if(first == 1 || first == 2 ||first == 12)
        {
            System.out.println("Winter");          
        }
        if(first == 3 || first == 4 ||first == 5)
        {
            System.out.println("Spring");          
        }
        if(first == 6 || first == 7 ||first == 8)
        {
            System.out.println("Summer");          
        }
        if(first == 9 || first == 10 ||first == 11)
        {
            System.out.println("Autumn");          
        }
        else if(first < 1 || first > 12)
        {
            System.out.println("Ошибка, введите число в диапазоне от 1 до 12");
        }
        in.close();
    }
}
