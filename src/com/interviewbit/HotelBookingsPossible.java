/**
 * A hotel manager has to process N advance bookings of rooms for the next season. His hotel has K rooms. Bookings contain an arrival date and a departure date. He wants to find out whether there are enough rooms in the hotel to satisfy the demand. Write a program that solves this problem in time O(N log N) .
 *
 * Input:
 *
 *
 * First list for arrival time of booking.
 * Second list for departure time of booking.
 * Third is K which denotes count of rooms.
 *
 * Output:
 *
 * A boolean which tells whether its possible to make a booking.
 * Return 0/1 for C programs.
 * O -> No there are not enough rooms for N booking.
 * 1 -> Yes there are enough rooms for N booking.
 * Example :
 *
 * Input :
 *         Arrivals :   [1 3 5]
 *         Departures : [2 6 8]
 *         K : 1
 *
 * Return : False / 0
 *
 * At day = 5, there are 2 guests in the hotel. But I have only one room.
 */
package com.interviewbit;

import java.util.ArrayList;
import java.util.Collections;

public class HotelBookingsPossible {
    public static void main(String[] args) {
        ArrayList<Integer> arrival = new ArrayList<Integer>();
        ArrayList<Integer> departure = new ArrayList<Integer>();
        int roomsAvailable = 2;

        arrival.add(1);arrival.add(3);arrival.add(5);
        departure.add(2);departure.add(6);departure.add(8);

        Collections.sort(arrival);
        Collections.sort(departure);

        int i = 0; int j = 0;
        int maxRoomsNeeded = 0; int currentRoomCount = 0;

        while (i<arrival.size() && j<departure.size()){
            int arrivalDay = arrival.get(i);
            int departDay = departure.get(j);

            if(Math.min(arrivalDay,departDay) == departDay){
                j++;
                currentRoomCount--;
            }else{
                i++;
                currentRoomCount++;
            }
            maxRoomsNeeded = Math.max(maxRoomsNeeded, currentRoomCount);
        }
        System.out.println(maxRoomsNeeded <= roomsAvailable ? true : false);
    }
}
