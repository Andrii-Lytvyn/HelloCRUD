package spring.service;

import org.springframework.stereotype.Service;
import spring.domain.Event;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventService {

    static final ArrayList<Event> events = new ArrayList<Event>() {{
        add(new Event("Opera", "London"));
        add(new Event("Violin concert", "Prague"));
        add(new Event("Jazz concert", "Berlin"));
        add(new Event("Art exhibition", "London"));
    }};

    public List<Event> findAll() {
        return events;
    }

    public void add(Event event) {
        events.add(event);
    }

    public List<String> findAllCities() {
        List<String> cities = new ArrayList<>(events.size());
        for (int i = 0; i < events.size(); i++) {
            cities.add(i, events.get(i).getCity());
        }
        return cities;
    }
}