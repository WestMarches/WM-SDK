/*
 * WestMarches API
 * West Marches API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package org.openapitools.client.api;

import org.openapitools.client.ApiException;
import org.junit.Test;
import org.junit.Ignore;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DiscordApi
 */
@Ignore
public class DiscordApiTest {

    private final DiscordApi api = new DiscordApi();

    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void addStoreToDiscordServerTest() throws ApiException {
        String id = null;
        api.addStoreToDiscordServer(id);

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void closeDiscordServerTest() throws ApiException {
        api.closeDiscordServer();

        // TODO: test validations
    }
    
    /**
     * 
     *
     * 
     *
     * @throws ApiException
     *          if the Api call fails
     */
    @Test
    public void getIncomingForDiscordServerTest() throws ApiException {
        List<Object> response = api.getIncomingForDiscordServer();

        // TODO: test validations
    }
    
}