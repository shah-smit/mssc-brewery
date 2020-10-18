package udemy.course.msscbrewery.web.resource;

import java.util.UUID;
import javax.validation.Valid;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import udemy.course.msscbrewery.service.BeerService;
import udemy.course.msscbrewery.web.model.BeerDto;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/beer")
public class BeerController {

  private final BeerService beerService;

  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {
    log.info("getBeer {}", beerId);
    return ResponseEntity.ok(beerService.getBeer(beerId));
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void addBeer(@Valid @RequestBody BeerDto beerDto) {
    log.info("addBeer {}", beerDto);
    beerService.addBeer(beerDto);
  }

  @PutMapping("/{beerId}")
  public void updateBeer(@PathVariable UUID beerId, @Valid @RequestBody BeerDto beerDto) {
    log.info("update Beer with id {} ", beerId, beerDto);
    beerService.updateBeer(beerId, beerDto);
  }

  @DeleteMapping("/{beerId}")
  public void deleteBeer(@PathVariable UUID beerId) {
    log.info("deleting beer {}", beerId);
    beerService.deleteBeer(beerId);
  }
}
