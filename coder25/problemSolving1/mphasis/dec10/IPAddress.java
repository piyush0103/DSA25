package coder25.problemSolving1.mphasis.dec10;

import java.util.*;

public class IPAddress {
    public static void main(String[] args) {
        String ips[] = {"10.0.0.4 satish", "10.0.0.4 Vinay", "10.0.0.5 Deepa", "10.0.0.1 satish", "10.0.0.2 Vinay", "10.0.0.1 satish"};
        int visitCount = 0;
        String mostVisitedIp = "";
        if (ips.length == 0) {
            return;
        }
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < ips.length; i++) {
            String key = ips[i].split(" ")[0];
            map.put(key, map.getOrDefault(key, 0) + 1);
        }
        System.out.println("print map " + map);
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (visitCount < entry.getValue()) {
                visitCount = entry.getValue();
                mostVisitedIp = entry.getKey();
            }
        }
        System.out.println(mostVisitedIp + ":ANS");
    }
}