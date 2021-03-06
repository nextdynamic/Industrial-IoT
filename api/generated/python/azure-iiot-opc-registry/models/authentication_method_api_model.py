# coding=utf-8
# --------------------------------------------------------------------------
# Copyright (c) Microsoft Corporation. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for
# license information.
#
# Code generated by Microsoft (R) AutoRest Code Generator 2.3.33.0
# Changes may cause incorrect behavior and will be lost if the code is
# regenerated.
# --------------------------------------------------------------------------

from msrest.serialization import Model


class AuthenticationMethodApiModel(Model):
    """Authentication Method model.

    :param id: Method id
    :type id: str
    :param credential_type: Possible values include: 'None', 'UserName',
     'X509Certificate', 'JwtToken'
    :type credential_type: str or
     ~azure-iiot-opc-registry.models.CredentialType
    :param security_policy: Security policy to use when passing credential.
    :type security_policy: str
    :param configuration: Method specific configuration
    :type configuration: object
    """

    _validation = {
        'id': {'required': True},
    }

    _attribute_map = {
        'id': {'key': 'id', 'type': 'str'},
        'credential_type': {'key': 'credentialType', 'type': 'CredentialType'},
        'security_policy': {'key': 'securityPolicy', 'type': 'str'},
        'configuration': {'key': 'configuration', 'type': 'object'},
    }

    def __init__(self, id, credential_type=None, security_policy=None, configuration=None):
        super(AuthenticationMethodApiModel, self).__init__()
        self.id = id
        self.credential_type = credential_type
        self.security_policy = security_policy
        self.configuration = configuration
