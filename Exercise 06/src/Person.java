public class Person {
    private String name;
    private int age;
    private double cash; // Added missing semicolon

    public Person(String name, int age, double cash) {
        this.name = name;
        this.age = age;
        this.cash = cash;
    }

    // Getters and setters (optional)
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
        this.age = age;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }
}
