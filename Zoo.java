public class Zoo {
    Animal[] animals;
    String name;
    String city;
    int nbrCages;
    int nbrAnimeaux = 0;

    public Zoo(){
    }

    public Zoo(String name, String city, int nbrCages){
        animals = new Animal[nbrCages];
        this.name = name;
        this.city = city;
        this.nbrCages = nbrCages;
    }

    public void displayZoo(){
        System.out.println("Name: " + name);
        System.out.println("City: " + city);
        System.out.println("nbrCages: " + nbrCages);
        System.out.println("List of Animals:\n");
        for(int i=0; i<nbrAnimeaux; i++){
            System.out.println("Animal n°" + (i+1) + ": " + animals[i].toString());
        }
    }

    @Override
    public String toString() {
        return "Name: " + name + "\n" + "City " + city + "\n" + "nbrCages: " + nbrCages + "\n";
    }

    public boolean addAnimal(Animal animal){
        if(nbrAnimeaux < nbrCages && searchAnimal(animal)==-1) {
            animals[nbrAnimeaux] = animal;
            nbrAnimeaux++;
            return true;
        }else{
            return false;
        }
    }

    public void displayAnimals()
    {
        for(int i=0; i<nbrAnimeaux;i++)
        {
            System.out.println(animals[i]);
        }
    }

    public int searchAnimal(Animal animal)
    {
        int incdice = -1;
        for (int i = 0; i < nbrAnimeaux; i++) {
            if (animal.name == animals[i].name)
                return i;
        }
        return incdice;
    }

    public boolean removeAnimal(Animal animal)
    {
        int indice=searchAnimal(animal);
        if(indice==-1)
            return false;
        
            for(int i =indice;i<nbrAnimeaux;i++)
            {
                animals[i]=animals[i+1];
                animals[nbrAnimeaux]=null;
                this.nbrAnimeaux--;
            }
            return true;
    }
}
