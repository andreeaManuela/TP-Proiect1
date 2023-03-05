package Model;

public class Monom {

    private int coeficient;
    private int exponent;

    public Monom(int coeficient, int exponent)
    {
        this.coeficient=coeficient;
        this.exponent=exponent;
    }

    public int getCoeficient() {
        return coeficient;
    }

    public void setCoeficient(int coeficient) {
        this.coeficient = coeficient;
    }

    public int getExponent() {
        return exponent;
    }

    public void setExponent(int exponent) {
        this.exponent = exponent;
    }

  public String toString()
    {
        if(coeficient==0)
        { return "";}
        else if(exponent == 0 && coeficient<0)
        {   return coeficient+"x^"+exponent;  }
        else if(coeficient>0 && exponent==0)
        {   return "+" +coeficient+"x^"+exponent;}
        else if(coeficient==1 && exponent==1)
        {    return "+x"; }

        if(coeficient>0 && exponent>0)
            return "+" + coeficient+"x^"+exponent;
        else if(coeficient<0 && exponent>0)
            return coeficient+"x^"+exponent;
        else return "";
    }

    public String toStringInteg()
    {
        if(coeficient==0 && exponent==0)
            return "";
        if(coeficient>0 && exponent>=0)
            return "+"+coeficient+"x^"+exponent+"/"+exponent;
        else return "";
    }
}
