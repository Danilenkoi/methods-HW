public class Main {

    //Exercise 1

    public static void printLeapYears(int howYear) {
        int years = howYear;
        if (years % 4 == 0 || years % 100 == 0 || years % 400 == 0) {
            System.out.println(years + " год является високосным");
        } else {
            System.out.println(years + " год не является високосным");
        }
    }

    //Exercise 2

    public static void getClientOS(int yearDevice, int osDevice) {
        int clientDeviceYear = yearDevice;
        int clientOS = osDevice;
        if (clientOS == 0 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 0 && clientDeviceYear < 2015) {
            System.out.println("Установите lite версию приложения для iOS по ссылке");
        } else if (clientOS == 1 && clientDeviceYear >= 2015) {
            System.out.println("Установите версию приложения для Android по ссылке");
        } else if (clientOS == 1 && clientDeviceYear < 2015) {
            System.out.println("Установите lite версию приложения для Android по ссылке");
        }
    }

    //Exercise 3

    public static int deliveryDay(int distance, int one, int two, int three){
        int deliveryDistance = distance;
        int day = one;
        int twoDay = two;
        int threeDay = three;
        if (deliveryDistance > 1 && deliveryDistance <= 20){
            return day;
        } else if(deliveryDistance > 20 && deliveryDistance <= 60){
            return twoDay;
        } else if (deliveryDistance > 60 && deliveryDistance <= 100){
            return threeDay;
        }
        return deliveryDistance;
    }



    public static void main(String[] args) {

        //exercise 1
        int numbersYear = 2022;
        printLeapYears(numbersYear);

        //exercise 2
        int yearDevice = 2020;
        int osDevice = 0;
        // IOS - 0; Android - 1.
        getClientOS(yearDevice, osDevice);

        //exercise 3
        int distance = 45;
        int one = 1;
        int two = one + 1;
        int three = two + 1;
        deliveryDay(distance, one, two, three);
        int dayForDelivery = deliveryDay(distance, one, two, three);
        System.out.println(dayForDelivery);
    }

}



