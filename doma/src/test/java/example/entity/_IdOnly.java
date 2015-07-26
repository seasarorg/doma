package example.entity;

/** */
@javax.annotation.Generated(value = { "Doma", "1.38.0" }, date = "2015-07-21T13:32:18.619+0900")
public final class _IdOnly extends org.seasar.doma.jdbc.entity.AbstractEntityType<IdOnly> {

    static {
        org.seasar.doma.internal.Artifact.validateVersion("1.38.0");
    }

    private static final _IdOnly __singleton = new _IdOnly();

    private final org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator __idGenerator = new org.seasar.doma.jdbc.id.BuiltinIdentityIdGenerator();

    /** the id */
    public final org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<Object, IdOnly, Integer, Object> $id = new org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<Object, IdOnly, Integer, Object>(IdOnly.class, Integer.class, org.seasar.doma.wrapper.IntegerWrapper.class, null, null, "id", "ID", __idGenerator);

    private final org.seasar.doma.jdbc.entity.NullEntityListener<IdOnly> __listener;

    private final org.seasar.doma.jdbc.entity.NamingType __namingType;

    private final boolean __immutable;

    private final String __catalogName;

    private final String __schemaName;

    private final String __tableName;

    private final String __qualifiedTableName;

    private final String __name;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<IdOnly, ?>> __idPropertyTypes;

    private final java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<IdOnly, ?>> __entityPropertyTypes;

    private final java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<IdOnly, ?>> __entityPropertyTypeMap;

    private _IdOnly() {
        __listener = new org.seasar.doma.jdbc.entity.NullEntityListener<IdOnly>();
        __namingType = org.seasar.doma.jdbc.entity.NamingType.SNAKE_UPPER_CASE;
        __immutable = false;
        __name = "IdOnly";
        __catalogName = "";
        __schemaName = "";
        __tableName = "ID_ONLY";
        __qualifiedTableName = "ID_ONLY";
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<IdOnly, ?>> __idList = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<IdOnly, ?>>();
        java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<IdOnly, ?>> __list = new java.util.ArrayList<org.seasar.doma.jdbc.entity.EntityPropertyType<IdOnly, ?>>(1);
        java.util.Map<String, org.seasar.doma.jdbc.entity.EntityPropertyType<IdOnly, ?>> __map = new java.util.HashMap<String, org.seasar.doma.jdbc.entity.EntityPropertyType<IdOnly, ?>>(1);
        __idList.add($id);
        __list.add($id);
        __map.put("id", $id);
        __idPropertyTypes = java.util.Collections.unmodifiableList(__idList);
        __entityPropertyTypes = java.util.Collections.unmodifiableList(__list);
        __entityPropertyTypeMap = java.util.Collections.unmodifiableMap(__map);
    }

    @Override
    public org.seasar.doma.jdbc.entity.NamingType getNamingType() {
        return __namingType;
    }

    @Override
    public boolean isImmutable() {
        return __immutable;
    }

    @Override
    public String getName() {
        return __name;
    }

    @Override
    public String getCatalogName() {
        return __catalogName;
    }

    @Override
    public String getSchemaName() {
        return __schemaName;
    }

    @Override
    public String getTableName() {
        return __tableName;
    }

    @Override
    public String getQualifiedTableName() {
        return __qualifiedTableName;
    }

    @Override
    public void preInsert(IdOnly entity, org.seasar.doma.jdbc.entity.PreInsertContext<IdOnly> context) {
        __listener.preInsert(entity, context);
    }

    @Override
    public void preUpdate(IdOnly entity, org.seasar.doma.jdbc.entity.PreUpdateContext<IdOnly> context) {
        __listener.preUpdate(entity, context);
    }

    @Override
    public void preDelete(IdOnly entity, org.seasar.doma.jdbc.entity.PreDeleteContext<IdOnly> context) {
        __listener.preDelete(entity, context);
    }

    @Override
    public void postInsert(IdOnly entity, org.seasar.doma.jdbc.entity.PostInsertContext<IdOnly> context) {
        __listener.postInsert(entity, context);
    }

    @Override
    public void postUpdate(IdOnly entity, org.seasar.doma.jdbc.entity.PostUpdateContext<IdOnly> context) {
        __listener.postUpdate(entity, context);
    }

    @Override
    public void postDelete(IdOnly entity, org.seasar.doma.jdbc.entity.PostDeleteContext<IdOnly> context) {
        __listener.postDelete(entity, context);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<IdOnly, ?>> getEntityPropertyTypes() {
        return __entityPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.EntityPropertyType<IdOnly, ?> getEntityPropertyType(String __name) {
        return __entityPropertyTypeMap.get(__name);
    }

    @Override
    public java.util.List<org.seasar.doma.jdbc.entity.EntityPropertyType<IdOnly, ?>> getIdPropertyTypes() {
        return __idPropertyTypes;
    }

    @Override
    public org.seasar.doma.jdbc.entity.GeneratedIdPropertyType<Object, IdOnly, ?, ?> getGeneratedIdPropertyType() {
        return $id;
    }

    @Override
    public org.seasar.doma.jdbc.entity.VersionPropertyType<Object, IdOnly, ?, ?> getVersionPropertyType() {
        return null;
    }

    @Override
    public IdOnly newEntity() {
        return new IdOnly();
    }

    @Override
    public IdOnly newEntity(java.util.Map<String, Object> __args) {
        return new IdOnly();
    }

    @Override
    public Class<IdOnly> getEntityClass() {
        return IdOnly.class;
    }

    @Override
    public IdOnly getOriginalStates(IdOnly __entity) {
        return null;
    }

    @Override
    public void saveCurrentStates(IdOnly __entity) {
    }

    /**
     * @return the singleton
     */
    public static _IdOnly getSingletonInternal() {
        return __singleton;
    }

    /**
     * @return the new instance
     */
    public static _IdOnly newInstance() {
        return new _IdOnly();
    }

}
