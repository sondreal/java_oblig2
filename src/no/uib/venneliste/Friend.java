package no.uib.venneliste;

public class Friend {
    private String firstName;
    private String lastName;
    private String epost;
    private String phone;

    /**
     *
     * @param firstName
     * @param lastName
     * @param epost
     * @param phone
     */
    public Friend(String firstName, String lastName, String epost, String phone) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.epost = epost;
        this.phone = phone;
    }
    /**
     *
     * @return String
     */
    public String getFirsdtName() {
        return firstName;
    }
    /**
     *
     * @param firstName
     */
    public void setFirsdtName(String firstName) {
        this.firstName = firstName;
    }
    /**
     *
     * @return String
     */
    public String getLastName() {
        return lastName;
    }
    /**
     *
     * @param lastName
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    /**
     *
     * @return String
     */
    public String getEpost() {
        return epost;
    }
    /**
     *
     * @param epost
     */
    public void setEpost(String epost) {
        this.epost = epost;
    }
    /**
     *
     * @return String
     */
    public String getPhone() {
        return phone;
    }
    /**
     *
     * @param phone
     */
    public void setPhone(String phone) {
        this.phone = phone;
    }
}
