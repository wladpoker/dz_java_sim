package org.example;
import java.io.*;
import java.util.*;


//Организовать ввод и хранение данных пользователей. ФИО возраст и пол
//вывод в формате Фамилия И.О. возраст пол
//добавить возможность выхода или вывода списка отсортированного по возрасту!)
//*реализовать сортировку по возрасту с использованием индексов
//*реализовать сортировку по возрасту и полу с использованием индексов
class Person implements Comparable<Person> {
    private final String lastname;
    private final String name;
    private final String patronymic;
    private final int age;
    private final String sex;


    public Person(String lastname,String name, String patronymic, int age, String sex) {
        this.lastname = lastname;
        this.name = name;
        this.patronymic = patronymic;
        this.age = age;
        this.sex = sex;
    }

    @Override
    public String toString() {
        return String.join(" ", lastname, name, patronymic, Integer.toString(age), sex);
    }

    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.name);
    }
    public String getLastName() {
        return lastname;
    }
    public String getName() {
        return name;
    }

    public String getPatronymic() {
        return patronymic;
    }
    public int getAge() {
        return age;
    }
    public String getSex() {
        return sex;
    }
}

class ComparatorByAge implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return Integer.compare(o1.getAge(), o2.getAge());
    }
}

class ComparatorBySex implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return CharSequence.compare(o1.getSex(), o2.getSex());
    }
}

public class Main {
    public static void main(String[] args) {
        var personList = Arrays.asList(
                new Person("Персунов", "Семен", "Хикканович", 22, "муж"),
                new Person("Двачевская", "Алиса", "2ch", 19, "жен"),
                new Person("Сыроежкин", "Сергей", "Юрьевич", 16, "робот")
        );
        int persons = personList.size();
        // Печатаем число элементов в коллекции
        System.out.println("кол-во людей: " + persons);

        Scanner in = new Scanner(System.in);
        System.out.println("1. Вывод базы\n2. Ввод нового человека\n3. Вывод сортировки по возрасту\n4. Вывод сортировки по полу");
        System.out.print("Ввелите номер действия: ");
        int num = in.nextInt();

        if (num == 1) {
            for (int i = 0; i < persons; i++) {
                System.out.println(personList.get(i));
            }
        }

        if (num == 2) {
            Scanner in2 = new Scanner(System.in);
            System.out.print("Введите Фамилию: ");
            String ltn = in2.nextLine();

            System.out.print("Введите Имя: ");
            String nn = in2.nextLine();

            System.out.print("Введите Отчество: ");
            String pan = in2.nextLine();

            System.out.print("Введите сколько лет: ");
            Integer agn = in2.nextInt();

            System.out.print("Введите пол: ");
            String sen = in2.nextLine();

            personList.add(new Person(ltn, nn, pan, agn, sen));

            System.out.println(personList.get(personList.size()-1));

        }
        if (num == 3) {
            Collections.sort(personList, new ComparatorByAge());
            for (int i = 0; i < persons; i++) {
                System.out.println(personList.get(i));
            }
        }
        if (num == 4) {
            Collections.sort(personList, new ComparatorBySex());
            for (int i = 0; i < persons; i++) {
                System.out.println(personList.get(i));
            }
        }
    }
}