package com.labwork7;

import java.util.List;
import java.util.ArrayList;

/**
 * Represents a relational table.
 */
class Table
{
    private String name;
    private List<String> columns;
    /**
     * Constructs a new table with the given name.
     * @param name The name of the table.
     */
    public Table(String name)
    {
        this.name = name;
        this.columns = new ArrayList<>();
        System.out.println(name+" created");
    }
    /**
     * Adds a column to the table.
     * @param column The name of the column to add.
     */
    public void addColumn(String column)
    {
        columns.add(column);
        System.out.println(column+" added to "+name);
    }
    /**
     * Returns the columns of the table.
     * @return The list of columns.
     */
    public List<String> getColumns()
    {
        return columns;
    }
    /**
     * Returns the name of the table.
     * @return The name of the table.
     */
    public String getName()
    {
        return name;
    }
}