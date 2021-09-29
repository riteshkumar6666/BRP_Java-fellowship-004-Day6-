//BRP-Java Fellowship 004(DAY6 PROGRAM)
// the sum of cos(x) series
import java.lang.Math.*;

public class Cos
{
    static final double PI = 3.142;

    static double cosXSeriesSum(double x, int n)
    {
        // h x is in degree.
        //  convert  to radian
        //  using  series formula,
        // series expansion angle is in radian

        x = x * (PI / 180.0);

        double res = 1;
        double sign = 1, fact = 1, pow = 1;

        for (int i = 1; i < 5; i++)
        {
            sign = sign * -1;
            fact = fact * (2 * i - 1) * (2 * i);
            pow = pow * x * x;
            res = res + sign * pow / fact;
        }

        return res;
    }

    public static void main(String[] args)
    {
        float x = 500;
        int n = 5;
        System.out.println((float)(
                cosXSeriesSum(x, 5) * 1000000) / 1000000.00);
    }
}



