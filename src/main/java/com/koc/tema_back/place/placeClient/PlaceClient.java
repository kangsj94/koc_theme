package com.koc.tema_back.place.placeClient;

import com.koc.tema_back.place.PlaceDto;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name="place", url = "http://localhost:8081",configuration = PlaceConfig.class)
public interface PlaceClient {
        @RequestMapping(method = RequestMethod.GET,value = "/place",produces = "application/json")
        List<PlaceDto> getPlaceList();
}
