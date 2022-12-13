//package ds;
//
//public class TreesEtc {
//    public static void main(String[] args) {
//        String[] arr = {"3","3","4","5","1"};
//        TreesEtc te = new TreesEtc();
//        int res = te.solution(arr);
//        System.out.println(res);
//    }
//
//        int maxMinProduct(TreeNode root){
//
//        }
//
//        public int solution(String[] A) {
//            return maxMinProduct(new TreeNode(A));
//        }
//
//        static class TreeNode{
//            int val;
//            TreeNode left;
//            TreeNode right;
//            TreeNode(int val) { this.val = val; }
//            public TreeNode(String[] vals) {
//                val = Integer.parseInt(vals[0]);
//                left = constructFromArray(vals, 1);
//                right = constructFromArray(vals, 2);
//            }
//
//            private TreeNode constructFromArray(String[] vals, int k) {
//                if (k >= vals.length || vals[k].equals("null")) {
//                    return null;
//                }
//                TreeNode root = new TreeNode(Integer.parseInt(vals[k]));
//                int leftIndex = 2 * k + 1;
//                root.left = constructFromArray(vals, leftIndex);
//                int rightIndex = 2 * k + 2;
//                root.right = constructFromArray(vals, rightIndex);
//                return root;
//            }
//        }
//
//}
