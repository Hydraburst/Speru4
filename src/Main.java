
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Country[] abc = new Country[5];
        Country[] afterDel = new Country[abc.length];
        abc[0] = new Country("Бразилия", "Рио Де Жанейро", "Южная Америка", 5, 5);
        abc[1] = new Country("Хохляндия", "Kiev", "Евразия", 4, 4);
        abc[2] = new Country("Коцапия", "Хуйсква", "Евразия", 3, 3);
        abc[3] = new Country("Аргентина", "Аргентина", "Южная Америка", 2, 2);
        abc[4] = new Country("Британия", "Британия", "Великобритания", 1, 1);

        System.out.println("Выберите пункт: ");
        System.out.println("1) Удаление из базы всех стран, у которых численность меньше заданной");
        System.out.println("2) Поиск по названию столицы");
        System.out.println("3) Поиск по занимаемой площади свыше заданной");
        System.out.println("4) Выдачу сведений о государствах заданного континента с выбором способа сортировки");
        System.out.println("5) Выход (в окно)");
        int swi = in.nextInt();
        switch (swi) {
            case 1:
                int counter = 0;
                System.out.println("Введисте население: ");
                int pop = in.nextInt();
                if (pop <= 0) {
                    System.out.println("Вы ввели ложное значение!");
                    break;
                }
                for (int i = 0; i < abc.length; i++) {
                    if (abc[i].getPopulation() < pop) {
                        abc[i] = null;
                        counter++;
                    }

                }

                for (int i = 0; i < abc.length; i++) {
                    if (abc[i] != null) {

                        System.arraycopy(abc, 0, afterDel, 0, abc.length - counter);
                    }
                    if (abc[i] == null) {
                        break;
                    }
                }
                for (int i = 0; i < abc.length - counter; i++) {
                    System.out.println(afterDel[i].getName());

                }
                break;
            case 2:
                System.out.println("Введите Столицу : ");
                java.lang.String cap = in.next();
                if (cap == "1" || cap == "2" || cap == "3" || cap == "4" || cap == "5" || cap == "6" || cap == "7" || cap == "8" || cap == "9" || cap == "0") {
                    System.out.println("Введите правильное название столицы!");
                    break;
                }
                for (int i = 0; i < abc.length; i++) {
                    if (abc[i].getCapital().equals(cap)) {
                        System.out.println(abc[i].toString());
                        break;
                    }
                    if (i == abc.length) System.out.println("Не найдено");
                }
                break;
            case 3:
                System.out.println("Введите Площадь : ");
                int sortArea = in.nextInt();
                if (sortArea <= 0) {
                    System.out.println("Введите правильное значение площади!");
                    break;
                }
                for (int i = 0; i < abc.length; i++) {
                    if (abc[i].getArea() > sortArea) {
                        System.out.println(abc[i].getName());
                    }
                }
            case 4:
                System.out.println("Введите континент: ");
                java.lang.String cont = in.next();
                Country[] name = new Country[abc.length];
                for (int i = 0; i < abc.length; i++) {
                    if (abc[i].getContinent().equals(cont)) {
                        System.arraycopy(abc, 0, name, 0, abc.length);
                        System.out.println(name[i].toString());

                    }

                }

                System.out.println("Выберите метод сортировки 1-3 (по названию, по площади, по населению)");
                int swi1 = in.nextInt();
                switch (swi1) {
                    case 1:
                        Arrays.sort(name);
                        for (int i = 0; i < abc.length; i++) {
                            if (name[i].getContinent().equals(cont)) {
                                System.out.println(name[i].toString());
                            }
                        }
                }

            case 5:
                break;
        }

    }

}








