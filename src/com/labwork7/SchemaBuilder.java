package com.labwork7;

/**
 * Defines the schema builder interface.
 */
interface SchemaBuilder
{
    /**
     * Adds a table to the schema.
     * @param table The table to add.
     * @return The schema builder.
     */
    SchemaBuilder addTable(Table table);
    /**
     * Builds the database schema.
     * @return The constructed database schema.
     */
    DatabaseSchema build();
}