import java.util.Scanner;

public class Ex4 
{
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);

       
        System.out.print("Введите шестизначное число: ");
        int first = in.nextInt();
        
        if(first > 100000)
        {
            first -=  110011;
            System.out.println(first);
            in.close();  
        }
        else
        {
            System.out.println("Ошибка, введите шестизначное число");
        }
    }
}
