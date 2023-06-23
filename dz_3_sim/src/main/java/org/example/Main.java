package org.example;
import java.util.*;

public class Main {

    static void delChet(List<Integer> arrList) {
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) % 2 == 0) {
                arrList.remove(i);
            }
        }
        System.out.println("\nУдаления чётных чисел\nРезультат: " + arrList);

    }
    static Integer Maxn(List<Integer> arrList) {
        int max = arrList.get(0);
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) > max) {
                max = arrList.get(i);
            }
        }
        return max;
    }
    static Integer Minn(List<Integer> arrList) {
        int min = arrList.get(0);
        for (int i=0; i < arrList.size()-1; i++) {
            if (arrList.get(i) < min) {
                min = arrList.get(i);
            }
        }
        return min;
    }
    static Double Sredznach(List<Integer> arrList) {
        int sum = 0;
        double sredzn;
        for (int i=0; i < arrList.size()-1; i++) {
            sum += arrList.get(i);
        }
        sredzn = sum / arrList.size();
        return sredzn;
    }

    public static void main(String[] args) {
        List<Integer> list_num = new ArrayList(Arrays.asList(35,0,85,99,56,73,50,18,404,875,476,86,109,931,41,646,34,73,71,94,18,77,8));
        System.out.println("Изначальный список: " + list_num);
        delChet(list_num);
        System.out.println("Минимальное значение: " + Minn(list_num));
        System.out.println("Максимальное значение: " + Maxn(list_num));
        System.out.println("Среднее значение: " + Sredznach(list_num));

    }
}