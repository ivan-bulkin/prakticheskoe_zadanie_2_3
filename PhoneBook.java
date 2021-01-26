package part_02.prakticheskoe_zadanie_3;

import java.util.*;

//Класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров
public class PhoneBook {

    public static Map<String, List<String>> phonebook = new HashMap<>();//Создаём HashMap ТелефонныйСправочник, где к одной фамилии добавляем массив(List) телефонных номеров

    //добавлять записи в этот телефонный справочник
    public void add(String surname, String phoneNumber) {
        phonebook.computeIfPresent(surname, (sn, phone) -> {
            phone.add(phoneNumber);
            return phone;
        });
        phonebook.putIfAbsent(surname, new ArrayList<>(Collections.singletonList(phoneNumber)));//это за меня сделала Java - подставила Collections.singletonList, когдая я ввёл только phoneNumber
        //пока было просто Collections.singletonList(phoneNumber)), то при добавлении второго имени телефона к имени возникало исключение
        //добавление ArrayList<>( решило эту явную проблему
        //putIfAbsent должно быть после computeIfPresent, иначе телефонный номер будет добавлен дважды
    }

    //искать номер телефона по фамилии
    public List<String> get(String surname) {
//        System.out.println(surname + ": " + phonebook.get(surname));//это было для теста тут
        return phonebook.get(surname);
    }
}
