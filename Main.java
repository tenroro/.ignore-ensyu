import java.util.Scanner;
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("g’·‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢(m):");
        double height = scanner.nextDouble();
        System.out.print("‘Ìd‚ğ“ü—Í‚µ‚Ä‚­‚¾‚³‚¢(kg):");
        double weight = scanner.nextDouble();
        double bmi = weight / (height * height);
        double a = ((double)Math.round(bmi * 100))/100;
        System.out.print("bmi:"+a);
    }
}
