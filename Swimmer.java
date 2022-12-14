/**
 * Abstract class Swimmer 
 * 
 * @author Nicholas Marino and Alex Lowczyk
 * @version 12/14/22
 */

public abstract class Swimmer
{
    // instance variables - replace the example below with your own
    private int height;
    private int age;
    private String skillLevel;
    private String name;

    /**
     * Constructor for objects of class Swimmer
     */
    public Swimmer()
    {
        // initialise instance variables
        name = "Alex Lowczyk";
        height = 72;
        age = 17;
        skillLevel = "intermediate";
        public Swimmer(int a, int h, String n, String s)
        {
            
           age = a;
            height = h;
            name = n;
            skillLevel = s;
    }
  public void prepStance();
    
    public void getBetterKiddo()
   {
       skillLevel += 1;
   }

    public int getAge()
    {
        return age;
    }
    public String getSkillLevel() 
    {
      return skillLevel;  
    }
}
