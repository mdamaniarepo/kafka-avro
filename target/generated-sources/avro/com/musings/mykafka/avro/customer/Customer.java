/**
 * Autogenerated by Avro
 *
 * DO NOT EDIT DIRECTLY
 */
package com.musings.mykafka.avro.customer;

import org.apache.avro.specific.SpecificData;
import org.apache.avro.message.BinaryMessageEncoder;
import org.apache.avro.message.BinaryMessageDecoder;
import org.apache.avro.message.SchemaStore;

@SuppressWarnings("all")
/** This is a customer schema */
@org.apache.avro.specific.AvroGenerated
public class Customer extends org.apache.avro.specific.SpecificRecordBase implements org.apache.avro.specific.SpecificRecord {
  private static final long serialVersionUID = 8150627621282530888L;
  public static final org.apache.avro.Schema SCHEMA$ = new org.apache.avro.Schema.Parser().parse("{\"type\":\"record\",\"name\":\"Customer\",\"namespace\":\"com.musings.mykafka.avro.customer\",\"doc\":\"This is a customer schema\",\"fields\":[{\"name\":\"firstName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"First name of customer\"},{\"name\":\"middleName\",\"type\":[\"null\",{\"type\":\"string\",\"avro.java.string\":\"String\"}],\"doc\":\"Middle name of customer\",\"default\":null},{\"name\":\"lastName\",\"type\":{\"type\":\"string\",\"avro.java.string\":\"String\"},\"doc\":\"Last name of customer\"},{\"name\":\"age\",\"type\":\"int\",\"doc\":\"Age of the customer\"},{\"name\":\"height\",\"type\":\"float\",\"doc\":\"Height of the customer in cms\"},{\"name\":\"weight\",\"type\":\"float\",\"doc\":\"Weight of the customer in kilograms\"},{\"name\":\"automatedEmail\",\"type\":\"boolean\",\"doc\":\"Customer choice for email alerts\",\"default\":true}]}");
  public static org.apache.avro.Schema getClassSchema() { return SCHEMA$; }

  private static SpecificData MODEL$ = new SpecificData();

  private static final BinaryMessageEncoder<Customer> ENCODER =
      new BinaryMessageEncoder<Customer>(MODEL$, SCHEMA$);

  private static final BinaryMessageDecoder<Customer> DECODER =
      new BinaryMessageDecoder<Customer>(MODEL$, SCHEMA$);

  /**
   * Return the BinaryMessageDecoder instance used by this class.
   */
  public static BinaryMessageDecoder<Customer> getDecoder() {
    return DECODER;
  }

  /**
   * Create a new BinaryMessageDecoder instance for this class that uses the specified {@link SchemaStore}.
   * @param resolver a {@link SchemaStore} used to find schemas by fingerprint
   */
  public static BinaryMessageDecoder<Customer> createDecoder(SchemaStore resolver) {
    return new BinaryMessageDecoder<Customer>(MODEL$, SCHEMA$, resolver);
  }

  /** Serializes this Customer to a ByteBuffer. */
  public java.nio.ByteBuffer toByteBuffer() throws java.io.IOException {
    return ENCODER.encode(this);
  }

  /** Deserializes a Customer from a ByteBuffer. */
  public static Customer fromByteBuffer(
      java.nio.ByteBuffer b) throws java.io.IOException {
    return DECODER.decode(b);
  }

  /** First name of customer */
   private java.lang.String firstName;
  /** Middle name of customer */
   private java.lang.String middleName;
  /** Last name of customer */
   private java.lang.String lastName;
  /** Age of the customer */
   private int age;
  /** Height of the customer in cms */
   private float height;
  /** Weight of the customer in kilograms */
   private float weight;
  /** Customer choice for email alerts */
   private boolean automatedEmail;

  /**
   * Default constructor.  Note that this does not initialize fields
   * to their default values from the schema.  If that is desired then
   * one should use <code>newBuilder()</code>.
   */
  public Customer() {}

  /**
   * All-args constructor.
   * @param firstName First name of customer
   * @param middleName Middle name of customer
   * @param lastName Last name of customer
   * @param age Age of the customer
   * @param height Height of the customer in cms
   * @param weight Weight of the customer in kilograms
   * @param automatedEmail Customer choice for email alerts
   */
  public Customer(java.lang.String firstName, java.lang.String middleName, java.lang.String lastName, java.lang.Integer age, java.lang.Float height, java.lang.Float weight, java.lang.Boolean automatedEmail) {
    this.firstName = firstName;
    this.middleName = middleName;
    this.lastName = lastName;
    this.age = age;
    this.height = height;
    this.weight = weight;
    this.automatedEmail = automatedEmail;
  }

