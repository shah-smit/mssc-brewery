package udemy.course.msscbrewery.service;

import java.util.UUID;
import udemy.course.msscbrewery.web.model.CustomerDto;

public interface CustomerService {

  CustomerDto getCustomer(UUID id);

  void addCustomer(CustomerDto customerDto);

  void updateCustomer(UUID customerId, CustomerDto customerDto);
}
