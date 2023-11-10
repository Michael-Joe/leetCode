/*
 * 注：因为字母数量是有限的，所以将字母做数组下标，对该位置进行操作，第一个数组增加个数，第二个数组减少个数，最后若不为0，说明不成立
 */

class Solution2 {
    public boolean isAnagram(String s, String t) {
        if (s.length() == 0 && t.length() == 0) {
            return true;
        }
        if (s.length() != t.length()) {
            return false;
        }

        int arr[]=new int[256];//256个字符
        for(char sc:s.toCharArray()){
            arr[sc]++;
        }
        for(char tc:t.toCharArray()){
            arr[tc]--;
        }

        for(int i=0;i<256;i++){
            if(arr[i]!=0){
                return false;
            }
        }
        return true;
    }
}
