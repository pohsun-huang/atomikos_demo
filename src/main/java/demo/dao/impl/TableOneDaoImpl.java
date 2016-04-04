package demo.dao.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;

import demo.dao.TableOneDao;
import demo.model.TableOne;

@Service
public class TableOneDaoImpl implements TableOneDao {

	private EntityManager entityManager;

	@PersistenceContext(unitName = "PersistenceUnit1")
	public void setEntityManager(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	public void save(TableOne tableOne) {
		entityManager.persist(tableOne);
	}

}
