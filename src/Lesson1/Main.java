package Lesson1;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Задача 1. Написать метод, который меняет два элемента массива местами.

        String[] arr = {"Bob", "Fred", "Alex", "Tom", "Dan"};

        System.out.println("Задача 1\n" + Arrays.toString(arr));
        replacingElements(arr, 1, 3);

        System.out.println(Arrays.toString(arr));

        //Задача 2. Написать метод, который преобразует массив в ArrayList;
        String[] arrayOfStrings = {"1", "2", "3", "4"};
        List<String> list = convertToList(arrayOfStrings);

        System.out.println("Задача 2\n" + list.getClass() + " : " + list);

        //Задача 3.
//        a. Есть классы Fruit -> Apple, Orange;(больше фруктов не надо)
//        b. Класс Box в который можно складывать фрукты, коробки условно сортируются по типу фрукта, поэтому в одну коробку нельзя сложить и яблоки, и апельсины;
//        c. Для хранения фруктов внутри коробки можете использовать ArrayList;
//        d. Сделать метод getWeight() который высчитывает вес коробки, зная количество фруктов и вес одного фрукта(вес яблока - 1.0f, апельсина - 1.5f, не важно в каких это единицах);
//        e. Внутри класса коробка сделать метод compare, который позволяет сравнить текущую коробку с той, которую подадут в compare в качестве параметра, true - если их веса равны, false в противном случае(коробки с яблоками мы можем сравнивать с коробками с апельсинами);
//        f. Написать метод, который позволяет пересыпать фрукты из текущей коробки в другую коробку(помним про сортировку фруктов, нельзя яблоки высыпать в коробку с апельсинами), соответственно в текущей коробке фруктов не остается, а в другую перекидываются объекты, которые были в этой коробке;
//        g. Не забываем про метод добавления фрукта в коробку.

        System.out.println("Задача 3");
        Orange orange = new Orange();
        Apple apple = new Apple();
        Box<Orange> orangeBox1 = new Box();
        Box<Orange> orangeBox2 = new Box();
        Box<Apple> appleBox = new Box();
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());
        orangeBox1.add(new Orange());

        for (int i = 0; i < 4; i++) {
            orangeBox2.add(new Orange());
        }
        for (int i = 0; i < 6; i++) {
            appleBox.add(new Apple());
        }


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

        Float orange1Weight = orangeBox1.getWeight();
        Float orange2Weight = orangeBox2.getWeight();
        Float appleWeight = appleBox.getWeight();
        System.out.println("Вес коробки 1 с апельсинами: " + orange1Weight);
        System.out.println("Вес коробки 2 с апельсинами: " + orange2Weight);
        System.out.println("Вес коробки с яблоками: " + appleWeight);

        System.out.println("Сравнить вес orangeBox1 и appleBox: " + orangeBox1.compare(appleBox));
        System.out.println("Сравнить вес orangeBox2 и appleBox: " + orangeBox2.compare(appleBox));

        orangeBox1.moveAt(orangeBox2);


        orangeBox1.info();
        orangeBox2.info();
        appleBox.info();

    }


    private static <T> void replacingElements(T[] array, int index1, int index3) { // Метод к заадаче 1
        T temp = array[index1];
        array[index1] = array[index3];
        array[index3] = temp;
    }

    private static <E> List<E> convertToList(E[] array) {   //Метод для задачи 2
        return Arrays.asList(array);
    }




}
