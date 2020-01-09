package com.planit.banking;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@SpringBootApplication
public class BankingApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(BankingApplication.class);

	public static void main(String[] args) {
		SpringApplication.run(BankingApplication.class, args);
	}

	@Autowired
	JdbcTemplate jdbcTemplate;
	/*
	@Override
	public void run(String... strings) throws Exception {

		log.info("Populating tables");

		List<Object[]> splitUpNames = Arrays.asList(
				"John Woo Serbian Professor",
				"Jeff Dean American Teacher",
				"Josh Bloch German Scientist",
				"Josh Long Japanese Designer")
				.stream()
				.map(name -> name.split(" "))
				.collect(Collectors.toList());

		splitUpNames.forEach(name -> log.info(String.format("Inserting customer record for %s %s", name[0], name[1])));

		jdbcTemplate.batchUpdate("INSERT INTO customers(cust_first_name, cust_last_name, cust_nationality, cust_occupation) VALUES (?,?,?,?)", splitUpNames);

		log.info("Querying for customer records where first_name = 'Josh':");
		jdbcTemplate.query(
				"SELECT cust_id, cust_first_name, cust_last_name, cust_nationality, cust_occupation FROM customers WHERE cust_first_name = ?", new Object[] { "Josh" },
				(rs, rowNum) -> new Customer(
						rs.getInt("cust_id"),
						rs.getString("cust_first_name"),
						rs.getString("cust_last_name"),
						rs.getString("cust_nationality"),
						rs.getString("cust_occupation"),
						(short)10
				)
		).forEach(customer -> log.info(customer.toString()));

	}
	*/
}
