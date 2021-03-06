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
import java.util.UUID;
import org.openapitools.client.model.Campaign;
import org.openapitools.client.model.GameSystem;

/**
 * Item
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T20:22:10.805+10:30[Australia/Adelaide]")
public class Item {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_HOME_BREW_ORIGIN = "homeBrewOrigin";
  @SerializedName(SERIALIZED_NAME_HOME_BREW_ORIGIN)
  private Campaign homeBrewOrigin;

  public static final String SERIALIZED_NAME_ITEM_NAME = "itemName";
  @SerializedName(SERIALIZED_NAME_ITEM_NAME)
  private String itemName;

  public static final String SERIALIZED_NAME_CURRENCY_VALUE = "currencyValue";
  @SerializedName(SERIALIZED_NAME_CURRENCY_VALUE)
  private Integer currencyValue;

  public static final String SERIALIZED_NAME_GAME_SYSTEM = "game_System";
  @SerializedName(SERIALIZED_NAME_GAME_SYSTEM)
  private GameSystem gameSystem;


  public Item id(UUID id) {
    
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public UUID getId() {
    return id;
  }


  public void setId(UUID id) {
    this.id = id;
  }


  public Item homeBrewOrigin(Campaign homeBrewOrigin) {
    
    this.homeBrewOrigin = homeBrewOrigin;
    return this;
  }

   /**
   * Get homeBrewOrigin
   * @return homeBrewOrigin
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Campaign getHomeBrewOrigin() {
    return homeBrewOrigin;
  }


  public void setHomeBrewOrigin(Campaign homeBrewOrigin) {
    this.homeBrewOrigin = homeBrewOrigin;
  }


  public Item itemName(String itemName) {
    
    this.itemName = itemName;
    return this;
  }

   /**
   * Get itemName
   * @return itemName
  **/
  @ApiModelProperty(required = true, value = "")

  public String getItemName() {
    return itemName;
  }


  public void setItemName(String itemName) {
    this.itemName = itemName;
  }


  public Item currencyValue(Integer currencyValue) {
    
    this.currencyValue = currencyValue;
    return this;
  }

   /**
   * Get currencyValue
   * @return currencyValue
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getCurrencyValue() {
    return currencyValue;
  }


  public void setCurrencyValue(Integer currencyValue) {
    this.currencyValue = currencyValue;
  }


  public Item gameSystem(GameSystem gameSystem) {
    
    this.gameSystem = gameSystem;
    return this;
  }

   /**
   * Get gameSystem
   * @return gameSystem
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public GameSystem getGameSystem() {
    return gameSystem;
  }


  public void setGameSystem(GameSystem gameSystem) {
    this.gameSystem = gameSystem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Item item = (Item) o;
    return Objects.equals(this.id, item.id) &&
        Objects.equals(this.homeBrewOrigin, item.homeBrewOrigin) &&
        Objects.equals(this.itemName, item.itemName) &&
        Objects.equals(this.currencyValue, item.currencyValue) &&
        Objects.equals(this.gameSystem, item.gameSystem);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, homeBrewOrigin, itemName, currencyValue, gameSystem);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Item {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    homeBrewOrigin: ").append(toIndentedString(homeBrewOrigin)).append("\n");
    sb.append("    itemName: ").append(toIndentedString(itemName)).append("\n");
    sb.append("    currencyValue: ").append(toIndentedString(currencyValue)).append("\n");
    sb.append("    gameSystem: ").append(toIndentedString(gameSystem)).append("\n");
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

