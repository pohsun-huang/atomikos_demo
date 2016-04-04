package demo.service;

import demo.model.TableOne;
import demo.model.TableTwo;

public interface TransactionalService {

	void persist(TableOne tableOne, TableTwo tableTwo);

}
