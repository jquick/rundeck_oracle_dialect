This alternate oracle dialect is to tell the oracle driver to use updated (clob/blob/etc) instead of the deprecated long. This should allow rundeck to startup and create all tables without issues. Tested on Oracle12c.

## Install
copy jar file to:

`/var/lib/rundeck/exp/webapp/WEB-INF/lib`

edit rundeck-config.properties change/add dialect to:

`dataSource.dialect = com.rundeck.hibernate.RundeckOracleDialect`

start up!


All credit to @ikogan
