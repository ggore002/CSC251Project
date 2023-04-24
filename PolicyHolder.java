public class PolicyHolder {
    private String firstName;
    private String lastName;
    private int age;
    private String smokingStatus;
    private double height;
    private double weight;
    
    public PolicyHolder() {
       firstName = "";
       lastName = "";
       age = 0;
       smokingStatus = "";
       height = 0;
       weight = 0;
    }
    
    public PolicyHolder(String first, String last, int curAge, String smoke, double curHeight, double curWeight) {
       firstName = first;
       lastName = last;
       age = curAge;
       smokingStatus = smoke;
       height = curHeight;
       weight = curWeight;
    }
    
    /**
      * Gets the first name of the policy holder.
      * 
      * @return The first name of the policy holder.
      */
     public String getFirstName() {
         return firstName;
     }
 
     /**
      * Sets the first name of the policy holder.
      * 
      * @param newFirstName The new first name for the policy holder.
      */
     public void setFirstName(String newFirstName) {
         firstName = newFirstName;
     }
 
     /**
      * Gets the last name for the policy holder.
      * 
      * @return The last name for the policy holder.
      */
     public String getLastName() {
         return lastName;
     }
 
     /**
      * Sets the last name for the policy holder.
      * 
      * @param newLastName The new last name for the policy holder.
      */
     public void setLastName(String newLastName) {
         lastName = newLastName;
     }
 
     /**
      * Gets the age of the policy holder.
      * 
      * @return The age of the policy holder.
      */
     public int getAge() {
         return age;
     }
 
     /**
      * Sets the age of the policy holder.
      * 
      * @param newAge The new age of the policy holder.
      */
     public void setAge(int newAge) {
         age = newAge;
     }
 
     /**
      * Gets the smoking status of the policy holder.
      * 
      * @return The smoking status of the policy holder. 
      */
     public String getSmokingStatus() {
         return smokingStatus;
     }
 
     /**
      * Sets the smoking status of the policy holder.
      * 
      * @param newSmokingStatus The new smoking status of the policy holder.
      */
     public void setSmokingStatus(String newSmokingStatus) {
         smokingStatus = newSmokingStatus;
     }
 
     /**
      * Gets the height of the policy holder.
      * 
      * @return The height of the policy holder.
      */
     public double getHeight() {
         return height;
     }
 
     /**
      * Sets the height of the policy holder.
      * 
      * @param newHeight The new height of the policy holder.
      */
     public void setHeight(double newHeight) {
         height = newHeight;
     }
 
     /**
      * Gets the weight of the policy holder.
      * 
      * @return The weight of the policy holder.
      */
     public double getWeight() {
         return weight;
     }
 
     /**
      * Sets the weight of the policy holder.
      * 
      * @param newWeight The new weight of the policy holder.
      */
     public void setWeight(double newWeight) {
         weight = newWeight;
     }
 }