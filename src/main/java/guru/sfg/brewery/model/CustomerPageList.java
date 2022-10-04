package guru.sfg.brewery.model;

import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.Pageable;

import java.util.List;

public class CustomerPageList extends PageImpl<CustomerDto> {
    public CustomerPageList(List<CustomerDto> content, Pageable pageable, long total){
        super(content, pageable, total);
    }

    public CustomerPageList(List<CustomerDto> content){
        super(content);
    }
}
