
public class FiftyBack extends BackStroker implements Comparable<BackStroker>
{
    // instance variables - replace the example below with your own
  
    private double personalBest;
    private double firstTwentyFiveTime;
    private double lastTwentyFiveTime;
    private int amountOfPeopleCheering;

    /**
     * Constructor for objects of class FiftyBack
     */
    public FiftyBack()
    {
        // initialise instance variables
        super();
        personalBest = 0.0;
        firstTwentyFiveTime = 0.0;
        lastTwentyFiveTime = 0.0;
        amountOfPeopleCheering = 0;
    }
    public FiftyBack(int a, int h, String n, String s, int ag, String f, double d, double b, double first, double last, int c)
    {
        super(a, h, n, s, ag, f, d);
        personalBest = b;
        firstTwentyFiveTime = first;
        lastTwentyFiveTime = last;
        amountOfPeopleCheering = c;
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void congratsYoureFasterNow(double newTime, double newFirst, double newLast, int moreCheering)
    {
        // put your code here
        personalBest = newTime;
        firstTwentyFiveTime = newFirst;
        lastTwentyFiveTime = newLast;
        amountOfPeopleCheering = moreCheering;
    }
    public void haveLongerArms(double fast,double firstFast, double lastFast )
    {
       super.haveLongerArms();
       personalBest-=fast;
       firstTwentyFiveTime -=firstFast;
       lastTwentyFiveTime -= lastFast;
       
    }
    public String toString()
    {
        return "Personal Best Time: " + this.personalBest + "First Twenty Five: " + this.firstTwentyFiveTime + "Last Twenty Five: " + this.lastTwentyFiveTime + "Amount of People Cheering: " + this.amountOfPeopleCheering;
    }
    public boolean equals()
    {
        double number = .000001;
        if ((firstTwentyFiveTime - lastTwentyFiveTime) < number){
            return true;
        }
       else {
            return false;
        }
    }
    public int compareTo(BackStroker back)
    {
        return BackStroker.amountOfPeopleCheering - this.amountOfPeopleCheering;
    }
    }
