<<<<<<< HEAD
package com.oracle.userservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightId;

    @Column
    private String flightName;

    @Column
    private String source;

    @Column
    private String dest;

    @Column
    private Integer price;

    // add time, date

    @Column
    private Integer availableSeats;

//    @Column(name = "departure_date")
//	@JsonFormat(pattern = "mm-dd-yyyy HH:mm:ss")
//    private String deptDateTime;

//    @Column(name = "arrival_date")
//	@JsonFormat(pattern = "mm-dd-yyyy HH:mm:ss")
//    private String arrDateTime;


    public Flight() {
    }


    public Flight(Integer flightId, String flightName, String source, String dest, Integer price, Integer availableSeats) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.source = source;
        this.dest = dest;
        this.price = price;
        this.availableSeats=availableSeats;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getSource() {
        return source;
    }

    public String getDest() {
        return dest;
    }

    public Integer getPrice() {
        return price;
    }


    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", flightName='" + flightName + '\'' +
                ", source='" + source + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price +
                ", availableSeats=" + availableSeats+
                '}';
    }
}
=======
package com.oracle.userservice.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "flights")
public class Flight {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer flightId;

    @Column
    private String flightName;

    @Column
    private String source;

    @Column
    private String dest;

    @Column
    private Integer price;

    // add time, date

    @Column
    private Integer availableSeats;

//    @Column(name = "departure_date")
//	@JsonFormat(pattern = "mm-dd-yyyy HH:mm:ss")
//    private String deptDateTime;

//    @Column(name = "arrival_date")
//	@JsonFormat(pattern = "mm-dd-yyyy HH:mm:ss")
//    private String arrDateTime;


    public Flight() {
    }


    public Flight(Integer flightId, String flightName, String source, String dest, Integer price, Integer availableSeats) {
        this.flightId = flightId;
        this.flightName = flightName;
        this.source = source;
        this.dest = dest;
        this.price = price;
        this.availableSeats=availableSeats;
    }

    public Integer getFlightId() {
        return flightId;
    }

    public String getFlightName() {
        return flightName;
    }

    public String getSource() {
        return source;
    }

    public String getDest() {
        return dest;
    }

    public Integer getPrice() {
        return price;
    }


    public Integer getAvailableSeats() {
        return availableSeats;
    }

    public void setFlightId(Integer flightId) {
        this.flightId = flightId;
    }

    public void setFlightName(String flightName) {
        this.flightName = flightName;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }


    public void setAvailableSeats(Integer availableSeats) {
        this.availableSeats = availableSeats;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "flightId=" + flightId +
                ", flightName='" + flightName + '\'' +
                ", source='" + source + '\'' +
                ", dest='" + dest + '\'' +
                ", price=" + price +
                ", availableSeats=" + availableSeats+
                '}';
    }
}
>>>>>>> 0123469b063a7d675e6b6f59eb1374fefd8816aa
