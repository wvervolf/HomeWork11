import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        calculateLeapYear(2021); //Задание 1
        printInfoAboutVersion(0, 2023);
        int deliveryDays = calculateDeliveryDistance(95);
        if (deliveryDays > 0) {
            System.out.println("Колличество дней доставки " + deliveryDays);
        }else System.out.println("Доставки нет"); // (Вопрос для консультации)Как сделать так, чтобы изюбежать всей этой требухи(чтобы значени е выводилось непосредственно методом)
    }

    static void calculateLeapYear(int year) {
        if (solutionLeapYear(year)) { // (Вопрос для консультации)Откуда взялаcя параметр у метода leapYearSolution(year), почему метод взят снизу, а параметр сверху
            System.out.println(year + " - Високосный год");
        } else
            System.out.println(year + " - Невисокосный год");
    }

    static boolean solutionLeapYear(int yearNahuy) {
        return yearNahuy % 4 == 0 && yearNahuy % 100 != 0 || yearNahuy % 400 == 0; //Конец задания 1
    }

    static void printInfoAboutVersion(int os, int productionYear) {
        int currentYear = LocalDate.now().getYear();
        if (os == 0 && productionYear == currentYear) {
            System.out.println("Установите версию для iOS");
        } else if (os == 0 && productionYear < currentYear) {
            System.out.println("Установите облегченную версию для iOS");
        } else if (os == 1 && productionYear == currentYear) {
            System.out.println("Установите версию для Андроид");
        } else if (os == 1 && productionYear < currentYear) {
            System.out.println("Установите облегченную версию для Андроид");
        }

    }

    static int calculateDeliveryDistance(int distance) {
        if (distance<0 || distance > 100){
            return -1;
        }
        int deliveryDays = 1;
        if (distance >= 20) { // (Вопрос для консультации)почему нет диапазона, как в решении задачи по условным операторам?
            deliveryDays++;
        }
        if (distance >= 60){
            deliveryDays++;
        }
        return deliveryDays;
    }


}