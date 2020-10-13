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
}
