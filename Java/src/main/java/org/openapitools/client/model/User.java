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
import org.openapitools.client.model.Character;
import org.openapitools.client.model.UserCredentials;
import org.threeten.bp.OffsetDateTime;

/**
 * User
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2021-03-11T20:22:10.805+10:30[Australia/Adelaide]")
public class User {
  public static final String SERIALIZED_NAME_ID = "id";
  @SerializedName(SERIALIZED_NAME_ID)
  private UUID id;

  public static final String SERIALIZED_NAME_GIVEN_NAME = "givenName";
  @SerializedName(SERIALIZED_NAME_GIVEN_NAME)
  private String givenName;

  public static final String SERIALIZED_NAME_FAMILY_NAME = "familyName";
  @SerializedName(SERIALIZED_NAME_FAMILY_NAME)
  private String familyName;

  public static final String SERIALIZED_NAME_DATE_CREATED = "dateCreated";
  @SerializedName(SERIALIZED_NAME_DATE_CREATED)
  private OffsetDateTime dateCreated;

  public static final String SERIALIZED_NAME_CHARACTERS = "characters";
  @SerializedName(SERIALIZED_NAME_CHARACTERS)
  private List<Character> characters = null;

  public static final String SERIALIZED_NAME_CREDENTIALS = "credentials";
  @SerializedName(SERIALIZED_NAME_CREDENTIALS)
  private List<UserCredentials> credentials = null;

  public static final String SERIALIZED_NAME_CAMPAIGNS_OWNED = "campaignsOwned";
  @SerializedName(SERIALIZED_NAME_CAMPAIGNS_OWNED)
  private List<Campaign> campaignsOwned = null;


  public User id(UUID id) {
    
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


  public User givenName(String givenName) {
    
    this.givenName = givenName;
    return this;
  }

   /**
   * Get givenName
   * @return givenName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getGivenName() {
    return givenName;
  }


  public void setGivenName(String givenName) {
    this.givenName = givenName;
  }


  public User familyName(String familyName) {
    
    this.familyName = familyName;
    return this;
  }

   /**
   * Get familyName
   * @return familyName
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public String getFamilyName() {
    return familyName;
  }


  public void setFamilyName(String familyName) {
    this.familyName = familyName;
  }


  public User dateCreated(OffsetDateTime dateCreated) {
    
    this.dateCreated = dateCreated;
    return this;
  }

   /**
   * Get dateCreated
   * @return dateCreated
  **/
  @ApiModelProperty(required = true, value = "")

  public OffsetDateTime getDateCreated() {
    return dateCreated;
  }


  public void setDateCreated(OffsetDateTime dateCreated) {
    this.dateCreated = dateCreated;
  }


  public User characters(List<Character> characters) {
    
    this.characters = characters;
    return this;
  }

  public User addCharactersItem(Character charactersItem) {
    if (this.characters == null) {
      this.characters = new ArrayList<Character>();
    }
    this.characters.add(charactersItem);
    return this;
  }

   /**
   * Get characters
   * @return characters
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Character> getCharacters() {
    return characters;
  }


  public void setCharacters(List<Character> characters) {
    this.characters = characters;
  }


  public User credentials(List<UserCredentials> credentials) {
    
    this.credentials = credentials;
    return this;
  }

  public User addCredentialsItem(UserCredentials credentialsItem) {
    if (this.credentials == null) {
      this.credentials = new ArrayList<UserCredentials>();
    }
    this.credentials.add(credentialsItem);
    return this;
  }

   /**
   * Get credentials
   * @return credentials
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<UserCredentials> getCredentials() {
    return credentials;
  }


  public void setCredentials(List<UserCredentials> credentials) {
    this.credentials = credentials;
  }


  public User campaignsOwned(List<Campaign> campaignsOwned) {
    
    this.campaignsOwned = campaignsOwned;
    return this;
  }

  public User addCampaignsOwnedItem(Campaign campaignsOwnedItem) {
    if (this.campaignsOwned == null) {
      this.campaignsOwned = new ArrayList<Campaign>();
    }
    this.campaignsOwned.add(campaignsOwnedItem);
    return this;
  }

   /**
   * Get campaignsOwned
   * @return campaignsOwned
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "")

  public List<Campaign> getCampaignsOwned() {
    return campaignsOwned;
  }


  public void setCampaignsOwned(List<Campaign> campaignsOwned) {
    this.campaignsOwned = campaignsOwned;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    User user = (User) o;
    return Objects.equals(this.id, user.id) &&
        Objects.equals(this.givenName, user.givenName) &&
        Objects.equals(this.familyName, user.familyName) &&
        Objects.equals(this.dateCreated, user.dateCreated) &&
        Objects.equals(this.characters, user.characters) &&
        Objects.equals(this.credentials, user.credentials) &&
        Objects.equals(this.campaignsOwned, user.campaignsOwned);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, givenName, familyName, dateCreated, characters, credentials, campaignsOwned);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class User {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    givenName: ").append(toIndentedString(givenName)).append("\n");
    sb.append("    familyName: ").append(toIndentedString(familyName)).append("\n");
    sb.append("    dateCreated: ").append(toIndentedString(dateCreated)).append("\n");
    sb.append("    characters: ").append(toIndentedString(characters)).append("\n");
    sb.append("    credentials: ").append(toIndentedString(credentials)).append("\n");
    sb.append("    campaignsOwned: ").append(toIndentedString(campaignsOwned)).append("\n");
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

