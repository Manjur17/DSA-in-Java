package HashMaps;

import java.util.*;

public class GroupAnagrams {
    public String getKey(String s) {
        int[] arr = new int[26];
        for (int i = 0; i < s.length(); i++) {
            arr[s.charAt(i) - 'a']++;
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0) {
                sb.append((char) (i + 'a')).append(arr[i]);
            }
        }
        return sb.toString();
    }

    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for (String s : strs) {
            //instead of sorting we are counting in sorted order
            String key = getKey(s);
            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }

        List<List<String>> ans = new ArrayList<>();

        for (List<String> s : map.values()) {
            ans.add(s);
        }
        return ans;
    }

    public List<List<String>> groupAnagramsIII(String[] strs) {
        List<List<String>> ans = new ArrayList<>();
        HashMap<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] arr = s.toCharArray();
            Arrays.sort(arr);
            String key = String.valueOf(arr);

            List<String> list = map.getOrDefault(key, new ArrayList<>());
            list.add(s);
            map.put(key, list);
        }

        ans.addAll(map.values());

        return ans;
    }

    public List<List<String>> groupAnagramsII(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> map = new HashMap<>();

        for (String s : strs) {
            HashMap<Character, Integer> fMap = new HashMap<>();

            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i);
                fMap.put(c, fMap.getOrDefault(c, 0) + 1);
            }

            if (map.containsKey(fMap)) {
                List<String> list = map.get(fMap);
                list.add(s);
                map.put(fMap, list);
            } else {
                List<String> list = new ArrayList<>();
                list.add(s);
                map.put(fMap, list);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for (List<String> s : map.values()) {
            ans.add(s);
        }
        return ans;
    }
}
