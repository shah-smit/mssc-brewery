package udemy.course.msscbrewery.web.model;

import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {
  @Null
  private UUID id;
  @NotBlank
  private String beerName;
  @NotBlank
  private String beerStyle;
  @Positive
  private Long upc;
}
