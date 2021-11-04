public class App {
    public static void main(String[] args) throws Exception {
        Product rice = new Product();
        rice.code = 111111;
        rice.name = "rice";
        rice.data = "12-01-2021";

        System.out.println(rice.toString());
    }
}
