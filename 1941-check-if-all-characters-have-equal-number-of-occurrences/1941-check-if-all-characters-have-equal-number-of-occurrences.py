class Solution:
    def areOccurrencesEqual(self, s: str) -> bool:
        New={}
        for i in s:
            if i in New:
                New[i]+=1
            else:
                New[i]=1
        values=list(New.values())

        for i in values:
            if i!=values[0]:
                return False
        return True