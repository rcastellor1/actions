package es.castellor.actions.integration;


import es.castellor.actions.entity.TableExample;
import es.castellor.actions.repository.TableExampleRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ITTableExampleRepositoryTest {
    
    @Autowired
    private TableExampleRepository tableExampleRepository;
    
    @Test
    @Transactional
    @Rollback(false)
    void saveTableExample() {
        TableExample example = TableExample.builder()
                .name("EJEMPLO")
                .description("Descripción del ejemplo").build();
        assertDoesNotThrow(() ->this.tableExampleRepository.save(example));
    }
}
