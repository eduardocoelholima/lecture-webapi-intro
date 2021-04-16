
package org.tempuri;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.tempuri package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _SelectionSortResponseSelectionSortResult_QNAME = new QName("http://tempuri.org/", "selectionSortResult");
    private final static QName _GetKeyResponseGetKeyResult_QNAME = new QName("http://tempuri.org/", "GetKeyResult");
    private final static QName _MergeSortInput_QNAME = new QName("http://tempuri.org/", "input");
    private final static QName _MergeSortUserKey_QNAME = new QName("http://tempuri.org/", "userKey");
    private final static QName _MergeSortResponseMergeSortResult_QNAME = new QName("http://tempuri.org/", "mergeSortResult");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.tempuri
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SelectionSortResponse }
     * 
     */
    public SelectionSortResponse createSelectionSortResponse() {
        return new SelectionSortResponse();
    }

    /**
     * Create an instance of {@link GetKey }
     * 
     */
    public GetKey createGetKey() {
        return new GetKey();
    }

    /**
     * Create an instance of {@link MergeSortResponse }
     * 
     */
    public MergeSortResponse createMergeSortResponse() {
        return new MergeSortResponse();
    }

    /**
     * Create an instance of {@link MergeSort }
     * 
     */
    public MergeSort createMergeSort() {
        return new MergeSort();
    }

    /**
     * Create an instance of {@link GetKeyResponse }
     * 
     */
    public GetKeyResponse createGetKeyResponse() {
        return new GetKeyResponse();
    }

    /**
     * Create an instance of {@link SelectionSort }
     * 
     */
    public SelectionSort createSelectionSort() {
        return new SelectionSort();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "selectionSortResult", scope = SelectionSortResponse.class)
    public JAXBElement<String> createSelectionSortResponseSelectionSortResult(String value) {
        return new JAXBElement<String>(_SelectionSortResponseSelectionSortResult_QNAME, String.class, SelectionSortResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "GetKeyResult", scope = GetKeyResponse.class)
    public JAXBElement<String> createGetKeyResponseGetKeyResult(String value) {
        return new JAXBElement<String>(_GetKeyResponseGetKeyResult_QNAME, String.class, GetKeyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "input", scope = MergeSort.class)
    public JAXBElement<String> createMergeSortInput(String value) {
        return new JAXBElement<String>(_MergeSortInput_QNAME, String.class, MergeSort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userKey", scope = MergeSort.class)
    public JAXBElement<String> createMergeSortUserKey(String value) {
        return new JAXBElement<String>(_MergeSortUserKey_QNAME, String.class, MergeSort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "mergeSortResult", scope = MergeSortResponse.class)
    public JAXBElement<String> createMergeSortResponseMergeSortResult(String value) {
        return new JAXBElement<String>(_MergeSortResponseMergeSortResult_QNAME, String.class, MergeSortResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "input", scope = SelectionSort.class)
    public JAXBElement<String> createSelectionSortInput(String value) {
        return new JAXBElement<String>(_MergeSortInput_QNAME, String.class, SelectionSort.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "userKey", scope = SelectionSort.class)
    public JAXBElement<String> createSelectionSortUserKey(String value) {
        return new JAXBElement<String>(_MergeSortUserKey_QNAME, String.class, SelectionSort.class, value);
    }

}
