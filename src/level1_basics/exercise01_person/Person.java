package level1_basics.exercise01_person;

public class Person {
    private String name;
    private int age;
    private double height;

    public Person (String name, int age, double height) {
        this.setName(name);
        this.setAge(age);
        this.setHeight(height);
    }

    public void present() {
        System.out.println("Hello! my name is " + this.getName());
    }

    public void showInformation() {
        System.out.println("--- Information ---");
        System.out.println("Name: " + this.getName());
        System.out.println("Age: " + this.getAge() + " years old");
        System.out.println("Height: " + this.getHeight() + " meters");
    }

    public void birthDay() {
        this.setAge(getAge() + 1);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        } else {
            System.out.println("Invalid Age");
        }
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        if (height > 0) {
            this.height = height;
        } else {
            System.out.println("Invalid height");
        }
    }
}

