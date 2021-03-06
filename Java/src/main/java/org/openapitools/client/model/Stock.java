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
import org.openapitools.client.model.Item;

/**
 * Stock
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T20:22:10.805+10:30[Australia/Adelaide]")
public class Stock {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_DISCOUNT_PERCENTAGE = "discountPercentage";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_PERCENTAGE)
  private Double discountPercentage;

  public static final String SERIALIZED_NAME_DISCOUNT_FIXED = "discountFixed";
  @SerializedName(SERIALIZED_NAME_DISCOUNT_FIXED)
  private Integer discountFixed;

  public static final String SERIALIZED_NAME_UNLIMITED = "unlimited";
  @SerializedName(SERIALIZED_NAME_UNLIMITED)
  private Boolean unlimited;

  public static final String SERIALIZED_NAME_AMOUNT = "amount";
  @SerializedName(SERIALIZED_NAME_AMOUNT)
  private Integer amount;

  public static final String SERIALIZED_NAME_ITEM = "item";
  @SerializedName(SERIALIZED_NAME_ITEM)
  private Item item;

  public static final String SERIALIZED_NAME_PRICE = "price";
  @SerializedName(SERIALIZED_NAME_PRICE)
  private Integer price;


  public Stock id(UUID id) {
    
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


  public Stock discountPercentage(Double discountPercentage) {
    
    this.discountPercentage = discountPercentage;
    return this;
  }

   /**
   * Get discountPercentage
   * @return discountPercentage
  **/
  @ApiModelProperty(required = true, value = "")

  public Double getDiscountPercentage() {
    return discountPercentage;
  }


  public void setDiscountPercentage(Double discountPercentage) {
    this.discountPercentage = discountPercentage;
  }


  public Stock discountFixed(Integer discountFixed) {
    
    this.discountFixed = discountFixed;
    return this;
  }

   /**
   * Get discountFixed
   * @return discountFixed
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getDiscountFixed() {
    return discountFixed;
  }


  public void setDiscountFixed(Integer discountFixed) {
    this.discountFixed = discountFixed;
  }


  public Stock unlimited(Boolean unlimited) {
    
    this.unlimited = unlimited;
    return this;
  }

   /**
   * Get unlimited
   * @return unlimited
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Boolean getUnlimited() {
    return unlimited;
  }


  public void setUnlimited(Boolean unlimited) {
    this.unlimited = unlimited;
  }


  public Stock amount(Integer amount) {
    
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getAmount() {
    return amount;
  }


  public void setAmount(Integer amount) {
    this.amount = amount;
  }


  public Stock item(Item item) {
    
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Item getItem() {
    return item;
  }


  public void setItem(Item item) {
    this.item = item;
  }


   /**
   * Get price
   * @return price
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getPrice() {
    return price;
  }




  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Stock stock = (Stock) o;
    return Objects.equals(this.id, stock.id) &&
        Objects.equals(this.discountPercentage, stock.discountPercentage) &&
        Objects.equals(this.discountFixed, stock.discountFixed) &&
        Objects.equals(this.unlimited, stock.unlimited) &&
        Objects.equals(this.amount, stock.amount) &&
        Objects.equals(this.item, stock.item) &&
        Objects.equals(this.price, stock.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, discountPercentage, discountFixed, unlimited, amount, item, price);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Stock {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    discountPercentage: ").append(toIndentedString(discountPercentage)).append("\n");
    sb.append("    discountFixed: ").append(toIndentedString(discountFixed)).append("\n");
    sb.append("    unlimited: ").append(toIndentedString(unlimited)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

