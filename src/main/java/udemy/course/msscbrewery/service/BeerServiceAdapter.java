package udemy.course.msscbrewery.service;

import java.util.UUID;
import org.springframework.stereotype.Service;
import udemy.course.msscbrewery.web.model.BeerDto;

@Service
public class BeerServiceAdapter implements BeerService {

  @Override
  public BeerDto getBeer(UUID beerId) {
    return BeerDto.builder().id(beerId).build();
  }

  @Override
  public void addBeer(BeerDto beerDto) {}

  @Override
  public void updateBeer(UUID beerId, BeerDto beerDto) {}

  @Override
  public void deleteBeer(UUID beerId) {}
}
