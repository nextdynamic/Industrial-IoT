/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator 1.0.0.0
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.iiot.opc.twin.models;

import java.util.List;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Node model.
 */
public class NodeApiModel {
    /**
     * Possible values include: 'Object', 'Variable', 'Method', 'ObjectType',
     * 'VariableType', 'ReferenceType', 'DataType', 'View'.
     */
    @JsonProperty(value = "nodeClass")
    private NodeClass nodeClass;

    /**
     * Display name.
     */
    @JsonProperty(value = "displayName")
    private String displayName;

    /**
     * Id of node.
     * (Mandatory).
     */
    @JsonProperty(value = "nodeId", required = true)
    private String nodeId;

    /**
     * Description if any.
     */
    @JsonProperty(value = "description")
    private String description;

    /**
     * Browse name.
     */
    @JsonProperty(value = "browseName")
    private String browseName;

    /**
     * Possible values include: 'SigningRequired', 'EncryptionRequired',
     * 'SessionRequired'.
     */
    @JsonProperty(value = "accessRestrictions")
    private NodeAccessRestrictions accessRestrictions;

    /**
     * Default write mask for the node
     * (default: 0).
     */
    @JsonProperty(value = "writeMask")
    private Integer writeMask;

    /**
     * User write mask for the node
     * (default: 0).
     */
    @JsonProperty(value = "userWriteMask")
    private Integer userWriteMask;

    /**
     * Whether type is abstract, if type can
     * be abstract.  Null if not type node.
     * (default: false).
     */
    @JsonProperty(value = "isAbstract")
    private Boolean isAbstract;

    /**
     * Whether a view contains loops. Null if
     * not a view.
     */
    @JsonProperty(value = "containsNoLoops")
    private Boolean containsNoLoops;

    /**
     * Possible values include: 'SubscribeToEvents', 'HistoryRead',
     * 'HistoryWrite'.
     */
    @JsonProperty(value = "eventNotifier")
    private NodeEventNotifier eventNotifier;

    /**
     * If method node class, whether method can
     * be called.
     */
    @JsonProperty(value = "executable")
    private Boolean executable;

    /**
     * If method node class, whether method can
     * be called by current user.
     * (default: false if not executable).
     */
    @JsonProperty(value = "userExecutable")
    private Boolean userExecutable;

    /**
     * Data type definition in case node is a
     * data type node and definition is available,
     * otherwise null.
     */
    @JsonProperty(value = "dataTypeDefinition")
    private Object dataTypeDefinition;

    /**
     * Possible values include: 'CurrentRead', 'CurrentWrite', 'HistoryRead',
     * 'HistoryWrite', 'SemanticChange', 'StatusWrite', 'TimestampWrite',
     * 'NonatomicRead', 'NonatomicWrite', 'WriteFullArrayOnly'.
     */
    @JsonProperty(value = "accessLevel")
    private NodeAccessLevel accessLevel;

    /**
     * Possible values include: 'CurrentRead', 'CurrentWrite', 'HistoryRead',
     * 'HistoryWrite', 'SemanticChange', 'StatusWrite', 'TimestampWrite',
     * 'NonatomicRead', 'NonatomicWrite', 'WriteFullArrayOnly'.
     */
    @JsonProperty(value = "userAccessLevel")
    private NodeAccessLevel userAccessLevel;

    /**
     * If variable the datatype of the variable.
     * (default: null).
     */
    @JsonProperty(value = "dataType")
    private String dataType;

    /**
     * Possible values include: 'OneOrMoreDimensions', 'OneDimension',
     * 'TwoDimensions', 'ScalarOrOneDimension', 'Any', 'Scalar'.
     */
    @JsonProperty(value = "valueRank")
    private NodeValueRank valueRank;

    /**
     * Array dimensions of variable or variable type.
     * (default: empty array).
     */
    @JsonProperty(value = "arrayDimensions")
    private List<Integer> arrayDimensions;

    /**
     * Whether the value of a variable is historizing.
     * (default: false).
     */
    @JsonProperty(value = "historizing")
    private Boolean historizing;

    /**
     * Minimum sampling interval for the variable
     * value, otherwise null if not a variable node.
     * (default: null).
     */
    @JsonProperty(value = "minimumSamplingInterval")
    private Double minimumSamplingInterval;

    /**
     * Value of variable or default value of the
     * subtyped variable in case node is a variable
     * type, otherwise null.
     */
    @JsonProperty(value = "value")
    private Object value;

    /**
     * Inverse name of the reference if the node is
     * a reference type, otherwise null.
     */
    @JsonProperty(value = "inverseName")
    private String inverseName;

