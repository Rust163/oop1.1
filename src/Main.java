public class Main {
    public static void main(String[] args) {
        Human maxim = new Human("Максим", "Минск", 1988, "бренд-менеджер");
        Human anna = new Human("Аня", "Москва", 1993, "методист образовательных программ");
        Human kate = new Human("Катя", "Калининград", -1992, "продукт-менеджер");
        Human artem = new Human("", "Москва", 1995, "директор по развитию бизнеса");

        maxim.info();
        anna.info();
        kate.info();
        artem.info();

        //--------------С методом toString---------------------
        System.out.println(maxim.toString());
        System.out.println(anna.toString());
        System.out.println(kate.toString());
        System.out.println(artem.toString());


    }
}





