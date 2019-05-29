package com.store.store.service;

import com.store.store.model.Option;
import com.store.store.repository.OptionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OptionService {

    private OptionRepository optionRepository;

    public OptionService(OptionRepository optionRepository) {
        this.optionRepository = optionRepository;
    }

    public List<Option> getOptions(){ return optionRepository.findAll();
    }


}
