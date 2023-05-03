import java.util.Comparator;

class SortByArrTime implements Comparator<Airport> {
    @Override
    public int compare(Airport airport1, Airport airport2) {
        return airport1.arrTime - airport2.arrTime;
    }
}

class SortByDeptTime implements Comparator<Airport> {
    @Override
    public int compare(Airport airport1, Airport airport2) {
        return airport2.deptTime - airport1.deptTime;
    }
}

class SortByPrice implements Comparator<Airport> {
    public int compare(Airport airport1, Airport airport2) {
        if(airport1.price == airport2.price){
            return airport1.name.compareTo(airport2.name);
        }
        return airport1.price - airport2.price;
    }
}