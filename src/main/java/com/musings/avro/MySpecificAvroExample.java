package com.musings.avro;

import java.io.File;
import java.io.IOException;

import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;
import org.apache.avro.specific.SpecificDatumReader;
import org.apache.avro.specific.SpecificDatumWriter;

import com.musings.mykafka.avro.customer.Customer;

public class MySpecificAvroExample {
	
	public static void main(String[] args) {
		
		Customer.Builder customerBuilder = Customer.newBuilder();
		customerBuilder.setFirstName("Kiaan");
		customerBuilder.setMiddleName("Mayank");
		customerBuilder.setLastName("Damania");
		customerBuilder.setAge(2);
		customerBuilder.setHeight(85);
		customerBuilder.setWeight(12);
		customerBuilder.setAutomatedEmail(false);
		Customer kiaan = customerBuilder.build();
		
		Customer.Builder customerBuilder1 = Customer.newBuilder();
		customerBuilder1.setFirstName("Amyra");
		customerBuilder1.setLastName("Damania");
		customerBuilder1.setAge(2);
		customerBuilder1.setHeight(85);
		customerBuilder1.setWeight(12);
		customerBuilder1.setAutomatedEmail(false);
		Customer amyra = customerBuilder1.build();
		
		
		DatumWriter<Customer> datumWriter = new SpecificDatumWriter<>(Customer.class);
		try (DataFileWriter<Customer> dataFileWriter = new DataFileWriter<Customer>(datumWriter)) {
			dataFileWriter.create(kiaan.getSchema(), new File("customer-specific.avro"));
			dataFileWriter.append(kiaan);
			dataFileWriter.append(amyra);
			System.out.println("Wrote successfully to file" );
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

		DatumReader<Customer> datumReader = new SpecificDatumReader<>(Customer.class);
		try (DataFileReader<Customer> dataFileReader = new DataFileReader<>(new File("customer-specific.avro"),
				datumReader)) {
			dataFileReader.forEach(s -> System.out.println("Customer: "+ s.getFirstName() + s.getLastName()));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
		
	}

}
