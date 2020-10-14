package udemy.course.msscbrewery.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.UUID;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;
import udemy.course.msscbrewery.web.model.CustomerDto;

@ExtendWith(MockitoExtension.class)
public class CustomerServiceAdapterTest {

  @InjectMocks
  CustomerServiceAdapter customerServiceAdapter;

  @Test
  public void testShouldReturnCustomerDtoWithGivenId() {
    UUID uuid = UUID.randomUUID();
    CustomerDto customerDto = customerServiceAdapter.getCustomer(uuid);

    assertNotNull(customerDto);
    assertEquals(uuid, customerDto.getId());
  }

}
