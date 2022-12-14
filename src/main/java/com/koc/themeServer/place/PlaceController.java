package com.koc.themeServer.place;

import com.koc.themeServer.place.placeClient.PlaceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class PlaceController {
    private final PlaceClient placeClient;

    @GetMapping("/places")
    public List<PlaceDto> getPlaceList() {
        return placeClient.getPlaceList();
    }


}