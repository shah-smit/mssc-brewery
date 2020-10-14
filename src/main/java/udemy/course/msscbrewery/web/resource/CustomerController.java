package udemy.course.msscbrewery.web.resource;

import java.util.UUID;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import udemy.course.msscbrewery.service.CustomerService;
import udemy.course.msscbrewery.web.model.BeerDto;
import udemy.course.msscbrewery.web.model.CustomerDto;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/customer")
public class CustomerController {

  private final CustomerService customerService;

  @GetMapping("/{customerId}")
  public ResponseEntity<CustomerDto> getBeer(@PathVariable UUID customerId) {
    return ResponseEntity.ok(customerService.getCustomer(customerId));
  }

}
