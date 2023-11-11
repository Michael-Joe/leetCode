/*
 * Date:  2023.11.11
 * Url:   https://leetcode.cn/problems/daily-temperatures/
 * Title: 739. 每日温度
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int[] tempera = new int[]{73, 74, 75, 71, 69, 72, 76, 73};
        System.out.println(Arrays.toString(new Solution().dailyTemperatures(tempera)));
    }

    public int[] dailyTemperatures(int[] temperatures) {
        StackAsc stackAsc = new StackAsc();
        int[] answer = new int[temperatures.length];
        List<Integer> li = new ArrayList<>();

        for (int i = 0; i < temperatures.length; i++) {
            while (!li.isEmpty() && temperatures[li.get(li.size() - 1)] < temperatures[i]) {
//                TemperatureNode node = stackAsc.pop();
//                answer[node.index] = i - node.index;
                answer[li.get(li.size() - 1)] = i - li.get(li.size() - 1);
                li.remove(li.size() - 1);
            }
//            stackAsc.put(new TemperatureNode(i));
            li.add(i);
        }
        return answer;
    }
}

class TemperatureNode {
    public int index;
    public int temperature;

    public TemperatureNode(int index, int temperature) {
        this.index = index;
        this.temperature = temperature;
    }

    public TemperatureNode(int index) {
        this.index = index;
    }
}

class StackAsc {
    public List<TemperatureNode> list = new ArrayList<>();

    public int size = 0;


    public void put(TemperatureNode node) {
        list.add(node);
        size++;
    }

    public TemperatureNode pop() {
        TemperatureNode node = list.get(size - 1);
        list.remove(list.get(size - 1));
        size--;
        return node;
    }

    public TemperatureNode top() {
        if (size == 0) {
            return null;
        }
        return list.get(size - 1);
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
