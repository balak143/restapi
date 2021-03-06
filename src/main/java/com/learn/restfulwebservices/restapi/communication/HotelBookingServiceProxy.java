package com.learn.restfulwebservices.restapi.communication;

import com.learn.restfulwebservices.restapi.RibbonConfiguration;
import com.learn.restfulwebservices.restapi.pojo.HotelBookingRequest;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = "hotel-booking-service"/*, url = "http://localhost:8091"*/)
@RibbonClient(name = "hotel-booking-service", configuration = RibbonConfiguration.class)
public interface HotelBookingServiceProxy {
    @PostMapping("/hotel/booking")
    ResponseEntity<Object> bookHotel(@RequestBody HotelBookingRequest request);
}