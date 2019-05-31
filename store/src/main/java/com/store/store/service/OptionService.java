package com.store.store.service;

import com.store.store.DTO.mapper.OptionMapper;
import com.store.store.DTO.modelDTO.OptionDTO;
import com.store.store.model.Option;
import com.store.store.repository.OptionRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class OptionService {

    private OptionRepository optionRepository;
    private OptionMapper optionMapper;


    public OptionService(OptionRepository optionRepository, OptionMapper optionMapper) {
        this.optionRepository = optionRepository;
        this.optionMapper = optionMapper;
    }

    //DAO
    public List<Option> getOptions(){ return optionRepository.findAll();
    }


    //DTO
    public List<OptionDTO> getOptionsDTO(){
        List<OptionDTO> optionDTOS = new ArrayList<>();
        for (Option o: optionRepository.findAll()) {
            optionDTOS.add(optionMapper.map(o));
        }
        return optionDTOS;
    }

}
