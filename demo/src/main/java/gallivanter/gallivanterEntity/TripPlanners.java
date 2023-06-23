package gallivanter.gallivanterEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "TRIP_ITINENARY")
public class TripPlanners {

    private String planName;
    private String destination;
    private String hotelName;
    private String hotelAddress;
    private String hoteCheckin;
    private String hotelCheckout;
    private String flightName;
    private String flightNumber;
    private String flghtTo;
    private String flightFrom;
    private String tripStart;
    private String tripEnd;
    private String notes;
    private String tripActivities;

    @Column(name = "PLAN_NAME", length = 64, nullable = false)
    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    @Column(name = "DESTINATION", length = 64, nullable = false)
    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    @Column(name = "HOTEL_NAME", length = 64, nullable = true)
    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    @Column(name = "HOTEL_ADDRESS", length = 64, nullable = true)
    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    @Column(name = "HOTEL_CHECKIN", length = 64, nullable = true)
    public String getHoteCheckin() {
        return hoteCheckin;
    }

    public void setHoteCheckin(String hoteCheckin) {
        this.hoteCheckin = hoteCheckin;
    }

    @Column(name = "HOTEL_CHECKOUT", length = 64, nullable = true)
    public String getHotelCheckout() {
        return hotelCheckout;
    }

    public void setHotelCheckout(String hotelCheckout) {
        this.hotelCheckout = hotelCheckout;
    }

    @Column(name = "FLIGHT_NAME", length = 64, nullable = true)
    public String getFlightName() {
        return flightName;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    @Column(name = "FLIGHT_NUMBER", length = 64, nullable = true)
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    @Column(name = "FLIGHT_TO", length = 64, nullable = true)
    public String getFlghtTo() {
        return flghtTo;
    }

    public void setFlghtTo(String flghtTo) {
        this.flghtTo = flghtTo;
    }

    @Column(name = "FLIGHT_FROM", length = 64, nullable = true)
    public String getFlightFrom() {
        return flightFrom;
    }

    public void setFlightFrom(String flightFrom) {
        this.flightFrom = flightFrom;
    }

    @Column(name = "TRIP_START", length = 64, nullable = false)

    public String getTripStart() {
        return tripStart;
    }

    public void setTripStart(String tripStart) {
        this.tripStart = tripStart;
    }

    @Column(name = "TRIP_END", length = 64, nullable = false)
    public String getTripEnd() {
        return tripEnd;
    }

    public void setTripEnd(String tripEnd) {
        this.tripEnd = tripEnd;
    }

    @Column(name = "NOTES", length = 64, nullable = true)
    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Column(name = "TRIP_ACTIVITIES", length = 64, nullable = true)
    public String getTripActivities() {
        return tripActivities;
    }

    public void setTripActivities(String tripActivities) {
        this.tripActivities = tripActivities;
    }
}
