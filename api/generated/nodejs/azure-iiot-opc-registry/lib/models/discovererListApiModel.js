/*
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

'use strict';

/**
 * Discoverer registration list
 *
 */
class DiscovererListApiModel {
  /**
   * Create a DiscovererListApiModel.
   * @property {array} [items] Registrations
   * @property {string} [continuationToken] Continuation or null if final
   */
  constructor() {
  }

  /**
   * Defines the metadata of DiscovererListApiModel
   *
   * @returns {object} metadata of DiscovererListApiModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'DiscovererListApiModel',
      type: {
        name: 'Composite',
        className: 'DiscovererListApiModel',
        modelProperties: {
          items: {
            required: false,
            serializedName: 'items',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'DiscovererApiModelElementType',
                  type: {
                    name: 'Composite',
                    className: 'DiscovererApiModel'
                  }
              }
            }
          },
          continuationToken: {
            required: false,
            serializedName: 'continuationToken',
            type: {
              name: 'String'
            }
          }
        }
      }
    };
  }
}

module.exports = DiscovererListApiModel;
