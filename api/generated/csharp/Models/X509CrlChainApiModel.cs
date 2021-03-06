// <auto-generated>
// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License. See License.txt in the project root for
// license information.
//
// Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
// Changes may cause incorrect behavior and will be lost if the code is
// regenerated.
// </auto-generated>

namespace Microsoft.Azure.IIoT.Opc.Vault.Models
{
    using Newtonsoft.Json;
    using System.Collections;
    using System.Collections.Generic;
    using System.Linq;

    /// <summary>
    /// Crl chain model
    /// </summary>
    public partial class X509CrlChainApiModel
    {
        /// <summary>
        /// Initializes a new instance of the X509CrlChainApiModel class.
        /// </summary>
        public X509CrlChainApiModel()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the X509CrlChainApiModel class.
        /// </summary>
        /// <param name="chain">Chain</param>
        public X509CrlChainApiModel(IList<X509CrlApiModel> chain = default(IList<X509CrlApiModel>))
        {
            Chain = chain;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets chain
        /// </summary>
        [JsonProperty(PropertyName = "chain")]
        public IList<X509CrlApiModel> Chain { get; set; }

    }
}
