package es.castellor.actions.entity;

import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;


@Data
@Builder
@Table("table_example")
public class TableExample {

    @Id
    private Integer id;

    private String name;
    private String description;
    
}
