package udemy.course.msscbrewery.web.model;

import java.util.UUID;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
  @NotNull
  private UUID id;
  @NotBlank
  @Min(3)
  @Max(100)
  private String name;
}
