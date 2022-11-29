public class Human {
    public String name;
    public String town;
    public int yearOfBirth;
    public String jobTitle;

    public Human(String name, String town, int yearOfBirth, String jobTitle) {
        if (name.length() == 0) {
            //System.out.println("Информация не указана!"); // выводил null если не указано имя.
            this.name = "Имя не указано!"; // выводит сообщение если не указано имя.
        } else {
            this.name = name;
        }

        if (town.length() == 0) {
            //System.out.println("Информация не указана!");
            this.town = "Город не указан!";
        }else {
            this.town = town;
        }


        if (yearOfBirth >= 0) {
            this.yearOfBirth = yearOfBirth;
        } else {
            this.yearOfBirth = Math.abs(yearOfBirth);
        }

        if (jobTitle.length() == 0) {
            //System.out.println("Информация не указана!");
            this.jobTitle = "Должность не указана!";
        } else {
            this.jobTitle = jobTitle;
        }
    }

    void info() {
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------");
        System.out.println("Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(-ась) " + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!");
        System.out.println("--------------------------------------------------------------------------------------------------------------------------------------------------------------\n");
    }

    //-------------С методом toString---------------
    @Override
    public String toString() {
        return "Привет! Меня зовут " + name + ". Я из города " + town + ". Я родился(-ась)" + yearOfBirth + " году. Я работаю на должности " + jobTitle + ". Будем знакомы!\n" ;
    }
}




