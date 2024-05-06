package com.labwork7;

import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        Table table1 = new Table("Table1");
        table1.addColumn("Column1");
        table1.addColumn("Column2");
        Table table2 = new Table("Table2");
        table2.addColumn("Column1");
        table2.addColumn("Column2");
        table2.addColumn("Column3");
        SchemaBuilder builder = new ConcreteSchemaBuilder();
        DatabaseSchema schema = builder.addTable(table1)
                .addTable(table2)
                .build();
        List<Table> tables = schema.getTables();
        for (Table table : tables)
        {
            System.out.println("Table: " + table.getName());
            System.out.println("Columns: " + table.getColumns());
        }
    }
}