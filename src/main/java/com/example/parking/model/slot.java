//package com.example.parking.model;
//
//import jakarta.persistence.*;
//
//@Entity
//@Table(name = "slots")
//public class slot {
//    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Integer id;
//
//    @Column(nullable = false)
//    private String slotNumber;
//
//    @Column(nullable = false)
//    private boolean occupied;
//
//    // Getters & setters
//    public Integer getId() { return id; }
//    public void setId(Integer id) { this.id = id; }
//    public String getSlotNumber() { return slotNumber; }
//    public void setSlotNumber(String slotNumber) { this.slotNumber = slotNumber; }
//    public boolean isOccupied() { return occupied; }
//    public void setOccupied(boolean occupied) { this.occupied = occupied; }
//}
package com.example.parking.model;

import jakarta.persistence.*;

@Entity
public class slot {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String slotNumber;
    private boolean occupied;

    // Getters and setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getSlotNumber() { return slotNumber; }
    public void setSlotNumber(String slotNumber) { this.slotNumber = slotNumber; }

    public boolean isOccupied() { return occupied; }
    public void setOccupied(boolean occupied) { this.occupied = occupied; }
}
