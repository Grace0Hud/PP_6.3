import java.util.Scanner;
public class countingInts
{
    public static void main(String [] args)
    {
       String[] maxTen = new String[20];
       int tenCount = 0;
       String[] maxTwenty = new String[20];
       int twentyCount = 0;
       String[] maxThirty = new String[20];
       int thirtyCount = 0;
       String[] maxFourty= new String[20];
       int fourtyCount = 0;
       String[] maxFifty = new String[20];
       int fiftyCount = 0;
        int num = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your string of numbers (1,50): ");
        while(num > -1 && num < 51)
        {
            num = scan.nextInt();
            if(num > -1 && num < 11)
                tenCount++;
            if(num > 10 && num < 21)
                twentyCount++;
            if(num > 20 && num < 31)
                thirtyCount++;
            if(num > 30 && num < 41)
                fourtyCount++;
            if(num > 40 && num < 51)
                fiftyCount++;
        }//end of while loop
        //cycles through all arrays, organizing information
        for(int i = 0; i < tenCount; i++)
            maxTen[i] = "*";
        for(int i = 0; i < twentyCount; i++)
            maxTwenty[i] = "*";
        for(int i = 0; i < thirtyCount; i++)
            maxThirty[i] = "*";
        for(int i = 0; i < fourtyCount; i++)
            maxFourty[i] = "*";
        for(int i = 0; i < fiftyCount; i++)
            maxFifty[i] = "*";
        //prints out info
        System.out.print("0-10\t|\t");
        for(int i = 0; i < tenCount; i++)
            System.out.print(maxTen[i]);
        System.out.print("\n11-20\t|\t");
        for(int i = 0; i < twentyCount; i++)
            System.out.print(maxTwenty[i]);
        System.out.print("\n21-30\t|\t");
        for(int i = 0; i < thirtyCount; i++)
            System.out.print(maxThirty[i]);
        System.out.print("\n31-40\t|\t");
        for(int i = 0; i < fourtyCount; i++)
            System.out.print(maxFourty[i]);
        System.out.print("\n41-50\t|\t");
        for(int i = 0; i < fiftyCount; i++)
            System.out.print(maxFifty[i]);

    }//end of main method
}//end of countingInts
