public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;

    /**
     * No arg constructor
     */
    public Policy() {
        policyNumber = 0;
        providerName = "";
        policyholderFirstName = "";
        policyholderLastName = "";
        policyholderAge = 0;
        policyholderSmokingStatus = "";
        policyholderHeight = 0;
        policyholderWeight = 0;
    }

    /**
     * Constrcutor with arguments
     * 
     * @param poliNum
     * @param provName
     * @param poliholdFirstName
     * @param poliholdLastName
     * @param poliholdAge
     * @param poliholdSmokeStatus
     * @param poliholdHeight
     * @param poliholdWeight
     */
    public Policy(int poliNum, String provName, String poliholdFirstName, String poliholdLastName, int poliholdAge, String poliholdSmokeStatus, double poliholdHeight, double poliholdWeight) {
        policyNumber = poliNum;
        providerName = provName;
        policyholderFirstName = poliholdFirstName;
        policyholderLastName = poliholdLastName;
        policyholderAge = poliholdAge;
        policyholderSmokingStatus = poliholdSmokeStatus;
        policyholderHeight = poliholdHeight;
        policyholderWeight = poliholdWeight;
    }

    /**
     * Gets the policy number for the policy.
     *  
     * @return The policy number.
     */
    public int getPolicyNumber() {
        return policyNumber;
    }

    /**
     * Sets the policy number for the policy.
     * 
     * @param newPolicyNumber The new policy number to use.
     */
    public void setPolicyNumber(int newPolicyNumber) {
        policyNumber = newPolicyNumber;
    }

    /**
     * Gets the provider name for the policy.
     * 
     * @return The provider name.
     */
    public String getProviderName() {
        return providerName;
    }

    /**
     * Sets the provider name for the policy.
     * 
     * @param newProviderName The new provider name for the policy.
     */
    public void setProviderName(String newProviderName) {
        providerName = newProviderName;
    }

    /**
     * Gets the first name of the policy holder.
     * 
     * @return The first name of the policy holder.
     */
    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    /**
     * Sets the first name of the policy holder.
     * 
     * @param newPolicyholderFirstName The new first name for the policy holder.
     */
    public void setPolicyholderFirstName(String newPolicyholderFirstName) {
        policyholderFirstName = newPolicyholderFirstName;
    }

    /**
     * Gets the last name for the policy holder.
     * 
     * @return The last name for the policy holder.
     */
    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    /**
     * Sets the last name for the policy holder.
     * 
     * @param newPolicyholderLastName The new last name for the policy holder.
     */
    public void setPolicyholderLastName(String newPolicyholderLastName) {
        policyholderLastName = newPolicyholderLastName;
    }

    /**
     * Gets the age of the policy holder.
     * 
     * @return The age of the policy holder.
     */
    public int getPolicyholderAge() {
        return policyholderAge;
    }

    /**
     * Sets the age of the policy holder.
     * 
     * @param newPolicyholderAge The new age of the policy holder.
     */
    public void setPolicyholderAge(int newPolicyholderAge) {
        policyholderAge = newPolicyholderAge;
    }

    /**
     * Gets the smoking status of the policy holder.
     * 
     * @return The smoking status of the policy holder. 
     */
    public String getPolicyholderSmokingStatus() {
        return policyholderSmokingStatus;
    }

    /**
     * Sets the smoking status of the policy holder.
     * 
     * @param newPolicyholderSmokingStatus The new smoking status of the policy holder.
     */
    public void setPolicyholderSmokingStatus(String newPolicyholderSmokingStatus) {
        policyholderSmokingStatus = newPolicyholderSmokingStatus;
    }

    /**
     * Gets the height of the policy holder.
     * 
     * @return The height of the policy holder.
     */
    public double getPolicyholderHeight() {
        return policyholderHeight;
    }

    /**
     * Sets the height of the policy holder.
     * 
     * @param newPolicyholderHeight The new height of the policy holder.
     */
    public void setPolicyholderHeight(double newPolicyholderHeight) {
        policyholderHeight = newPolicyholderHeight;
    }

    /**
     * Gets the weight of the policy holder.
     * 
     * @return The weight of the policy holder.
     */
    public double getPolicyholderWeight() {
        return policyholderWeight;
    }

    /**
     * Sets the weight of the policy holder.
     * 
     * @param newPolicyholderWeight The new weight of the policy holder.
     */
    public void setPolicyholderWeight(double newPolicyholderWeight) {
        policyholderWeight = newPolicyholderWeight;
    }

    /**
     * Calculates the BMI for the policy holder.
     * 
     * @return The BMI of the policy holder.
     */
    public double calculateBMI() {
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }

    /**
     * Calculates the total cost of the policy.
     * 
     * @return The price of the policy.
     */
    public double calculatePolicyPrice() {
        double additionalFee = 0;

        if (policyholderAge > 50) {
            additionalFee += 75;
        }

        if (policyholderSmokingStatus.equals("smoker")) {
            additionalFee += 100;
        }

        if (calculateBMI() > 35) {
            additionalFee += (calculateBMI() - 35) * 20;
        }

        return 600 + additionalFee;
    }
}