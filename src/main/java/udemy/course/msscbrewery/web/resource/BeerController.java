package udemy.course.msscbrewery.web.resource;

import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
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

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/beer")
public class BeerController {

  private final BeerService beerService;

  @GetMapping("/{beerId}")
  public ResponseEntity<BeerDto> getBeer(@PathVariable UUID beerId) {
    return ResponseEntity.ok(beerService.getBeer(beerId));
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void addBeer(@RequestBody BeerDto beerDto){
    beerService.addBeer(beerDto);
  }

  @PutMapping("/{beerId}")
  public void updateBeer(@PathVariable UUID beerId, @RequestBody BeerDto beerDto){
    beerService.updateBeer(beerId, beerDto);
  }
}
