package demo.dao.table_one;

import org.springframework.data.jpa.repository.JpaRepository;

import demo.model.TableOne;

public interface TableOneDao extends JpaRepository<TableOne, Long> {

}
