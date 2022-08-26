public class Main {
    public static void main(String[] args) {
        //Задача 1
        int clientOS = 0;
        if (clientOS ==1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOS < 1){
                System.out.println("Установите версию приложения для IOS по ссылке");
        }

        int clientDeviceYear = 2013;
        if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        }else if (clientOS == 1 && clientDeviceYear>= 2015){
            System.out.println("Установите версию приложения для Android по ссылке");
        }else if (clientOS < 1 && clientDeviceYear < 2015){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        }else if (clientOS < 1 && clientDeviceYear >= 2015){
            System.out.println("Установите версию приложения для iOS по ссылке");
        }

        int year = 2021;
        if(year % 4 == 0){
            System.out.println("Год является високосным");
        } else if (year % 100 != 0){
            System.out.println("Год является високосным");
        } else if (year % 400 == 0) {
            System.out.println("Год является високосным");
        } else {
            System.out.println("Год не является високосным");
        }


        int deliveryDistance = 95;
        if(deliveryDistance == 20){
            System.out.println("Потребуется 1 день для доставки");
        } else if(deliveryDistance < 20 && deliveryDistance < 60){
            System.out.println("Потребуется 2 дня для доставки");
        } else if(deliveryDistance > 60 && deliveryDistance < 100) {
            System.out.println("Потребуется 1 день для доставки");
        }

        int monthNumber = 12;
        switch (monthNumber){
            case 1:
            case 2:
                System.out.println("Время года зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Время года весна");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Время года лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Время года осень");
                break;
            case 12:
                System.out.println("Время года зима");
                break;
            default:
                System.out.println("Если номер месяца 13 и больше, то программа выполняться не будет");
          }





}}