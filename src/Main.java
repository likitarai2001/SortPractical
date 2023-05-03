import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public void displayFlights(ArrayList<Airport> arr){
        System.out.println("Flight information");
        for(Airport airportObj : arr){
            System.out.println("Name: " + airportObj.name + " | Journey: " + airportObj.journey + " | Arrival: " + airportObj.arrTime + " | Departure: "
                    + airportObj.deptTime + " | Price: " + airportObj.price);
        }
        System.out.println("");
    }
    public static void main(String[] args) {

        Main mainObj = new Main();

        ArrayList<Airport> arr = new ArrayList<Airport>();
        arr.add(new Airport("IndiGo", "AMD to BLR", 12, 13, 3700));
        arr.add(new Airport("Akasa Air", "BOM to COK", 14, 15, 4800));
        arr.add(new Airport("Vistara", "BLR to HYD", 16, 19, 6800));
        arr.add(new Airport("Air India", "DEL to BOM", 21, 23, 6800));

        System.out.println("Welcome to Sardar Vallabhbhai Patel International Airport, Ahmedabad\n");

        Collections.sort(arr);
        mainObj.displayFlights(arr);

        Collections.sort(arr, new SortByArrTime());
        mainObj.displayFlights(arr);

        Collections.sort(arr, new SortByDeptTime());
        mainObj.displayFlights(arr);

        Collections.sort(arr, new SortByPrice());
        mainObj.displayFlights(arr);

        Collections.sort(arr, (airport1, airport2) -> airport2.arrTime - airport1.arrTime);
        mainObj.displayFlights(arr);
    }
}