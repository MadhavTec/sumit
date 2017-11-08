package com.techo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BuyingShowTickets {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int peoples = Integer.parseInt(reader.readLine());
		int tickets[] = new int[peoples];

		for (int i = 0; i < peoples; i++) {
			tickets[i] = Integer.parseInt(reader.readLine());
		}
		int position = Integer.parseInt(reader.readLine());
		long time = waitingTime(tickets, position);
		System.out.println(time);

	}

	static long waitingTime(int[] tickets, int p) {
		int purchasedTicket = tickets[p];
		long time = 0;
		int start = 0;
		while (true) {
			if (start == tickets.length) {
				start = 0;
			}
			if (tickets[start] > 0) {
				if (start == p) {
					purchasedTicket--;
					if (purchasedTicket == 0) {
						break;
					}
				}
				time++;
				start++;

			} else {
				start++;
			}

		}

		return time;
	}

}

class TicketCounter {
	int tickets;
	TicketCounter next;

	public int getTickets() {
		return tickets;
	}

	public void setTickets(int tickets) {
		this.tickets = tickets;
	}

	public TicketCounter getNext() {
		return next;
	}

	public void setNext(TicketCounter next) {
		this.next = next;
	}
}
