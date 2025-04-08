class encap
{
    private int number;
    private int amount;

    public int getNumber()
    {
        return number;
    }

    public void setNumber(int n)
    {
        number = n;
    }

    public int getAmount()
    {
        return amount;
    }

    public void setAmount(int a)
    {
        amount = a;
    }
}

public class encapsulate {
    public static void main(String a[])
    {
        encap cap = new encap();
        cap.setNumber(8);
        cap.setAmount(19);

        System.out.println(cap.getAmount() + " is the value of amount, while " + cap.getNumber() + " is the value of number.");
    }
}