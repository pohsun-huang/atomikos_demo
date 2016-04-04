package demo.service.impl;

import org.springframework.transaction.annotation.Transactional;

import demo.dao.table_one.TableOneDao;
import demo.dao.table_two.TableTwoDao;
import demo.model.TableOne;
import demo.model.TableTwo;
import demo.service.TransactionalService;

public class TransactionalServiceImpl implements TransactionalService {

	// @Autowired
	private TableOneDao tableOneDao;

	// @Autowired
	private TableTwoDao tableTwoDao;

	public TransactionalServiceImpl(TableOneDao tableOneDao,
			TableTwoDao tableTwoDao) {
		this.tableOneDao = tableOneDao;
		this.tableTwoDao = tableTwoDao;

	}

	@Transactional(rollbackFor = Exception.class)
	public void persist(TableOne tableOne, TableTwo tableTwo) {
		tableOneDao.save(tableOne);
		tableTwoDao.save(tableTwo);
	}

}
