package com.sadatmalik.brewerymicroservice.web.mappers;

import com.sadatmalik.brewerymicroservice.domain.Beer;
import com.sadatmalik.brewerymicroservice.web.model.BeerDto;
import org.mapstruct.Mapper;

@Mapper(uses = {DateMapper.class})
public interface BeerMapper {

    BeerDto beerToBeerDto(Beer beer);

    Beer beerDtoToBeer(BeerDto dto);
}