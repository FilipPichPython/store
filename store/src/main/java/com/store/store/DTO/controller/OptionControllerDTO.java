package com.store.store.DTO.controller;

import com.store.store.DTO.modelDTO.OptionDTO;
import com.store.store.service.OptionService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/dto")
public class OptionControllerDTO {

    private OptionService optionService;

    public OptionControllerDTO(OptionService optionService) {
        this.optionService = optionService;
    }
    @GetMapping("/options")
    public List<OptionDTO> getAllOptionsDTO(){
        return optionService.getOptionsDTO();
    }
}
