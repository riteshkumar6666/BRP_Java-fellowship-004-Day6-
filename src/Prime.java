//BRP-Java Fellowship 004(DAY6 PROGRAM)

public class Prime {
    public static void main(String[] args) {

        System.out.println("prime number between 1 to 100");

        for (int no = 1; no <= 100; no++)
        {
            int temp = 0;

            for (int i = 2; i <= no - 1; i++)
            {
                if (no % i == 0)
                {
                    temp = temp + 1;
                }
            }
            if (temp == 0) {

                System.out.println(no);
            }
        }
    }
}






