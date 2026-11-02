class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> list = new ArrayList<>();
        List<Integer> curr = new ArrayList<>();
        check(0, candidates, list, target, curr, 0);
        return list;
    }
    private void check(int index, int[] candidates,
                       List<List<Integer>> list, int target,
                       List<Integer> curr, int sum) {
        if (sum == target) {
            list.add(new ArrayList<>(curr));
            return;
        }
        if (sum > target || index == candidates.length) {
            return;
        }
        curr.add(candidates[index]);
        check(index, candidates, list, target, curr,
              sum + candidates[index]);
        curr.remove(curr.size() - 1);
        check(index + 1, candidates, list, target, curr, sum);
    }
}
