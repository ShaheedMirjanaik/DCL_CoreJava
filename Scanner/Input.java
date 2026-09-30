
import java.util.Scanner;


class Input{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter the value: ");
        // String a = sc.nextLine();
        // char c = a.charAt(1);
        // System.out.write(c);

        /*
         * nextLine() - It acceots the input until a \n kubeus detected ut getd teminated at any pony where it detects
         * a \n(nextLine)
         * 
         * To reslove this kind of scenarios er need to invoke one more nextLine() before to consume the \n and let
         *  the other nextLine acceot the input data.
         */

        System.out.println("Enter the employye details");
        System.out.println("Enter the name");
        String name = sc.nextLine();
        System.out.println("Enter the salary");
        double salary = sc.nextDouble();
        System.out.println("Enter the Desc");
        sc.nextLine();
        String job = sc.nextLine();
        System.out.println(name);
        System.out.println(job);
        System.out.println(salary);
        sc.close();
    }
}