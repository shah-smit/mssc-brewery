package udemy.course.msscbrewery.web.model;

import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Positive;
import javax.validation.constraints.PositiveOrZero;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class BeerDto {
  @Null private UUID id;
  @Null private Long version;
  @Null private Timestamp createdDate;
  @Null private Timestamp lastModifiedDate;
  @NotBlank private String beerName;
  @NotBlank private String beerStyle;
  @Positive private Long upc;
  @Positive private BigDecimal price;
  @PositiveOrZero private Integer minOnHand;
  @PositiveOrZero private Integer quantityToBrew;
}
