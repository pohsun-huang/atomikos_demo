package demo.dao.table_two;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.TableTwo;

public interface TableTwoDao extends JpaRepository<TableTwo, Long> {

}
