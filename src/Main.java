public class Main {

    public static void main(String[] args) {
        CookieReader reader = new CookieReader("src/cookies.txt");
        reader.run();
        System.out.println(reader.getPeoples());
    }
}



