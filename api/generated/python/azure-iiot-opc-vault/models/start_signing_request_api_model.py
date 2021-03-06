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


class StartSigningRequestApiModel(Model):
    """Signing request.

    :param entity_id: Id of entity to sign a certificate for
    :type entity_id: str
    :param group_id: Certificate group id
    :type group_id: str
    :param certificate_request: Request
    :type certificate_request: object
    """

    _attribute_map = {
        'entity_id': {'key': 'entityId', 'type': 'str'},
        'group_id': {'key': 'groupId', 'type': 'str'},
        'certificate_request': {'key': 'certificateRequest', 'type': 'object'},
    }

    def __init__(self, entity_id=None, group_id=None, certificate_request=None):
        super(StartSigningRequestApiModel, self).__init__()
        self.entity_id = entity_id
        self.group_id = group_id
        self.certificate_request = certificate_request
