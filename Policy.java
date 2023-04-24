public class Policy {
    private int policyNumber;
    private String providerName;
    private PolicyHolder person;

    /**
     * No arg constructor
     */
    public Policy() {
        policyNumber = 0;
        providerName = "";
        person;
    }

    /**
     * Constrcutor with arguments
     * 
     * @param poliNum
     * @param provName
     */
    public Policy(int poliNum, String provName, PolicyHolder poliHolder) {
        policyNumber = poliNum;
        providerName = provName;
        person = poliHolder;
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