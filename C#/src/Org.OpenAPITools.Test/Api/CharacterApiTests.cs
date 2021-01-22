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
    ///  Class for testing CharacterApi
    /// </summary>
    /// <remarks>
    /// This file is automatically generated by OpenAPI Generator (https://openapi-generator.tech).
    /// Please update the test case below to test the API endpoint.
    /// </remarks>
    public class CharacterApiTests : IDisposable
    {
        private CharacterApi instance;

        public CharacterApiTests()
        {
            instance = new CharacterApi();
        }

        public void Dispose()
        {
            // Cleanup when everything is done.
        }

        /// <summary>
        /// Test an instance of CharacterApi
        /// </summary>
        [Fact]
        public void InstanceTest()
        {
            // TODO uncomment below to test 'IsType' CharacterApi
            //Assert.IsType<CharacterApi>(instance);
        }

        /// <summary>
        /// Test ApiCharacterIdGet
        /// </summary>
        [Fact]
        public void ApiCharacterIdGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //long id = null;
            //var response = instance.ApiCharacterIdGet(id);
            //Assert.IsType<string>(response);
        }

        /// <summary>
        /// Test ApiCharacterMyIdGet
        /// </summary>
        [Fact]
        public void ApiCharacterMyIdGetTest()
        {
            // TODO uncomment below to test the method and replace null with proper value
            //Guid id = null;
            //var response = instance.ApiCharacterMyIdGet(id);
            //Assert.IsType<List<Character>>(response);
        }
    }
}