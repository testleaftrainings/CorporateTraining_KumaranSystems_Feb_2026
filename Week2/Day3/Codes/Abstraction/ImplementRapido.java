package org.kumaransystems.week2.day3;

public class ImplementRapido implements RapidoBooking {

    @Override
    public void selectSource() {
        System.out.println("selectSource");
    }

    @Override
    public void selectMode() {
    System.out.println("selectMode");
    }

    public static void main(String[] args) {
        ImplementRapido rapidoOptions=new ImplementRapido();
        rapidoOptions.selectMode();
        rapidoOptions.selectMode();
    }

}
