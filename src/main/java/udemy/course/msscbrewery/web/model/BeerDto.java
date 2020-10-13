package udemy.course.msscbrewery.web.model;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {

  private UUID id;
  private String beerName;
  private String beerStyle;
  private Long upc;
}
