package udemy.course.msscbrewery.service;

import org.mapstruct.Mapper;
import udemy.course.msscbrewery.entity.Beer;
import udemy.course.msscbrewery.web.model.BeerDto;

@Mapper
public interface BeerMapper {
  Beer mapToBeer(BeerDto beerDto);
  BeerDto mapTOBeerDto(Beer beer);
}
