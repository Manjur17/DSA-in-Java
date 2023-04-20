package GreedyQuestions;

import java.util.*;

class Meetings {
    int start;
    int end;

    Meetings(int start, int end) {
        this.start = start;
        this.end = end;
    }
}

class Meetings1 {
    int start;
    int end;
    int pos;

    Meetings1(int start, int end, int pos) {
        this.start = start;
        this.end = end;
        this.pos = pos;
    }
}

class meetingComparator implements Comparator<Meetings1> {
    @Override
    public int compare(Meetings1 o1, Meetings1 o2) {
        if (o1.end < o2.end)
            return -1;
        else if (o1.end > o2.end)
            return 1;
        else if (o1.pos < o2.pos)
            return -1;
        else
            return 1;
    }
}

public class NMeetingsInOneRoom {
    public static int maxMeetings(int[] start, int[] end, int n) {
        ArrayList<Meetings> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Meetings(start[i], end[i])); // 1 based indexing
        }

        Collections.sort(list, (m1, m2) -> (m1.end - m2.end));

        int count = 1;// 1st metting will happen
        int limit = list.get(0).end;

        for (int i = 1; i < n; i++) {
            if (list.get(i).start > limit) {
                limit = list.get(i).end;
                count++;
            }
        }

        return count;
    }

    public static int maxMeetingsII(int[] start, int[] end, int n) {
        ArrayList<Meetings1> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(new Meetings1(start[i], end[i], i + 1)); // 1 based indexing
        }

        Collections.sort(list, new meetingComparator());

        ArrayList<Integer> answer = new ArrayList<Integer>();
        answer.add(list.get(0).pos);
        int limit = list.get(0).end;

        for (int i = 1; i < start.length; i++) {
            if (list.get(i).start > limit) {
                limit = list.get(i).end;
                answer.add(list.get(i).pos);
            }
        }
        return answer.size();
    }
}
