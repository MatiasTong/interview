package com.mt.section1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//


public class Practice1_MergingMeetingTimes {
    Meeting three = new Meeting(4, 8);

    public static void main(String[] args) {

        Meeting one = new Meeting(0, 1);
        Meeting two = new Meeting(3, 5);
        Meeting three = new Meeting(4, 8);


        ArrayList<Meeting> meetings = new ArrayList<>(Arrays.asList(
                new Meeting(3, 5), new Meeting(4, 8), new Meeting(0, 1), new Meeting(4, 5)
        ));


        System.out.println(mergeRanges(meetings));
//        System.out.println(meetings);
    }


    public static ArrayList<Meeting> mergeRanges(ArrayList<Meeting> meetings) {
        meetings.sort(Comparator.comparing(Meeting::getStartTime));
        ArrayList<Meeting> mergedMeetings = new ArrayList();
        mergedMeetings.add(meetings.get(0));
        for (int i = 0; i < meetings.size() - 1; i++) {
            Meeting meeting = meetings.get(i);
            Meeting lastMergedMeeting = mergedMeetings.get(mergedMeetings.size() - 1);
            //if overlap

            if (lastMergedMeeting.getEndTime() >= meeting.getStartTime()) {
                int newStartTime = lastMergedMeeting.getStartTime();
                int newEndTime = Math.max(lastMergedMeeting.getEndTime(), meeting.getEndTime());
                mergedMeetings.remove(mergedMeetings.size() - 1);
                mergedMeetings.add(new Meeting(newStartTime, newEndTime));
            } else {
                mergedMeetings.add(meeting);
            }
        }
        return mergedMeetings;
    }

    public static class Meeting {
        private int startTime;
        private int endTime;

        public Meeting(int startTime, int endTime) {
            this.startTime = startTime;
            this.endTime = endTime;
        }

        public int getStartTime() {
            return startTime;
        }

        public void setStartTime(int startTime) {
            this.startTime = startTime;
        }

        public int getEndTime() {
            return endTime;
        }

        public void setEndTime(int endTime) {
            this.endTime = endTime;
        }

        @Override
        public String toString() {
            return "Meeting{" +
                    "startTime=" + startTime +
                    ", endTime=" + endTime +
                    '}';
        }
    }
}