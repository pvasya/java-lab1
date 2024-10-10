import com.vasylpopovych.java.lab1.*;

public class Main {
    public static void main(String[] args) {
        GameRoom GameRoom = new GameRoom(1000);

        GameRoom.addToy(new SmallCar("Mini Car1", 50, AGE_GROUP.KIDS));
        GameRoom.addToy(new MediumDoll("Medium Doll1", 150, AGE_GROUP.TEENS));
        GameRoom.addToy(new LargeBall("Large Ball1", 200, AGE_GROUP.TODDLERS));

        GameRoom.addToy(new SmallCar("Mini Car2", 51, AGE_GROUP.TODDLERS));
        GameRoom.addToy(new MediumDoll("Medium Doll2", 153, AGE_GROUP.KIDS));
        GameRoom.addToy(new LargeBall("Large Ball2", 2000, AGE_GROUP.KIDS));

        GameRoom.addToy(new SmallCar("Mini Car3", 5032, AGE_GROUP.TODDLERS));
        GameRoom.addToy(new MediumDoll("Medium Doll3", 10, AGE_GROUP.TODDLERS));
        GameRoom.addToy(new LargeBall("Large Ball3", 22, AGE_GROUP.TODDLERS));

        GameRoom.addToy(new SmallCar("Mini Car4", 99, AGE_GROUP.TODDLERS));
        GameRoom.addToy(new MediumDoll("Medium Doll4", 99, AGE_GROUP.TEENS));
        GameRoom.addToy(new LargeBall("Large Ball4", 100, AGE_GROUP.TEENS));

        GameRoom.addToy(new SmallBall("Mini Car5", 999, AGE_GROUP.TODDLERS));
        GameRoom.addToy(new MediumBall("Medium Doll5", 333, AGE_GROUP.KIDS));
        GameRoom.addToy(new LargeBall("Large Ball5", 1000, AGE_GROUP.TEENS));

        System.out.println("The toys before sorting:");
        GameRoom.displayToys();

        GameRoom.sortToysByPrice();
        System.out.println("\nThe toys after sorting by price:");
        GameRoom.displayToys();

        System.out.println("\nThe toys for toddlers:");
        GameRoom.findToysByAgeGroup(AGE_GROUP.TODDLERS).forEach(System.out::println);

        System.out.println("\nThe toys for kids:");
        GameRoom.findToysByAgeGroup(AGE_GROUP.KIDS).forEach(System.out::println);

        System.out.println("\nThe toys for teens:");
        GameRoom.findToysByAgeGroup(AGE_GROUP.TEENS).forEach(System.out::println);

        System.out.println("\nLargeDoll:");
        GameRoom.findToysByType(SmallCar.class).forEach(System.out::println);

        System.out.println("\nfindToysByParameters(Double minPrice, Double maxPrice, AgeGroup ageGroup)");
        GameRoom.findToysByParameters(100., 1000., AGE_GROUP.TEENS).forEach(System.out::println);
    }
}