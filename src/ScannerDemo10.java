import java.util.Scanner;

public class ScannerDemo10 {
    public static void main(String[] args) {

        String password="pass123";
        System.out.println(password.equals("pass123"));
        if (password.equals("pass123")){
            System.out.println("wrong password");


            boolean isRaining=true;
            if (!isRaining){
                System.out.println("lets go for a walk");
            }else {
                System.out.println("stay in");
            }
        }

    }
}
