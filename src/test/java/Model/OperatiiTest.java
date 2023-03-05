package Model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OperatiiTest {

    @Test
    void adunare() {
        Polinom a= Polinom.readPolynomial1("3x^2+3x^4+2x^1");
        Polinom b= Polinom.readPolynomial1("2x^2+1x^1");
        Polinom sum=Polinom.readPolynomial1("5x^2+3x^1+3x^4");
        Polinom sum2=Operatii.adunare(a,b);

        Assertions.assertEquals( sum2.getRezultat().toString(), sum.getPolinom1().toString(), "Adunare Incorecta!");
    }

    @Test
    void scadere()
    {
        Polinom a= Polinom.readPolynomial1("3x^2+6x^1-5x^0");
        Polinom b= Polinom.readPolynomial1("2x^2-2x^0");
        Polinom sub=Polinom.readPolynomial1("1x^2-3x^0+6x^1");
        Polinom sub2=Operatii.scadere(a,b);

        Assertions.assertEquals( sub2.getRezultat().toString(), sub.getPolinom1().toString(), "Scadere Incorecta!");
    }

    @Test
    void inmultire()
    {
        Polinom a= Polinom.readPolynomial1("2x^4");
        Polinom b= Polinom.readPolynomial1("5x^6+1x^2");
        Polinom rez=Polinom.readPolynomial1("10x^10+2x^6");
        Polinom rez2=Operatii.inmultire(a,b);

        Assertions.assertEquals( rez2.getRezultat().toString(), rez.getPolinom1().toString(), "Inmultire Incorecta!");
    }

    @Test
    void derivare()
    {
        Polinom a= Polinom.readPolynomial1("3x^3+5x^2");
        Polinom rez=Polinom.readPolynomial1("9x^2+10x^1");
        Polinom rez2=Operatii.derivare(a);

        Assertions.assertEquals( rez2.getRezultat().toString(), rez.getPolinom1().toString(), "Adunare Incorecta!");
    }

    @Test
    void integrare()
    {
        Polinom a= Polinom.readPolynomial1("10x^5+3x^6");
        Polinom rez=Polinom.readPolynomial1("10x^6/6+3x^7/7");
        Polinom rez2=Operatii.integrare(a);

        Assertions.assertEquals( rez2.getRezultat().toString(), rez.getPolinom1().toString(), "Adunare Incorecta!");
    }
}