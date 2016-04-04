package demo.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import demo.dao.TableTwoDao;
import demo.model.TableTwo;

@Service
public class TableTwoDaoImpl implements TableTwoDao {

	private EntityManager entityManager;

	@PersistenceContext(unitName = "PersistenceUnit2")
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void save(TableTwo tableTwo) {
		entityManager.persist(tableTwo);
		throw new RuntimeException("test rollback");
	}

}
