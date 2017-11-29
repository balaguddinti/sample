package com.practice;

public class BuyingShowTickets {
	
	static long waitingTime(int[] tickets, int p) {
        long noOfIterations = 0;
        int ticketBeingProcessed = 0;
        int numberOfParticipantsInLine = tickets.length;
        if(numberOfParticipantsInLine > p)
        {
            while(tickets[p] != 0)
            {
                if(tickets[ticketBeingProcessed] != 0)
                {
                    tickets[ticketBeingProcessed] = tickets[ticketBeingProcessed] -1;
                    if(ticketBeingProcessed == numberOfParticipantsInLine -1)
                        ticketBeingProcessed = 0;
                    else
                        ticketBeingProcessed ++;
                    noOfIterations ++;
                }
                else {
                    if (ticketBeingProcessed == numberOfParticipantsInLine - 1)
                        ticketBeingProcessed = 0;
                    else
                        ticketBeingProcessed++;
                }
            }
        }
        else
        {
            return 0;
        }
        return noOfIterations;
    }

	public static void main(String[] args) {
		int [] input = {5, 5, 2, 3};
		long l = waitingTime(input,3);
		System.out.println(l);
	}

}
