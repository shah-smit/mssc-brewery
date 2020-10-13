package udemy.course.msscbrewery.web.resource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.any;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import udemy.course.msscbrewery.service.BeerService;
import udemy.course.msscbrewery.web.model.BeerDto;

@ExtendWith(MockitoExtension.class)
class BeerControllerTest {

  @InjectMocks
  private BeerController controller;

  @Mock
  private BeerService beerService;

  @Test
  void getBeerShouldReturnEmptyBeerObjectWithNullBeerId() {
    when(beerService.getBeer(any())).thenReturn(BeerDto.builder().build());

    ResponseEntity<BeerDto> entity = controller.getBeer(null);

    assertEquals(HttpStatus.OK, entity.getStatusCode());
    assertNotNull(entity.getBody());
    assertNull(entity.getBody().getBeerName());

    verify(beerService, times(1)).getBeer(isNull());
  }
}