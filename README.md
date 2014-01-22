# Playing with grails hibernate filter plugin

This is a simple Grails 2.3.4 application to make some test of the [grails-hibernate-filter plugin](http://grails.org/plugin/hibernate-filter).

The app uses a Postgresql database instead of the default in-memory H2 database. This is because I mainly only use Postgres in production and I want to test with the final database.

As the results of my tests I realized that the plugin does not work with Postgres and I open two JIRAS:

 * [Filter does not work with Postgres](http://jira.grails.org/browse/GPHIBERNATEFILTER-13)
 * [The name of the variables in the filter must be the physical name](http://jira.grails.org/browse/GPHIBERNATEFILTER-14)