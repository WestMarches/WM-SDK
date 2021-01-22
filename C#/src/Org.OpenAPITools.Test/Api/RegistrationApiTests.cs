/*
 * WestMarches API
 *
 * West Marches API
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */

using System;
using System.IO;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Reflection;
using RestSharp;
using Xunit;

using Org.OpenAPITools.Client;
using Org.OpenAPITools.Api;
// uncomment below to import models
//using Org.OpenAPITools.Model;

namespace Org.OpenAPITools.Test.Api
{
    /// <summary>
    ///  Class for testing RegistrationApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class RegistrationApiTests : IDisposable
    {
        private RegistrationApi instance;

        public RegistrationApiTests()
        {
            instance = new RegistrationApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of RegistrationApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' RegistrationApi
            //Assert.IsType<RegistrationApi>(instance);
        }

        /// <summary>
        /// Test ApiRegistrationPost
        /// </summary>
        [Fact]
        public void ApiRegistrationPostTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //RegistrationRequest registrationRequest = null;
            //instance.ApiRegistrationPost(registrationRequest);
        }
    }
}
