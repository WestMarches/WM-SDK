/*
 * WestMarches API
 *
 * West Marches API
 *
 * The version of the OpenAPI document: 1.0.0
 * Generated by: https://github.com/openapitools/openapi-generator.git
 */


using System;
using System.Collections;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.IO;
using System.Runtime.Serialization;
using System.Text;
using System.Text.RegularExpressions;
using Newtonsoft.Json;
using Newtonsoft.Json.Converters;
using Newtonsoft.Json.Linq;
using System.ComponentModel.DataAnnotations;
using OpenAPIDateConverter = Org.OpenAPITools.Client.OpenAPIDateConverter;

namespace Org.OpenAPITools.Model
{
    /// <summary>
    /// Stock
    /// </summary>
    [DataContract(Name = "Stock")]
    public partial class Stock : IEquatable<Stock>, IValidatableObject
    {
        /// <summary>
        /// Initializes a new instance of the <see cref="Stock" /> class.
        /// </summary>
        [JsonConstructorAttribute]
        protected Stock() { }
        /// <summary>
        /// Initializes a new instance of the <see cref="Stock" /> class.
        /// </summary>
        /// <param name="id">id.</param>
        /// <param name="discountPercentage">discountPercentage (required).</param>
        /// <param name="discountFixed">discountFixed.</param>
        /// <param name="unlimited">unlimited.</param>
        /// <param name="amount">amount.</param>
        /// <param name="item">item.</param>
        public Stock(Guid id = default(Guid), double discountPercentage = default(double), int discountFixed = default(int), bool unlimited = default(bool), int amount = default(int), Item item = default(Item))
        {
            this.DiscountPercentage = discountPercentage;
            this.Id = id;
            this.DiscountFixed = discountFixed;
            this.Unlimited = unlimited;
            this.Amount = amount;
            this.Item = item;
        }

        /// <summary>
        /// Gets or Sets Id
        /// </summary>
        [DataMember(Name = "id", EmitDefaultValue = false)]
        public Guid Id { get; set; }

        /// <summary>
        /// Gets or Sets DiscountPercentage
        /// </summary>
        [DataMember(Name = "discountPercentage", IsRequired = true, EmitDefaultValue = false)]
        public double DiscountPercentage { get; set; }

        /// <summary>
        /// Gets or Sets DiscountFixed
        /// </summary>
        [DataMember(Name = "discountFixed", EmitDefaultValue = false)]
        public int DiscountFixed { get; set; }

        /// <summary>
        /// Gets or Sets Unlimited
        /// </summary>
        [DataMember(Name = "unlimited", EmitDefaultValue = false)]
        public bool Unlimited { get; set; }

        /// <summary>
        /// Gets or Sets Amount
        /// </summary>
        [DataMember(Name = "amount", EmitDefaultValue = false)]
        public int Amount { get; set; }

        /// <summary>
        /// Gets or Sets Item
        /// </summary>
        [DataMember(Name = "item", EmitDefaultValue = false)]
        public Item Item { get; set; }

        /// <summary>
        /// Gets or Sets Price
        /// </summary>
        [DataMember(Name = "price", EmitDefaultValue = false)]
        public int Price { get; private set; }

        /// <summary>
        /// Returns false as Price should not be serialized given that it's read-only.
        /// </summary>
        /// <returns>false (boolean)</returns>
        public bool ShouldSerializePrice()
        {
            return false;
        }

        /// <summary>
        /// Returns the string presentation of the object
        /// </summary>
        /// <returns>String presentation of the object</returns>
        public override string ToString()
        {
            var sb = new StringBuilder();
            sb.Append("class Stock {\n");
            sb.Append("  Id: ").Append(Id).Append("\n");
            sb.Append("  DiscountPercentage: ").Append(DiscountPercentage).Append("\n");
            sb.Append("  DiscountFixed: ").Append(DiscountFixed).Append("\n");
            sb.Append("  Unlimited: ").Append(Unlimited).Append("\n");
            sb.Append("  Amount: ").Append(Amount).Append("\n");
            sb.Append("  Item: ").Append(Item).Append("\n");
            sb.Append("  Price: ").Append(Price).Append("\n");
            sb.Append("}\n");
            return sb.ToString();
        }

        /// <summary>
        /// Returns the JSON string presentation of the object
        /// </summary>
        /// <returns>JSON string presentation of the object</returns>
        public virtual string ToJson()
        {
            return Newtonsoft.Json.JsonConvert.SerializeObject(this, Newtonsoft.Json.Formatting.Indented);
        }

        /// <summary>
        /// Returns true if objects are equal
        /// </summary>
        /// <param name="input">Object to be compared</param>
        /// <returns>Boolean</returns>
        public override bool Equals(object input)
        {
            return this.Equals(input as Stock);
        }

        /// <summary>
        /// Returns true if Stock instances are equal
        /// </summary>
        /// <param name="input">Instance of Stock to be compared</param>
        /// <returns>Boolean</returns>
        public bool Equals(Stock input)
        {
            if (input == null)
                return false;

            return 
                (
                    this.Id == input.Id ||
                    (this.Id != null &&
                    this.Id.Equals(input.Id))
                ) && 
                (
                    this.DiscountPercentage == input.DiscountPercentage ||
                    this.DiscountPercentage.Equals(input.DiscountPercentage)
                ) && 
                (
                    this.DiscountFixed == input.DiscountFixed ||
                    this.DiscountFixed.Equals(input.DiscountFixed)
                ) && 
                (
                    this.Unlimited == input.Unlimited ||
                    this.Unlimited.Equals(input.Unlimited)
                ) && 
                (
                    this.Amount == input.Amount ||
                    this.Amount.Equals(input.Amount)
                ) && 
                (
                    this.Item == input.Item ||
                    (this.Item != null &&
                    this.Item.Equals(input.Item))
                ) && 
                (
                    this.Price == input.Price ||
                    this.Price.Equals(input.Price)
                );
        }

        /// <summary>
        /// Gets the hash code
        /// </summary>
        /// <returns>Hash code</returns>
        public override int GetHashCode()
        {
            unchecked // Overflow is fine, just wrap
            {
                int hashCode = 41;
                if (this.Id != null)
                    hashCode = hashCode * 59 + this.Id.GetHashCode();
                hashCode = hashCode * 59 + this.DiscountPercentage.GetHashCode();
                hashCode = hashCode * 59 + this.DiscountFixed.GetHashCode();
                hashCode = hashCode * 59 + this.Unlimited.GetHashCode();
                hashCode = hashCode * 59 + this.Amount.GetHashCode();
                if (this.Item != null)
                    hashCode = hashCode * 59 + this.Item.GetHashCode();
                hashCode = hashCode * 59 + this.Price.GetHashCode();
                return hashCode;
            }
        }

        /// <summary>
        /// To validate all properties of the instance
        /// </summary>
        /// <param name="validationContext">Validation context</param>
        /// <returns>Validation Result</returns>
        IEnumerable<System.ComponentModel.DataAnnotations.ValidationResult> IValidatableObject.Validate(ValidationContext validationContext)
        {
            yield break;
        }
    }

}
