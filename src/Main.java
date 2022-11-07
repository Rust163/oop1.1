public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", 1988, "бренд-менеджером");
        Human anna = new Human("Аня", "Москва", 1993, "методистом образовательных программ");
        Human kate = new Human("Катя", "Калининград", 1992, "продакт-менеджером");
        Human artem = new Human("Артем", "Москва", 1995, "директором по развитию бизнеса");

        maxim.info();
        anna.info();
        kate.info();
        artem.info();

        //--------------С методом toString---------------------
        /*System.out.println(maxim.toString());
        System.out.println(anna.toString());
        System.out.println(kate.toString());
        System.out.println(artem.toString());
*/


    }
}