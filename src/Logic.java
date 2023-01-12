public class Logic {
    public static void main(String[] args) {


        String country="USA";
        switch (country.toLowerCase()){
            case "usa":
                System.out.println("burgers");
                break;
            case "italy":
                System.out.println("pasta");
                break;
            case "Afghanistan":
                System.out.println("kebab");
                break;
            default:
                System.out.println("wrong country");
        }
    }

}



