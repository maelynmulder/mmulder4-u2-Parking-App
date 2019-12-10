package com.company;

public class LostTicket implements FeeStrategy {
    private int fee;

    public LostTicket() {
        this.fee = 2500;
    }

    public LostTicket(int fee) {
        this.fee = fee;
    }

    @Override
    public void calcuator(Ticket ticket) {
        ticket.setTicketPrice(this.fee);
    }
}
