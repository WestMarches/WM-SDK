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

(function(root, factory) {
  if (typeof define === 'function' && define.amd) {
    // AMD.
    define(['expect.js', process.cwd()+'/src/index'], factory);
  } else if (typeof module === 'object' && module.exports) {
    // CommonJS-like environments that support module.exports, like Node.
    factory(require('expect.js'), require(process.cwd()+'/src/index'));
  } else {
    // Browser globals (root is window)
    factory(root.expect, root.WestMarchesApi);
  }
}(this, function(expect, WestMarchesApi) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new WestMarchesApi.User();
  });

  var getProperty = function(object, getter, property) {
    // Use getter method if present; otherwise, get the property directly.
    if (typeof object[getter] === 'function')
      return object[getter]();
    else
      return object[property];
  }

  var setProperty = function(object, setter, property, value) {
    // Use setter method if present; otherwise, set the property directly.
    if (typeof object[setter] === 'function')
      object[setter](value);
    else
      object[property] = value;
  }

  describe('User', function() {
    it('should create an instance of User', function() {
      // uncomment below and update the code to test User
      //var instane = new WestMarchesApi.User();
      //expect(instance).to.be.a(WestMarchesApi.User);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new WestMarchesApi.User();
      //expect(instance).to.be();
    });

    it('should have the property discordId (base name: "discordId")', function() {
      // uncomment below and update the code to test the property discordId
      //var instance = new WestMarchesApi.User();
      //expect(instance).to.be();
    });

    it('should have the property givenName (base name: "givenName")', function() {
      // uncomment below and update the code to test the property givenName
      //var instance = new WestMarchesApi.User();
      //expect(instance).to.be();
    });

    it('should have the property familyName (base name: "familyName")', function() {
      // uncomment below and update the code to test the property familyName
      //var instance = new WestMarchesApi.User();
      //expect(instance).to.be();
    });

    it('should have the property dateCreated (base name: "dateCreated")', function() {
      // uncomment below and update the code to test the property dateCreated
      //var instance = new WestMarchesApi.User();
      //expect(instance).to.be();
    });

    it('should have the property characters (base name: "characters")', function() {
      // uncomment below and update the code to test the property characters
      //var instance = new WestMarchesApi.User();
      //expect(instance).to.be();
    });

    it('should have the property campaignsOwned (base name: "campaignsOwned")', function() {
      // uncomment below and update the code to test the property campaignsOwned
      //var instance = new WestMarchesApi.User();
      //expect(instance).to.be();
    });

  });

}));
