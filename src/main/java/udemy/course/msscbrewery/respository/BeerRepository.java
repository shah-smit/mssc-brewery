package udemy.course.msscbrewery.respository;

import java.util.UUID;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;
import udemy.course.msscbrewery.entity.Beer;

@Repository
public interface BeerRepository extends PagingAndSortingRepository<Beer, UUID> {

}
