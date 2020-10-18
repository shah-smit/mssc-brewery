package udemy.course.msscbrewery.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import udemy.course.msscbrewery.web.model.BeerDto;

@ExtendWith(MockitoExtension.class)
class BeerServiceAdapterTest {

  @InjectMocks private BeerServiceAdapter beerServiceAdapter;

  @Test
  void getBeerWithAnyIdShouldReturnEmptyBeerDto() {
    BeerDto beerDto = beerServiceAdapter.getBeer(null);

    assertNotNull(beerDto);
  }

  @Test
  void getBeerWithValidIdShouldReturnEmptyBeerDtoWithSameId() {
    UUID uuid = UUID.randomUUID();
    BeerDto beerDto = beerServiceAdapter.getBeer(uuid);

    assertNotNull(beerDto);
    assertEquals(uuid, beerDto.getId());
  }
}
