package udemy.course.msscbrewery.service;

import java.util.UUID;
import org.springframework.stereotype.Service;
import udemy.course.msscbrewery.web.model.CustomerDto;

@Service
public class CustomerServiceAdapter implements CustomerService{

  @Override
  public CustomerDto getCustomer(UUID id) {
    return CustomerDto.builder().id(id).build();
  }

  @Override
  public void addCustomer(CustomerDto customerDto) {

  }

  @Override
  public void updateCustomer(UUID customerId, CustomerDto customerDto) {

  }
}
