import dziedziczenie.Man;
import dziedziczenie.Woman;
import obiektowosc.Car;
import obiektowosc.Human;

public class Obiektowosc {
    public static void main(String[] args) {

        Human.opiszKlase();

        Human czlowiek1 = new Human("Kasia", "Nowakowska", 1991);
        //Metoda przedstawSie jest dostepna, bo jest public
        czlowiek1.przedstawSie();

        //Atrybut name oraz funkcja oblicz wiek nie są dostępne poza klasą Human
        //Bo są private
        //czlowiek1.name;
        //czlowiek1.obliczWiek();

        Human czlowiek2 = new Human("Robert", "Kowalski", 1985);
        czlowiek2.przedstawSie();

        Human czlowiek3 = new Human("Gosia", "Majewska", 1959);
        czlowiek3.przedstawSie();
        System.out.println(czlowiek3.getName() + " " + czlowiek3.getSurname());
        czlowiek3.setBirthYear(1975);
        czlowiek3.przedstawSie();

        //2 obiekty klasy Car
        Car opel = new Car("opel", "astra", 2006);
        opel.przyspiesz(60);
        opel.przyspiesz(20);
        opel.opiszAuto();

        Car bmw = new Car("bmw", "m3", 2016);
        bmw.przyspiesz(152);
        bmw.opiszAuto();
//        System.out.println(bmw.obliczWiek());

        //Obiekt klasy Woman dziedziczacej po Human
        Woman kobieta1 = new Woman("Kasia", "Kowalska", 2007);
        kobieta1.przedstawSie();
        kobieta1.setBirthYear(2009);
        kobieta1.getName();

        Man mezczyzna1 = new Man("Tomek", "Gorny",1998);
        mezczyzna1.setWaga(70);
        mezczyzna1.ocenSile();
        mezczyzna1.przedstawSie();

        mezczyzna1.setWaga(105);
        mezczyzna1.ocenSile();
        mezczyzna1.przedstawSie();
    }
}
