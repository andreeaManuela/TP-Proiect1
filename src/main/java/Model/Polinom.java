package Model;

import View.View;

import java.util.LinkedList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Polinom {

    private LinkedList<Monom> poli1= new LinkedList<Monom>();
    private LinkedList<Monom> rezultat= new LinkedList<Monom>();

    public Polinom()   {
        this.poli1=poli1;
       this.rezultat=rezultat;
    }

    public LinkedList<Monom> getPolinom1()
    {
        return poli1;
    }
    public void add(Monom m)
    {
        poli1.add(m);
    }

    public boolean isElement(Monom m)
    {
        if(rezultat.contains(m))
        {
            return true;
        }
        else return false;
    }

    public LinkedList<Monom> getRezultat() {
        return rezultat;
    }

    public void addRez(Monom m)
    {
        rezultat.add(m);
    }

    //Regex
    public static Polinom readPolynomial1(String input1)
    {
        String polynomFormat="([+-]?[^-+]+)";
        Pattern pattern = Pattern.compile(polynomFormat);
        Matcher matcher = pattern.matcher(input1);
        Polinom poly=new Polinom();

        matcher.find();

        String monomFormat="(-?\\b\\d+)[xX]\\^(-?\\d+\\b)";
        Pattern pattern2=Pattern.compile(monomFormat);
        Matcher matcher2=pattern2.matcher(input1);

        while(matcher2.find())
        {
           int  coeficient=Integer.parseInt(matcher2.group(1));
           int  exponent=Integer.parseInt(matcher2.group(2));
         //  System.out.println("Coeficient  "+coeficient + " Putere: "+ exponent);

           Monom monom1= new Monom(coeficient, exponent);
           poly.poli1.add(monom1);

        }
        return poly;
    }

}
