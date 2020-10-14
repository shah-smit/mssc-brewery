package udemy.course.msscbrewery.service;

import java.util.UUID;
import udemy.course.msscbrewery.web.model.BeerDto;

public interface BeerService {

  BeerDto getBeer(UUID beerId);

  void addBeer(BeerDto beerDto);

  void updateBeer(UUID beerId, BeerDto beerDto);

  void deleteBeer(UUID beerId);
}
