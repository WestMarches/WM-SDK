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


export interface Guild { 
    campaign?: Campaign;
    discordId: number;
    guildName: string;
    storeCategoryName?: string | null;
}
