package Siniflar.Boks;

public class Ring {
    Fighter f1;
    Fighter f2;
    int minWeight;
    int maxWeight;

    public Ring(Fighter f1, Fighter f2, int minWeight, int maxWeight) {
        this.f1 = f1;
        this.f2 = f2;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }
    public Fighter firstRaid() {
        return Math.random() < 0.5 ? f1 : f2;
     
    }

    public void run() {
        Fighter first = firstRaid();
        Fighter second = first == f1 ? f2 : f1;
        System.out.println("First fighter is " + first.name);
        System.out.println("Second fighter is " + second.name);


        if (checkWeight(first, second)) {
            while (first.health > 0 && second.health > 0) {
                System.out.println("======== YENİ ROUND ===========");
                second.health = first.hit(second);
                if (isWin(first, second)) {
                    break;
                }
                first.health = second.hit(first);
                if (isWin(first, second)) {
                    break;
                }
                printScore();
            }

        } else {
            System.out.println("Sporcuların ağırlıkları uyuşmuyor.");
        }


    }

    public boolean checkWeight(Fighter f1, Fighter f2) {
        return (f1.weight >= minWeight && f1.weight <= maxWeight) && (f2.weight >= minWeight && f2.weight <= maxWeight);
    }

    public boolean isWin(Fighter f1, Fighter f2) {
        if (f2.health == 0) {
            System.out.println("Maçı Kazanan : " + f1.name);
            return true;
        } else if (f1.health == 0){
            System.out.println("Maçı Kazanan : " + f2.name);
            return true;
        }

        return false;
    }


    public void printScore() {
        System.out.println("------------");
        System.out.println(f1.name + " Kalan Can \t:" + f1.health);
        System.out.println(f2.name + " Kalan Can \t:" + f2.health);
    }
}