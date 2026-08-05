class Solution:
    def checkInclusion(self, s1: str, s2: str) -> bool:
        freq1 = {}
        k = len(s1)

        for ch in s1:
            freq1[ch] = 1 + freq1.get(ch,0)

        freq2 = {}
        l = 0

        for r in range(len(s2)):
            freq2[s2[r]] = 1 + freq2.get(s2[r],0)

            if (r-l+1) > k:
                freq2[s2[l]] -= 1
                if  freq2[s2[l]] == 0:
                    freq2.pop(s2[l])
                l += 1

            if freq1 == freq2:
                return True

        return False
                

        