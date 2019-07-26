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
    using System.Linq;

    /// <summary>
    /// Certificate request query model
    /// </summary>
    public partial class CertificateRequestQueryRequestApiModel
    {
        /// <summary>
        /// Initializes a new instance of the
        /// CertificateRequestQueryRequestApiModel class.
        /// </summary>
        public CertificateRequestQueryRequestApiModel()
        {
            CustomInit();
        }

        /// <summary>
        /// Initializes a new instance of the
        /// CertificateRequestQueryRequestApiModel class.
        /// </summary>
        /// <param name="entityId">The entity id to filter with</param>
        /// <param name="state">The certificate request state. Possible values
        /// include: 'New', 'Approved', 'Rejected', 'Failure', 'Completed',
        /// 'Accepted'</param>
        public CertificateRequestQueryRequestApiModel(string entityId = default(string), CertificateRequestState? state = default(CertificateRequestState?))
        {
            EntityId = entityId;
            State = state;
            CustomInit();
        }

        /// <summary>
        /// An initialization method that performs custom operations like setting defaults
        /// </summary>
        partial void CustomInit();

        /// <summary>
        /// Gets or sets the entity id to filter with
        /// </summary>
        [JsonProperty(PropertyName = "entityId")]
        public string EntityId { get; set; }

        /// <summary>
        /// Gets or sets the certificate request state. Possible values
        /// include: 'New', 'Approved', 'Rejected', 'Failure', 'Completed',
        /// 'Accepted'
        /// </summary>
        [JsonProperty(PropertyName = "state")]
        public CertificateRequestState? State { get; set; }

    }
}