    /**
     * Whether the reference is symmetric in case
     * the node is a reference type, otherwise
     * null.
     */
    @JsonProperty(value = "symmetric")
    private Boolean symmetric;

    /**
     * Role permissions.
     */
    @JsonProperty(value = "rolePermissions")
    private List<RolePermissionApiModel> rolePermissions;

    /**
     * User Role permissions.
     */
    @JsonProperty(value = "userRolePermissions")
    private List<RolePermissionApiModel> userRolePermissions;

    /**
     * Optional type definition of the node.
     */
    @JsonProperty(value = "typeDefinitionId")
    private String typeDefinitionId;

    /**
     * Whether node has children which are defined as
     * any forward hierarchical references.
     * (default: unknown).
     */
    @JsonProperty(value = "children")
    private Boolean children;

    /**
     * Get possible values include: 'Object', 'Variable', 'Method', 'ObjectType', 'VariableType', 'ReferenceType', 'DataType', 'View'.
     *
     * @return the nodeClass value
     */
    public NodeClass nodeClass() {
        return this.nodeClass;
    }

    /**
     * Set possible values include: 'Object', 'Variable', 'Method', 'ObjectType', 'VariableType', 'ReferenceType', 'DataType', 'View'.
     *
     * @param nodeClass the nodeClass value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withNodeClass(NodeClass nodeClass) {
        this.nodeClass = nodeClass;
        return this;
    }

    /**
     * Get display name.
     *
     * @return the displayName value
     */
    public String displayName() {
        return this.displayName;
    }

    /**
     * Set display name.
     *
     * @param displayName the displayName value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    /**
     * Get id of node.
     (Mandatory).
     *
     * @return the nodeId value
     */
    public String nodeId() {
        return this.nodeId;
    }

    /**
     * Set id of node.
     (Mandatory).
     *
     * @param nodeId the nodeId value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    /**
     * Get description if any.
     *
     * @return the description value
     */
    public String description() {
        return this.description;
    }

    /**
     * Set description if any.
     *
     * @param description the description value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * Get browse name.
     *
     * @return the browseName value
     */
    public String browseName() {
        return this.browseName;
    }

    /**
     * Set browse name.
     *
     * @param browseName the browseName value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withBrowseName(String browseName) {
        this.browseName = browseName;
        return this;
    }

    /**
     * Get possible values include: 'SigningRequired', 'EncryptionRequired', 'SessionRequired'.
     *
     * @return the accessRestrictions value
     */
    public NodeAccessRestrictions accessRestrictions() {
        return this.accessRestrictions;
    }

    /**
     * Set possible values include: 'SigningRequired', 'EncryptionRequired', 'SessionRequired'.
     *
     * @param accessRestrictions the accessRestrictions value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withAccessRestrictions(NodeAccessRestrictions accessRestrictions) {
        this.accessRestrictions = accessRestrictions;
        return this;
    }

    /**
     * Get default write mask for the node
     (default: 0).
     *
     * @return the writeMask value
     */
    public Integer writeMask() {
        return this.writeMask;
    }

    /**
     * Set default write mask for the node
     (default: 0).
     *
     * @param writeMask the writeMask value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withWriteMask(Integer writeMask) {
        this.writeMask = writeMask;
        return this;
    }

    /**
     * Get user write mask for the node
     (default: 0).
     *
     * @return the userWriteMask value
     */
    public Integer userWriteMask() {
        return this.userWriteMask;
    }

    /**
     * Set user write mask for the node
     (default: 0).
     *
     * @param userWriteMask the userWriteMask value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withUserWriteMask(Integer userWriteMask) {
        this.userWriteMask = userWriteMask;
        return this;
    }

    /**
     * Get whether type is abstract, if type can
     be abstract.  Null if not type node.
     (default: false).
     *
     * @return the isAbstract value
     */
    public Boolean isAbstract() {
        return this.isAbstract;
    }

    /**
     * Set whether type is abstract, if type can
     be abstract.  Null if not type node.
     (default: false).
     *
     * @param isAbstract the isAbstract value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withIsAbstract(Boolean isAbstract) {
        this.isAbstract = isAbstract;
        return this;
    }

    /**
     * Get whether a view contains loops. Null if
     not a view.
     *
     * @return the containsNoLoops value
     */
    public Boolean containsNoLoops() {
        return this.containsNoLoops;
    }

