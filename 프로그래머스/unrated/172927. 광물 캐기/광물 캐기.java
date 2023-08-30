import java.util.*;
class Solution {
    public int solution(int[] picks, String[] minerals) {
        List<List<Integer>> fatigueGroupList = new ArrayList<>();
        int len = picks[0] + picks[1] + picks[2];

        int slicer = 0;
        List<Integer> innerFatigue = new ArrayList<>();
        for (int i = 0; i < minerals.length; i++) {
            if (fatigueGroupList.size() >= len) {
                break;
            }
            if (i % 5 == 0 && slicer != 0) {
                fatigueGroupList.add(innerFatigue);
                slicer = 0;
                innerFatigue = new ArrayList<>();
            }

            if ("diamond".equals(minerals[i])) {
                innerFatigue.add(25);
            } else if ("iron".equals(minerals[i])) {
                innerFatigue.add(5);
            } else if ("stone".equals(minerals[i])) {
                innerFatigue.add(1);
            }

            slicer++;
        }
        if (fatigueGroupList.size() < len) {
            fatigueGroupList.add(innerFatigue);
        }

        fatigueGroupList.sort(Comparator.comparingInt(innerList -> innerList.stream().mapToInt(Integer::intValue).sum()));

        int fatigue = 0;

        for (int i = 0; i < picks[0]; i++) {
            if (fatigueGroupList.size() == 0) {
                break;
            }
            fatigue += fatigueGroupList.get(fatigueGroupList.size() - 1).size();
            fatigueGroupList.remove(fatigueGroupList.size()-1);
        }

        for (int i = 0; i < picks[1]; i++) {
            if (fatigueGroupList.size() == 0) {
                break;
            }

            List<Integer> fatigueSum = fatigueGroupList.get(fatigueGroupList.size()-1);
            for (Integer f : fatigueSum) {
                fatigue += f / 5 + f % 5;
            }
            fatigueGroupList.remove(fatigueGroupList.size()-1);
        }

        for (int i = 0; i < picks[2]; i++) {
            if (fatigueGroupList.size() == 0) {
                break;
            }

            fatigue += fatigueGroupList.get(fatigueGroupList.size()-1).stream().mapToInt(Integer::intValue).sum();
            fatigueGroupList.remove(fatigueGroupList.size()-1);
        }


        return fatigue;
    }
}