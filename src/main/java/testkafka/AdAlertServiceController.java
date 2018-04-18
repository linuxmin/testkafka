package testkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController      //Spring Controller class, exposing http endpoints (e.g. for GET,POST...)
@RequestMapping(value = "kafka/")   //root uri for controller
public class AdAlertServiceController {
    @Autowired
    private AdAlertService adAlertService;

    @RequestMapping(value="/alerts/create/", method = RequestMethod.POST)
    @ResponseStatus(HttpStatus.CREATED)
    public AdAlert createAdvertisement (@RequestBody AdAlert adAlert) {
        AdAlert savedAdAlert = adAlertService.saveAdAlert(adAlert);
        return savedAdAlert;
    }
}
