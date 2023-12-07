//Nguyen Van Dung-20215013
//Create Aims class
package aims;

import cart.Cart;
import disc.DigitalVideoDisc;

public class Aims {
     public static void main(String[] args) {
    	 //TODO Auto-generated method stub

		// Create new Cart
		Cart anOrder = new Cart();
		
		//Add dvd1
        DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King", "Animation", "Roger Allers", 87, 19.95f);
        //anOrder.addDigitalVideoDisc(dvd1);
        
        //Add dvd2
        DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars", "Science Fiction", "George Lucas", 87, 24.95f);
        //anOrder.addDigitalVideoDisc(dvd2);
        
        //Add dvd3
        DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin", "Animation",18.99f);
        //anOrder.addDigitalVideoDisc(dvd3);
        
        //Method add DigitalVideoDisc with 2 parameters
        anOrder.addDigitalVideoDisc(dvd1,dvd2,dvd3);
        
        //Search by Title
        //anOrder.searchTitle();
        
        //Search by ID
        //anOrder.searchId();
        
        //PrintList
        //anOrder.printList();
        //CheckId
        //System.out.println(dvd1.getId() +"\t" + dvd2.getId()+"\t"+dvd3.getId());
        //Caculate the cost
        //System.out.println("Total Cost is : ");
        //System.out.println(anOrder.totalCost());
        
        //Check method removeDigitalVideoDisc
        //DigitalVideoDisc dvd4 = new DigitalVideoDisc("Conan", "Animation", "Aoyama", 87, 29.95f);
        //anOrder.removeDigitalVideoDisc(dvd4);
        anOrder.removeDigitalVideoDisc(dvd3);
	}

}
