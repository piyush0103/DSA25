package coder25.problemSolving1.mphasis;

public class LongestSubString {
    public static void main(String[] args) {
        String str = "abcdefgklmnoppppppppppppppppppppppppppppp";
        int ar[] = findLongestSubString(str);
        System.out.println(ar[0] + "    " + ar[1]);
    }

    private static int[] findLongestSubString(String str) {
        int maxIndex = 0;
        int count = 0;
        int max = Integer.MIN_VALUE;
        int arr[] = new int[2];
        int n = str.length();
        maxIndex = 0;
        for (int i = 1; i < n; i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;

            }
            if ((str.charAt(i) != str.charAt(i - 1)) || (i == n - 1)) {
                if (count > max) {
                    max = count;
                    arr[1] = max;
                    arr[0] = maxIndex;
                }
                count = 1;
                maxIndex = i;
            }
        }
        return arr;

    }

}
