package tn.esprit.gestionzoo.main;

import tn.esprit.gestionzoo.entities.*;

public class ZooManagement {

    public static void main(String[] args) throws ZooFullException, InvalidAgeException {
        Animal lion = new Animal();
        lion.setName("Simba");
        lion.setAge(7);
        lion.setFamily("Cats");
        lion.setMammal(true);

        Zoo myZoo = new Zoo("Wildlife Park", "Ariana");
        Zoo notMyZoo = new Zoo("WaterPark", "Siliana");


        Animal dog = new Animal("Canine", "Snoopy", -8, true);


        //System.out.println(myZoo.addAnimal(lion));
        //System.out.println(myZoo.addAnimal(dog));

        myZoo.displayAnimals();

        System.out.println(myZoo.searchAnimal(dog));
        Animal dog2 = new Animal("Canine", "lll", 2, true);
        System.out.println(myZoo.searchAnimal(dog2));

//           System.out.println(myZoo.removeAnimal(dog));
        myZoo.displayAnimals();


        System.out.println(myZoo);

        myZoo.addAnimal(lion);
        myZoo.addAnimal(dog);
        myZoo.addAnimal(dog2);
        myZoo.displayAnimals();


        myZoo.setName("Belvedere Park");
        Zoo notMyZoo1 = Zoo.comparerZoo(myZoo, notMyZoo);
        System.out.println(notMyZoo1);

        Aquatic Aqua=new Aquatic("Poisson","Chelba",1,false,"Sea");
        Aquatic Aqua2=new Aquatic("Poisson","wrata",1,false,"Sea");

        Terrestre T=new Terrestre();
        Dolphin D=new Dolphin("Dauphin","Dauphin 1",5,true,"sea",80.5f);
        Pinguin P=new Pinguin("Penguin","Batri9a",6,false,"north pole",100f);

        Aqua.swim();
        D.swim();
        P.swim();
        myZoo.addAquaticAnimal(Aqua);
        myZoo.addAquaticAnimal(D);
        myZoo.addAquaticAnimal(P);
        myZoo.displayNumberOfAquaticsByType();
        System.out.println(Aqua.equals(Aqua2));
        myZoo.addAnimal(lion); // ça affiche une exception : zoo is full

    }

}
