
/**
 * Write a description of class Freestyle here.
 *
 * @author Nicholas Marino
 * @version 12/14/22
 */
public class Freestyle extends Swimmer
{
    // instance variables - replace the example below with your own
    private int armCount;
    private int numBreaths;
    private String favoriteDrill;
    private double distanceUnderwater;

    /**
     * Constructor for objects of class Freestyle
     */
    public Freestyle()
    {
        armCount = 30;
        numBreaths = 7;
        favoriteDrill = "Underwaters";
        distanceUnderwater = 25.6;
    }
    
    public Freestyle(int armCounter, int numBreath, String favDrill, double distanceUnderwaters)
    {
        armCount = armCounter;
        numBreaths = numBreath;
        favoriteDrill = favDrill;
        distanceUnderwater = distanceUnderwaters;
    }

    public void improveEndurance(double distance)
    {
        distanceUnderwater += distance;
    }
    
    public void prepStance()
    {
        System.out.println("Depart from the block.")
    }

    public void addFavoriteDrill(String newFavorite)
    {
        favoriteDrill = newFavorite;
    }
    
    public String toString() 
    {
      return "\nArm Count: '" + this.armCount + "', \nNumber of Breaths: '" + this.numBreaths + "', \nFavorite Drill: '" + this.favoriteDrill + "'";
    }
}


