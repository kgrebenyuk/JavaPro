package HW4_2;

public class Obstacle {
    private String name;
    private int height;
    private int length;

    public Obstacle(String name, int height, int length) {
        this.name = name;
        this.height = height;
        this.length = length;
    }

    public static boolean overcome(String nameOfCompetitor, String nameOfObstacle, int run, int obstacleLength, int jumped, int wallHeight) {
        if (run < obstacleLength || jumped < wallHeight) {
            System.out.print(nameOfCompetitor + " не преодолел " + nameOfObstacle + ". ");
            if (nameOfObstacle == "Беговая дорожка")
                System.out.println("Пробежал: " + run + " метров из " + obstacleLength);
            else
                System.out.println("Прыгнул: " + jumped + " метров из " + wallHeight);
            return false;
        } else {
            System.out.print(nameOfCompetitor + " преодолел " + nameOfObstacle  + ". ");
            if (nameOfObstacle == "Беговая дорожка")
                System.out.println("Пробежал: " + run + " метров из " + obstacleLength);
            else
                System.out.println("Прыгнул: " + jumped + " метров из " + wallHeight);
            return true;
        }

    }

    public String getName() {
        return name;
    }

    public int getHeight() {
        return height;
    }

    public int getLength() {
        return length;
    }
}
