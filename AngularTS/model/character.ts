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
 */
import { Campaign } from './campaign';
import { User } from './user';
import { UserRoles } from './userRoles';
import { Stock } from './stock';


export interface Character { 
    id?: string;
    owner?: User;
    server?: Campaign;
    name: string;
    level: number;
    inspiration: number;
    currency: number;
    readonly format?: string | null;
    experience: number;
    experienceCap?: number;
    alive: boolean;
    inventory?: Array<Stock> | null;
    roles?: Array<UserRoles> | null;
    readyDate: string;
    ddBeyond?: number;
}

