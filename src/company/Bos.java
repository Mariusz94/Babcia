package company;

public class Bos extends Manager implements Management {

    public Bos(String name, String lastName) {
        super(name, lastName, Float.POSITIVE_INFINITY);
    }

    @Override
    public void voteNo(String reason) {
        System.out.println(reason);
    }

    @Override
    public void voteYes() {
        System.out.println("ustawa przeszła");
    }
}
