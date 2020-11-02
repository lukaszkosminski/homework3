public class Main{

    public static void main(String[] args){
        Client client1 = new Client();
        client1.setName("Mirek");
        client1.setAdress("Lakowa 2A");
        client1.setTelephone(569521425);



        Client client2 = new Client();
        client2.setName("Krysia");
        client2.setAdress("Nadrzeczna 6/3");
        client2.setTelephone(532626323);

        Client client3 = new Client();
        client3.setName("Damian");
        client3.setAdress("Polna 13");
        client3.setTelephone(845948565);

        Pizza pizza1 = new Pizza();
        pizza1.setPizzaSizze(PizzaSize.large);
        pizza1.setPizzaType(PizzaType.Peperoni);
        pizza1.setQuantity(1);

        Drinks drink1 = new Drinks();
        drink1.setDrinksType(DrinksType.juice);
        drink1.setQuantity(2);

        Pizza pizza2 = new Pizza();
        pizza2.setPizzaType(PizzaType.Hawaii);
        pizza2.setPizzaSizze(PizzaSize.small);
        pizza2.setQuantity(1);

        Pizza pizza3 = new Pizza();
        pizza3.setPizzaType(PizzaType.Capriciosa);
        pizza3.setPizzaSizze(PizzaSize.medium);
        pizza3.setQuantity(1);

        Drinks drink2 = new Drinks();
        drink2.setDrinksType(DrinksType.cola);
        drink2.setQuantity(1);

        Hamburger hamburger1 = new Hamburger();
        hamburger1.setHamburgerType(HamburgerType.Classic);
        hamburger1.setHamburgerSize(HamburgerSize.medium);
        hamburger1.setQuantity(1);

        Drinks drink3 = new Drinks();
        drink3.setDrinksType(DrinksType.beer);
        drink3.setQuantity(1);








        System.out.println(drink3.getDrinksType());



        System.out.println(client1.getName());
        System.out.println(client1.getAdress());
        System.out.println(client1.getTelephone());

        System.out.println(client2.getName());
        System.out.println(client2.getAdress());
        System.out.println(client2.getTelephone());

        System.out.println(client3.getName());
        System.out.println(client3.getAdress());
        System.out.println(client3.getTelephone());

    }
}
