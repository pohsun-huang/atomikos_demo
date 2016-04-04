//package atomikos_demo;
//
//import org.junit.runner.RunWith;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//import org.springframework.test.context.transaction.TransactionConfiguration;
//import org.springframework.transaction.annotation.Transactional;
//
//import demo.dao.table_one.TableOneDao;
//import demo.dao.table_two.TableTwoDao;
//import demo.model.TableOne;
//
//@ContextConfiguration(locations = "classpath:applicationContext.xml")
//@RunWith(SpringJUnit4ClassRunner.class)
//@Transactional
//@TransactionConfiguration(defaultRollback = true)
//public class Test {
//
//	@Autowired
//	TableOneDao tableOneDao;
//	@Autowired
//	TableTwoDao tableTwoDao;
//
//	/**
//	 * Tests a JTA transaction.
//	 */
//	@org.junit.Test
//	public void test() {
//		TableOne t1 = new TableOne();
//		t1.setValue("value2");
//
//		t1 = tableOneDao.save(t1);
//		System.err.println("........."+t1.getId());
//
////		final TableTwo t2 = new TableTwo();
////		t2.setValue("value2");
////
////		tableTwoDao.save(t2);
//
//		// final TableOne t2r = tableOneDao.findByName(PERSON_NAME);
//		// Assert.assertNotNull(retrievedPerson);
//		// Assert.assertNotNull(retrievedPerson.getID());
//		// Assert.assertEquals(PERSON_NAME, retrievedPerson.getName());
//		//
//		// final Product retrievedProduct = productRepository
//		// .findByName(PRODUCT_NAME);
//		// Assert.assertNotNull(retrievedProduct);
//		// Assert.assertNotNull(retrievedProduct.getID());
//		// Assert.assertEquals(PRODUCT_NAME, retrievedProduct.getName());
//	}
//}
