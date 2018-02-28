package company;

public class Main {
    public static void main(String[] args) {
        Worker oskar = new Worker("Oskar", "Polak", 2300, true);
        Manager ula = new Manager("Ula", "Swiatowska", 2400);
        oskar.speak();

        if (oskar.isWorking()) {
            System.out.println("pracuje");
        } else {
            System.out.println("nie pracuje");
        }
        Employee employee = oskar;

        ula.kickOut(oskar);

        Management[] managements = new Management[2];
        managements[0] = ula;
        managements[1] = new Bos("Michal","Makaruk");
        for(Management management :managements){
            management.voteYes();
        }
    }
}

