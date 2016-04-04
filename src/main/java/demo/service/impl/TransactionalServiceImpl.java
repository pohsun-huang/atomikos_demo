package demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import demo.dao.TableOneDao;
import demo.dao.TableTwoDao;
import demo.model.TableOne;
import demo.model.TableTwo;
import demo.service.TransactionalService;

@Service
public class TransactionalServiceImpl implements TransactionalService {

	@Autowired
	private TableOneDao tableOneDao;

	@Autowired
	private TableTwoDao tableTwoDao;

	@Transactional(rollbackFor = Exception.class)
	public void persist(TableOne tableOne, TableTwo tableTwo) {
		tableOneDao.save(tableOne);
		tableTwoDao.save(tableTwo);
	}

}
