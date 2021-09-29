////BRP-Java Fellowship 004(DAY6 PROGRAM)
import java.util.Random;
public class RollDie {
    public static void main(String[] args) {

        Random dice=new Random();

       int  number=1 + dice.nextInt(6);

        System.out.println(number +"");

    }
}
