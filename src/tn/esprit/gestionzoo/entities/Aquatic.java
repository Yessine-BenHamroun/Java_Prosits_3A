package tn.esprit.gestionzoo.entities;

import java.util.Objects;

public class Aquatic extends Animal{
    protected String habitat;

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public Aquatic(String family, String name, int age, boolean isMammal, String habitat)
    {
        super(family,name,age,isMammal);
        this.habitat=habitat;
    }

    public Aquatic(){}

    @Override public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat="+ habitat +
                '}';
    }

    public void swim()
    {
        System.out.println("This aquatic is swimming.");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        Aquatic other = (Aquatic) obj;

        return Objects.equals(name, other.name) &&
                age == other.age &&
                Objects.equals(habitat, other.habitat);
    }

}
