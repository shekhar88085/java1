package Agrima_Project;

public class Discount
{
    public static void main(double cost)throws Exception
    {
        int discount=0;
        if(cost<=2000)
            discount=5;
        else if(cost<=5000)
            discount=25;
        else if(cost<=10000)
            discount=35;
        else
            discount=50;
        System.out.println("The cost to be paid by the customer after availing the discount of "+discount+"% is Rs. "+(cost*(100-discount)/100)+".");
    }
}
