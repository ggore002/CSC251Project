public class Policy {
    private int policyNumber;
    private String providerName;
    private String policyholderFirstName;
    private String policyholderLastName;
    private int policyholderAge;
    private String policyholderSmokingStatus;
    private double policyholderHeight;
    private double policyholderWeight;

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

    public int getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(int newPolicyNumber) {
        policyNumber = newPolicyNumber;
    }

    public String getProviderName() {
        return providerName;
    }

    public void setProviderName(String newProviderName) {
        providerName = newProviderName;
    }

    public String getPolicyholderFirstName() {
        return policyholderFirstName;
    }

    public void setPolicyholderFirstName(String newPolicyholderFirstName) {
        policyholderFirstName = newPolicyholderFirstName;
    }

    public String getPolicyholderLastName() {
        return policyholderLastName;
    }

    public void setPolicyholderLastName(String newPolicyholderLastName) {
        policyholderLastName = newPolicyholderLastName;
    }

    public int getPolicyholderAge() {
        return policyholderAge;
    }

    public void setPolicyholderAge(int newPolicyholderAge) {
        policyholderAge = newPolicyholderAge;
    }

    public String getPolicyholderSmokingStatus() {
        return policyholderSmokingStatus;
    }

    public void setPolicyholderSmokingStatus(String newPolicyholderSmokingStatus) {
        policyholderSmokingStatus = newPolicyholderSmokingStatus;
    }

    public double getPolicyholderHeight() {
        return policyholderHeight;
    }

    public void setPolicyholderHeight(double newPolicyholderHeight) {
        policyholderHeight = newPolicyholderHeight;
    }

    public double getPolicyholderWeight() {
        return policyholderWeight;
    }

    public void setPolicyholderWeight(double newPolicyholderWeight) {
        policyholderWeight = newPolicyholderWeight;
    }

    public double calculateBMI() {
        return (policyholderWeight * 703) / (policyholderHeight * policyholderHeight);
    }

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