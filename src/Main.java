public class Main {
    public static void main(String[] args) {
        char ch1 = 'h';
        char ch2 = 'i';
        char ch3 = 'b';

        System.out.println(decode(ch1) + " " + decode(ch2) + " " + decode(ch3));
    }

    public static String decode(char ch) {
        String x;
        switch (ch) {

            case 'h':
                x = "Hello!";
                break;
            case 'i', 'm', 'k':
                x = "I can decode!";
                break;
            case 'b':
                x = "Bye!";
                break;
            default:
                x = "I don't know these symbols :(";
        }
        return x;
    }
}