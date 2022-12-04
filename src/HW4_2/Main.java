package HW4_2;


public class Main {
    public static void main(String[] args) {
        int numberOfCompetitors = 3;
        int numberOfobstacles = 2;

        Competitor[] competitors =
                {new Competitor("Человек", 2000, 2),
                        new Competitor("Кот", 100, 1),
                        new Competitor("Робот", 2000, 3)};
        Obstacle[] obstacles =
                {new Obstacle("Беговая дорожка", 0, 1000),
                        new Obstacle("Стена", 2, 0)};

        for (int i = 0; i < numberOfCompetitors; i++) {
            for (int j = 0; j < numberOfobstacles; j++) {

                if(!Obstacle.overcome(
                        competitors[i].getName(), obstacles[j].getName(),
                        competitors[i].getRunLength(), obstacles[j].getLength(),
                        competitors[i].getJumpedHeight(), obstacles[j].getHeight()))
                    break;

                }
            }
        }
    }
