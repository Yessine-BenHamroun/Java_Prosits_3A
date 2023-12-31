package tn.esprit.gestionzoo.entities;

public class Zoo {

    public static final int NUMBER_OF_CAGES = 25;
    private Animal[] animals;
    private String name, city;
    private int nbrAnimals;
    private Aquatic[] aquaticAnimals;
    private int nbrAquaticAnimals;

    public Zoo() {
    }

    public Zoo(String name, String city) {
        animals = new Animal[NUMBER_OF_CAGES];
        this.name = name;
        this.city = city;
        aquaticAnimals = new Aquatic[10];
        nbrAquaticAnimals=0;
    }


    public static Zoo comparerZoo(Zoo z1, Zoo z2) {
        if (z1.nbrAnimals > z2.nbrAnimals)
            return z1;
        return z2;
    }

    public Animal[] getAnimals() {
        return animals;
    }

    public void setAnimals(Animal[] animals) {
        this.animals = animals;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isBlank())
            System.out.println("The Zoo name cannot be empty");
        else
            this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getNbrAnimals() {
        return nbrAnimals;
    }

    public void setNbrAnimals(int nbrAnimals) {
        this.nbrAnimals = nbrAnimals;
    }

    void displayZoo() {
        System.out.println("Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals);
    }

    public void addAnimal(Animal animal) throws ZooFullException,InvalidAgeException {
        if (animal.getAge() < 0) {
            throw new InvalidAgeException("Animal cannot have a negative age.");
        }
        if (isZooFull()) {
            throw new ZooFullException("Zoo is full, cannot add more animals.");
        }

        if (nbrAnimals < NUMBER_OF_CAGES) {
            animals[nbrAnimals] = animal;
            nbrAnimals++;
        }
        System.out.println("Number of animals: " + nbrAnimals);
    }


    public boolean removeAnimal(Animal animal) {
        int indexAnimal = searchAnimal(animal);
        if (indexAnimal == -1)
            return false;
        for (int i = indexAnimal; i < nbrAnimals; i++) {
            animals[i] = animals[i + 1];
        }
        animals[nbrAnimals] = null;
        this.nbrAnimals--;
        return true;
    }

    public void displayAnimals() {
        System.out.println("List of animals of " + name + ":");
        for (int i = 0; i < nbrAnimals; i++) {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal) {
        int index = -1;
        for (int i = 0; i < nbrAnimals; i++) {
            if (animal.getName() == animals[i].getName())
                return i;
        }
        return index;
    }

    public boolean isZooFull() {
        return nbrAnimals == NUMBER_OF_CAGES;
    }

    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", N° Cages: " + NUMBER_OF_CAGES + " N° animals: " + nbrAnimals;
    }

    public void addAquaticAnimal(Aquatic animal) {
        if (nbrAquaticAnimals < aquaticAnimals.length) {
            aquaticAnimals[nbrAquaticAnimals] = animal;
            nbrAquaticAnimals++;
            System.out.println("Added " + animal.getName() + " to the aquatic animals.");
        } else {
            System.out.println("Aquatic animal capacity reached. Cannot add more.");
        }
    }


    public float MaxPenguinSwimmingDepth() {
        float maxSwimmingDepth = -1;  // Set an initial value

        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Pinguin) {
                Pinguin pinguin = (Pinguin) aquaticAnimal;  // Cast to Pinguin
                if (pinguin.getSwimmingDepth() > maxSwimmingDepth) {
                    maxSwimmingDepth = pinguin.getSwimmingDepth();
                }
            }
        }

        return maxSwimmingDepth;
    }

    public void displayNumberOfAquaticsByType() {
        int dolphinCount = 0;
        int penguinCount = 0;

        for (Aquatic aquaticAnimal : aquaticAnimals) {
            if (aquaticAnimal instanceof Dolphin) {
                dolphinCount++;
            } else if (aquaticAnimal instanceof Pinguin) {
                penguinCount++;
            }
        }

        System.out.println("Nombre de dauphins : " + dolphinCount);
        System.out.println("Nombre de penguins : " + penguinCount);
    }


}
