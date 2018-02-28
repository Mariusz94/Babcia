package company;

public class Worker extends Employee {

    private boolean isWorking;

    public Worker(String name, String lastName, float salary, boolean isWorking) {
        super(name, lastName, salary);
        this.isWorking = isWorking;
    }
    public Worker(String name, String lastName, float salary) {
        this(name, lastName, salary, false);
    }

    public boolean isWorking() {
        return isWorking;
    }

    public void setWorking(boolean working) {
        isWorking = working;
    }

    @Override
    public void speak() {
        System.out.println("hey ho do roboty by sie szoł");
    }
}
