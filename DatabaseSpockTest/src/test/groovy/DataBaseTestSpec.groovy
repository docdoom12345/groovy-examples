package test.groovy

import groovy.sql.Sql
import spock.lang.*
class DataBaseTestSpec extends Specification{
	def "conenction"(){
		given:
		def dbUrl = 'jdbc:postgresql://localhost:5432/testing'
		def dbUser = 'student'
		def dbPassword = 'student'
		
		when:
		def dataSource = Sql.newInstance(dbUrl, dbUser, dbPassword)
		
		then:
		dataSource.getConnection() != null
	}
}
