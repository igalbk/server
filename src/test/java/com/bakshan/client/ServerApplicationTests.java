package com.bakshan.client;

import _com.bakshan_.client.ApiException;
import _com.bakshan_.client.controllers.HomeControllerApi;
import _com.bakshan_.client.models.ResponseRecord;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.DirtiesContext;
import org.springframework.test.context.junit.jupiter.SpringExtension;

@ExtendWith({ SpringExtension.class})
@DirtiesContext(classMode = DirtiesContext.ClassMode.AFTER_CLASS)
@SpringBootTest(classes = ServerApplication.class,properties = "server.port=8181", webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
class ServerApplicationTests {

	HomeControllerApi client = new HomeControllerApi();
	@Test void contextLoads() throws ApiException {
		Integer num=40;
		ResponseRecord responseRecord = client.getSomething("Igal",num);
		Assertions.assertEquals(num, responseRecord.getAge());
		Assertions.assertEquals(num+1, responseRecord.getAgeNextYear());
	}

}
