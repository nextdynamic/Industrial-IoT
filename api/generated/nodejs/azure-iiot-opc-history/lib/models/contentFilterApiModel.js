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
 * Content filter
 *
 */
class ContentFilterApiModel {
  /**
   * Create a ContentFilterApiModel.
   * @property {array} [elements] The flat list of elements in the filter AST
   */
  constructor() {
  }

  /**
   * Defines the metadata of ContentFilterApiModel
   *
   * @returns {object} metadata of ContentFilterApiModel
   *
   */
  mapper() {
    return {
      required: false,
      serializedName: 'ContentFilterApiModel',
      type: {
        name: 'Composite',
        className: 'ContentFilterApiModel',
        modelProperties: {
          elements: {
            required: false,
            serializedName: 'elements',
            type: {
              name: 'Sequence',
              element: {
                  required: false,
                  serializedName: 'ContentFilterElementApiModelElementType',
                  type: {
                    name: 'Composite',
                    className: 'ContentFilterElementApiModel'
                  }
              }
            }
          }
        }
      }
    };
  }
}

module.exports = ContentFilterApiModel;