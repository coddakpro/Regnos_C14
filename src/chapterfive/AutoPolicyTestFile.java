package chapterfive;

public class AutoPolicyTestFile {
    public static void main(String[] args) {
        AutoPolicy policy1 = null;
        main(args, policy1);
    }

    public static void main(String[] args, AutoPolicy policy1) {

//        creates two AutoPolicy objects
        AutoPolicy AutoPolicy1 =
                new AutoPolicy(11111111, "Toyota camry", "NJ");
        AutoPolicy AutoPolicy2 =
                new AutoPolicy(22222222, "Ford Fusion", "ME");

//        display whether each policy is in a no-fault state
        policyInFaultState(policy1);
        AutoPolicy policy2 = null;
        policyInFaultState(policy2);
        
    }

//    method that displays whether an AutoPolicy
//    is in a state with no-fault auto insurance
    public static void policyInFaultState(AutoPolicy policy){

        System.out.println("The auto policy: ");
        System.out.printf(
                "Account #: %d; Car: %s; State %s %s a no-fault state%n%n", policy.getAccountNumber(), policy.getMakeAndModel(), policy.getState(),
                (policy.isNoFaultState() ? "is": "is not"));
    }
}
