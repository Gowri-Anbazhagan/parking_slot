//package com.example.parking.service;
//
//import java.util.List;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//import com.example.parking.model.slot;
//import com.example.parking.repository.slotRepository;
//
//@Service
//public class slotService {
//    @Autowired
//    private slotRepository repository;
//
//    public List<slot> getAllSlots() {
//        return repository.findAll();
//    }
//
//    public void addSlot(slot s) {
//        repository.save(s);
//    }
//
//    public void bookSlot(Integer id) {
//        repository.findById(id).ifPresent(s -> {
//            s.setOccupied(true);
//            repository.save(s);
//        });
//    }
//
//    public void releaseSlot(Integer id) {
//        repository.findById(id).ifPresent(s -> {
//            s.setOccupied(false);
//            repository.save(s);
//        });
//    }
//}
package com.example.parking.service;

import com.example.parking.model.slot;
import com.example.parking.repository.slotRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class slotService {

    @Autowired
    private slotRepository repository;

    public List<slot> getAllSlots() {
        return repository.findAll();
    }

    public void addSlot(slot s) {
        System.out.println("📌 Saving Slot: " + s.getSlotNumber());
        repository.save(s);
    }

    public void bookSlot(int id) {
        slot s = repository.findById(id).orElse(null);
        if (s != null) {
            s.setOccupied(true);
            repository.save(s);
        }
    }

    public void releaseSlot(int id) {
        slot s = repository.findById(id).orElse(null);
        if (s != null) {
            s.setOccupied(false);
            repository.save(s);
        }
    }
}
