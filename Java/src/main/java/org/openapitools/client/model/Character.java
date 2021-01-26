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
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
import org.openapitools.client.model.Campaign;
import org.openapitools.client.model.Stock;
import org.openapitools.client.model.User;
import org.openapitools.client.model.UserRoles;
import org.threeten.bp.OffsetDateTime;

/**
 * Character
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-01-26T11:34:06.333+10:30[Australia/Adelaide]")
public class Character {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_OWNER = "owner";
  @SerializedName(SERIALIZED_NAME_OWNER)
  private User owner;

  public static final String SERIALIZED_NAME_SERVER = "server";
  @SerializedName(SERIALIZED_NAME_SERVER)
  private Campaign server;

  public static final String SERIALIZED_NAME_NAME = "name";
  @SerializedName(SERIALIZED_NAME_NAME)
  private String name;

  public static final String SERIALIZED_NAME_LEVEL = "level";
  @SerializedName(SERIALIZED_NAME_LEVEL)
  private Integer level;

  public static final String SERIALIZED_NAME_INSPIRATION = "inspiration";
  @SerializedName(SERIALIZED_NAME_INSPIRATION)
  private Integer inspiration;

  public static final String SERIALIZED_NAME_CURRENCY = "currency";
  @SerializedName(SERIALIZED_NAME_CURRENCY)
  private Integer currency;

  public static final String SERIALIZED_NAME_FORMAT = "format";
  @SerializedName(SERIALIZED_NAME_FORMAT)
  private String format;

  public static final String SERIALIZED_NAME_EXPERIENCE = "experience";
  @SerializedName(SERIALIZED_NAME_EXPERIENCE)
  private Integer experience;

  public static final String SERIALIZED_NAME_EXPERIENCE_CAP = "experienceCap";
  @SerializedName(SERIALIZED_NAME_EXPERIENCE_CAP)
  private Integer experienceCap;

  public static final String SERIALIZED_NAME_ALIVE = "alive";
  @SerializedName(SERIALIZED_NAME_ALIVE)
  private Boolean alive;

  public static final String SERIALIZED_NAME_INVENTORY = "inventory";
  @SerializedName(SERIALIZED_NAME_INVENTORY)
  private List<Stock> inventory = null;

  public static final String SERIALIZED_NAME_ROLES = "roles";
  @SerializedName(SERIALIZED_NAME_ROLES)
  private List<UserRoles> roles = null;

  public static final String SERIALIZED_NAME_READY_DATE = "readyDate";
  @SerializedName(SERIALIZED_NAME_READY_DATE)
  private OffsetDateTime readyDate;

  public static final String SERIALIZED_NAME_DD_BEYOND = "ddBeyond";
  @SerializedName(SERIALIZED_NAME_DD_BEYOND)
  private Long ddBeyond;


  public Character id(UUID id) {
    
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


  public Character owner(User owner) {
    
    this.owner = owner;
    return this;
  }

   /**
   * Get owner
   * @return owner
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public User getOwner() {
    return owner;
  }


  public void setOwner(User owner) {
    this.owner = owner;
  }


  public Character server(Campaign server) {
    
    this.server = server;
    return this;
  }

   /**
   * Get server
   * @return server
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Campaign getServer() {
    return server;
  }


  public void setServer(Campaign server) {
    this.server = server;
  }


  public Character name(String name) {
    
    this.name = name;
    return this;
  }

   /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")

  public String getName() {
    return name;
  }


  public void setName(String name) {
    this.name = name;
  }


  public Character level(Integer level) {
    
    this.level = level;
    return this;
  }

   /**
   * Get level
   * @return level
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getLevel() {
    return level;
  }


  public void setLevel(Integer level) {
    this.level = level;
  }


  public Character inspiration(Integer inspiration) {
    
    this.inspiration = inspiration;
    return this;
  }

   /**
   * Get inspiration
   * @return inspiration
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getInspiration() {
    return inspiration;
  }


  public void setInspiration(Integer inspiration) {
    this.inspiration = inspiration;
  }


  public Character currency(Integer currency) {
    
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getCurrency() {
    return currency;
  }


  public void setCurrency(Integer currency) {
    this.currency = currency;
  }


   /**
   * Get format
   * @return format
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFormat() {
    return format;
  }




  public Character experience(Integer experience) {
    
    this.experience = experience;
    return this;
  }

   /**
   * Get experience
   * @return experience
  **/
  @ApiModelProperty(required = true, value = "")

  public Integer getExperience() {
    return experience;
  }


  public void setExperience(Integer experience) {
    this.experience = experience;
  }


  public Character experienceCap(Integer experienceCap) {
    
    this.experienceCap = experienceCap;
    return this;
  }

   /**
   * Get experienceCap
   * @return experienceCap
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Integer getExperienceCap() {
    return experienceCap;
  }


  public void setExperienceCap(Integer experienceCap) {
    this.experienceCap = experienceCap;
  }


  public Character alive(Boolean alive) {
    
    this.alive = alive;
    return this;
  }

   /**
   * Get alive
   * @return alive
  **/
  @ApiModelProperty(required = true, value = "")

  public Boolean getAlive() {
    return alive;
  }


  public void setAlive(Boolean alive) {
    this.alive = alive;
  }


  public Character inventory(List<Stock> inventory) {
    
    this.inventory = inventory;
    return this;
  }

  public Character addInventoryItem(Stock inventoryItem) {
    if (this.inventory == null) {
      this.inventory = new ArrayList<Stock>();
    }
    this.inventory.add(inventoryItem);
    return this;
  }

   /**
   * Get inventory
   * @return inventory
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Stock> getInventory() {
    return inventory;
  }


  public void setInventory(List<Stock> inventory) {
    this.inventory = inventory;
  }


  public Character roles(List<UserRoles> roles) {
    
    this.roles = roles;
    return this;
  }

  public Character addRolesItem(UserRoles rolesItem) {
    if (this.roles == null) {
      this.roles = new ArrayList<UserRoles>();
    }
    this.roles.add(rolesItem);
    return this;
  }

   /**
   * Get roles
   * @return roles
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserRoles> getRoles() {
    return roles;
  }


  public void setRoles(List<UserRoles> roles) {
    this.roles = roles;
  }


  public Character readyDate(OffsetDateTime readyDate) {
    
    this.readyDate = readyDate;
    return this;
  }

   /**
   * Get readyDate
   * @return readyDate
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getReadyDate() {
    return readyDate;
  }


  public void setReadyDate(OffsetDateTime readyDate) {
    this.readyDate = readyDate;
  }


  public Character ddBeyond(Long ddBeyond) {
    
    this.ddBeyond = ddBeyond;
    return this;
  }

   /**
   * Get ddBeyond
   * @return ddBeyond
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public Long getDdBeyond() {
    return ddBeyond;
  }


  public void setDdBeyond(Long ddBeyond) {
    this.ddBeyond = ddBeyond;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Character character = (Character) o;
    return Objects.equals(this.id, character.id) &&
        Objects.equals(this.owner, character.owner) &&
        Objects.equals(this.server, character.server) &&
        Objects.equals(this.name, character.name) &&
        Objects.equals(this.level, character.level) &&
        Objects.equals(this.inspiration, character.inspiration) &&
        Objects.equals(this.currency, character.currency) &&
        Objects.equals(this.format, character.format) &&
        Objects.equals(this.experience, character.experience) &&
        Objects.equals(this.experienceCap, character.experienceCap) &&
        Objects.equals(this.alive, character.alive) &&
        Objects.equals(this.inventory, character.inventory) &&
        Objects.equals(this.roles, character.roles) &&
        Objects.equals(this.readyDate, character.readyDate) &&
        Objects.equals(this.ddBeyond, character.ddBeyond);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, owner, server, name, level, inspiration, currency, format, experience, experienceCap, alive, inventory, roles, readyDate, ddBeyond);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Character {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    server: ").append(toIndentedString(server)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
    sb.append("    inspiration: ").append(toIndentedString(inspiration)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    format: ").append(toIndentedString(format)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
    sb.append("    experienceCap: ").append(toIndentedString(experienceCap)).append("\n");
    sb.append("    alive: ").append(toIndentedString(alive)).append("\n");
    sb.append("    inventory: ").append(toIndentedString(inventory)).append("\n");
    sb.append("    roles: ").append(toIndentedString(roles)).append("\n");
    sb.append("    readyDate: ").append(toIndentedString(readyDate)).append("\n");
    sb.append("    ddBeyond: ").append(toIndentedString(ddBeyond)).append("\n");
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

