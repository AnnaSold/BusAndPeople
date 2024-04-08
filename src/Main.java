import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Passaengers pas1 = new Passaengers("Том", 25, 108.3);
        Passaengers pas2 = new Passaengers("Liz", 15, 48);
        Passaengers pas3 = new Passaengers("Lily", 32, 63.1);
        Passaengers pas4 = new Passaengers("Barny", 38, 82);
        Passaengers pas5 = new Passaengers("Robin", 36, 54);
        Passaengers pas6 = new Passaengers("Ted", 38, 79);
        Passaengers pas7 = new Passaengers("Marshall", 38, 110);
        Passaengers pas8 = new Passaengers("Henry", 20, 62);
        Passaengers pas9 = new Passaengers("Harry", 2, 11);
        Passaengers pas10 = new Passaengers("Marry", 21, 48.5);
        Passaengers pas11 = new Passaengers("Olga", 45, 73.5);
        Passaengers pas12 = new Passaengers("Serj", 48, 98.3);

        //
        Bus bus1 = new Bus(13,50);
        bus1.enterPassenger(pas1);
        bus1.enterPassenger(pas2);
        bus1.enterPassenger(pas3);

        Bus bus2 = new Bus(5,158);
        bus2.enterPassenger(pas4);
        bus2.enterPassenger(pas5);
        bus2.enterPassenger(pas6);
        bus2.enterPassenger(pas7);
        bus2.enterPassenger(pas8);

        Bus bus3 = new Bus(4,200);
        bus3.enterPassenger(pas9);
        bus3.enterPassenger(pas10);
        bus3.enterPassenger(pas11);
        bus3.enterPassenger(pas12);

        //System.out.println(bus1.getPassengers());
        //System.out.println(bus2.getPassengers());
        //System.out.println(bus3.getPassengers());
        ArrayList<Bus> allBus = new ArrayList<Bus>();
        allBus.add(bus1);
        allBus.add(bus2);
        allBus.add(bus3);

        System.out.println(allBus);
        System.out.println(bus1.calculateAllWeight());
        System.out.println(bus2.calculateAllWeight());
        System.out.println(bus3.calculateAllWeight());
        allBus.sort(Comparator.naturalOrder());
        System.out.println(allBus);

    }

}