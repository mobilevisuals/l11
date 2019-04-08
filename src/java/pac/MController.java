/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pac;

import javax.inject.Named;
import javax.enterprise.context.SessionScoped;
import java.io.Serializable;

/**
 *
 * @author eyvind
 */
@Named(value = "mController")
@SessionScoped
public class MController implements Serializable {
    
    private int number,result;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
    
    public void calculate(int choice)
    {
    switch(choice)
    {
        case 0:
            calculation1();
            break;
              case 1:
                  calculation2();
            break;
    }
    }
    
    private void calculation1()
    {
    result=number*4;
    }
    
     private void calculation2()
    {
      result=number*2;
    }

    /**
     * Creates a new instance of MController
     */
    public MController() {
    }
    
}
