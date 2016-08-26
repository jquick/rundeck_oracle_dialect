package com.rundeck.hibernate;

import org.hibernate.dialect.Oracle10gDialect;

import java.sql.Types;

/**
 * Custom Oracle dialect that fixes various issues with
 * Oracle support in Hibernate.
 */
public class RundeckOracleDialect extends Oracle10gDialect {
    protected void registerLargeObjectTypeMappings() {
        registerColumnType( Types.BLOB, "blob" );
        registerColumnType( Types.CLOB, "clob" );

        registerColumnType( Types.BINARY, 2000, "raw($l)" );
        registerColumnType( Types.BINARY, "blob" );

	registerColumnType( Types.VARBINARY, 2000, "raw($l)" );
	registerColumnType( Types.VARBINARY, "blob" );

	registerColumnType( Types.LONGVARCHAR, "clob" );
	registerColumnType( Types.LONGVARBINARY, "blob" );

	registerColumnType( Types.VARCHAR, 4000, "varchar2($l char)" );
	registerColumnType( Types.VARCHAR, "clob" );
    }
}
