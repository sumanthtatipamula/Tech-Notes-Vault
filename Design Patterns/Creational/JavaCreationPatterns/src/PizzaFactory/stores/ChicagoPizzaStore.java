package PizzaFactory.stores;

import PizzaFactory.Chicago.ChicagoStyleCheesePizza;
import PizzaFactory.Chicago.ChicagoStyleClamPizza;
import PizzaFactory.Chicago.ChicagoStylePepperoniPizza;
import PizzaFactory.Chicago.ChicagoStyleVeggiePizza;
import PizzaFactory.Pizza;

public class ChicagoPizzaStore extends PizzaStore{
    @Override
    Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza =  new ChicagoStyleCheesePizza();
        }
        else if(type.equals("pepperoni")){
            pizza = new ChicagoStylePepperoniPizza();
        }
        else if(type.equals("clam")){
            pizza = new ChicagoStyleClamPizza();
        }
        else if(type.equals("veggie")){
            pizza = new ChicagoStyleVeggiePizza();
        }
        return pizza;
    }
}
