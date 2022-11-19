package HW3;

public class Animal {
    int maxSize = 100;

    protected String name;
    protected int run;
    protected int swim;
    public String[] animalName = new String[maxSize];
    public int[] animalType = new int[maxSize];
    public int[] animalRun = new int[maxSize];
    public int[] animalSwim = new int[maxSize];
    private int allAnimals = 0;
    private int allDogs = 0;
    private int allCats = 0;

    public int getAllAnimals() {
        return allAnimals;
    }

    public String[] getAnimalName() {
        return animalName;
    }

    public int[] getAnimalType() {
        return animalType;
    }

    public int getAllDogs() {
        return allDogs;
    }

    public int getAllCats() {
        return allCats;
    }

    public void addAnimal(int typeOfAnimal, String animalName, int run, int swim) {
        this.animalName[allAnimals] = animalName;
        this.animalType[allAnimals] = typeOfAnimal;
        this.animalRun[allAnimals] = run;
        this.animalSwim[allAnimals] = swim;
        allAnimals++;
        if (typeOfAnimal == 1) allDogs++;
        if (typeOfAnimal == 2) allCats++;
    }

    public void getStatistics() {
        System.out.println("\nВсего " + getAllAnimals() + " животных: ");
        System.out.println("Всего собак: " + getAllDogs());
        System.out.println("Всего кошек: " + getAllCats());

        for (int i = 0; i < getAllAnimals(); i++) {
            System.out.print(animalType[i] == 1 ? "собака: " : "кошка : ");
            System.out.print(animalName[i]);
            System.out.print(", пробег " + animalRun[i]);
            if (animalType[i] == 1)
                System.out.println(", заплыв " + animalSwim[i]);
            else
                System.out.println();
        }
    }

}