    /**
     * Set whether a view contains loops. Null if
     not a view.
     *
     * @param containsNoLoops the containsNoLoops value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withContainsNoLoops(Boolean containsNoLoops) {
        this.containsNoLoops = containsNoLoops;
        return this;
    }

    /**
     * Get possible values include: 'SubscribeToEvents', 'HistoryRead', 'HistoryWrite'.
     *
     * @return the eventNotifier value
     */
    public NodeEventNotifier eventNotifier() {
        return this.eventNotifier;
    }

    /**
     * Set possible values include: 'SubscribeToEvents', 'HistoryRead', 'HistoryWrite'.
     *
     * @param eventNotifier the eventNotifier value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withEventNotifier(NodeEventNotifier eventNotifier) {
        this.eventNotifier = eventNotifier;
        return this;
    }

    /**
     * Get if method node class, whether method can
     be called.
     *
     * @return the executable value
     */
    public Boolean executable() {
        return this.executable;
    }

    /**
     * Set if method node class, whether method can
     be called.
     *
     * @param executable the executable value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withExecutable(Boolean executable) {
        this.executable = executable;
        return this;
    }

    /**
     * Get if method node class, whether method can
     be called by current user.
     (default: false if not executable).
     *
     * @return the userExecutable value
     */
    public Boolean userExecutable() {
        return this.userExecutable;
    }

    /**
     * Set if method node class, whether method can
     be called by current user.
     (default: false if not executable).
     *
     * @param userExecutable the userExecutable value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withUserExecutable(Boolean userExecutable) {
        this.userExecutable = userExecutable;
        return this;
    }

    /**
     * Get data type definition in case node is a
     data type node and definition is available,
     otherwise null.
     *
     * @return the dataTypeDefinition value
     */
    public Object dataTypeDefinition() {
        return this.dataTypeDefinition;
    }

    /**
     * Set data type definition in case node is a
     data type node and definition is available,
     otherwise null.
     *
     * @param dataTypeDefinition the dataTypeDefinition value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withDataTypeDefinition(Object dataTypeDefinition) {
        this.dataTypeDefinition = dataTypeDefinition;
        return this;
    }

    /**
     * Get possible values include: 'CurrentRead', 'CurrentWrite', 'HistoryRead', 'HistoryWrite', 'SemanticChange', 'StatusWrite', 'TimestampWrite', 'NonatomicRead', 'NonatomicWrite', 'WriteFullArrayOnly'.
     *
     * @return the accessLevel value
     */
    public NodeAccessLevel accessLevel() {
        return this.accessLevel;
    }

    /**
     * Set possible values include: 'CurrentRead', 'CurrentWrite', 'HistoryRead', 'HistoryWrite', 'SemanticChange', 'StatusWrite', 'TimestampWrite', 'NonatomicRead', 'NonatomicWrite', 'WriteFullArrayOnly'.
     *
     * @param accessLevel the accessLevel value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withAccessLevel(NodeAccessLevel accessLevel) {
        this.accessLevel = accessLevel;
        return this;
    }

    /**
     * Get possible values include: 'CurrentRead', 'CurrentWrite', 'HistoryRead', 'HistoryWrite', 'SemanticChange', 'StatusWrite', 'TimestampWrite', 'NonatomicRead', 'NonatomicWrite', 'WriteFullArrayOnly'.
     *
     * @return the userAccessLevel value
     */
    public NodeAccessLevel userAccessLevel() {
        return this.userAccessLevel;
    }

    /**
     * Set possible values include: 'CurrentRead', 'CurrentWrite', 'HistoryRead', 'HistoryWrite', 'SemanticChange', 'StatusWrite', 'TimestampWrite', 'NonatomicRead', 'NonatomicWrite', 'WriteFullArrayOnly'.
     *
     * @param userAccessLevel the userAccessLevel value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withUserAccessLevel(NodeAccessLevel userAccessLevel) {
        this.userAccessLevel = userAccessLevel;
        return this;
    }

    /**
     * Get if variable the datatype of the variable.
     (default: null).
     *
     * @return the dataType value
     */
    public String dataType() {
        return this.dataType;
    }

    /**
     * Set if variable the datatype of the variable.
     (default: null).
     *
     * @param dataType the dataType value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withDataType(String dataType) {
        this.dataType = dataType;
        return this;
    }

    /**
     * Get possible values include: 'OneOrMoreDimensions', 'OneDimension', 'TwoDimensions', 'ScalarOrOneDimension', 'Any', 'Scalar'.
     *
     * @return the valueRank value
     */
    public NodeValueRank valueRank() {
        return this.valueRank;
    }

