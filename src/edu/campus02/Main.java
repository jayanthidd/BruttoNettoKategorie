package edu.campus02;

import com.sun.deploy.security.SelectableSecurityManager;

public class Main {

    public static void main(String[] args) {
	int preis;
	int steuerKlasse;

	int steuerKlasse1;
	int steuerKlasse2;
	int steuerKlasse3;
//	int total;
	steuerKlasse1 =  20;
    steuerKlasse2 = 16;
    steuerKlasse3 = 8;

        steuerKlasse = steuerKlasse1;
	preis = 200;
	        System.out.println("The total price from the method is : " +steuer(steuerKlasse, 200));



        //if (steuerKlasse == steuerKlasse1)
          //  total = preis + (preis * steuerKlasse1 /100);
        //else if (steuerKlasse == steuerKlasse2)
          //  total = preis + (preis * steuerKlasse2 /100);
      //  else if (steuerKlasse == steuerKlasse3)
            //total = preis + (preis * steuerKlasse3 /100);
    //    else
  //          total = preis;

//        System.out.println("Total Preis : " + total);

        //with switch

    }
public static int steuer ( int steuerKlasse, int preis){
        int total;
        switch (steuerKlasse){
        case 20:
            total = preis + (preis * steuerKlasse /100);
            break;
        case 16:
            total = preis + (preis * steuerKlasse /100);
            break;
        case 8:
            total = preis + (preis * steuerKlasse /100);
            break;
        default:
            total = preis;
    }
//    System.out.println("Total Preis : " + total);
    return total;
}

}
