package udemy.course.msscbrewery.web.resource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.http.ResponseEntity;
import udemy.course.msscbrewery.service.CustomerService;
import udemy.course.msscbrewery.web.model.CustomerDto;

@ExtendWith(MockitoExtension.class)
class CustomerControllerTest {

  @InjectMocks private CustomerController controller;

  @Mock private CustomerService customerService;

  @Test
  public void testShouldReturnCustomerDto() {
    when(customerService.getCustomer(any())).thenReturn(CustomerDto.builder().build());

    ResponseEntity<CustomerDto> customerDto = controller.getCustomer(null);

    assertNotNull(customerDto);
    verify(customerService, times(1)).getCustomer(isNull());
  }

  @Test
  public void testShouldAddCustomer() {
    CustomerDto build = CustomerDto.builder().build();
    controller.addCustomer(build);

    verify(customerService, times(1)).addCustomer(build);
  }

  @Test
  public void testShouldUpdateCustomer() {
    UUID uuid = UUID.randomUUID();
    CustomerDto build = CustomerDto.builder().build();

    controller.updateCustomer(uuid, build);

    verify(customerService, times(1)).updateCustomer(uuid, build);
  }

  @Test
  public void testShouldDeleteCustomer() {
    UUID uuid = UUID.randomUUID();

    controller.deleteCustomer(uuid);

    verify(customerService, times(1)).deleteCustomer(uuid);
  }
}
