import java.util.*;
import java.util.ArrayList;

public class Bus implements Comparable<Bus> {
    int capacity;
    int busNumber;
    ArrayList<Passaengers> passengers;

    public Bus(int capacity, int busNumber) {
        this.capacity = capacity;
        if (capacity < 0)
            capacity = 0;
        this.busNumber = busNumber;
        if (busNumber < 0) busNumber = 0;
        this.passengers = new ArrayList<Passaengers>();
    }

    @Override
    public String toString() {
        return "Bus{" +

                ", busNumber=" + busNumber+
                '}';
    }

    public Double calculateAllWeight() {
        double sum = 0;
        for (Passaengers p : passengers) {
            sum += p.getWeight();
        }
        return sum;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getBusNumber() {
        return busNumber;
    }

    public ArrayList<Passaengers> getPassengers() {
        return passengers;
    }

    public void enterPassenger(Passaengers pas) {
        this.passengers.add(pas);
    }


    public int compareTo(Bus o ) {
        return this.calculateAllWeight().compareTo(o.calculateAllWeight());
    }
    //    public int compareTo(Helicopter o) {
    //        return this.name.compareTo(o.name);
    //    }

}