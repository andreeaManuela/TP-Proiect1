package Controller;

import Model.Monom;
import Model.Operatii;
import Model.Polinom;
import View.View;
import Model.Polinom;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Controller {

    private View view;

    public Controller(View view) {
        this.view = view;

        this.view.clearButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                view.clearALL();
            }
        });

        this.view.addButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1= Polinom.readPolynomial1(view.getPolinom1Input());
                Polinom p2= Polinom.readPolynomial1(view.getPolinom2Input());
                Polinom suma=new Polinom();
                StringBuilder rezSuma=new StringBuilder(100);
                suma=Operatii.adunare(p1,p2);

                for(Monom m: suma.getRezultat())
                {
                   rezSuma.append(m.toString());
                }
              view.setResultLabel(rezSuma.toString());
            }
        });

        this.view.subButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1= Polinom.readPolynomial1(view.getPolinom1Input());
                Polinom p2= Polinom.readPolynomial1(view.getPolinom2Input());
                Polinom scadere=new Polinom();
                StringBuilder rezScadere=new StringBuilder(100);
                scadere=Operatii.scadere(p1,p2);

                for(Monom m: scadere.getRezultat())
                {
                    rezScadere.append(m.toString());
                }
                view.setResultLabel(rezScadere.toString());
            }
        });

        this.view.multiplyButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                  Polinom p1=Polinom.readPolynomial1(view.getPolinom1Input());
                  Polinom p2=Polinom.readPolynomial1(view.getPolinom2Input());
                  Polinom inmultire=new Polinom();
                  StringBuilder rezInm=new StringBuilder(100);
                  inmultire=Operatii.inmultire(p1,p2);

                  for(Monom m: inmultire.getRezultat())
                  {
                      rezInm.append(m.toString());
                  }
                  view.setResultLabel(rezInm.toString());
            }
        });

        this.view.derivativeButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1=Polinom.readPolynomial1(view.getPolinom1Input());
                Polinom derivare=new Polinom();
                StringBuilder rezDerivare= new StringBuilder(100);
                derivare=Operatii.derivare(p1);
                for(Monom m: derivare.getRezultat())
                {
                    rezDerivare.append(m.toString());
                }
                view.setResultLabel(rezDerivare.toString());

            }
        });

        this.view.integrationButtonListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Polinom p1=Polinom.readPolynomial1(view.getPolinom1Input());
                Polinom integrare=new Polinom();
                StringBuilder rezIntegrare= new StringBuilder(100);
                integrare=Operatii.integrare(p1);
                for(Monom m: integrare.getRezultat())
                {
                    rezIntegrare.append(m.toStringInteg());
                }
                view.setResultLabel(rezIntegrare.toString());

            }
        });
    }
}
