package advancedJavaProject1;

import java.time.Duration;
import java.time.LocalTime;

public class InAndOut extends ChargeType {


    private static final Duration MIN = Duration.ofHours(5) ;
    private static final Duration MAX = Duration.ofHours(15);

    public InAndOut() {


        setChargeType("InAndOut");
        setPrice(1);


        LocalTime timeIn = LocalTime.now(); //Gather check in time
        LocalTime timeOutMIN = LocalTime.MIN;  // Set constant to overwrite
    }

    public void setTimeOut(LocalTime timeOut) {
        this.timeOut = timeOut;
    }
    public void setTimeIn(LocalTime timeIn) {
        this.timeOut = timeIn;
    }


    public LocalTime getTimeOut() {
        return timeOut;
    }
    public LocalTime getTimeIn() {
        return timeIn;
    }
    //set min

   // set time out
  //  set time in
   // get time out
   // get time in


    public int getTime()
    {
        Duration totalTime = Duration.between(getTimeIn(), getTimeOut());

        if (totalTime.compareTo(MIN) < 0 ) //if the time is negative return a min
        {
            return 5; //minhours

        }
        else if (totalTime.compareTo(MAX) > 0 )
        {
            return 15;
        }

        else return totalTime.toHoursPart();

    }

}




