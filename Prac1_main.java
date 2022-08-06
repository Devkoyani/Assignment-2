import java.util.Scanner;

public class Prac1_main {

        public static void main(String[] args) {
            Scanner obj=new Scanner(System.in);
            double ra=obj.nextDouble();
            circle c=new circle();
            circle d=new circle(ra);
            double n=d.getarea();
            double m=d.getperimeter();
            System.out.println(n);
            System.out.println(m);
        }
    }