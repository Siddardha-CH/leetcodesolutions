// You are given three arrays of length n that describe the properties of n coupons: code, businessLine, and isActive. The ith coupon has:

// code[i]: a string representing the coupon identifier.
// businessLine[i]: a string denoting the business category of the coupon.
// isActive[i]: a boolean indicating whether the coupon is currently active.
// A coupon is considered valid if all of the following conditions hold:

// code[i] is non-empty and consists only of alphanumeric characters (a-z, A-Z, 0-9) and underscores (_).
// businessLine[i] is one of the following four categories: "electronics", "grocery", "pharmacy", "restaurant".
// isActive[i] is true.
// Return an array of the codes of all valid coupons, sorted first by their businessLine in the order: "electronics", "grocery", 
// "pharmacy", "restaurant", and then by code in lexicographical (ascending) order within each category.



_________________________________SOLUTION______________________________________




  class Solution {
    public List<String> validateCoupons(String[] code, String[] b, boolean[] a) {
        List<String> ans = new ArrayList<>();
        List<String> l1 = new ArrayList<>();
        List<String> l2 = new ArrayList<>();
        List<String> l3 = new ArrayList<>();
        
        for (int i = 0; i < code.length; i++) {
            if (b[i].equals("electronics") && a[i] == true)
                if (val(code[i]))
                    ans.add(code[i]); 
        }
        Collections.sort(ans);
        for (int i = 0; i < code.length; i++) {
            if (b[i].equals("grocery") && a[i] == true)
                if (val(code[i]))
                    l1.add(code[i]); 
        }
        Collections.sort(l1);
        for (String i : l1)
            ans.add(i);
        for (int i = 0; i < code.length; i++) {
            if (b[i].equals("pharmacy") && a[i] == true)
                if (val(code[i]))
                    l2.add(code[i]); 
        }
        Collections.sort(l2);
        for (String i : l2)
            ans.add(i);
        for (int i = 0; i < code.length; i++) {
            if (b[i].equals("restaurant") && a[i] == true)
                if (val(code[i]))
                    l3.add(code[i]); 
        }
        Collections.sort(l3);
        for (String i : l3)
            ans.add(i);
        return ans;
    }
    public boolean val(String k) {
        int l;
        if (k.equals(""))
            return false;
        for (char i : k.toCharArray()) {
            if (i == '_' || Character.isLetter(i) || Character.isDigit(i))
                l = 0;
            else
                return false;
        }
        return true;
    }
}
