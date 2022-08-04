public class Main {

    public static void main(String[] args) {
        // Задание 1
    byte pear = 3;
    short glass = 5;
    int dog = 8;
    long metre = 1500L;
    float saltWeight = 23.5f;
    double milkWeight = 345.67;
    char zero = 48;
    boolean dogIsAdult = dog > 10;
    System.out.println (dogIsAdult);

    // Задание 2
        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        System.out.println ("Общий вес двух бойцов " + totalWeight + " кг");
        var differenceWeight = secondBoxer - firstBoxer;
        System.out.println ("Разница между весами бойцов " + differenceWeight + " кг");

        // Задание 3
    var banana = 5 * 80;
    var milk = 2 * 105;
    var iceCream = 2 * 100;
    var rawEgg = 4 * 70;
    var sportBreаkfаst = banana +  milk + iceCream + rawEgg;
    System.out.println ("Вес спортзавтрака " + sportBreаkfаst + " г");
    var sportBreаkfаst1 = sportBreаkfаst * 0.001;
    System.out.println ("Вес спортзавтрака " + sportBreаkfаst1 + " кг");

        // Задание 4
        var excessWeight = 7;
        var numberOfDays = (7 * 1000) / 250;
        var numberOfDays1 = (7 * 1000) / 500;
        System.out.println ("При похудении на 250 г в день понадобится " + numberOfDays + " дней");
        System.out.println ("При похудении на 500 г в день понадобится " + numberOfDays1 + " дней");
        var averageNumberOfDays = (numberOfDays + numberOfDays1) /2;
        System.out.println ("Чтобы добиться результата похудения, в среднем может потребоваться " + averageNumberOfDays + " дней");

        // Задание 5
         var Masha = 67_760;
         var Denis = 83_690;
         var Kristina = 76_230;
         var newMasha = 67_760 + (67_760 * 0.1);
         var newDenis = 83_690 + (83_690 * 0.1);
         var newKristina = 76_230 + (76_230 * 0.1);
         var differenceMasha = (newMasha * 12) - (Masha * 12);
         var differenceDenis = (newDenis * 12) - (Denis * 12);
         var differenceKristina = (newKristina * 12) - (Kristina * 12);
        System.out.println ("Маша теперь получает " + newMasha + " рублей. Годовой доход вырос на " + differenceMasha + " рублей");
        System.out.println ("Денис теперь получает " + newDenis + " рублей. Годовой доход вырос на " + differenceDenis + " рублей");
        System.out.println ("Кристина теперь получает " + newKristina + " рублей. Годовой доход вырос на " + differenceKristina + " рублей");












































