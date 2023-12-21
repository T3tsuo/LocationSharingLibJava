public class Main {

    public static void main(String[] args) {
        CookieReader reader = new CookieReader("cookies.txt");
        reader.run();
        System.out.println(reader.getPeoples());
    }
}



