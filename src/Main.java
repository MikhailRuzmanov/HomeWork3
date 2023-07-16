// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();

    }




    public static void task1 () {
        System.out.println("Задача 1");
        byte apple = 3;// Пишем код для задачи 1
        short elephantWeight = 7645;
        int speedLight = 300000000;
        long f = 85285285285L;
        float a = 2.6785f;
        double b = 675.098567844;
        System.out.println("Значение переменной " + "apple " +"с типом byte равно " + apple);
        System.out.println("Значение переменной " + "elephantWeight " +"с типом short равно " + elephantWeight);
        System.out.println("Значение переменной " + "speedLight " +"с типом int равно " + speedLight);
        System.out.println("Значение переменной " + "f " +"с типом long равно " + f);
        System.out.println("Значение переменной " + "a " +"с типом float равно " + a);
        System.out.println("Значение переменной " + "b " +"с типом double равно " + b);
    }

    public static void task2 () {
        System.out.println("Задача 2");
        float angle = 27.12f;// Пишем код для задачи 2
        long g = 987678965549L;
        float ballCapacity = 2.786f;
        short boatWeight = 569;
        short depth = -159;
        short freeTime = 27897;
        byte bananas = 67;
        System.out.println("Угол подъёма равен " + angle + " градусов");
        System.out.println("Переменная g равна " + g);
        System.out.println("Объём шара равен " + ballCapacity + " см3");
        System.out.println("Вес лодки составляет " + boatWeight + " кг");
        System.out.println("Глубина равна " + depth + " метров");
        System.out.println("Свободного времени накопилось " + freeTime + " минут");
        System.out.println("В коробке находится " + bananas + " бананов");

    }
    private static void task3() {
        System.out.println("Задача 3");
        byte ludmilaPavlovna = 23;
        byte annaSergeevna = 27;
        byte ekaterinaAndreevna = 30;
        short allSheets = 480;
        int numberSheetsStudent = allSheets/(ludmilaPavlovna + annaSergeevna + ekaterinaAndreevna);
        System.out.println("На каждого ученика рассчитано " + numberSheetsStudent + " листов бумаги");
    }
    private static void task4() {
        System.out.println("Задача 4");
        byte numberBottlesTwoMin = 16;
        byte numberMin16Bottles = 2;
        int numberBottlesOneMin = numberBottlesTwoMin/numberMin16Bottles;
        byte time20Min = 20;
        int numberBottles20Min = numberBottlesOneMin*time20Min;
        short numberMinInOneDay = 24*60;
        int numberMinInThreeDays = 3*numberMinInOneDay;
        int numberMinInOneMonth = 30*numberMinInOneDay;
        int numberBottlesInOneDay = numberMinInOneDay*numberBottlesOneMin;
        int numberBottlesInThreeDays = numberMinInThreeDays*numberBottlesOneMin;
        int numberBottlesInOneMonth = numberMinInOneMonth*numberBottlesOneMin;
        System.out.println("За " + time20Min + " минут машина произвела " + numberBottles20Min + " бутылок");
        System.out.println("За один день машина произвела " + numberBottlesInOneDay + " бутылок");
        System.out.println("За три дня машина произвела " + numberBottlesInThreeDays + " бутылок");
        System.out.println("За один месяц машина произвела " + numberBottlesInOneMonth + " бутылок");
    }
    private static void task5() {
        System.out.println("Задача 5");
        byte allBanks = 120;
        byte numberWhiteBanksForOneClass = 2;
        byte numberBrownBanksForOneClass = 4;
        int allBanksForOneClass = numberWhiteBanksForOneClass + numberBrownBanksForOneClass;
        int allClassesForPaint = allBanks/allBanksForOneClass;
        int numberWhiteBanksForAllClasses = allClassesForPaint*numberWhiteBanksForOneClass;
        int numberBrownBanksForAllClasses = allClassesForPaint*numberBrownBanksForOneClass;
        System.out.println("В школе, где " + allClassesForPaint + " классов, нужно " + numberWhiteBanksForAllClasses + " банок белой краски и " + numberBrownBanksForAllClasses + " банок коричневой краски");

    }
    private static void task6() {
        System.out.println("Задача 6");
        byte bananas = 5;
        byte gramsOneBanana = 80;
        short milkMilliliters = 200;
        byte gramsIn100MillilitersMilk = 105;
        byte millilitersIn105GramsMilk = 100;
        byte iceCreamPlombirBrikets = 2;
        byte gramsOneBriket = 100;
        byte eggs = 4;
        byte gramsOneEgg = 70;
        int gramsAllBananas = bananas*gramsOneBanana;
        float gramsInOneMilliliterMilk = gramsIn100MillilitersMilk/millilitersIn105GramsMilk;
        float gramsAllMilk = milkMilliliters*gramsInOneMilliliterMilk;
        int gramsAllBrikets = iceCreamPlombirBrikets*gramsOneBriket;
        int gramsAllEggs = eggs*gramsOneEgg;
        float gramsSportBreakfastWeight = gramsAllBananas + gramsAllMilk + gramsAllBrikets + gramsAllEggs;
        short gramsInOneKg = 1000;
        float kgSportBreakfastWeight = gramsSportBreakfastWeight/gramsInOneKg;
        System.out.println("Вес завтрака " + gramsSportBreakfastWeight + " в граммах");
        System.out.println("Вес завтрака " + kgSportBreakfastWeight + " в килограммах");

    }

    private static void task7() {
        System.out.println("Задача 7");
        byte allWeightKg = 7;
        short oneWeightInDayGrams = 250;
        short twoWeightInDayGrams = 500;
        int middleWeight = (oneWeightInDayGrams + twoWeightInDayGrams)/2;
        short gramsInOneKg = 1000;
        int allWeightGrams = allWeightKg*gramsInOneKg;
        float allWeightGramsWithDot = allWeightKg*gramsInOneKg;
        int numberDaysForOneWeight = allWeightGrams/oneWeightInDayGrams;
        int numberDaysForTwoWeight = allWeightGrams/twoWeightInDayGrams;
        float numberDaysForMiddleWeight = allWeightGramsWithDot/middleWeight;
        System.out.println("Если спортсмен будет сбрасывать по " + oneWeightInDayGrams +" грамм в день, то для похудения на " + allWeightKg + " килограмм,ему понадобиться " + numberDaysForOneWeight + " дней");
        System.out.println("Если спортсмен будет сбрасывать по " + twoWeightInDayGrams +" грамм в день, то для похудения на " + allWeightKg + " килограмм,ему понадобиться " + numberDaysForTwoWeight + " дней");
        System.out.println("Если спортсмен будет сбрасывать в среднем по " + middleWeight +" грамм в день, то для похудения на " + allWeightKg + " килограмм,ему понадобиться " + numberDaysForMiddleWeight + " дней");
    }

    private static void task8() {
        System.out.println("Задача 8");
        int masha = 67760;
        int denis = 83690;
        int kristina = 76230;
        float percentGrowSalary = 0.1f;
        byte numberMonthsInYear = 12;
        float mashaAfterGrowSalary = masha + masha*percentGrowSalary;
        float denisAfterGrowSalary = denis + denis*percentGrowSalary;
        float kristinaAfterGrowSalary = kristina + kristina*percentGrowSalary;
        int mashaYearSalaryBeforeGrow = masha*numberMonthsInYear;
        int denisYearSalaryBeforeGrow = denis*numberMonthsInYear;
        int kristinaYearSalaryBeforeGrow = kristina*numberMonthsInYear;
        float mashaYearSalaryAfterGrow = mashaAfterGrowSalary*numberMonthsInYear;
        float denisYearSalaryAfterGrow = denisAfterGrowSalary*numberMonthsInYear;
        float kristinaYearSalaryAfterGrow = kristinaAfterGrowSalary*numberMonthsInYear;
        float mashaDiffBetweenAfterBeforeYear = mashaYearSalaryAfterGrow - mashaYearSalaryBeforeGrow;
        float denisDiffBetweenAfterBeforeYear = denisYearSalaryAfterGrow - denisYearSalaryBeforeGrow;
        float kristinaDiffBetweenAfterBeforeYear = kristinaYearSalaryAfterGrow - kristinaYearSalaryBeforeGrow;
        System.out.println("Маша теперь получает " + mashaAfterGrowSalary + " рублей. Годовой доход вырос на " + mashaDiffBetweenAfterBeforeYear + " рублей");
        System.out.println("Денис теперь получает " + denisAfterGrowSalary + " рублей. Годовой доход вырос на " + denisDiffBetweenAfterBeforeYear + " рублей");
        System.out.println("Кристина теперь получает " + kristinaAfterGrowSalary + " рублей. Годовой доход вырос на " + kristinaDiffBetweenAfterBeforeYear + " рублей");

    }



}