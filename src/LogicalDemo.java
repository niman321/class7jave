import java.util.Scanner;

public class LogicalDemo {
    public static void main(String[] args) {


        Scanner scan=new Scanner(System.in);
        String day=scan.next();

        if (day.equalsIgnoreCase("monday")||day.equalsIgnoreCase("friday")){
            System.out.println("no class today");
        } else if (day.equalsIgnoreCase("saturday")|| day.equalsIgnoreCase("sunday")) {
            System.out.println("we java class");
        } else if (day.equalsIgnoreCase("wednesday")|| day.equalsIgnoreCase("tuseday")) {
            System.out.println("manual testing class");
        } else if (day.equalsIgnoreCase("thursday")) {
            System.out.println("review class");
        } else {
            System.out.println("wrong day");

        }


    }
}
