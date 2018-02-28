package company;

public class Manager extends Worker implements Management {

    public Manager(String name, String lastName, float salary) {
        super(name, lastName, salary, true);
    }

    @Override
    public void speak() {
        System.out.println("Do pracy lenie!");
    }
    public void kickOut(Worker worker){
        worker.setWorking(false);
        System.out.println("widzicie wlaśnie wasz kolega " + worker.getName()+ " wyleciał");
    }

    @Override
    public void voteNo(String reason) {
        System.out.println("panie szefie jajajja");
        System.out.println(reason);
    }

    @Override
    public void voteYes() {
        System.out.println("szefe ty to masz najlepsze pomysły pod słońccem");
    }
}
