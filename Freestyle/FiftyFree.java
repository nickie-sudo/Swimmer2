public class FifityFree
{
    private double personalBest;
    private double firstFiftyTime;
    private double lastFiftyTime;
    private int amtOfPeopleCheering;

    public FifityFree()
    {
        personalBest = 25.6 ;
        firstFiftyTime = 30.5 ;
        lastFiftyTime =  32.6;
        amtOfPeopleCheering = 2019765709;
    }

    public FifityFree(double personal, double first, double last, int amt)
    {
        personalBest = personal;
        firstFiftyTime = first;
        lastFiftyTime =  last;
        amtOfPeopleCheering = amt;
    }

    public void increaseCheer()
    {
        amtOfPeopleCheering +=1;
    }

    public void setPersonalBest(double newPersonalBest)
    {
        personalBest = newPersonalBest;
    }

    public void resetTimes()
    {
        firstFiftyTime = 0;
        lastFiftyTime = 0;
    }

    public boolean equals()
    {
        double num = .000001;
        if((firstFiftyTime - lastFiftyTime) > num){
            return true;
        }
        else { 
            return false;
        }
    }

    public String toString()
    {
        return "Personal Best: " + personalBest + "First Fifty Free: " + firstFiftyTime + "Last Fifty Free: " + lastFiftyTime;
    }

    public int compareTo(FifityFree free)
    {
        return 1;
    }
}
