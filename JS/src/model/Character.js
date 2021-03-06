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

import ApiClient from '../ApiClient';
import Campaign from './Campaign';
import Stock from './Stock';
import User from './User';
import UserRoles from './UserRoles';

/**
 * The Character model module.
 * @module model/Character
 * @version 1.0.0
 */
class Character {
    /**
     * Constructs a new <code>Character</code>.
     * @alias module:model/Character
     * @param name {String} 
     * @param level {Number} 
     * @param inspiration {Number} 
     * @param currency {Number} 
     * @param experience {Number} 
     * @param alive {Boolean} 
     * @param readyDate {Date} 
     */
    constructor(name, level, inspiration, currency, experience, alive, readyDate) { 
        
        Character.initialize(this, name, level, inspiration, currency, experience, alive, readyDate);
    }

    /**
     * Initializes the fields of this object.
     * This method is used by the constructors of any subclasses, in order to implement multiple inheritance (mix-ins).
     * Only for internal use.
     */
    static initialize(obj, name, level, inspiration, currency, experience, alive, readyDate) { 
        obj['name'] = name;
        obj['level'] = level;
        obj['inspiration'] = inspiration;
        obj['currency'] = currency;
        obj['experience'] = experience;
        obj['alive'] = alive;
        obj['readyDate'] = readyDate;
    }

    /**
     * Constructs a <code>Character</code> from a plain JavaScript object, optionally creating a new instance.
     * Copies all relevant properties from <code>data</code> to <code>obj</code> if supplied or a new instance if not.
     * @param {Object} data The plain JavaScript object bearing properties of interest.
     * @param {module:model/Character} obj Optional instance to populate.
     * @return {module:model/Character} The populated <code>Character</code> instance.
     */
    static constructFromObject(data, obj) {
        if (data) {
            obj = obj || new Character();

            if (data.hasOwnProperty('id')) {
                obj['id'] = ApiClient.convertToType(data['id'], 'String');
            }
            if (data.hasOwnProperty('owner')) {
                obj['owner'] = User.constructFromObject(data['owner']);
            }
            if (data.hasOwnProperty('server')) {
                obj['server'] = Campaign.constructFromObject(data['server']);
            }
            if (data.hasOwnProperty('name')) {
                obj['name'] = ApiClient.convertToType(data['name'], 'String');
            }
            if (data.hasOwnProperty('level')) {
                obj['level'] = ApiClient.convertToType(data['level'], 'Number');
            }
            if (data.hasOwnProperty('inspiration')) {
                obj['inspiration'] = ApiClient.convertToType(data['inspiration'], 'Number');
            }
            if (data.hasOwnProperty('currency')) {
                obj['currency'] = ApiClient.convertToType(data['currency'], 'Number');
            }
            if (data.hasOwnProperty('format')) {
                obj['format'] = ApiClient.convertToType(data['format'], 'String');
            }
            if (data.hasOwnProperty('experience')) {
                obj['experience'] = ApiClient.convertToType(data['experience'], 'Number');
            }
            if (data.hasOwnProperty('experienceCap')) {
                obj['experienceCap'] = ApiClient.convertToType(data['experienceCap'], 'Number');
            }
            if (data.hasOwnProperty('alive')) {
                obj['alive'] = ApiClient.convertToType(data['alive'], 'Boolean');
            }
            if (data.hasOwnProperty('inventory')) {
                obj['inventory'] = ApiClient.convertToType(data['inventory'], [Stock]);
            }
            if (data.hasOwnProperty('roles')) {
                obj['roles'] = ApiClient.convertToType(data['roles'], [UserRoles]);
            }
            if (data.hasOwnProperty('readyDate')) {
                obj['readyDate'] = ApiClient.convertToType(data['readyDate'], 'Date');
            }
            if (data.hasOwnProperty('ddBeyond')) {
                obj['ddBeyond'] = ApiClient.convertToType(data['ddBeyond'], 'Number');
            }
        }
        return obj;
    }


}

/**
 * @member {String} id
 */
Character.prototype['id'] = undefined;

/**
 * @member {module:model/User} owner
 */
Character.prototype['owner'] = undefined;

/**
 * @member {module:model/Campaign} server
 */
Character.prototype['server'] = undefined;

/**
 * @member {String} name
 */
Character.prototype['name'] = undefined;

/**
 * @member {Number} level
 */
Character.prototype['level'] = undefined;

/**
 * @member {Number} inspiration
 */
Character.prototype['inspiration'] = undefined;

/**
 * @member {Number} currency
 */
Character.prototype['currency'] = undefined;

/**
 * @member {String} format
 */
Character.prototype['format'] = undefined;

/**
 * @member {Number} experience
 */
Character.prototype['experience'] = undefined;

/**
 * @member {Number} experienceCap
 */
Character.prototype['experienceCap'] = undefined;

/**
 * @member {Boolean} alive
 */
Character.prototype['alive'] = undefined;

/**
 * @member {Array.<module:model/Stock>} inventory
 */
Character.prototype['inventory'] = undefined;

/**
 * @member {Array.<module:model/UserRoles>} roles
 */
Character.prototype['roles'] = undefined;

/**
 * @member {Date} readyDate
 */
Character.prototype['readyDate'] = undefined;

/**
 * @member {Number} ddBeyond
 */
Character.prototype['ddBeyond'] = undefined;






export default Character;

