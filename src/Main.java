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
        double roznica = a - b;
        double iloczyn = a * b;
        double iloraz = a / b;
        double mod = a % b;

        System.out.println("\nzadanie 2");
        System.out.println(a + " liczba a");
        System.out.println(b + " liczba b");
        System.out.println(suma + " to ich suma");
        System.out.println(roznica + " to ich roznica (a-b)");
        System.out.println(iloczyn + " to ich iloczyn");
        System.out.println(iloraz + " to ich iloraz (a/b)");
        System.out.println(mod + " to ich modulo (a%b)");

    }

    public static void zad3(){

        double stopnieC = 5;
        double stopnieF = stopnieC * 1.8 + 32;
        System.out.println("\nzadanie 3");
        System.out.println(stopnieC + " stopni celcjusza, to " + stopnieF + " stopni farenheita");
    }

    public static void zad4(){


        int liczba = 1234;
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
