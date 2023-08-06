public class Main {

    public static void main(String[] args) {
        String code = "H";

        String contactInfo = code.equals("H") ? "Y" : code.equals("O") ? "Y" : "N";
        System.out.println(contactInfo);
    }
}
