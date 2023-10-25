package tn.esprit.gestionzoo.entities;

public class Pinguin extends Aquatic{
    private float swimmingDepth;

    public void setSwimmingDepth(float swimmingDepth) {
        this.swimmingDepth = swimmingDepth;
    }

    public float getSwimmingDepth() {
        return swimmingDepth;
    }

    public Pinguin(){}

    public Pinguin(String family, String name, int age, boolean isMammal,String habitat,float swimmingDepth)
    {
        super(family, name, age, isMammal, habitat);
        this.swimmingDepth=swimmingDepth;
    }

    public String toString() {
        return "tn.esprit.gestionzoo.entities.Animal{" +
                "family='" + family + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", isMammal=" + isMammal +
                ", habitat=" + habitat+
                ", swimmingSpeed=" + swimmingDepth +
                '}';
    }
}
