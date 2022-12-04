package HW4_2;

public class Competitor {
    private String name;
    private int runLength;
    private int jumpedHeight;

    public Competitor(String name, int runLength, int jumpedHeight) {
        this.name = name;
        this.runLength = runLength;
        this.jumpedHeight = jumpedHeight;
    }

    public void run(String name) {
        System.out.println(name + " бегает");
    }

    public void jump(String name) {System.out.println(name + " прыгает");}

    public String getName() {
        return name;
    }

    public int getRunLength() {
        return runLength;
    }

    public int getJumpedHeight() {
        return jumpedHeight;
    }
}
