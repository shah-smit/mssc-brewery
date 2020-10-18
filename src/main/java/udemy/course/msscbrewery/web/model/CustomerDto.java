package udemy.course.msscbrewery.web.model;

import java.util.UUID;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Builder
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDto {
  @NotNull private UUID id;

  @NotBlank
  @Size(min = 3, max = 100)
  private String name;
}
