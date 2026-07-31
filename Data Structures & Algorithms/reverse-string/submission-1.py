class Solution:
    def reverseString(self, s: List[str]) -> None:
        i = 0
        j = len(s) - 1
        while(i<=j):
            new = s[i]
            s[i] = s[j]
            s[j] = new
            i+=1
            j-=1
        