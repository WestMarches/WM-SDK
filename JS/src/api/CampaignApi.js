/**
 * WestMarches API
 * West Marches API
 *
 * The version of the OpenAPI document: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 *
 */


import ApiClient from "../ApiClient";
import Campaign from '../model/Campaign';

/**
* Campaign service.
* @module api/CampaignApi
* @version 1.0.0
*/
export default class CampaignApi {

    /**
    * Constructs a new CampaignApi. 
    * @alias module:api/CampaignApi
    * @class
    * @param {module:ApiClient} [apiClient] Optional API client implementation to use,
    * default to {@link module:ApiClient#instance} if unspecified.
    */
    constructor(apiClient) {
        this.apiClient = apiClient || ApiClient.instance;
    }


    /**
     * Callback function to receive the result of the apiCampaignGet operation.
     * @callback module:api/CampaignApi~apiCampaignGetCallback
     * @param {String} error Error message, if any.
     * @param {Array.<module:model/Campaign>} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {module:api/CampaignApi~apiCampaignGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link Array.<module:model/Campaign>}
     */
    apiCampaignGet(callback) {
      let postBody = null;

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['Bearer'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = [Campaign];
      return this.apiClient.callApi(
        '/api/campaign', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the apiCampaignIdGet operation.
     * @callback module:api/CampaignApi~apiCampaignIdGetCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Campaign} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {String} id 
     * @param {module:api/CampaignApi~apiCampaignIdGetCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Campaign}
     */
    apiCampaignIdGet(id, callback) {
      let postBody = null;
      // verify the required parameter 'id' is set
      if (id === undefined || id === null) {
        throw new Error("Missing the required parameter 'id' when calling apiCampaignIdGet");
      }

      let pathParams = {
        'id': id
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['Bearer'];
      let contentTypes = [];
      let accepts = ['application/json'];
      let returnType = Campaign;
      return this.apiClient.callApi(
        '/api/campaign/{id}', 'GET',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the apiCampaignPost operation.
     * @callback module:api/CampaignApi~apiCampaignPostCallback
     * @param {String} error Error message, if any.
     * @param data This operation does not return a value.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {module:model/Campaign} opts.campaign 
     * @param {module:api/CampaignApi~apiCampaignPostCallback} callback The callback function, accepting three arguments: error, data, response
     */
    apiCampaignPost(opts, callback) {
      opts = opts || {};
      let postBody = opts['campaign'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['Bearer'];
      let contentTypes = ['application/json'];
      let accepts = [];
      let returnType = null;
      return this.apiClient.callApi(
        '/api/campaign', 'POST',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }

    /**
     * Callback function to receive the result of the apiCampaignPut operation.
     * @callback module:api/CampaignApi~apiCampaignPutCallback
     * @param {String} error Error message, if any.
     * @param {module:model/Campaign} data The data returned by the service call.
     * @param {String} response The complete HTTP response.
     */

    /**
     * @param {Object} opts Optional parameters
     * @param {module:model/Campaign} opts.campaign 
     * @param {module:api/CampaignApi~apiCampaignPutCallback} callback The callback function, accepting three arguments: error, data, response
     * data is of type: {@link module:model/Campaign}
     */
    apiCampaignPut(opts, callback) {
      opts = opts || {};
      let postBody = opts['campaign'];

      let pathParams = {
      };
      let queryParams = {
      };
      let headerParams = {
      };
      let formParams = {
      };

      let authNames = ['Bearer'];
      let contentTypes = ['application/json'];
      let accepts = ['application/json'];
      let returnType = Campaign;
      return this.apiClient.callApi(
        '/api/campaign', 'PUT',
        pathParams, queryParams, headerParams, formParams, postBody,
        authNames, contentTypes, accepts, returnType, null, callback
      );
    }


}
