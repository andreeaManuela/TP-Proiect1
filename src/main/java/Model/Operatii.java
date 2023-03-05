package Model;

import java.util.LinkedList;
import java.util.List;

public class Operatii {

   public static boolean esteMonom(Monom monom, Polinom p)
    {
        for(Monom m: p.getRezultat())
        {
             if(m.getExponent() == monom.getExponent())
            {
                return true;
            }
        }
        return false;
    }

    public static Polinom adunare(Polinom p1, Polinom p2)
    {
         Polinom suma= new Polinom();
         Monom monRez;
       //se parcurg polinoamele p1 si p2
       for(Monom mn1: p1.getPolinom1() ) {
           for (Monom mn2 : p2.getPolinom1()) {
               if (mn1.getExponent() == mn2.getExponent()) {
                   monRez = new Monom(mn1.getCoeficient() + mn2.getCoeficient(), mn1.getExponent());
                   suma.addRez(monRez);
               }
           }
       }
        //daca nu se gasesc monoame cu acelasi exponent in polinomul p1,p2 il adaugam in polinom rez
       for(Monom mn1: p1.getPolinom1())
       {
           if(!esteMonom(mn1, suma) && !p1.isElement(mn1))
           {
               suma.addRez(new Monom(mn1.getCoeficient(), mn1.getExponent()));
           }
       }
      for(Monom mn2: p2.getPolinom1())
       {
           if(!esteMonom(mn2, suma) && !p2.isElement(mn2))
           {
               suma.addRez(new Monom(mn2.getCoeficient(), mn2.getExponent()));
           }
       }
         return suma;
    }

     public static Polinom scadere(Polinom p1, Polinom p2)
    {
        Polinom scadere= new Polinom();
        Monom monRez;
        //se parcurg polinoamele p1 si p2
        for(Monom mn1: p1.getPolinom1() ) {
            for (Monom mn2 : p2.getPolinom1()) {
                if (mn1.getExponent() == mn2.getExponent()) {
                    monRez = new Monom(mn1.getCoeficient() - mn2.getCoeficient(), mn1.getExponent());
                    scadere.addRez(monRez);
                }
            }
        }
        //daca nu se gasesc monoame cu acelasi exponent in polinomiul p1 il adaugam in polinom rez
        for(Monom mn1: p1.getPolinom1())
        {
            if(!esteMonom(mn1, scadere) && !p1.isElement(mn1))
            {
                scadere.addRez(new Monom(mn1.getCoeficient(), mn1.getExponent()));
            }
        }
        for(Monom mn2: p2.getPolinom1() )
        {
            if(!esteMonom(mn2, scadere) && !p2.isElement(mn2))
            {
                mn2.setCoeficient(0-mn2.getCoeficient());
                scadere.addRez(new Monom(mn2.getCoeficient(), mn2.getExponent()));
            }
        }
        return scadere;
    }

    public static Polinom inmultire(Polinom p1, Polinom p2)
    {
        Polinom rezInmultire= new Polinom();
        Monom monRez;
       for(Monom mn1: p1.getPolinom1())
        {
           for(Monom mn2: p2.getPolinom1())
            {
                monRez=new Monom(mn1.getCoeficient()* mn2.getCoeficient(), mn1.getExponent()+mn2.getExponent());
                rezInmultire.addRez(monRez);
            }
        }
       return rezInmultire;
    }

    public static Polinom derivare(Polinom p1)
    {
        Polinom rezDeriv=new Polinom();
        for(Monom m: p1.getPolinom1())
        {
            if(m.getExponent() != 0) {
                m.setCoeficient(m.getCoeficient() * m.getExponent());
                m.setExponent(m.getExponent()-1);
                rezDeriv.addRez(m);
            }
        }
        return rezDeriv;
    }

    public static Polinom integrare(Polinom p1)
    {
        Polinom rezInt=new Polinom();
        for(Monom m: p1.getPolinom1())
        {
             m.setCoeficient(m.getCoeficient());
             m.setExponent(m.getExponent()+1);
             rezInt.addRez(m);
        }
        return rezInt;
    }
}
