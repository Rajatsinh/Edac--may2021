import java.util.Scanner;

public class Pattern15
{
    public static void main(String[] args)
    {
        
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the number of rows needed to print the pattern ");

        int rows = scanner.nextInt();
        System.out.println(" Print the pattern");
        
        
        for (int i=1; i<=rows; i++)
        {
            for (int j=1; j<=i; j++)
            {
                if( j == 1 || j == i || i == rows)
                    System.out.print("*");
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}