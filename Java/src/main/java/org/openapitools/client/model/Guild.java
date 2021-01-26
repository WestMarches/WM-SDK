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


package org.openapitools.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.openapitools.client.model.Campaign;

/**
 * Guild
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-26T11:34:06.333+10:30[Australia/Adelaide]")
public class Guild {
  public static final String SERIALIZED_NAME_CAMPAIGN = "campaign";
  @SerializedName(SERIALIZED_NAME_CAMPAIGN)
  private Campaign campaign;

  public static final String SERIALIZED_NAME_DISCORD_ID = "discordId";
  @SerializedName(SERIALIZED_NAME_DISCORD_ID)
  private Long discordId;

  public static final String SERIALIZED_NAME_GUILD_NAME = "guildName";
  @SerializedName(SERIALIZED_NAME_GUILD_NAME)
  private String guildName;

  public static final String SERIALIZED_NAME_STORE_CATEGORY_NAME = "storeCategoryName";
  @SerializedName(SERIALIZED_NAME_STORE_CATEGORY_NAME)
  private String storeCategoryName;


  public Guild campaign(Campaign campaign) {
    
    this.campaign = campaign;
    return this;
  }

   /**
   * Get campaign
   * @return campaign
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Campaign getCampaign() {
    return campaign;
  }


  public void setCampaign(Campaign campaign) {
    this.campaign = campaign;
  }


  public Guild discordId(Long discordId) {
    
    this.discordId = discordId;
    return this;
  }

   /**
   * Get discordId
   * @return discordId
  **/
  @ApiModelProperty(required = true, value = "")

  public Long getDiscordId() {
    return discordId;
  }


  public void setDiscordId(Long discordId) {
    this.discordId = discordId;
  }


  public Guild guildName(String guildName) {
    
    this.guildName = guildName;
    return this;
  }

   /**
   * Get guildName
   * @return guildName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getGuildName() {
    return guildName;
  }


  public void setGuildName(String guildName) {
    this.guildName = guildName;
  }


  public Guild storeCategoryName(String storeCategoryName) {
    
    this.storeCategoryName = storeCategoryName;
    return this;
  }

   /**
   * Get storeCategoryName
   * @return storeCategoryName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getStoreCategoryName() {
    return storeCategoryName;
  }


  public void setStoreCategoryName(String storeCategoryName) {
    this.storeCategoryName = storeCategoryName;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guild guild = (Guild) o;
    return Objects.equals(this.campaign, guild.campaign) &&
        Objects.equals(this.discordId, guild.discordId) &&
        Objects.equals(this.guildName, guild.guildName) &&
        Objects.equals(this.storeCategoryName, guild.storeCategoryName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(campaign, discordId, guildName, storeCategoryName);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guild {\n");
    sb.append("    campaign: ").append(toIndentedString(campaign)).append("\n");
    sb.append("    discordId: ").append(toIndentedString(discordId)).append("\n");
    sb.append("    guildName: ").append(toIndentedString(guildName)).append("\n");
    sb.append("    storeCategoryName: ").append(toIndentedString(storeCategoryName)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

