import java.util.Scanner;

public class IsLeapYear
{
    public static void main(String[] args)
    {
        int year;
        boolean isLeapYear=false;

        System.out.println("Enter a year:");

        Scanner number=new Scanner(System.in);
        year=number.nextInt();

        if (year%4==0)
        {
            if (year%100==0)
            {
                if (year%400==0)
                {
                    isLeapYear=true;
                }
            }
            else
            {
                isLeapYear=true;
            }
        }

        if (isLeapYear)
        {
            System.out.println(year+" is a leap year");
        }
        else
        {
            System.out.println(year+" is not a leap year");
        }

    }
}
