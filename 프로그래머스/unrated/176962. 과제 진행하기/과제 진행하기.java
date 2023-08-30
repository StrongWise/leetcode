import java.util.*;
class Solution {
    public String[] solution(String[][] plans) {
        List<String> answer = new ArrayList<>();

        List<HomeWork> homeWorks = new ArrayList<>();
        for (String[] plan : plans) {
            homeWorks.add(new HomeWork(plan));
        }
        homeWorks.sort(Comparator.comparing(HomeWork::getStart));

        int count = 0;
        Stack<HomeWork> laterHomeWorks = new Stack<>();

        while (count + 1 < plans.length) {
            HomeWork now = homeWorks.get(count);
            HomeWork next = homeWorks.get(count + 1);

            if (now.getStart() + now.getPlayTime() == next.getStart()) {
                // 다음 과제 진행
                answer.add(now.getName());
            } else if (now.getStart() + now.getPlayTime() < next.getStart()) {
                // 다음 과제 진행 중 여유 시간이 있는 경우
                answer.add(now.getName());
                int freeTime = next.getStart() - now.getStart() - now.getPlayTime();
                while (freeTime > 0) {
                    if (laterHomeWorks.isEmpty()) {
                        break;
                    } else {
                        HomeWork peek = laterHomeWorks.peek();
                        if (peek.getPlayTime() <= freeTime) {
                            freeTime -= peek.getPlayTime();
                            answer.add(laterHomeWorks.pop().getName());
                        } else {
                            peek.setPlayTime(peek.getPlayTime() - freeTime);
                            break;
                        }
                    }
                }
            } else {
                // 멈추고 다음 과제 진행
                now.setPlayTime(now.getPlayTime() - (next.getStart() - now.getStart()));
                laterHomeWorks.push(now);
            }

            count++;
        }

        laterHomeWorks.push(homeWorks.get(plans.length - 1));
        while (!laterHomeWorks.isEmpty()) {
            answer.add(laterHomeWorks.pop().getName());
        }

        String[] answer2 = new String[plans.length];

        for (int i = 0; i < answer2.length; i++) {
            answer2[i] = answer.get(i);
        }

        return answer2;
    }

    private static class HomeWork {
        private String name;
        private int start;
        private int playTime;

        public HomeWork(String[] plan) {
            this.name= plan[0];
            String[] split = plan[1].split(":");
            this.start= Integer.parseInt(split[0]) * 60 + Integer.parseInt(split[1]);
            this.playTime= Integer.parseInt(plan[2]);
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getStart() {
            return start;
        }

        public void setStart(int start) {
            this.start = start;
        }

        public int getPlayTime() {
            return playTime;
        }

        public void setPlayTime(int playTime) {
            this.playTime = playTime;
        }
    }
}