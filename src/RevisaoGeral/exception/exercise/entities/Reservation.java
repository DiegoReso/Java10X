package RevisaoGeral.exception.exercise.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer room;
    private Date checkin;
    private Date checkout;

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation() {
    }

    public Reservation(Integer room, Date checkin, Date checkout) {
        this.room = room;
        this.checkin = checkin;
        this.checkout = checkout;
    }

    long duration(){

        long diff = checkout.getTime() - checkin.getTime();
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

    }

    public String updateDates(Date checkin, Date checkout){

        Date now = new Date();

        if(checkin.before(now) || checkout.before(now)){
            return"Error in reservation: Check out date must be future";
        }
        if(!checkout.after(checkin)){
            return "Error in reservation: Check out date must be after check-in";
        }else{
            this.checkin = checkin;
            this.checkout = checkout;
            return null;
        }
    }

    public Integer getRoom() {
        return room;
    }

    public void setRoom(Integer room) {
        this.room = room;
    }

    public Date getCheckinDate() {
        return checkin;
    }

    public Date getCheckoutDate() {
        return checkout;
    }

    @Override
    public String toString() {
        return "Room "
                + room
                + " checkin: "
                + sdf.format(checkin)
                + ", checkout: "
                + sdf.format(checkout)
                +", "
                + duration()
                + " nights";
    }
}
