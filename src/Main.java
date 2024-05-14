public class Main {
    public static void main(String[] args) {
        System.out.println("  Задача №1");
        int age = 19;
        if (age >= 18) {
            System.out.println("Человеку 18 лет или больше");
        } else {
            System.out.println("Возраст совершеннолетия еще не наступил, нужно немного одождать");
        }

        System.out.println("  Задача №2");
        int temperature = 1;
        if (temperature < 5) {
            System.out.printf("На улице %s градусов, нужно надеть шапку %n", temperature);
        } else {
            System.out.printf("На улице %s градусов, можно идти без шапки %n", temperature);
        }

        System.out.println("  Задача №3");
        int speed = 57;
        if (speed > 60) {
            System.out.printf("Если скорость %s , то придется заплатить штраф %n", speed);
        }
        if (speed < 60) {
            System.out.printf("Если скорость %s, то можно ездить спокойно %n", speed);
        }

        System.out.println("  Задача №4");
        int Age = 7;

        boolean canGoToKindergarten = Age >=2 && Age <=6;
        if (canGoToKindergarten) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в детсад %n", Age);
        }

        boolean canGoToSchool = Age >=7 && Age <=17;
        if (canGoToSchool) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в школу %n", Age);
        }

        boolean canGoToUniversity = Age >=18 && Age <=24;
        if (canGoToUniversity) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить в университет %n", Age);
        }

        boolean canGoToJob = Age > 24;
        if (canGoToJob) {
            System.out.printf("Если возраст человека равен %s, то ему нужно ходить на работу %n", Age);
        }

        System.out.println("  Задача №5");

        int Age2 = 18;
        int presenceOfAnAdult = 0;


        boolean canRidOnTheAmusementRide = Age2 < 5 ;
        if (canRidOnTheAmusementRide) {
            System.out.printf("Если возраст ребенка равен %s, то ему нельзя кататься на аттракционе %n", Age2);
        }

        boolean canRidOnTheAmusementRide2 = (Age2 >= 5) && (Age2 < 14);
        if (presenceOfAnAdult == 1 && canRidOnTheAmusementRide2) {
            System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе в сопровождении взрослого %n", Age2);
        }
        if ((presenceOfAnAdult != 1) && canRidOnTheAmusementRide2) {
            System.out.printf("Если возраст ребенка равен %s, но он пришел без взрослых, то ему нельзя кататься на аттракционе без сопровождении взрослого %n", Age2);
        }
        else  {
            System.out.printf("Если возраст ребенка равен %s, то ему можно кататься на аттракционе без сопровождении взрослого %n", Age2);
        }

        System.out.println("___Задача №6___");
        int capacityOfOneTrainCar = 102;
        int maxSeatingAreas = 60;
        int maxStandingRoom = capacityOfOneTrainCar - maxSeatingAreas;

        int numberOfOccupiedSeats = 30;
        int numberOfOccupiedStandingPlaces = 42;

        int freeStandingPlaces = maxStandingRoom - numberOfOccupiedStandingPlaces;
        int freeSeats = maxSeatingAreas - numberOfOccupiedSeats;


        boolean availabilityOfFreeSpaceInTheCarriage = freeStandingPlaces < maxStandingRoom && freeSeats < maxSeatingAreas && freeStandingPlaces != 0 && freeSeats != 0;

        if (availabilityOfFreeSpaceInTheCarriage) {
            System.out.printf("В вагоне есть стоячие места : %s штук и сидячие места : %s штук %n", freeStandingPlaces, freeSeats);
        } else if (freeStandingPlaces <= 0 && freeSeats > 0) {
            System.out.printf("В вагоне стоячих мест: нет, но есть сидячие места : %s штук %n", freeSeats);
        } else if (freeStandingPlaces > 0 && freeSeats <= 0) {
            System.out.printf("В вагоне есть стоячие места : %s штук, но сидячих мест - нет. %n", freeStandingPlaces);
        } else if (freeStandingPlaces <= 0 && freeSeats <= 0) {
            System.out.println("В вагоне нет ни стоячих мест, ни сидячих мест");
        }

        System.out.println("___Задача №7___");
        int one = -80 ;
        int two = 50 ;
        int three = 10 ;
        boolean greatestNumber = one > two && one > three;
        if (greatestNumber) {
            System.out.println("Наибольшее число = " + one);
        } else if (one < two && two > three) {
            System.out.println("Наибольшее число = " + two);
        } else if (one < three && two < three) {
            System.out.println("Наибольшее число = " + three);
        }































    }
}