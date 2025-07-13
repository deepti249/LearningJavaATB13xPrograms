package Task_7July;
/*
2. Bank Interest Calculation
Description: Abstract class Bank with abstract method getInterestRate(). Classes SBI and HDFC implement it.
🔶 Expected Output:
SBI Interest Rate: 6.5%
HDFC Interest Rate: 7.0%
 */

public class Lab_2_BankInterestCalculation {

    public static void main(String[] args)
    {
        Bank sbi = new SBI();
        sbi.getInterestRate();

        Bank hdfc = new HDFC();
        hdfc.getInterestRate();

    }
}

abstract class Bank
{
    abstract void getInterestRate();
}

class SBI extends Bank
{

    @Override
    void getInterestRate()
    {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}
class HDFC extends Bank
{

    @Override
    void getInterestRate()
    {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}
