package superads.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import superads.entities.Advertisment;


@Repository
public interface AdvertismentRepository extends CrudRepository<Advertisment, Long> {

}
