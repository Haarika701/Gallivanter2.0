package gallivanter.gallivanterEntity;

import jakarta.persistence.*;

@Entity
@Table(name = "Trip Itinenary")
public class TripPlanners {

    @Column(name = "plan_name", length = 64, nullable = false)
    String planName;

    @Column(name = "destination", length = 64, nullable = false)
    String destination;

    @Column(name = "hotel_name", length = 64, nullable = true)
    String hotelName;

    @Column(name = "hotel_address", length = 64, nullable = true)
    String hotelAddress;

    @Column(name = "hotel_checkin", length = 64, nullable = true)
    String hoteCheckin;

    @Column(name = "hotel_checkout", length = 64, nullable = true)
    String hotelCheckout;

    @Column(name = "flight_name", length = 64, nullable = true)
    String flightName;

    @Column(name = "flight_number", length = 64, nullable = true)
    String flightNumber;

    @Column(name = "flight_to", length = 64, nullable = true)
    String flghtTo;

    @Column(name = "flight_from", length = 64, nullable = true)
    String flightFrom;

    @Column(name = "trip_start", length = 64, nullable = false)
    String tripStart;

    @Column(name = "trip_end", length = 64, nullable = false)
    String tripEnd;

    @Column(name = "notes", length = 64, nullable = true)
    String notes;

    @Column(name = "trip_activities", length = 64, nullable = true)
    String tripActivities;

}
