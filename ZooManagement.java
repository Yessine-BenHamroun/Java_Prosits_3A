import java.util.Scanner;

public class ZooManagement {
    public static void main(String[] args){
        //-------------------------------- Prosit 1 -------------------------------------//
/*
        int nbrCages = 20;
        String zooName = "Belvedere";

        System.out.println(zooName + " comporte " + nbrCages + " cages");

        Scanner scn = new Scanner(System.in);
        Scanner scn1 = new Scanner(System.in);

        System.out.println("Entrer le nombre de cages: ");
        nbrCages = scn.nextInt();
        System.out.println("Enterer le nom du zoo: ");
        zooName = scn1.nextLine();

        System.out.println(zooName + " comporte " + nbrCages + " cages");


        //-------------------------------- Prosit 2 -------------------------------------//

        Zoo myZoo = new Zoo("myZoo", "Tunis", 1);
        Animal a1 = new Animal("Otariidae", "Lion", 10, true);
        Animal a2 = new Animal("Canidae", "Wolf", 8, false);

        //myZoo.displayZoo();

        //
        
        myZoo.displayZoo();
        */
        Zoo myZoo = new Zoo("Belvedere", "Tunis", 5);
        Animal lion = new Animal("Big Cats", "Lion", 10, true);   

        System.out.println(myZoo);
        System.out.println(myZoo.toString());
        System.out.println(myZoo.addAnimal(lion));
        myZoo.displayAnimals();

        Animal canari=new Animal("Oiseaux","3asfour", 2, false);
        myZoo.addAnimal(canari);
        myZoo.displayAnimals();
        //myZoo.displayAnimals();
        //int result=myZoo.searchAnimal(a1);
        //System.out.println(result);
        //myZoo.addAnimal(a1);
        
        System.out.println(myZoo.searchAnimal(canari));
        myZoo.removeAnimal(lion);
        myZoo.displayAnimals();



    }
}
