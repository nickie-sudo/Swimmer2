
public class BackStroker extends Swimmer implements Comparable<BackStroker>
{
    // instance variables - replace the example below with your own
    private int armCount;
    private String favoriteDrill;
    private double distanceUnderwater;
    

    /**
     * Constructor for objects of class BackStroker
     */
    public BackStroker()
    {
        // initialise instance variables
        super();
        armCount = 4;
        favoriteDrill = "Catch Up";
        distanceUnderwater = 5.5;
        
    }
    public BackStroker(int a, int h, String n, String s, int ag, String f, double d)
    {
        super(a, h, n, s);
        
        armCount = ag;
        favoriteDrill = f;
        distanceUnderwater = d;
    }
    public void haveLongerArms()
    {
        
        armCount -= 1;
    }
    public void getBetterAtHoldingBreath(double distance)
    {
        distanceUnderwater += distance;
        
    }
    public void learnNewDrill(String favorite)
    {
        favoriteDrill = favorite;
    }
    
    public void prepStance()
    {
        
        System.out.println("Take Off Is In The Water");
    }

    public String toString()
    {
      return "ArmCount: " + this.armCount + "Favorite Drill: " + this.favoriteDrill + "Underwaters Distance: " + this.distanceUnderwater;  
    }
    public boolean equals(double newDistanceUnderwater)
    {
         double fixer = .000001;
        if ((newDistanceUnderwater - distanceUnderwater) < fixer){
            return true;
        }
       else {
            return false;
        }
    }
    
    public int compareTo(BackStroker b)
    {
        return b.armCount - this.armCount;
    }
    
    }
