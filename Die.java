public class Die
{
private int value;
private int numSides;
private static int id;
private int dieId;

public Die(int v, int n)
{
setValue(v);
setNumSides(n);
id++;
setDieId(id);
}

//default
public Die()
{
  this(1,6);
}
//accessors
public int getValue()
{
  return value;
}
public int getNumSides()
{
  return numSides;
}

//mutators
public void setValue(int v)
{
  value=v;
}
public void setNumSides(int n)
{
  numSides=n;
}
public void setDieId(int d)
{
  dieId=d;
}

//a rand num between 1 and die max, this and value make the value stick
public int roll()
{
  int value = (1+((int)(numSides*Math.random())));
  this.setValue(value);
  return value;
}

//equals method
public boolean equals(Die d)
{
  if(this.getValue()==d.getValue())
  {
    return true;
  } else {
    return false;
  }
}
//convert to string
public String toString()
{
  return "Die ID: "+dieId+"\nValue:"+value+" NumSides: "+ numSides;
}

}