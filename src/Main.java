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
        var dog = 8.0 ;
        var cat = 3.6 ;
        var paper = 763789 ;
        System.out.println(" Задача 1");
        System.out.println(" dog = " + dog);
        System.out.println(" cat = " + cat);
        System.out.println(" paper = " + paper);
    }
    public static void task2 () {
        var dog = 8.0 ;
        var cat = 3.6 ;
        var paper = 763789  ;
        System.out.println(" Задача 2");
        System.out.println(" dog  = " + (dog + 4 ));
        System.out.println(" cat  = " + (cat + 4));
        System.out.println(" paper = " + (paper +4));
    }
    public static void task3 () {
        var dog = 8.0 ;
        dog = dog - 3.5;
        var cat = 3.6 ;
        cat = cat - 1.6;
        var paper = 763789;
        paper = paper - 7639;
        System.out.println(" Задача 3");
        System.out.println(" dog = " + dog);
        System.out.println(" cat = " + cat);
        System.out.println(" paper = "+ paper);
    }
    public static void task4 () {
        System.out.println(" Задача 4");
        var friend = 19;
        System.out.println(" friend = " + friend);
        friend = friend + 2;
        System.out.println(" friend = " + friend);
        friend = friend / 7;
        System.out.println(" friend = " + friend);
    }
    public static void task5 () {
        System.out.println(" Задача 5");
        var frog = 3.5;
        System.out.println(" frog = " + frog);
        frog = frog * 10;
        System.out.println(" frog = " + frog);
        frog = frog / 3.5;
        System.out.println(" frog = " + frog);
        frog = frog + 4;
        System.out.println(" frog = " + frog);
    }
    public static void task6 () {
        System.out.println(" Задача 6");
        var WeightOf1stBoxer = 78.2;
        var WeightOf2dBoxer = 82.7;
        var TotalWeight = WeightOf1stBoxer + WeightOf2dBoxer;
        System.out.println(" Общий вес двух бойцов " + TotalWeight + " кг");
        var Difference = WeightOf2dBoxer % WeightOf1stBoxer;
        System.out.println(" Разница в весе бойцов " + Difference + " кг");

    }
    public static void task7 () {
        System.out.println(" Задача 7");
        var WeightOf1stBoxer = 78.2;
        var WeightOf2dBoxer = 82.7;
        var Difference = WeightOf2dBoxer % WeightOf1stBoxer;
        System.out.println(" Разница в весе бойцов " + Difference + " кг");
        Difference = WeightOf2dBoxer - WeightOf1stBoxer;
        System.out.println(" Разница в весе бойцов " + Difference + " кг");

    }
    public static void task8 () {
        System.out.println(" Задача 8");
        var TotalHours = 640;
        var HoursPerEmployee = 8;
        var TotalEmployee = TotalHours / HoursPerEmployee;
        System.out.println(" Всего работников в компании — " + TotalEmployee + " человек");
        TotalEmployee = TotalEmployee + 94;
        TotalHours = TotalEmployee * HoursPerEmployee;
        System.out.println(" Если в компании работает " + TotalEmployee + " человек, то всего " + TotalHours + " часов работы может быть поделено между сотрудниками");



    }

}