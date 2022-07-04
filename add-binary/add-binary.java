class Solution {
    public String addBinary(String a, String b) {
        int aLen = a.length();
        int bLen = b.length();

        int len = aLen < bLen ? aLen : bLen;

        StringBuilder result = new StringBuilder();
        boolean carry = false;
        while (len > 0) {
            if (a.charAt(aLen - 1) == '1' && b.charAt(bLen - 1) == '1') {
                if (carry) {
                    result.append('1');
                    carry = true;
                } else {
                    result.append('0');
                    carry = true;
                }
            } else if (a.charAt(aLen - 1) == '0' && b.charAt(bLen - 1) == '1'
                    || a.charAt(aLen - 1) == '1' && b.charAt(bLen - 1) == '0') {
                if (carry) {
                    result.append('0');
                    carry = true;
                } else {
                    result.append('1');
                    carry = false;
                }
            } else if (a.charAt(aLen - 1) == '0' && b.charAt(bLen - 1) == '0') {
                if (carry) {
                    result.append('1');
                    carry = false;
                } else {
                    result.append('0');
                    carry = false;
                }
            }
            aLen--;
            bLen--;
            len--;
        }

        if (aLen == 0 && bLen == 0) {
            if (carry) {
                result.append('1');
            }
            return result.reverse().toString();
        }
        if (len == aLen) {
            while (bLen > 0) {
                if (b.charAt(bLen - 1) == '0') {
                    if (carry) {
                        result.append('1');
                        carry = false;
                    } else {
                        result.append('0');
                        carry = false;
                    }
                } else if (b.charAt(bLen - 1) == '1') {
                    if (carry) {
                        result.append('0');
                        carry = true;
                    } else {
                        result.append('1');
                        carry = false;
                    }
                }
                bLen--;
            }
        } else if (len == bLen) {
            while (aLen > 0) {
                if (a.charAt(aLen - 1) == '0') {
                    if (carry) {
                        result.append('1');
                        carry = false;
                    } else {
                        result.append('0');
                        carry = false;
                    }
                } else if (a.charAt(aLen - 1) == '1') {
                    if (carry) {
                        result.append('0');
                        carry = true;
                    } else {
                        result.append('1');
                        carry = false;
                    }
                }
                aLen--;
            }
        }
        if (carry) {
            result.append('1');
        }
        return result.reverse().toString();
    }
}