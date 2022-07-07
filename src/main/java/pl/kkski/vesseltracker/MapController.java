package pl.kkski.vesseltracker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import pl.kkski.vesseltracker.services.VesselService;

@Controller
public class MapController {

    private final VesselService vesselService;

    public MapController(VesselService vesselService) {
        this.vesselService = vesselService;
    }


    @GetMapping
    public String showMap(Model model) {
        model.addAttribute("vessels", vesselService.getVessels());
        return "map";
    }
}
