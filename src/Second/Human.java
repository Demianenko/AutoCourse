package Second;

/**
 * Created by user on 23.05.2016.
 */
public abstract class Human {
    private int age;
    private String firstName;
    private String secondName;
    private int salary;
    private int wealth;
    public Human(int age, String firstName, String secondName, int salary, int wealth) {
        this.age = age;
        this.firstName = firstName;
        this.secondName = secondName;
        this.salary = salary;
        this.wealth = wealth;
    }

    public Human() {
        this(0,"firstName","secondName",0,0);
    }
    public void spendMoney(int money) {
        wealth = wealth - money;
    }
    public int getAge() {
        return age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getSecondName() {
        return secondName;
    }

    public int getSalary() {
        return salary;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setSecondName(String secondName) {
        this.secondName = secondName;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getWealth() {
        return wealth;
    }

    public void setWealth(int wealth) {
        this.wealth = wealth;
    }

    public abstract void work();
}
