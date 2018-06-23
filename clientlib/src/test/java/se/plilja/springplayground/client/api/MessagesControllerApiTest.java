/*
 * Api Documentation
 * Api Documentation
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package se.plilja.springplayground.client.api;

import se.plilja.springplayground.client.model.Message;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for MessagesControllerApi
 */
@Ignore
public class MessagesControllerApiTest {

    private final MessagesControllerApi api = new MessagesControllerApi();

    
    /**
     * create
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void createTest() {
        Message message = null;
        Message response = api.create(message);

        // TODO: test validations
    }
    
    /**
     * delete
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void deleteTest() {
        Long id = null;
        api.delete(id);

        // TODO: test validations
    }
    
    /**
     * get
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getTest() {
        Long id = null;
        Message response = api.get(id);

        // TODO: test validations
    }
    
    /**
     * list
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void listTest() {
        List<Message> response = api.list();

        // TODO: test validations
    }
    
}
