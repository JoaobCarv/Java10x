package java10x.CadastroDeNinjas.Missions;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class MissionController {

    @GetMapping("/missions")
    public MissionModel missions() {
        return new MissionModel();
    }


}

