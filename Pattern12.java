import java.util.Scanner;

public class Pattern12
{
    public static void main(String[] args)
    {
      
        Scanner scanner = new Scanner(System.in);

      
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        
        
        for (int i = rows; i >= 1; i--)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 2; i <= rows; i++)
        {
            for (int j = i; j >= 1; j--)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        scanner.close();
    }
}