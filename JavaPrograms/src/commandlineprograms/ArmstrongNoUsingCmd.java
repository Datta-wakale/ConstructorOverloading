package commandlineprograms;
public class ArmstrongNoUsingCmd {
    public static void main(String[] args) {

        int num = Integer.parseInt(args[0]);
        int original = num;
        int digits = 0, temp = num;
        while (temp > 0) {
            digits++;
            temp /= 10;
        }

        temp = num;
        int sum = 0;
        while (temp > 0) {
            int digit = temp % 10;

            int power = 1;
            for (int i = 0; i < digits; i++) {   
                power *= digit;
            }

            sum += power;
            temp /= 10;
        }
        if (sum == original)
            System.out.println(original + " is an Armstrong number");
        else
            System.out.println(original + " is NOT an Armstrong number");
    }
}
