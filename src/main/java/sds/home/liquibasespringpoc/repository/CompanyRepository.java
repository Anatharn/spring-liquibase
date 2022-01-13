package sds.home.liquibasespringpoc.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import sds.home.liquibasespringpoc.domain.Company;

/**
 * @author Sébastien DE SANTIS, SFEIR Benelux
 * @version 1.0
 * @since 1/13/22
 */
@RepositoryRestResource
public interface CompanyRepository extends PagingAndSortingRepository<Company, Integer> {
}
