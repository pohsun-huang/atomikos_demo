package demo.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.HttpRequestHandler;

import demo.model.TableOne;
import demo.model.TableTwo;
import demo.service.TransactionalService;

@Component("testServlet")
public class TestServlet implements HttpRequestHandler {

	@Autowired
	private TransactionalService transactionalService;

	public void handleRequest(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {

		TableOne tableOne = new TableOne();
		tableOne.setValue("value1");

		TableTwo tableTwo = new TableTwo();
		tableTwo.setValue("value2");
		
		transactionalService.persist(tableOne, tableTwo);
	}

}
