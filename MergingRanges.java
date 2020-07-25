import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;

public class MergingRanges{
	public static class Meeting {

		private int startTime;
		private int endTime;

		public Meeting(int startTime, int endTime) {
			// number of 30 min blocks past 9:00 am
			this.startTime = startTime;
			this.endTime   = endTime;
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
		public boolean equals(Object o) {
			if (o == this) {
				return true;
			}
			if (!(o instanceof Meeting)) {
				return false;
			}
			final Meeting meeting = (Meeting) o;
			return startTime == meeting.startTime && endTime == meeting.endTime;
		}

		@Override
		public int hashCode() {
			int result = 17;
			result = result * 31 + startTime;
			result = result * 31 + endTime;
			return result;
		}

		@Override
		public String toString() {
			return String.format("(%d, %d)", startTime, endTime);
		}
	}

	public static List<Meeting> mergeRanges(List<Meeting> meetings) {
		HashMap<Integer, Integer> hmap = new HashMap<Integer,Integer>();

		for(int i=0; i<meetings.size(); i++){
			hmap.put(meetings.get(i).getStartTime(), meetings.get(i).getEndTime());
		}
		
		for(int i=0; i<meetings.size(); i++){
			// if there is value between istart i end
				// make new meeting with min start max end
		}

		return meetings;
	}

	public static void main(String[] args){
		final List<Meeting> meetings = Arrays.asList(new Meeting(1, 3), new Meeting(2, 4));
		final List<Meeting> actual = mergeRanges(meetings);
		final List<Meeting> expected = Arrays.asList(new Meeting(1, 4));
	}
}