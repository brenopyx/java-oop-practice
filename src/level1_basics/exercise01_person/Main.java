package level1_basics.exercise01_person;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Carlos", 22, 1.70);

        Person person2 = new Person("Ana", 20, 1.50);

        person1.present();
        person2.present();

        person2.showInformation();
        person2.birthDay();
        person2.showInformation();

    }
}
