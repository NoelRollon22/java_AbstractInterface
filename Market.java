package Abstact_Interface;

public class Market extends Buyer{
    @Override
    public void buyer(int buy) {
        int option = 1;
        for (int cock = 1; cock <(buy/5); cock++) {
            for (int hen = 1; hen <(buy/3); hen++) {
                for (float chick = 1; chick <(buy*3); chick++){
                    if (cock + hen + chick == buy && cock * 5 + hen * 3 + chick/3 == buy) {
                        System.out.println("Option"+ option +"-> "+ cock +" Cocks "+ hen +" hens "+ chick+ " Chickens");
                        option++;
                    }
                }
            }
        }
    }

}
