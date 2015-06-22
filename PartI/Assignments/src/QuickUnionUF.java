/**
 * Created with IntelliJ IDEA.
 * User: jimr
 * Date: 21-6-15
 * Time: 10:03
 * To change this template use File | Settings | File Templates.
 */
public class QuickUnionUF extends UF {

    public QuickUnionUF(int N) {
        super(N);
    }

    public boolean connected(int p, int q) {

        int proot = findroot(p);
        int qroot = findroot(q);
        return proot == qroot;
    }

    private int findroot(int i) {
        int iid = id[i];
        int nextiid = id[iid];

        while(nextiid != iid) {
            iid = nextiid;
            nextiid = id[iid];
        }

        return iid;
    }

    public void union(int p, int q) {
        id[p] = id[q];
    }
}
