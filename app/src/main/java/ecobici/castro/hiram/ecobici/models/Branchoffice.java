package ecobici.castro.hiram.ecobici.models;
import com.google.gson.annotations.SerializedName;

public class Branchoffice {

    @SerializedName("codeMessage")
    private Integer codeMessage;
    @SerializedName("message")
    private String message;
    @SerializedName("id")
    private Integer id;
    @SerializedName("businessID")
    private String businessID;
    @SerializedName("storeID")
    private String storeID;
    @SerializedName("name")
    private String name;
    @SerializedName("address")
    private String address;
    @SerializedName("telephone")
    private String telephone;
    @SerializedName("manager")
    private String manager;
    @SerializedName("zipCode")
    private String zipCode;
    @SerializedName("latSpan")
    private String latSpan;
    @SerializedName("latPoint")
    private String latPoint;
    @SerializedName("lonPoint")
    private String lonPoint;
    @SerializedName("opens")
    private String opens;

    public Branchoffice() {

    }

    public Branchoffice(String businessID, String storeID, String name, String address, String telephone, String manager, String zipCode, String latSpan, String latPoint, String lonPoint, String opens) {
        this.businessID = businessID;
        this.storeID = storeID;
        this.name = name;
        this.address = address;
        this.telephone = telephone;
        this.manager = manager;
        this.zipCode = zipCode;
        this.latSpan = latSpan;
        this.latPoint = latPoint;
        this.lonPoint = lonPoint;
        this.opens = opens;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getBusinessID() {
        return businessID;
    }

    public void setBusinessID(String businessID) {
        this.businessID = businessID;
    }

    public String getStoreID() {
        return storeID;
    }

    public void setStoreID(String storeID) {
        this.storeID = storeID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public String getLatSpan() {
        return latSpan;
    }

    public void setLatSpan(String latSpan) {
        this.latSpan = latSpan;
    }

    public String getLatPoint() {
        return latPoint;
    }

    public void setLatPoint(String latPoint) {
        this.latPoint = latPoint;
    }

    public String getLonPoint() {
        return lonPoint;
    }

    public void setLonPoint(String lonPoint) {
        this.lonPoint = lonPoint;
    }

    public String getOpens() {
        return opens;
    }

    public void setOpens(String opens) {
        this.opens = opens;
    }
}
