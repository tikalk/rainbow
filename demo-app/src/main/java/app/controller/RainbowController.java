package app.controller;

import app.model.RainbowModel;
import app.repository.RainbowRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/rainbow")
public class RainbowController {

    @Autowired
    private RainbowRepository rainbowRepository;


    @RequestMapping(value = "/", method = RequestMethod.POST)
    public HttpStatus createRainbow(@RequestBody RainbowModel rainbow) {

        rainbowRepository.save(rainbow);
        return HttpStatus.ACCEPTED;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public List<RainbowModel> getAllRainbows() {

        return  rainbowRepository.findAll();

    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public HttpStatus deleteRainbow(@PathVariable String id) {

        rainbowRepository.delete(id);
        return HttpStatus.ACCEPTED;
    }

}
