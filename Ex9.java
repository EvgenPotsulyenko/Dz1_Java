import java.util.Arrays;

public class Ex9 
{
    public static void main(String[] args) 
    {
        int[] array = new int[] {1, 0, 5, 4, 8, 3};
        Arrays.sort(array);

        System.out.print("Максимальный елемнт массива: " + array[5] );
        System.out.print("Минимальный елемнт массива: " + array[0] );
    }  
}
