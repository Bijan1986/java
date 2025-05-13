package udemy.design.pattern.creational.factory.abstactmethod;

public class GymMembershiptProvider {
    public static GymMembershipAbstractFactory getMembershipFactory(String membershipType) {
        return switch (membershipType.toUpperCase()) {
            case "BASIC" -> new BasicMembersipFacatory();
            case "ADVANCED" -> new AdvancedMembershipFactory();
            default -> throw new IllegalArgumentException();
        };
    }
}
