package com.app

import groovy.sql.Sql
class Student{
	static void main(args) {
		def dbUrl = 'jdbc:postgresql://localhost:5432/testing'
		def dbUser = 'student'
		def dbPassword = 'student'
		
		def dataSource = Sql.newInstance(dbUrl, dbUser, dbPassword)
		
		def query = "SELECT * FROM example"
		def result = dataSource.rows(query)
		result.each { row ->
			println("User: ${row.name}, Age: ${row.age}")
		}
	}
}
