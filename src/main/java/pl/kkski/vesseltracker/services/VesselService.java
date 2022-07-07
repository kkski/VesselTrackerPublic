package pl.kkski.vesseltracker.services;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.http.*;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.kkski.vesseltracker.dtos.VesselDto;
import pl.kkski.vesseltracker.model.ReferencePoint;
import pl.kkski.vesseltracker.model.Vessel;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;


@Service
public class VesselService {

    public List<VesselDto> getVessels() {
        RestTemplate restTemplate = new RestTemplate();
        HttpHeaders httpHeaders = new HttpHeaders();

        // it is not public api, so every request cost money. if you want to try the app let me know, we will see what we can do.
        // you can also buy subscription yourself using the link from README.md

        httpHeaders.add("X-RapidAPI-Key", "SEND ME A MESSAGE FOR API KEY IF YOU WANT TO TRY THE APP");
        httpHeaders.add("X-RapidAPI-Host", "vessel-data.p.rapidapi.com");
        HttpEntity httpEntity = new HttpEntity(httpHeaders);

        List<HttpMessageConverter<?>> messageConverters = new ArrayList<HttpMessageConverter<?>>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();

        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        restTemplate.setMessageConverters(messageConverters);

        ResponseEntity<ReferencePoint> exchange = restTemplate.exchange("https://vessel-data.p.rapidapi.com/get_vessels_by_position?latitude=51.29528709082863&longitude=4.285065583825203",
                HttpMethod.GET,
                httpEntity,
                ReferencePoint.class);


        List<Vessel> vessels = exchange.getBody().getVessels();

        List<VesselDto> vesselDtoList = vessels.stream().filter(val -> !val.getShipname().equals("[SAT-AIS]")).map(
                vessel -> new VesselDto(
                        vessel.getCourse(),
                        vessel.getDestination(),
                        vessel.getFlag(),
                        vessel.getLat(),
                        vessel.getLon(),
                        vessel.getShipname(),
                        vessel.getTypename(),
                        vessel.getStatusname(),
                        vessel.getShipid()
                )).collect(Collectors.toList());

        return vesselDtoList;

    }


}
