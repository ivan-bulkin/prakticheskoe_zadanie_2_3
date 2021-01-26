package part_02.prakticheskoe_zadanie_3;

public class MainTwo {

    public static void main(String[] args) {
        System.out.println("Практическое задание к уроку 3. Коллекции. Часть 2.");
        PhoneBook phonebook = new PhoneBook();
        phonebook.add("Иван", "11111111111");
        phonebook.add("Иван", "11111111111");//не вызывает исключения
        phonebook.add("Иван", "222222222222222");
        phonebook.add("Пётр", "3333");
//        phonebook.add("Пётр","4444");
        phonebook.add("Катя", "112");
        phonebook.add("Маша", "8-800");

        System.out.println("Иван: " + phonebook.get("Иван"));
//        phonebook.get("Иван");//это было для теста тут
        System.out.println("Катя: "+phonebook.get("Катя"));
    }
}
