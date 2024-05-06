package com.labwork7;

import java.util.List;

/**
 * Represents a database schema consisting of tables.
 */
class DatabaseSchema
{
    private static volatile DatabaseSchema instance;
    private List<Table> tables;
    /**
     * Constructs a new database schema with the given tables.
     * @param tables The list of tables in the schema.
     */
    DatabaseSchema(List<Table> tables)
    {
        this.tables = tables;
    }
    /**
     * Returns the instance of the database schema.
     * @return The instance of the database schema.
     */
    public static DatabaseSchema getInstance()
    {
        if (instance == null)
        {
            synchronized (DatabaseSchema.class)
            {
                if (instance == null)
                {
                    instance = new ConcreteSchemaBuilder().build();
                }
            }
        }
        return instance;
    }
    /**
     * Returns the tables in the schema.
     * @return The list of tables.
     */
    public List<Table> getTables()
    {
        return tables;
    }
}