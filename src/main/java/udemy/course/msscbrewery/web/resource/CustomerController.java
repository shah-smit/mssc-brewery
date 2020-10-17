package udemy.course.msscbrewery.web.resource;

import java.util.UUID;
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
import udemy.course.msscbrewery.service.CustomerService;
import udemy.course.msscbrewery.web.model.CustomerDto;

@Slf4j
@RestController
@AllArgsConstructor
@RequestMapping("/api/v1/customer")
public class CustomerController {

  private final CustomerService customerService;

  @GetMapping("/{customerId}")
  public ResponseEntity<CustomerDto> getCustomer(@PathVariable UUID customerId) {
    log.info("getCustomer {}", customerId);
    return ResponseEntity.ok(customerService.getCustomer(customerId));
  }

  @PostMapping
  @ResponseStatus(HttpStatus.CREATED)
  public void addCustomer(@RequestBody CustomerDto customerDto) {
    log.info("addCustomer {}", customerDto.toString());
    customerService.addCustomer(customerDto);
  }

  @PutMapping("/{customerId}")
  public void updateCustomer(@PathVariable UUID customerId, @RequestBody CustomerDto customerDto) {
    log.info("updateCustomer {}", customerId);
    customerService.updateCustomer(customerId, customerDto);
  }

  @DeleteMapping("/{customerId}")
  public void deleteCustomer(@PathVariable UUID customerId) {
    log.info("deleteCustomer {}", customerId.toString());
    customerService.deleteCustomer(customerId);
  }

}
