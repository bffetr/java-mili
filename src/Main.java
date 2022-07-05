public class Main {
    public static void main(String[] args) {


        int rubTicket = 100_000;
        int rub = 20;

        int mili = rubTicket / rub;

        if (mili >= 1) {

            System.out.println("Колличество миллей:" + mili);
        }


    }
}

