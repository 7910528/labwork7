package com.labwork7;

import java.util.ArrayList;
import java.util.List;

/**
 * Represents a concrete implementation of the schema builder interface.
 */
public class ConcreteSchemaBuilder implements SchemaBuilder
{
    private List<Table> tables;
    /**
     * Constructs a new concrete schema builder.
     */
    public ConcreteSchemaBuilder()
    {
        this.tables = new ArrayList<>();
    }
    @Override
    public SchemaBuilder addTable(Table table)
    {
        this.tables.add(table);
        return this;
    }
    @Override
    public DatabaseSchema build()
    {
        return new DatabaseSchema(tables);
    }
}