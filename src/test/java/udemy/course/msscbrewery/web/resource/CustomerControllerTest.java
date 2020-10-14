package udemy.course.msscbrewery.web.resource;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.isNull;
import static org.mockito.Mockito.*;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import udemy.course.msscbrewery.service.CustomerService;
import udemy.course.msscbrewery.web.model.CustomerDto;

@ExtendWith(MockitoExtension.class)
class CustomerControllerTest {

  @InjectMocks
  private CustomerController controller;

  @Mock
  private CustomerService customerService;

  @Test
  public void testShouldReturnCustomerDto(){
    when(customerService.getCustomer(any())).thenReturn(CustomerDto.builder().build());

    CustomerDto customerDto = customerService.getCustomer(null);

    assertNotNull(customerDto);
    verify(customerService, times(1)).getCustomer(isNull());
  }

}