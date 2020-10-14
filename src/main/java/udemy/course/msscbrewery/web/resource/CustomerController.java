package udemy.course.msscbrewery.web.resource;

import java.util.UUID;
import lombok.AllArgsConstructor;
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
import udemy.course.msscbrewery.service.CustomerService;
import udemy.course.msscbrewery.web.model.CustomerDto;

@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/customer")
public class CustomerController {

  private final CustomerService customerService;

  @GetMapping("/{customerId}")
  public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId) {
    return ResponseEntity.ok(customerService.getCustomer(customerId));
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void addCustomer(@RequestBody CustomerDto customerDto) {
    customerService.addCustomer(customerDto);
  }

  @PutMapping("/{customerId}")
  public void updateCustomer(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto) {
    customerService.updateCustomer(customerId, customerDto);
  }

  @DeleteMapping("/{customerId}")
  public void deleteCustomer(@PathVariable UUID customerId) {
    customerService.deleteCustomer(customerId);
  }

}
