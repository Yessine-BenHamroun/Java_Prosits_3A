package tn.esprit.gestionzoo.entities;

public class Dolphin extends Aquatic{
    private float swimmingSpeed;

    public void setSwimmingSpeed(float swimmingSpeed) {
        this.swimmingSpeed = swimmingSpeed;
    }

    public float getSwimmingSpeed() {
        return swimmingSpeed;
    }

    public Dolphin(){}

    public Dolphin(String family, String name, int age, boolean isMammal,String habitat,float swimmingSpeed)
    {
        super(family, name, age, isMammal, habitat);
        this.swimmingSpeed=swimmingSpeed;
    }

    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat=" + habitat+
                ", swimmingSpeed=" + swimmingSpeed +
                '}';
    }

    public void swim()
    {
        System.out.println("This dolphin is swimming.");
    }
}
