package advancedJavaProject1;


import java.time.LocalTime;

public abstract class ChargeType {

    String ChargeType;
    Integer Price;
    LocalTime timeIn = LocalTime.now(); //Gather check in time
    LocalTime timeOutMIN = LocalTime.MIN;  // Set constant to overwrite
    LocalTime timeOut = LocalTime.now();  // Set constant to overwrite
    int ID = LocalTime.now().hashCode();
    int numberOfCarsInCharge = 0;


    public String getChargeType() {
        return ChargeType;
    }

   public void setChargeType(String chargeType) {
        ChargeType = chargeType;
    }

    public Integer getPrice() {
        return Price;
    }

    public void setPrice(Integer price) {
        Price = price;
    }

    public LocalTime getTimeIn() {
        return timeIn;
    }

    public void setTimeIn(LocalTime timeIn) {
        this.timeIn = timeIn;
    }

    public LocalTime getTimeOutMIN() {
        return timeOutMIN;
    }

    public void setTimeOutMIN(LocalTime timeOutMIN) {
        this.timeOutMIN = timeOutMIN;
    }

    public LocalTime getTimeOut() {
        return timeOut;
    }

    public void setTimeOut(LocalTime timeOut) {
        this.timeOut = timeOut;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void addTicket(){
        numberOfCarsInCharge = numberOfCarsInCharge + 1;
    }
}


