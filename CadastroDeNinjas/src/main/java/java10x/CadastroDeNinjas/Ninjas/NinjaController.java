package java10x.CadastroDeNinjas.Ninjas;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping

public class NinjaController {

    @GetMapping("/ninjas")
    public NinjaModel ninjaModel() {
        return new NinjaModel();
    }


}
