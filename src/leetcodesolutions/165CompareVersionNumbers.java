// Given two version strings, version1 and version2, compare them. A version string 
// consists of revisions separated by dots '.'. The value of the revision is its integer conversion ignoring leading zeros.

// To compare version strings, compare their revision values in left-to-right order. 
// If one of the version strings has fewer revisions, treat the missing revision values as 0.

// Return the following:

// If version1 < version2, return -1.
// If version1 > version2, return 1.
// Otherwise, return 0.


----------------------------------------------------------



  class Solution {
    public int compareVersion(String version1, String version2) {
        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        boolean c = false;
        char s;
        int k = 0;
        int d;
        for (int i = 0 ; i < version1.length(); i++) {
            s = version1.charAt(i);
            if (s == '.') {
                c = true;
                a.add(k);
                k = 0;
            }
            else {
                d = s - '0';
                if (s == '0' && c == true);
                else {
                    c = false;
                    k = k * 10 + (d);
                }
            }
        }
        a.add(k);
        k = 0;
        for (int i = 0 ; i < version2.length(); i++) {
            s = version2.charAt(i);
            if (s == '.') {
                c = true;
                b.add(k);
                k = 0;
            }
            else {
                d = s - '0';
                if (s == '0' && c == true);
                else {
                    c = false;
                    k = k * 10 + (d);
                }
            }
        }
        b.add(k);
        int max = Math.max(a.size(),b.size());
        while (a.size() < max) {
            a.add(0);
        }
        while (b.size() < max) {
            b.add(0);
        }
        for (int i  =0 ; i < max;i ++) {
            System.out.println(a.get(i) +"  " + b.get(i));
        }
        for (int i  =0 ; i < max;i ++) {
            k = a.get(i);
            d = b.get(i);
            if (k > d) {
                return 1;
            }
            else if (k < d) {
                return -1;
            }
        }
        return 0;
    }
}
