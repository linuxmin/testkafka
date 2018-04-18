package testkafka;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdAlertService {
    @Autowired
    private AdAlertRepository adAlertRepository;




    public AdAlert saveAdAlert(AdAlert adAlert){
        return adAlertRepository.save(adAlert);
    }

    public List<AdAlert> getAdAlertByAdItemName(String adItemName){
        return adAlertRepository.findAdAlertByAdItemName(adItemName);
    }
}
