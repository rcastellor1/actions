package es.castellor.actions.repository;

import es.castellor.actions.entity.TableExample;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TableExampleRepository extends CrudRepository<TableExample, Integer> {
}
