package com.store.store.DTO.mapper;

import com.store.store.DTO.modelDTO.OptionDTO;
import com.store.store.commons.mapper.Mapper;
import com.store.store.model.Option;
import org.springframework.stereotype.Component;

@Component
public class OptionMapper implements Mapper<Option, OptionDTO> {


    @Override
    public OptionDTO map(Option from) {

        //todo - funkcja

        return new OptionDTO(
                from.getCode(),
                from.getLabel_EsEs(),
                from.getLabel_NlNl(),
                from.getLabel_NlBe(),
                from.getLabel_NbNo(),
                from.getLabel_ItIt(),
                from.getLabel_FrFr(),
                from.getLabel_FiFi(),
                from.getLabel_EnUs(),
                from.getLabel_SvSe(),
                from.getLabel_EnIe(),
                from.getLabel_EnGb(),
                from.getLabel_DeDe(),
                from.getLabel_DeCh(),
                from.getLabel_DeAt(),
                from.getLabel_DaDk(),
                from.getLabel_CsCz(),
                from.getLabel_PlPl(),
                from.getAttribute().getCode(),
                from.getSortOrder()
                );
    }


}
