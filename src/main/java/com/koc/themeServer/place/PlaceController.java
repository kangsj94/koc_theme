package com.koc.themeServer.place;

import com.koc.themeServer.place.placeClient.PlaceClient;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/places")
public class PlaceController {
    private final PlaceClient placeClient;

    @GetMapping
    public List<PlaceDto> getPlaceList() {
        return placeClient.getPlaceList();
    }


}
