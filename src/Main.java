import javafx.util.Pair;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {

    public static String zwrocImie(Integer case1){
       // Integer case1 = 5;
        String imie = "";
        switch (case1){
            case 1: imie = "Kasia"; break;
            case 5: imie = "Tomek"; break;
            case 8: imie = "Dawid"; break;
            default: imie = "NoName";
        }

        return imie;
    }

    public static void przedstawSie(String imie){
        System.out.println("Moje imie to " + imie);
    }

    //Wpisujemy main
    //Funkacja egzekucyjna
    public static void main(String[] args) {
        String imie = zwrocImie(5);
        przedstawSie(imie);
        imie = zwrocImie(1);
        przedstawSie(imie);
        przedstawSie(zwrocImie(10));






        System.out.println("Hej, drugi raz cos wypisze");
        System.out.println("Hej, moj pierwszy program");

        //Zmienne
        //Definicja Typu (String) nazwa zmienniej (napis1) + opcjonalnie przydzielenie wartości
        //String - typ tekstowy, jego wartoscią jest napis (w cudzyslowie podwojnym lub pojedynczym
        String napis1 = "Ktarzyna Nowakowska";
        //Boolean - typ logiczny, zwraca true lub false
        Boolean isTomek = napis1.contains("Tomek");
        System.out.println(isTomek);
        //Integer - typ numeryczny liczb całkowitych
        //Long - liczba całkowita, dużo dłuższy
        Integer liczba1 = 2;
        Long liczba2 = Long.valueOf(1302);
        liczba1.equals(liczba2);
        //Typ prosty, Integer to klasa wrappujaca typ prosty int (daje metody
        //ulatwiajace prace z danym typem

        //Float - typ numeryczny zmiennoprzecinkowy
        //Float ulamek1 = 10.155;
        Double ulamek2 = 10.5;

        //Kolekcje
        //Lista = zbior elementow w indeksie
        List<String> lista1 = new ArrayList<>();
        lista1.add(napis1);
        lista1.add("Tomek");
        System.out.println(lista1.toString());

        //HashMap - słownik trzymajacy pary klucz-wartość
        HashMap<String, Integer> mapa1 = new HashMap<>();
        mapa1.put(napis1, liczba1);
        mapa1.put("Tomek", 5);
        mapa1.get("Tomek");
        System.out.println(mapa1.toString());
        //Pair - słownik tylko jedna pare klucz wartosc
        Pair<String, Integer> mojaPara = new Pair<>("Kasia", 1);
        String napis2 = mojaPara.getKey();
        napis2 += mojaPara.getValue().toString();
        System.out.println(napis2);
        //CTRL + SHIFT + F10 - odpalenie aktualnej konfiguracji

        //Pętle
        //Petla for
        //Warunek poczatkowy (wartosc poczatkowa licznika);
        // warunek końcowy (wartosc koncowa licznika);
        // modyfikator licznika i++ oznacza, że i bedzie wieksze o 1 po przejsciu petli
        for(Integer i=0; i<=5; i++){
            System.out.println("Wartosc licznika: " + i.toString());
        }

        Integer i = 0;
        while(i<5){
            System.out.println("Jestem w while po raz " + i.toString());
            i++;
        }
        //While
        //Break to specjalne słowo, ktore pozwala zakończyć działanie petli
        //Continue pozwala przejsc do kolejnej iteracji z pominieciem kodu pod tym slowkiem
        while(true){
            i++;
            if(i.equals(7))
                continue;
            System.out.print(" " + i.toString());
            if(i.equals(10))
                break;
        }

        //Petla do while - zawsze wykona sie chociaz jedna iteracja
        do {
            System.out.println("Jestem w do while " + i.toString());
            i++;
        }while(i<10);

        //Petla for each na liscie
        for (String el: lista1) {
            System.out.println("Element listy: " + el);
        }

        //Petla for each na mapie #TODO
        //for(String el: mapa1){}

        //Instrukcje warunkowe
        //Instrukcje if..else if... else
        //Else sie zawsze wykona, kiedy warunek nie jest spelniony
        if(lista1.size() == 3){
            System.out.println("Hej, jestem w instrukcji warunkowej");
        }

        if(lista1.size()<1){
            System.out.println("Z tym warunkiem nigdy sie nie wypisze");
        }else{
            System.out.println("Jestem w instrukcji else");
        }

        if(lista1.size()<1){
            System.out.println("Nie wykonam sie");
        }else if (lista1.size() == 2){
            System.out.println("Ja sie wykonam");
        }else{
            System.out.println("Ja sie juz nie wykonam, bo warunek jest spelniony");
        }

        //Instrukcja warunkowa switch case - na końcu każdego case musi znaleźć się słówko break;

        i=2;
        String message = "Moje imie to ";
        switch (i){
            case 2: message += "Kasia"; break;
            case 5: message += "Tomek"; break;
            case 8: message += "Dawid"; break;
        }

        System.out.println(message);
    }
}
