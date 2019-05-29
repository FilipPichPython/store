package com.store.store.controller;

import com.store.store.model.Option;
import com.store.store.service.OptionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")  //prefix
public class OptionController {

    private OptionService optionService;

    public OptionController(OptionService optionService) {
        this.optionService = optionService;
    }

    @GetMapping("/options")
    public List<Option> getAllOptions(){
        return optionService.getOptions();
    }
}
