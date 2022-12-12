/**
 * Abstract class Swimmer - write a description of the class here
 *
 * @author Nicholas Marino and Alex Lowczyk
 * @version (version number or date here)
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
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int getAge()
    {
        // put your code here
        return age;
    }
    public String getSkillLevel() 
    {
      return skillLevel;  
    }
}
