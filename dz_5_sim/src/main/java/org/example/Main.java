package org.example;
import java.io.*;
import java.util.*;


public class Main {

    static <K, V> List<K> getAllKeysForValue(Map<K, V> mapOfWords, V value)
    {
        List<K> listOfKeys = null;


        if(mapOfWords.containsValue(value))
        {

            listOfKeys = new ArrayList<>();


            for (Map.Entry<K, V> entry : mapOfWords.entrySet())
            {
                if (entry.getValue().equals(value))
                {
                    listOfKeys.add(entry.getKey());
                }
            }

        }




        return listOfKeys;
    }

    public static void main(String[] args) {
        HashMap<String, String> passportsAndNames = new HashMap<>();


        passportsAndNames.put("123-222-1111", "Семён");
        passportsAndNames.put("441-112-4326", "Алиса");
        passportsAndNames.put("592-394-7893", "Лена");
        passportsAndNames.put("890-312-3341", "Славя");
        passportsAndNames.put("890-312-1231", "Ульяна");
        passportsAndNames.put("890-323-1255", "Ульяна");
        passportsAndNames.put("893-321-1231", "Мику");
        passportsAndNames.put("890-311-2131", "Юля");
        passportsAndNames.put("890-657-2134", "Женя");
        passportsAndNames.put("821-123-2367", "Женя");
        passportsAndNames.put("722-231-5532", "Ольга");
        passportsAndNames.put("812-554-7345", "Виола");
        passportsAndNames.put("598-232-4566", "Шурик");
        passportsAndNames.put("386-433-3453", "Сережа");

        System.out.println("Телефонная книга");


        Set<String> keys = passportsAndNames.keySet();
        System.out.println("Телефоны: " + keys);

        ArrayList<String> values = new ArrayList<>(passportsAndNames.values());
        System.out.println("Имена: " + values);

        System.out.println("1. Поиск номера по имени человека\n2. Добавить запись в книге.");
        Scanner in2 = new Scanner(System.in);
        System.out.print("Введите номер меню: ");
        Integer num = in2.nextInt();


        if (num == 1) {
            Scanner in1 = new Scanner(System.in);
            System.out.print("Введите имя искомого человека: ");
            String name = in1.nextLine();

            List<String> listOfKeys = Main.getAllKeysForValue(passportsAndNames, name);
            Collections.sort(listOfKeys);
            Collections.reverse(listOfKeys);
            System.out.println(listOfKeys);
        }
        if (num == 2) {
            Scanner in1 = new Scanner(System.in);
            System.out.print("Введите имя для добовления: ");
            String name_add = in1.nextLine();

            System.out.print("Введите телефон для добовления: ");
            String num_add = in1.nextLine();

            passportsAndNames.put(num_add,name_add);

        }
    }
}