    /**
     * Set possible values include: 'OneOrMoreDimensions', 'OneDimension', 'TwoDimensions', 'ScalarOrOneDimension', 'Any', 'Scalar'.
     *
     * @param valueRank the valueRank value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withValueRank(NodeValueRank valueRank) {
        this.valueRank = valueRank;
        return this;
    }

    /**
     * Get array dimensions of variable or variable type.
     (default: empty array).
     *
     * @return the arrayDimensions value
     */
    public List<Integer> arrayDimensions() {
        return this.arrayDimensions;
    }

    /**
     * Set array dimensions of variable or variable type.
     (default: empty array).
     *
     * @param arrayDimensions the arrayDimensions value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withArrayDimensions(List<Integer> arrayDimensions) {
        this.arrayDimensions = arrayDimensions;
        return this;
    }

    /**
     * Get whether the value of a variable is historizing.
     (default: false).
     *
     * @return the historizing value
     */
    public Boolean historizing() {
        return this.historizing;
    }

    /**
     * Set whether the value of a variable is historizing.
     (default: false).
     *
     * @param historizing the historizing value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withHistorizing(Boolean historizing) {
        this.historizing = historizing;
        return this;
    }

    /**
     * Get minimum sampling interval for the variable
     value, otherwise null if not a variable node.
     (default: null).
     *
     * @return the minimumSamplingInterval value
     */
    public Double minimumSamplingInterval() {
        return this.minimumSamplingInterval;
    }

    /**
     * Set minimum sampling interval for the variable
     value, otherwise null if not a variable node.
     (default: null).
     *
     * @param minimumSamplingInterval the minimumSamplingInterval value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withMinimumSamplingInterval(Double minimumSamplingInterval) {
        this.minimumSamplingInterval = minimumSamplingInterval;
        return this;
    }

    /**
     * Get value of variable or default value of the
     subtyped variable in case node is a variable
     type, otherwise null.
     *
     * @return the value value
     */
    public Object value() {
        return this.value;
    }

    /**
     * Set value of variable or default value of the
     subtyped variable in case node is a variable
     type, otherwise null.
     *
     * @param value the value value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withValue(Object value) {
        this.value = value;
        return this;
    }

    /**
     * Get inverse name of the reference if the node is
     a reference type, otherwise null.
     *
     * @return the inverseName value
     */
    public String inverseName() {
        return this.inverseName;
    }

    /**
     * Set inverse name of the reference if the node is
     a reference type, otherwise null.
     *
     * @param inverseName the inverseName value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withInverseName(String inverseName) {
        this.inverseName = inverseName;
        return this;
    }

    /**
     * Get whether the reference is symmetric in case
     the node is a reference type, otherwise
     null.
     *
     * @return the symmetric value
     */
    public Boolean symmetric() {
        return this.symmetric;
    }

    /**
     * Set whether the reference is symmetric in case
     the node is a reference type, otherwise
     null.
     *
     * @param symmetric the symmetric value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withSymmetric(Boolean symmetric) {
        this.symmetric = symmetric;
        return this;
    }

    /**
     * Get role permissions.
     *
     * @return the rolePermissions value
     */
    public List<RolePermissionApiModel> rolePermissions() {
        return this.rolePermissions;
    }

    /**
     * Set role permissions.
     *
     * @param rolePermissions the rolePermissions value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withRolePermissions(List<RolePermissionApiModel> rolePermissions) {
        this.rolePermissions = rolePermissions;
        return this;
    }

    /**
     * Get user Role permissions.
     *
     * @return the userRolePermissions value
     */
    public List<RolePermissionApiModel> userRolePermissions() {
        return this.userRolePermissions;
    }

    /**
     * Set user Role permissions.
     *
     * @param userRolePermissions the userRolePermissions value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withUserRolePermissions(List<RolePermissionApiModel> userRolePermissions) {
        this.userRolePermissions = userRolePermissions;
        return this;
    }

    /**
     * Get optional type definition of the node.
     *
     * @return the typeDefinitionId value
     */
    public String typeDefinitionId() {
        return this.typeDefinitionId;
    }

    /**
     * Set optional type definition of the node.
     *
     * @param typeDefinitionId the typeDefinitionId value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withTypeDefinitionId(String typeDefinitionId) {
        this.typeDefinitionId = typeDefinitionId;
        return this;
    }

    /**
     * Get whether node has children which are defined as
     any forward hierarchical references.
     (default: unknown).
     *
     * @return the children value
     */
    public Boolean children() {
        return this.children;
    }

    /**
     * Set whether node has children which are defined as
     any forward hierarchical references.
     (default: unknown).
     *
     * @param children the children value to set
     * @return the NodeApiModel object itself.
     */
    public NodeApiModel withChildren(Boolean children) {
        this.children = children;
        return this;
    }

}
