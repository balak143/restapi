package com.learn.restfulwebservices.restapi;

import com.learn.restfulwebservices.restapi.pojo.VacationBookingReq;
import com.learn.restfulwebservices.restapi.service.VacationBookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/vacation/{vacationID}/book")
public class BookingController {
    @Autowired
   private VacationBookingService vacationBookingService;


    @PostMapping
    public ResponseEntity bookVacation(@PathVariable("vacationID") Long vacationID, @RequestBody VacationBookingReq  vacationBookingReq){
        return  vacationBookingService.book(vacationID,vacationBookingReq);
    }
}
