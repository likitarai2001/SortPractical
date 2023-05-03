public class Airport implements Comparable<Airport>{
    String name;
    String journey;
    int arrTime;
    int deptTime;
    int price;

    Airport(String name, String journey, int arrTime, int deptTime, int price){
        this.name = name;
        this.journey = journey;
        this.arrTime = arrTime;
        this.deptTime = deptTime;
        this.price = price;
    }

    @Override
    public int compareTo(Airport airport) {
        return this.name.compareTo(airport.name);
    }
}