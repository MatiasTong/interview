package com.mt.section1;

public class Practice1_MergingMeetingTimes {
}

//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Comparator;
//import java.util.List;
//
//public class Practice1_Merging_Meeting_Times {
//
//    public static class Main {
//
//        public static void main(String[] args) {
//            Meeting one = new Meeting(0,1);
//            Meeting two = new Meeting(3,5);
//            Meeting three = new Meeting(4,8);
//
//            ArrayList<Meeting> meetings= new ArrayList<>(Arrays.asList(
//                    new Meeting(3,5), new Meeting(4,8), new Meeting(0,1)
//            ));
//
//            mergeRanges(meetings);
//        }
//    }
//
//    public static ArrayList<Meeting> mergeRanges(ArrayList<Meeting> meetings){
//        meetings.sort(Comparator.comparing(Meeting::getStartTime));
//
//        meetings.forEach(meeting -> System.out.println(meeting.toString()));
//
//        ArrayList<Meeting> mergedMeetings = new ArrayList<>();
//        mergedMeetings.add(meetings.get(0));
//
//        for(int i=0; i < meetings.size()-1; i++){
//            Meeting currentMeeting = meetings.get(i);
//            Meeting mergedMeeting = mergedMeetings.get(mergedMeetings.size()-1);
//            //case 1 - no overlap between current meeting and next meeting
//            //case 2 - this is overlap, replace both meetings with a new meeting object
//            if(currentMeeting.getEndTime() > nextMeeting.getStartTime()) {
//                int newEndTime = Math.max(currentMeeting.getEndTime(), nextMeeting.getEndTime());
//                int newStartTime = currentMeeting.getStartTime();
//                Meeting newMeeting = new Meeting(newStartTime, newEndTime);
//                mergedMeetings.add(newMeeting);
//            }
//
//        }
//        for(Meeting meeting:meetings){
//            System.out.println(meeting.toString());
//        }
//        return meetings;
//    }
//
//    public static class Meeting{
//        private int startTime;
//        private int endTime;
//
//        public Meeting(int startTime, int endTime){
//            this.startTime = startTime;
//            this.endTime = endTime;
//        }
//
//        public int getStartTime() {
//            return startTime;
//        }
//
//        public void setStartTime(int startTime) {
//            this.startTime = startTime;
//        }
//
//        public int getEndTime() {
//            return endTime;
//        }
//
//        public void setEndTime(int endTime) {
//            this.endTime = endTime;
//        }
//
//        @Override
//        public String toString() {
//            return "Meeting{" +
//                    "startTime=" + startTime +
//                    ", endTime=" + endTime +
//                    '}';
//        }
//    }
//}