  public org.apache.avro.Schema getSchema() { return SCHEMA$; }
  // Used by DatumWriter.  Applications should not call.
  public java.lang.Object get(int field$) {
    switch (field$) {
    case 0: return firstName;
    case 1: return middleName;
    case 2: return lastName;
    case 3: return age;
    case 4: return height;
    case 5: return weight;
    case 6: return automatedEmail;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  // Used by DatumReader.  Applications should not call.
  @SuppressWarnings(value="unchecked")
  public void put(int field$, java.lang.Object value$) {
    switch (field$) {
    case 0: firstName = (java.lang.String)value$; break;
    case 1: middleName = (java.lang.String)value$; break;
    case 2: lastName = (java.lang.String)value$; break;
    case 3: age = (java.lang.Integer)value$; break;
    case 4: height = (java.lang.Float)value$; break;
    case 5: weight = (java.lang.Float)value$; break;
    case 6: automatedEmail = (java.lang.Boolean)value$; break;
    default: throw new org.apache.avro.AvroRuntimeException("Bad index");
    }
  }

  /**
   * Gets the value of the 'firstName' field.
   * @return First name of customer
   */
  public java.lang.String getFirstName() {
    return firstName;
  }


  /**
   * Gets the value of the 'middleName' field.
   * @return Middle name of customer
   */
  public java.lang.String getMiddleName() {
    return middleName;
  }


  /**
   * Gets the value of the 'lastName' field.
   * @return Last name of customer
   */
  public java.lang.String getLastName() {
    return lastName;
  }


  /**
   * Gets the value of the 'age' field.
   * @return Age of the customer
   */
  public java.lang.Integer getAge() {
    return age;
  }


  /**
   * Gets the value of the 'height' field.
   * @return Height of the customer in cms
   */
  public java.lang.Float getHeight() {
    return height;
  }


  /**
   * Gets the value of the 'weight' field.
   * @return Weight of the customer in kilograms
   */
  public java.lang.Float getWeight() {
    return weight;
  }


  /**
   * Gets the value of the 'automatedEmail' field.
   * @return Customer choice for email alerts
   */
  public java.lang.Boolean getAutomatedEmail() {
    return automatedEmail;
  }


  /**
   * Creates a new Customer RecordBuilder.
   * @return A new Customer RecordBuilder
   */
  public static com.musings.mykafka.avro.customer.Customer.Builder newBuilder() {
    return new com.musings.mykafka.avro.customer.Customer.Builder();
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Builder.
   * @param other The existing builder to copy.
   * @return A new Customer RecordBuilder
   */
  public static com.musings.mykafka.avro.customer.Customer.Builder newBuilder(com.musings.mykafka.avro.customer.Customer.Builder other) {
    return new com.musings.mykafka.avro.customer.Customer.Builder(other);
  }

  /**
   * Creates a new Customer RecordBuilder by copying an existing Customer instance.
   * @param other The existing instance to copy.
   * @return A new Customer RecordBuilder
   */
  public static com.musings.mykafka.avro.customer.Customer.Builder newBuilder(com.musings.mykafka.avro.customer.Customer other) {
    return new com.musings.mykafka.avro.customer.Customer.Builder(other);
  }

  /**
   * RecordBuilder for Customer instances.
   */
  public static class Builder extends org.apache.avro.specific.SpecificRecordBuilderBase<Customer>
    implements org.apache.avro.data.RecordBuilder<Customer> {

    /** First name of customer */
    private java.lang.String firstName;
    /** Middle name of customer */
    private java.lang.String middleName;
    /** Last name of customer */
    private java.lang.String lastName;
    /** Age of the customer */
    private int age;
    /** Height of the customer in cms */
    private float height;
    /** Weight of the customer in kilograms */
    private float weight;
    /** Customer choice for email alerts */
    private boolean automatedEmail;

    /** Creates a new Builder */
    private Builder() {
      super(SCHEMA$);
    }

    /**
     * Creates a Builder by copying an existing Builder.
     * @param other The existing Builder to copy.
     */
    private Builder(com.musings.mykafka.avro.customer.Customer.Builder other) {
      super(other);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.middleName)) {
        this.middleName = data().deepCopy(fields()[1].schema(), other.middleName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.age)) {
        this.age = data().deepCopy(fields()[3].schema(), other.age);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.height)) {
        this.height = data().deepCopy(fields()[4].schema(), other.height);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.weight)) {
        this.weight = data().deepCopy(fields()[5].schema(), other.weight);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.automatedEmail)) {
        this.automatedEmail = data().deepCopy(fields()[6].schema(), other.automatedEmail);
        fieldSetFlags()[6] = true;
      }
    }

    /**
     * Creates a Builder by copying an existing Customer instance
     * @param other The existing instance to copy.
     */
    private Builder(com.musings.mykafka.avro.customer.Customer other) {
            super(SCHEMA$);
      if (isValidValue(fields()[0], other.firstName)) {
        this.firstName = data().deepCopy(fields()[0].schema(), other.firstName);
        fieldSetFlags()[0] = true;
      }
      if (isValidValue(fields()[1], other.middleName)) {
        this.middleName = data().deepCopy(fields()[1].schema(), other.middleName);
        fieldSetFlags()[1] = true;
      }
      if (isValidValue(fields()[2], other.lastName)) {
        this.lastName = data().deepCopy(fields()[2].schema(), other.lastName);
        fieldSetFlags()[2] = true;
      }
      if (isValidValue(fields()[3], other.age)) {
        this.age = data().deepCopy(fields()[3].schema(), other.age);
        fieldSetFlags()[3] = true;
      }
      if (isValidValue(fields()[4], other.height)) {
        this.height = data().deepCopy(fields()[4].schema(), other.height);
        fieldSetFlags()[4] = true;
      }
      if (isValidValue(fields()[5], other.weight)) {
        this.weight = data().deepCopy(fields()[5].schema(), other.weight);
        fieldSetFlags()[5] = true;
      }
      if (isValidValue(fields()[6], other.automatedEmail)) {
        this.automatedEmail = data().deepCopy(fields()[6].schema(), other.automatedEmail);
        fieldSetFlags()[6] = true;
      }
    }

    /**
      * Gets the value of the 'firstName' field.
      * First name of customer
      * @return The value.
      */
    public java.lang.String getFirstName() {
      return firstName;
    }

    /**
      * Sets the value of the 'firstName' field.
      * First name of customer
      * @param value The value of 'firstName'.
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder setFirstName(java.lang.String value) {
      validate(fields()[0], value);
      this.firstName = value;
      fieldSetFlags()[0] = true;
      return this;
    }

    /**
      * Checks whether the 'firstName' field has been set.
      * First name of customer
      * @return True if the 'firstName' field has been set, false otherwise.
      */
    public boolean hasFirstName() {
      return fieldSetFlags()[0];
    }


    /**
      * Clears the value of the 'firstName' field.
      * First name of customer
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder clearFirstName() {
      firstName = null;
      fieldSetFlags()[0] = false;
      return this;
    }

    /**
      * Gets the value of the 'middleName' field.
      * Middle name of customer
      * @return The value.
      */
    public java.lang.String getMiddleName() {
      return middleName;
    }

    /**
      * Sets the value of the 'middleName' field.
      * Middle name of customer
      * @param value The value of 'middleName'.
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder setMiddleName(java.lang.String value) {
      validate(fields()[1], value);
      this.middleName = value;
      fieldSetFlags()[1] = true;
      return this;
    }

    /**
      * Checks whether the 'middleName' field has been set.
      * Middle name of customer
      * @return True if the 'middleName' field has been set, false otherwise.
      */
    public boolean hasMiddleName() {
      return fieldSetFlags()[1];
    }


    /**
      * Clears the value of the 'middleName' field.
      * Middle name of customer
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder clearMiddleName() {
      middleName = null;
      fieldSetFlags()[1] = false;
      return this;
    }

    /**
      * Gets the value of the 'lastName' field.
      * Last name of customer
      * @return The value.
      */
    public java.lang.String getLastName() {
      return lastName;
    }

    /**
      * Sets the value of the 'lastName' field.
      * Last name of customer
      * @param value The value of 'lastName'.
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder setLastName(java.lang.String value) {
      validate(fields()[2], value);
      this.lastName = value;
      fieldSetFlags()[2] = true;
      return this;
    }

    /**
      * Checks whether the 'lastName' field has been set.
      * Last name of customer
      * @return True if the 'lastName' field has been set, false otherwise.
      */
    public boolean hasLastName() {
      return fieldSetFlags()[2];
    }


    /**
      * Clears the value of the 'lastName' field.
      * Last name of customer
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder clearLastName() {
      lastName = null;
      fieldSetFlags()[2] = false;
      return this;
    }

    /**
      * Gets the value of the 'age' field.
      * Age of the customer
      * @return The value.
      */
    public java.lang.Integer getAge() {
      return age;
    }

    /**
      * Sets the value of the 'age' field.
      * Age of the customer
      * @param value The value of 'age'.
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder setAge(int value) {
      validate(fields()[3], value);
      this.age = value;
      fieldSetFlags()[3] = true;
      return this;
    }

    /**
      * Checks whether the 'age' field has been set.
      * Age of the customer
      * @return True if the 'age' field has been set, false otherwise.
      */
    public boolean hasAge() {
      return fieldSetFlags()[3];
    }


    /**
      * Clears the value of the 'age' field.
      * Age of the customer
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder clearAge() {
      fieldSetFlags()[3] = false;
      return this;
    }

    /**
      * Gets the value of the 'height' field.
      * Height of the customer in cms
      * @return The value.
      */
    public java.lang.Float getHeight() {
      return height;
    }

    /**
      * Sets the value of the 'height' field.
      * Height of the customer in cms
      * @param value The value of 'height'.
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder setHeight(float value) {
      validate(fields()[4], value);
      this.height = value;
      fieldSetFlags()[4] = true;
      return this;
    }

    /**
      * Checks whether the 'height' field has been set.
      * Height of the customer in cms
      * @return True if the 'height' field has been set, false otherwise.
      */
    public boolean hasHeight() {
      return fieldSetFlags()[4];
    }


    /**
      * Clears the value of the 'height' field.
      * Height of the customer in cms
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder clearHeight() {
      fieldSetFlags()[4] = false;
      return this;
    }

    /**
      * Gets the value of the 'weight' field.
      * Weight of the customer in kilograms
      * @return The value.
      */
    public java.lang.Float getWeight() {
      return weight;
    }

    /**
      * Sets the value of the 'weight' field.
      * Weight of the customer in kilograms
      * @param value The value of 'weight'.
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder setWeight(float value) {
      validate(fields()[5], value);
      this.weight = value;
      fieldSetFlags()[5] = true;
      return this;
    }

    /**
      * Checks whether the 'weight' field has been set.
      * Weight of the customer in kilograms
      * @return True if the 'weight' field has been set, false otherwise.
      */
    public boolean hasWeight() {
      return fieldSetFlags()[5];
    }


    /**
      * Clears the value of the 'weight' field.
      * Weight of the customer in kilograms
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder clearWeight() {
      fieldSetFlags()[5] = false;
      return this;
    }

    /**
      * Gets the value of the 'automatedEmail' field.
      * Customer choice for email alerts
      * @return The value.
      */
    public java.lang.Boolean getAutomatedEmail() {
      return automatedEmail;
    }

    /**
      * Sets the value of the 'automatedEmail' field.
      * Customer choice for email alerts
      * @param value The value of 'automatedEmail'.
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder setAutomatedEmail(boolean value) {
      validate(fields()[6], value);
      this.automatedEmail = value;
      fieldSetFlags()[6] = true;
      return this;
    }

    /**
      * Checks whether the 'automatedEmail' field has been set.
      * Customer choice for email alerts
      * @return True if the 'automatedEmail' field has been set, false otherwise.
      */
    public boolean hasAutomatedEmail() {
      return fieldSetFlags()[6];
    }


    /**
      * Clears the value of the 'automatedEmail' field.
      * Customer choice for email alerts
      * @return This builder.
      */
    public com.musings.mykafka.avro.customer.Customer.Builder clearAutomatedEmail() {
      fieldSetFlags()[6] = false;
      return this;
    }

    @Override
    @SuppressWarnings("unchecked")
    public Customer build() {
      try {
        Customer record = new Customer();
        record.firstName = fieldSetFlags()[0] ? this.firstName : (java.lang.String) defaultValue(fields()[0]);
        record.middleName = fieldSetFlags()[1] ? this.middleName : (java.lang.String) defaultValue(fields()[1]);
        record.lastName = fieldSetFlags()[2] ? this.lastName : (java.lang.String) defaultValue(fields()[2]);
        record.age = fieldSetFlags()[3] ? this.age : (java.lang.Integer) defaultValue(fields()[3]);
        record.height = fieldSetFlags()[4] ? this.height : (java.lang.Float) defaultValue(fields()[4]);
        record.weight = fieldSetFlags()[5] ? this.weight : (java.lang.Float) defaultValue(fields()[5]);
        record.automatedEmail = fieldSetFlags()[6] ? this.automatedEmail : (java.lang.Boolean) defaultValue(fields()[6]);
        return record;
      } catch (java.lang.Exception e) {
        throw new org.apache.avro.AvroRuntimeException(e);
      }
    }
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumWriter<Customer>
    WRITER$ = (org.apache.avro.io.DatumWriter<Customer>)MODEL$.createDatumWriter(SCHEMA$);

  @Override public void writeExternal(java.io.ObjectOutput out)
    throws java.io.IOException {
    WRITER$.write(this, SpecificData.getEncoder(out));
  }

  @SuppressWarnings("unchecked")
  private static final org.apache.avro.io.DatumReader<Customer>
    READER$ = (org.apache.avro.io.DatumReader<Customer>)MODEL$.createDatumReader(SCHEMA$);

  @Override public void readExternal(java.io.ObjectInput in)
    throws java.io.IOException {
    READER$.read(this, SpecificData.getDecoder(in));
  }

}