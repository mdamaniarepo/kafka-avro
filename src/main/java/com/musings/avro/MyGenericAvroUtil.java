package com.musings.avro;

import java.io.File;
import java.io.IOException;

import org.apache.avro.Schema;
import org.apache.avro.file.DataFileReader;
import org.apache.avro.file.DataFileWriter;
import org.apache.avro.generic.GenericData;
import org.apache.avro.generic.GenericDatumReader;
import org.apache.avro.generic.GenericDatumWriter;
import org.apache.avro.generic.GenericRecord;
import org.apache.avro.generic.GenericRecordBuilder;
import org.apache.avro.io.DatumReader;
import org.apache.avro.io.DatumWriter;

public class MyGenericAvroUtil {

	public static void main(String[] args) {
		Schema.Parser parser = new Schema.Parser();
		Schema customerSchema = parser.parse("{\r\n" + "	\"type\": \"record\",\r\n"
				+ "	\"namespace\": \"com.musings.mykafka.avro.customer\",\r\n" + "	\"name\": \"customer\",\r\n"
				+ "	\"doc\": \"This is a customer schema\",\r\n" + "	\"fields\": [\r\n"
				+ "		{\"name\": \"firstName\", \"type\": \"string\", \"doc\": \"First name of customer\"},\r\n"
				+ "		{\"name\": \"middleName\", \"type\": [\"null\", \"string\"], \"default\": null, \"doc\": \"Middle name of customer\"},\r\n"
				+ "		{\"name\": \"lastName\", \"type\": \"string\", \"doc\": \"Last name of customer\"},\r\n"
				+ "		{\"name\": \"age\", \"type\": \"int\", \"doc\": \"Age of the customer\"},\r\n"
				+ "		{\"name\": \"height\", \"type\": \"float\", \"doc\": \"Height of the customer in cms\"},\r\n"
				+ "		{\"name\": \"weight\", \"type\": \"float\", \"doc\": \"Weight of the customer in kilograms\"},\r\n"
				+ "		{\"name\": \"automatedEmail\", \"type\": \"boolean\", \"default\": true, \"doc\": \"Customer choice for email alerts\"}\r\n"
				+ "	]\r\n" + "}");

		GenericRecordBuilder genericRecordBuilder = new GenericRecordBuilder(customerSchema);
		genericRecordBuilder.set("firstName", "Mayank");
		genericRecordBuilder.set("middleName", "Sureshchandra");
		genericRecordBuilder.set("lastName", "Damania");
		genericRecordBuilder.set("age", 32);
		genericRecordBuilder.set("height", 170f);
		genericRecordBuilder.set("weight", 69.5f);
		genericRecordBuilder.set("automatedEmail", false);
		GenericData.Record record = genericRecordBuilder.build();

		GenericRecordBuilder genericRecordBuilder1 = new GenericRecordBuilder(customerSchema);
		genericRecordBuilder1.set("firstName", "Sasmita");
		genericRecordBuilder1.set("lastName", "Mallick");
		genericRecordBuilder1.set("age", 32);
		genericRecordBuilder1.set("height", 170f);
		genericRecordBuilder1.set("weight", 69.5f);
		GenericData.Record record1 = genericRecordBuilder1.build();

		DatumWriter<GenericRecord> datumWriter = new GenericDatumWriter<>(customerSchema);
		try (DataFileWriter<GenericRecord> dataFileWriter = new DataFileWriter<GenericRecord>(datumWriter)) {
			dataFileWriter.create(customerSchema, new File("customer-generic.avro"));
			dataFileWriter.append(record);
			dataFileWriter.append(record1);
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}

		DatumReader<GenericRecord> datumReader = new GenericDatumReader<>(customerSchema);
		try (DataFileReader<GenericRecord> dataFileReader = new DataFileReader<>(new File("customer-generic.avro"),
				datumReader)) {
			dataFileReader.forEach(s -> System.out.println("Customer: "+ s.get("firstName")));
		} catch (IOException e) {
			e.printStackTrace();
		} finally {

		}
	}

}
