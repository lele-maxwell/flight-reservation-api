/**
 * OpenAPI definition
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v0
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
    factory(root.expect, root.OpenApiDefinition);
  }
}(this, function(expect, OpenApiDefinition) {
  'use strict';

  var instance;

  beforeEach(function() {
    instance = new OpenApiDefinition.Ticket();
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

  describe('Ticket', function() {
    it('should create an instance of Ticket', function() {
      // uncomment below and update the code to test Ticket
      //var instance = new OpenApiDefinition.Ticket();
      //expect(instance).to.be.a(OpenApiDefinition.Ticket);
    });

    it('should have the property id (base name: "id")', function() {
      // uncomment below and update the code to test the property id
      //var instance = new OpenApiDefinition.Ticket();
      //expect(instance).to.be();
    });

    it('should have the property passengerName (base name: "passengerName")', function() {
      // uncomment below and update the code to test the property passengerName
      //var instance = new OpenApiDefinition.Ticket();
      //expect(instance).to.be();
    });

    it('should have the property companyName (base name: "companyName")', function() {
      // uncomment below and update the code to test the property companyName
      //var instance = new OpenApiDefinition.Ticket();
      //expect(instance).to.be();
    });

    it('should have the property originAddress (base name: "originAddress")', function() {
      // uncomment below and update the code to test the property originAddress
      //var instance = new OpenApiDefinition.Ticket();
      //expect(instance).to.be();
    });

    it('should have the property destinationAddress (base name: "destinationAddress")', function() {
      // uncomment below and update the code to test the property destinationAddress
      //var instance = new OpenApiDefinition.Ticket();
      //expect(instance).to.be();
    });

    it('should have the property kickoffDate (base name: "kickoffDate")', function() {
      // uncomment below and update the code to test the property kickoffDate
      //var instance = new OpenApiDefinition.Ticket();
      //expect(instance).to.be();
    });

  });

}));
