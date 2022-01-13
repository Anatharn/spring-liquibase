package sds.home.liquibasespringpoc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sds.home.liquibasespringpoc.domain.Person;

/**
 * @since 1/13/22
 */
@RepositoryRestResource()
public interface PersonRepository extends PagingAndSortingRepository<Person, Integer> {
}
