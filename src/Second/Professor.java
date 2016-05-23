package Second;

/**
 * Created by user on 23.05.2016.
 */
public class Professor extends Human {
    public Professor(int age, String firstName, String secondName, int salary, int wealth) {
        super(age, firstName, secondName, salary, wealth);
    }

    @Override
    public void work() {
        System.out.println("Professor working");
    }
}
