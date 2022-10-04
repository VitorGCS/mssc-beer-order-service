package guru.sfg.beer.order.service.services;

import guru.sfg.brewery.model.CustomerPageList;
import org.springframework.data.domain.Pageable;

public interface CustomerService {
    CustomerPageList listCustomers(Pageable pageable);
}
