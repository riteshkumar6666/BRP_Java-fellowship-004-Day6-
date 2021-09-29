//BRP-Java Fellowship 004(DAY6 PROGRAM)
//palindrome number between 1 to 100
public class Repeat {
    public static void main(String args[]) {

        int no = 100;
        int temp = no;
        int rev = 0, rem;
        for (no = 1; no <= 100; no++) {
            while (temp != 0) {
                rem = temp % 10;
                rev = rev * 10 + rem;
                temp = temp / 10;
            }
            if (no == rev) {
                System.out.println(no + "is a palindrome");
            } else {
                System.out.println(no + "is not a palindrome");
            }
        }
    }
}






