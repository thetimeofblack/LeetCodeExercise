class LeetCode31: 
    def nextPermutation(self,nums)->None :
        """
        Do not return anything , but modify the num array. 
        """
        right = len(nums) - 1 
        while right > 0  and nums[right]<=nums[right-1]: right-=1
        if right == 0 :
            nums[:] = nums[::-1]
            return 
        left, right =right-1 , len(nums)-1 
        while nums[right] <= nums[left] -1 : right-=1 
        nums[left] , nums[right] = nums[right] , nums[left]
        nums[left+1:] = nums[left+1:][::-1]
        
    def print_nums(self,nums):
        for i in nums:
            print(nums[i]+"\n")

nums1 = [1,2,3,4]        
nums2 = [1,2,4,3]
nums3 = [1,4,3,2]

lc1  = LeetCode31() 
lc1.nextPermutation(nums1)  
print(nums1)
lc1.nextPermutation(nums2)  
print(nums2)
lc1.nextPermutation(nums3)  
print(nums3)
        