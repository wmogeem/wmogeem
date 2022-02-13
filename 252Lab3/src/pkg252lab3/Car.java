

package pkg252lab3;


public class Car {

    String make;
    String model;
    int year;
    List<String> recalls;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.recalls = fetchCarRecalls();
    }

    public 

    private List<Recall> fetchCarRecalls(){
        try{
            Thread.sleep(2000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    return null;
    }

}
