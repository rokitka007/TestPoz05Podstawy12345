package obiektowosc;

public class Human {

    //Atrybuty klasy
    private String name;
    private String surname;
    private Integer birthYear;
    private Integer age;

    //Konstruktor - wywolywany jest przy inicjalizacji obiektu
    public Human(String name, String surname, Integer birthYear){
        this.name = name;
        this.surname = surname;
        this.birthYear = birthYear;
        this.age = this.obliczWiek();
    }

    //Slowka static - pozwala dostac sie do tej funkcji bez inicjalizacji obiketu
    //nie mozemy operowac w niej na zadnych atrybutach/metodach niestatycznych
    public static void opiszKlase(){
        System.out.println("Klasa Human oblicza wiek i umozliwia przedstawienie sie obiektu");
    }

    //metody klasy
    private Integer obliczWiek(){
        Integer actualYear = 2019;
        return actualYear - this.birthYear;
    }

    public void przedstawSie(){
        System.out.println("Hej, Nazywam sie " + this.name + " " + this.surname);
        System.out.println("Mam " + this.age + " lat.");
    }

    //Metody settery i gettery
    //Getter
    public String getName() {
        return name;
    }

    public String getSurname(){
        return surname;
    }

    //Setter
    public void setBirthYear(Integer birthYear){
        this.birthYear = birthYear;
        this.age = this.obliczWiek();
    }
}
