import Controller.Controller;
import Model.Monom;
import Model.Operatii;
import Model.Polinom;
import View.View;

import static Model.Polinom.readPolynomial1;
import View.View;

public class MainClass {
    public static void main(String[] args)
    {
      View view=new View();
      Controller controller=new Controller(view);
      view.setVisible(true);

    }
}
