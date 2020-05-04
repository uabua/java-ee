/**
 * Covid.java
 * <p>
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package covid;

public class Covid implements java.io.Serializable {
    private int confirmed;

    private java.lang.String country;

    private int deaths;

    private int recovered;

    public Covid() {
    }

    public Covid(
            int confirmed,
            java.lang.String country,
            int deaths,
            int recovered) {
        this.confirmed = confirmed;
        this.country = country;
        this.deaths = deaths;
        this.recovered = recovered;
    }


    /**
     * Gets the confirmed value for this Covid.
     *
     * @return confirmed
     */
    public int getConfirmed() {
        return confirmed;
    }


    /**
     * Sets the confirmed value for this Covid.
     *
     * @param confirmed
     */
    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }


    /**
     * Gets the country value for this Covid.
     *
     * @return country
     */
    public java.lang.String getCountry() {
        return country;
    }


    /**
     * Sets the country value for this Covid.
     *
     * @param country
     */
    public void setCountry(java.lang.String country) {
        this.country = country;
    }


    /**
     * Gets the deaths value for this Covid.
     *
     * @return deaths
     */
    public int getDeaths() {
        return deaths;
    }


    /**
     * Sets the deaths value for this Covid.
     *
     * @param deaths
     */
    public void setDeaths(int deaths) {
        this.deaths = deaths;
    }


    /**
     * Gets the recovered value for this Covid.
     *
     * @return recovered
     */
    public int getRecovered() {
        return recovered;
    }


    /**
     * Sets the recovered value for this Covid.
     *
     * @param recovered
     */
    public void setRecovered(int recovered) {
        this.recovered = recovered;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof Covid)) return false;
        Covid other = (Covid) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                this.confirmed == other.getConfirmed() &&
                ((this.country == null && other.getCountry() == null) ||
                        (this.country != null &&
                                this.country.equals(other.getCountry()))) &&
                this.deaths == other.getDeaths() &&
                this.recovered == other.getRecovered();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hashCode += getConfirmed();
        if (getCountry() != null) {
            _hashCode += getCountry().hashCode();
        }
        _hashCode += getDeaths();
        _hashCode += getRecovered();
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(Covid.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://service/", "covid"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("confirmed");
        elemField.setXmlName(new javax.xml.namespace.QName("", "confirmed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("country");
        elemField.setXmlName(new javax.xml.namespace.QName("", "country"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deaths");
        elemField.setXmlName(new javax.xml.namespace.QName("", "deaths"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recovered");
        elemField.setXmlName(new javax.xml.namespace.QName("", "recovered"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new org.apache.axis.encoding.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }

    @Override
    public String toString() {
        return "Covid{" +
                "confirmed=" + confirmed +
                ", country='" + country + '\'' +
                ", deaths=" + deaths +
                ", recovered=" + recovered +
                '}';
    }
}
