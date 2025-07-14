//package com.example.parking.controller;
//
//import com.example.parking.model.slot;
//import com.example.parking.service.slotService;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@Controller
//public class ParkingController {
//    @Autowired
//    private slotService service;
//
//    private boolean isLoggedIn(HttpSession session) {
//        return session.getAttribute("user") != null;
//    }
//
//    @GetMapping("/")
//    public String home(HttpSession session) {
//        return isLoggedIn(session) ? "index" : "redirect:/login";
//    }
//
//    @GetMapping("/addslot")
//    public String addSlotForm(HttpSession session) {
//        return isLoggedIn(session) ? "addslot" : "redirect:/login";
//    }
//
//    @PostMapping("/addslot")
//    public String addSlot(@RequestParam String slotNumber, HttpSession session) {
//        if (!isLoggedIn(session)) return "redirect:/login";
//        slot s = new slot();
//        s.setSlotNumber(slotNumber);
//        s.setOccupied(false);
//        service.addSlot(s);
//        return "redirect:/viewslots";
//    }
//
//    @GetMapping("/viewslots")
//    public String viewSlots(Model model, HttpSession session) {
//        if (!isLoggedIn(session)) return "redirect:/login";
//        List<slot> slots = service.getAllSlots();
//        model.addAttribute("slots", slots);
//        return "viewslots";
//    }
//
//    @GetMapping("/bookslot/{id}")
//    public String bookSlot(@PathVariable Integer id, HttpSession session) {
//        if (!isLoggedIn(session)) return "redirect:/login";
//        service.bookSlot(id);
//        return "bookslot";
//    }
//
//    @GetMapping("/releaseslot/{id}")
//    public String releaseSlot(@PathVariable Integer id, HttpSession session) {
//        if (!isLoggedIn(session)) return "redirect:/login";
//        service.releaseSlot(id);
//        return "releaseslot";
//    }
//}
//package com.example.parking.controller;
//
//import com.example.parking.model.slot;
//import com.example.parking.service.slotService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class ParkingController {
//
//    @Autowired
//    private slotService service;
//
//    // Home Page
//    @GetMapping("/")
//    public String home() {
//        return "index";
//    }
//
//    // Show Add Slot Form
//    @GetMapping("/addslot")
//    public String addSlotForm(Model model) {
//        model.addAttribute("slot", new slot());
//        return "addslot";
//    }
//
//    // Save Slot
//    @PostMapping("/addslot")
//    public String saveSlot(@ModelAttribute slot s) {
//        service.addSlot(s);
//        return "redirect:/viewslots";
//    }
//
//    // View All Slots
//    @GetMapping("/viewslots")
//    public String viewSlots(Model model) {
//        model.addAttribute("slots", service.getAllSlots());
//        return "viewslots";
//    }
//
//    // Book Slot by ID
//    @GetMapping("/bookslot/{id}")
//    public String bookSlot(@PathVariable int id) {
//        service.bookSlot(id);
//        return "bookslot";  // show booking success page
//    }
//
//    // Release Slot by ID
//    @GetMapping("/releaseslot/{id}")
//    public String releaseSlot(@PathVariable int id) {
//        service.releaseSlot(id);
//        return "releaseslot"; // show release success page
//    }
//}
//package com.example.parking.controller;
//
//import com.example.parking.model.slot;
//import com.example.parking.service.slotService;
//import jakarta.servlet.http.HttpSession;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.*;
//
//@Controller
//public class ParkingController {
//
//    @Autowired
//    private slotService service;
//
//    // Dashboard/Home after login
//    @GetMapping("/index")
//    public String home(HttpSession session) {
//        if (session.getAttribute("user") == null) {
//            return "redirect:/login";
//        }
//        return "index";
//    }
//
//    // Add Slot Form
//    @GetMapping("/addslot")
//    public String addSlotForm(Model model, HttpSession session) {
//        if (session.getAttribute("user") == null) return "redirect:/login";
//
//        model.addAttribute("slot", new slot());
//        return "addslot";
//    }
//
//    // Save Slot
//    @PostMapping("/addslot")
//    public String saveSlot(@ModelAttribute slot s, HttpSession session) {
//        if (session.getAttribute("user") == null) return "redirect:/login";
//
//        service.addSlot(s);
//        return "redirect:/viewslots";
//    }
//
//    // View Slots
//    @GetMapping("/viewslots")
//    public String viewSlots(Model model, HttpSession session) {
//        if (session.getAttribute("user") == null) return "redirect:/login";
//
//        model.addAttribute("slots", service.getAllSlots());
//        return "viewslots";
//    }
//
//    // Book Slot
//    @GetMapping("/bookslot/{id}")
//    public String bookSlot(@PathVariable int id, HttpSession session) {
//        if (session.getAttribute("user") == null) return "redirect:/login";
//
//        service.bookSlot(id);
//        return "bookslot";
//    }
//
//    // Release Slot
//    @GetMapping("/releaseslot/{id}")
//    public String releaseSlot(@PathVariable int id, HttpSession session) {
//        if (session.getAttribute("user") == null) return "redirect:/login";
//
//        service.releaseSlot(id);
//        return "releaseslot";
//    }
//}
package com.example.parking.controller;

import com.example.parking.model.slot;
import com.example.parking.service.slotService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class ParkingController {

    @Autowired
    private slotService service;

    @GetMapping("/index")
    public String index(HttpSession session) {
        if (session.getAttribute("user") == null) {
            return "redirect:/login";
        }
        return "index";
    }

    @GetMapping("/addslot")
    public String addSlotForm(Model model, HttpSession session) {
        if (session.getAttribute("user") == null) return "redirect:/login";
        model.addAttribute("slot", new slot());
        return "addslot";
    }

    @PostMapping("/addslot")
    public String saveSlot(@ModelAttribute slot s, HttpSession session) {
        if (session.getAttribute("user") == null) return "redirect:/login";
        service.addSlot(s);
        return "redirect:/viewslots";
    }

    @GetMapping("/viewslots")
    public String viewSlots(Model model, HttpSession session) {
        if (session.getAttribute("user") == null) return "redirect:/login";
        model.addAttribute("slots", service.getAllSlots());
        return "viewslots";
    }

    @GetMapping("/bookslot/{id}")
    public String bookSlot(@PathVariable int id, HttpSession session) {
        if (session.getAttribute("user") == null) return "redirect:/login";
        service.bookSlot(id);
        return "bookslot";
    }

    @GetMapping("/releaseslot/{id}")
    public String releaseSlot(@PathVariable int id, HttpSession session) {
        if (session.getAttribute("user") == null) return "redirect:/login";
        service.releaseSlot(id);
        return "releaseslot";
    }
}
