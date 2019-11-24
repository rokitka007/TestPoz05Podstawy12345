public class Car {

    private String marka;
    private String model;
    private Integer rokProdukcji;
    private Integer age;
    private Integer predkosc;

    Car(String marka, String model, Integer rok){
        this.marka = marka;
        this.model = model;
        this.rokProdukcji = rok;
        this.age = this.obliczWiek();
        this.predkosc = 0;
    }

    private Integer obliczWiek(){
        Integer actyalYear = 2019;
        return actyalYear - rokProdukcji;
    }

    public Integer przyspiesz(Integer zmiana){
        this.predkosc += zmiana;
        System.out.println("Twoja aktualna predkosc to: " + this.predkosc);
        return this.predkosc;
    }

    public void opiszAuto(){
        System.out.println("Oto " + this.marka + " " + this.model);

        if(this.age < 5){
            System.out.println("Nowe auto prawie nie używane");
        }else if(this.age <= 20){
            System.out.println("Troche już jeździ, ale jeszcze działa");
        }else{
            System.out.println("Nadaje się tylko na złom");
        }
    }
}
