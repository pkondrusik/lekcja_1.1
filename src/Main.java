public class Main {

    public static void main(String[] args) {

        zad1();
        zad2();
        zad3();
        zad4();
        zad5();
        zad6();
    }

    public static void zad1(){

        boolean takNie = true;
        char a = 'a';
        int b = 123;
        long c = 1234;
        float d = 123456;
        double e = 123.456;
        String f = "test";

        System.out.println("zadanie 1");
        System.out.println(takNie);
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);

    }

    public static void zad2(){

        double a = 123;
        double b = 12;
        double suma = a + b;
        double roznica_ab = a - b;
        double roznica_ba = b - a;
        double iloczyn = a * b;
        double iloraz = 0;
        double mod = 0;

        System.out.println("\nzadanie 2");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("a + b = " + suma);
        System.out.println("a - b = " + roznica_ab);
        System.out.println("b - a = " + roznica_ba);
        System.out.println("a * b = " + iloczyn);

        if (b != 0) {
            iloraz = a / b;
            System.out.println("a / b = " + iloraz);
        }
        else System.out.println("a / b = przez 0 nie dzielimy!");

        if (a != 0) {
            iloraz = b / a;
            System.out.println("b / a = " + iloraz);
        }
        else System.out.println("b / a = przez 0 nie dzielimy!");

        if (b != 0) {
            mod = a % b;
            System.out.println("a % b = " + mod);
        }
        else System.out.println("a % b = przez 0 nie dzielimy!");

        if (a != 0) {
            mod = b % a;
            System.out.println("b % a = " + mod);
        }
        else System.out.println("b % a = przez 0 nie dzielimy!");

    }

    public static void zad3(){

        double stopnieC = 5;
        double stopnieF = stopnieC * 1.8 + 32;
        System.out.println("\nzadanie 3");
        System.out.println(stopnieC + " stopni Celcjusza, to " + stopnieF + " stopni Fahrenheita");
    }

    public static void zad4(){


        int liczba = 1230;
/*        int a = liczba;
        double suma = 0;
        int licznik = 0;

        while (a != 0){
            suma += a % 10;
            a = (a - (a % 10)) / 10;
            licznik += 1;
        }
*/
        int x = liczba;
        double suma1 = 0;

        suma1 += x % 10;
        x = (x - (x % 10)) / 10;

        suma1 += x % 10;
        x = (x - (x % 10)) / 10;

        suma1 += x % 10;
        x = (x - (x % 10)) / 10;

        suma1 += x % 10;

        System.out.println("\nzadanie 4");
        System.out.println("Suma cyfr liczby " + liczba + " wynosi " + suma1);
        System.out.println("Srednia cyfr tej liczby to " + suma1 / 4);
    }


    public static void zad5(){

        int a = 1;
        int b = 111;
        int c = 2;
        int max = a;
        int min = a;

        if (b > max) max = b;
        if (b < min) min = b;

        if (c > max) max = c;
        if (c < min) min = c;

        System.out.println("\nzadanie 5");
        System.out.println("Podane liczby to: " + a + ", " + b + " i " + c);
        System.out.println("najwieksza liczba to " + max);
        System.out.println("najmniejsza liczba to " + min);
    }

    public static void zad6(){

        double bmi = 0;
        double wzrost = 2;
        double waga = 150;

        bmi = waga / (wzrost * wzrost);

        System.out.println("\nzadanie 6");
        System.out.print("Dla wzrostu " + wzrost + "m i wagi " + waga + "kg ");
        System.out.print("BMI wynosi: " + bmi + " i oznacza ");

        if (bmi > 18.5)
            if (bmi < 24.9) System.out.println("wage prawidlowa!");
            else System.out.println("nadwage!");
        else System.out.println("niedowage!");
    }
}
