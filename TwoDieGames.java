public class TwoDieGames
{

  private int numRolls;
  private int[] rolls;


  public TwoDieGames()
  {
    this(100);
  }

  public TwoDieGames(int x)
  {
    this.numRolls=x;
    rolls=new int[numRolls];
    rollDice();
  }



  private void rollDice()
  {
    Die d1=new Die();
    Die d2=new Die();
    for(int i=0;i<rolls.length;i++)
    {
      rolls[i]=d1.roll()+d2.roll();
    }
  }


  public void snakeEyes()
  {
    int count=0;
    for(int i:rolls)
    {
      if(i==2)
      {
        count++;
      }
    }
    System.out.println("The number of snake eyes in ");
    System.out.print(numRolls + " rolls is "+count);
 }



}